package com.xuyang.controller;

import com.alibaba.fastjson.JSONObject;
import com.xuyang.mapper.TdynamicMapper;
import com.xuyang.mapper.TgoodsAppraisesMapper;
import com.xuyang.mapper.TorderRefundMapper;
import com.xuyang.mapper.TuserMapper;
import com.xuyang.model.*;
import com.xuyang.mould.GoodsEvaluate;
import com.xuyang.mould.OrderToGoodsToType;
import com.xuyang.service.GoodsEvaluateService;
import com.xuyang.service.OrderToGoodsToTypeService;
import com.xuyang.service.RedisService;
import com.xuyang.service.TuserService;
import com.xuyang.util.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Created by YangJie
 * @Discription 用户接口
 * @Time 2018年10月25日14:28:00
 */

@Api(description = "用户接口")
@Controller
@RequestMapping(value = "/user")
public class TuserController {

    //用户依赖注入
    @Autowired
    private TuserService tuserService;

    @Autowired
    private TuserMapper tuserMapper;

    @Autowired
    private RedisService redisService;

    @Autowired
    private RedisTemplate<Object, Object> template;

    @Autowired
    private OrderToGoodsToTypeService toTypeService;

    @Autowired
    private TorderRefundMapper torderRefundMapper;

    @Autowired
    private GoodsEvaluateService goodsEvaluateService;
    @Autowired
    private TgoodsAppraisesMapper tgoodsAppraisesMapper;
    @Autowired
    private TdynamicMapper tdynamicMapper;

    /**
     * 新增用户
     *
     * @param user 用户实体对象
     * @return 返回受影响的值
     * @Time 2018年10月25日18:01:04
     */
    @ApiOperation(value = "新增用户")
    @ResponseBody
    @PostMapping("/inserTuser")
    public int addUser(@RequestBody Tuser user) {
        String md5Code = MD5Util.GetMD5Code(user.getUserPwd());
        user.setUserPwd(md5Code);
        return tuserService.insert(user);
    }

    /**
     * @param user 用户实体对象
     * @return 返回受影响的值
     * @Discription 用户注册/商家注册、判断邮箱是否为空
     * @Time 2018年10月25日18:01:04
     * @author create by YangJie
     */
    @ApiOperation(value = "用户注册")
    @ResponseBody
    @PostMapping("/registerUser")
    public Object registerUser(@RequestBody Tuser user) {
        TuserExample example = new TuserExample();
        //根据用户输入手机号码 判断该用户是否存在
        TuserExample.Criteria criteria = example.createCriteria();
        criteria.andUserPhoneEqualTo(user.getUserPhone());

        List<Tuser> tusers = tuserMapper.selectByExample(example);
        if (tusers != null) {
            for (Tuser t : tusers) {
                if (t.getUserPhone().equals(user.getUserPhone())) {
                    return XuYangResult.ok(ResultConstant.code_failue, "用户已存在", ResultConstant.code_failue);
                }
            }
        }
        //判断用户邮箱是否为空，不为空为商家注册，若为空则是普通用户注册
        if (user.getTenantBankEmail() != null && !"".equals(user.getTenantBankEmail())) {
            user.setTenantBankEmail(user.getTenantBankEmail());
        }
        String md5Code = MD5Util.GetMD5Code(user.getUserPwd());
        user.setUserPwd(md5Code);
        int selective = tuserService.insertSelective(user);
        return XuYangResult.ok(ResultConstant.code_ok, "注册成功", selective);
    }


    /**
     * 分页查询
     *
     * @param pageNum  起始页
     * @param pageSize 每页显示数据条数
     * @return 返回JSON 集合对象
     * @Time 2018年10月25日18:00:53
     */
    @ApiOperation(value = "后台查看所有的用户--分页查询")
    @ResponseBody
    @GetMapping("/queryUser")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "20")
                    int pageSize,
            @RequestParam(name = "identity", required = false) String identity) {
        return tuserService.queryUser(pageNum, pageSize, identity);
    }

    /**
     * 查询单个用户信息
     *
     * @param userId 用户参数【JSON格式】
     * @return 返回受影响的行数
     * @Time 2018年10月25日18:00:42
     */
    @ApiOperation(value = "获取个人信息--userId")
    @ResponseBody
    @PostMapping("/queryOne")
    public Object queryUserByUserId(@RequestParam("userId") String userId) {
        Tuser tuser1 = tuserService.selectByPrimaryKey(Integer.parseInt(userId));
        if (tuser1 != null) {
            return XuYangResult.ok(ResultConstant.code_ok, "获取数据成功", tuser1);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "服务错误", null);
    }


    /**
     * 修改用户信息
     *
     * @param tuser 用户参数【实体对象】
     * @return 返回受影响的行数
     * @Time 2018年10月25日18:00:42
     */
    @ApiOperation(value = "修改用户---修改个人资料")
    @ResponseBody
    @PutMapping("/updateUser")
    public Object updateUser(@RequestBody Tuser tuser) {
        if (tuser.getUserPwd() != null && !"".equals(tuser.getUserPwd())) {
            String md5Code = MD5Util.GetMD5Code(tuser.getUserPwd());
            tuser.setUserPwd(md5Code);
        }
        int updateCount = tuserService.updateByPrimaryKeySelective(tuser);
        if (updateCount > 0) {
            return XuYangResult.ok(ResultConstant.code_ok, "修改成功", updateCount);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "服务器异常", null);
    }


    /**
     * 删除用户信息
     *
     * @param userId 用户参数【JSON格式】
     * @return 返回受影响的行数
     * @Time 2018年10月25日18:00:42
     */
    @ApiOperation(value = "删除用户--后台管理对用户进行测试用户进行删除")
    @ResponseBody
    @DeleteMapping("/deleteUser")
    public Object deleteUserById(@RequestParam("userId") String userId) {
        if (!"".equals(userId) && userId != null) {
            int delCount = tuserService.deleteByPrimaryKey(Integer.parseInt(userId));
            if (delCount > 0) {
                return XuYangResult.ok(ResultConstant.code_ok, "删除成功", delCount);
            }
        }
        return XuYangResult.ok(ResultConstant.code_failue, "服务器异常", null);
    }


    /**
     * 用户登录
     *
     * @param map 用户参数【JSON格式】
     * @return 返回受影响的行数
     * @Time 2018年10月25日18:00:42
     */
    @ApiOperation(value = "用户登录--手机号密码登陆", notes = "传递参数userPhone，登陆密码userPwd")
    @ResponseBody
    @PostMapping("/userForLogin")
    public Object selectUserForLogin(@RequestBody Map map) {
        //获取用户手机号码参数
        String userPhone = map.get("userPhone").toString();
        TuserExample example = new TuserExample();
        //根据用户输入手机号码 判断该用户是否存在
        TuserExample.Criteria criteria = example.createCriteria();
        criteria.andUserPhoneEqualTo(userPhone);
        List<Tuser> tusers = tuserMapper.selectByExample(example);
        if (tusers.size() == 0) {
            return XuYangResult.ok(ResultConstant.code_failue, "亲，你还没有注册哦！", null);
        } else {
            //获取用户登录密码参数
            String userPwd = MD5Util.GetMD5Code(map.get("userPwd").toString());
            //实例用户对象
            Tuser tuser = new Tuser();
            //设置参数
            tuser.setUserPwd(userPwd);
            tuser.setUserPhone(userPhone);
            Tuser user = tuserService.selectUserForLogin(tuser);
            //设置唯一token  判断用户信息是否为空 若不等于NULL 存入redis  并且设置失效时间
            String token = UUIDFactory.getUUID();
            if (user != null) {
                Map<String, Object> map1 = new HashMap<String, Object>();
                template.opsForValue().set("user_" + token, user);
                map1.put("token", token);
                map1.put("user", user);
                //Tuser result = (Tuser) template.opsForValue().get("user_" + token);
                // map1.put("user_token",result);
                //返回值
                return XuYangResult.ok(ResultConstant.code_ok, "登录成功", map1);
            }
            return XuYangResult.ok(ResultConstant.code_failue, "密码错误", null);
        }

    }

    /**
     * 退出登录
     *
     * @param map Token
     * @return
     */
    @ApiOperation(value = "退出登录")
    @ResponseBody
    @PostMapping("/loginOut")
    public Object logout(@RequestBody Map map) {
        String token = map.get("token").toString();
        Jedis je = new Jedis();
        je.del("user_" + token);
        return XuYangResult.ok(ResultConstant.code_ok, "退出成功", "");
    }

    /**
     * 找回密码
     *
     * @param map
     * @return
     */
    @ApiOperation(value = "用户找回密码")
    @RequestMapping(value = "resetPassword", method = RequestMethod.POST)
    @ResponseBody
    public Object setPassword(@RequestBody Map<String, String> map) {
        try {
            String userPhone = "";
            String code = "";
            String userPwd = "";
            StringBuffer sb = new StringBuffer();
            if (map.containsKey("userPhone")) {
                userPhone = map.get("userPhone");
            } else {
                sb.append("userPhone").append(",");
            }
            if (map.containsKey("code"))
                code = map.get("code");
            else {
                sb.append("code").append(",");
            }
            if (map.containsKey("userPwd"))
                userPwd = map.get("userPwd");
            else {
                sb.append("userPwd").append(",");
            }
            if (sb.length() != 0) {
                return XuYangResult.build(ResultConstant.code_param, "以下参数不能为空" + sb.toString(), "");
            }
            if (!redisService.checkSmsCode(userPhone, code, 2)) {
                return XuYangResult.build(ResultConstant.code_SmsError, "验证码错误或已过期", "");
            }
            return tuserService.resetPassword(userPhone, userPwd);
        } catch (Exception e) {
            return XuYangResult.build(ResultConstant.code_exception, "数据异常", "");
        }
    }


    /**
     * @param userPhone 手机号码
     * @param flag      状态值 1，2
     * @return
     * @author create by YangJie
     * @Discription 用户登录发送验证码
     * @Time 2018年11月17日15:46:07
     */
    @ApiOperation(value = "发送验证码", notes = "userPhone用户手机号码，flag是发送验证码方式，1为注册，2为其")
    @GetMapping("/sentCode")
    @ResponseBody
    public Object sentCode(@RequestParam("userPhone") String userPhone, @RequestParam("flag") String flag) throws Exception {
        RestTest restTest = new RestTest();
        TuserExample example = new TuserExample();
        //根据用户输入手机号码 判断该用户是否存在
        TuserExample.Criteria criteria = example.createCriteria();
        criteria.andUserPhoneEqualTo(userPhone);
        List<Tuser> tuser = tuserMapper.selectByExample(example);
        //判断flag的值 1注册，2其他
        if ("1".equals(flag)) {
            //判读用户是否存在
            if (tuser.size() > 0) {
                return XuYangResult.ok(ResultConstant.code_failue, "手机号码已存在！", "");
            }
            //修改密码
        } else {
            //判读用户是否存在
            if (tuser.size() == 0) {
                return XuYangResult.ok(ResultConstant.code_failue, "该用户不存在，请注册！", "");
            }
        }
        //用户的账号唯一标识“Account Sid”，在开发者控制台获取
        String sid = HttpSendSmsUtil.getSid();
        //用户密钥“Auth Token”，在开发者控制台获取
        String token = HttpSendSmsUtil.getToken();
        //创建应用时系统分配的唯一标示
        String appid = HttpSendSmsUtil.getAppid();
        //可在后台短信产品→选择接入的应用→短信模板-模板ID，查看该模板ID
        String templateid = HttpSendSmsUtil.getTemplateid();
        /**模板中的替换参数，如该模板不存在参数则无需传该参数或者参数为空，如果有多个参数则需要写在同一个字符串中，以英文逗号分隔 （如：“a,b,c”），
         * 参数中不能含有特殊符号“【】”和“,” * */
        //用户唯一标示ID UUID序列
        String uid = UUIDFactory.getUUID();
        // Map map = new HashMap();
        //生成验证码
        int code = (int) ((Math.random() * 9 + 1) * 100000);
        String param = code + ",60";
        //实例Redis对象 存放到redis中 并设置时间为15分钟
        Jedis e = new Jedis();
        e.set("code_" + code, code + "");
        e.expire("code_" + code, 900);
        //存放在map中
        Object sendSms = restTest.testSendSms(sid, token, appid, templateid, param, userPhone, uid);
        Map<String, Object> map = this.getMap(sendSms.toString());
        return XuYangResult.ok(ResultConstant.code_ok, "发送成功！", map);
    }

    /**
     * @param json JSON数据
     * @return map
     * @Discription json数据转为Map集合对象
     */
    public static Map<String, Object> getMap(String json) {
        //实例出JSONObject对象 把json数据转换json
        JSONObject jsonObject = JSONObject.parseObject(json);
        Map<String, Object> valueMap = new HashMap<String, Object>();
        //将json数据转换为map
        valueMap.putAll(jsonObject);
        return valueMap;
    }


    @ApiOperation("验证码验证")
    @PostMapping("/checkSentCode")
    @ResponseBody
    public Object checkSentCode(@RequestBody Map map) {
        String code = map.get("code").toString();
        Jedis jd = new Jedis();
        String sentCode = jd.get("code_" + code);
        if (code != sentCode && !code.equals(sentCode)) {

            return XuYangResult.ok(ResultConstant.code_failue, "验证码不正确或者超时", "");
        }
        return XuYangResult.ok(ResultConstant.code_ok, "验证码正确", "");
    }

    @ApiOperation(value = "查询用户订单")
    @PostMapping("/queryOrderUser")
    @ResponseBody
    public Object queryOrderUser(@RequestBody Integer id) {
        List<OrderToGoodsToType> orderToGoodsToTypes = toTypeService.queryOrderToGoodsToType(id);
        if (orderToGoodsToTypes != null) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", orderToGoodsToTypes);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败-没有数据", null);
    }

    @ApiOperation(value = "订单详情")
    @PostMapping("/queryOrderDetails")
    @ResponseBody
    public Object queryOrderUserDetails(@RequestBody Integer order_id) {
        OrderToGoodsToType orderToGoodsToType = toTypeService.queryOrderUserDetails(order_id);
        if (orderToGoodsToType != null) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", orderToGoodsToType);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败-没有数据", null);
    }

    @ApiOperation(value = "退款退货")
    @PostMapping("/refundBack")
    @ResponseBody
    public Object refundBack(@RequestBody Integer user_id) {
        TorderRefundExample example = new TorderRefundExample();
        example.createCriteria().andOreIdIsNotNull().andUserIdEqualTo(user_id);
        List<TorderRefund> torderRefunds = torderRefundMapper.selectByExample(example);

        if (torderRefunds != null) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", torderRefunds);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败-没有数据", null);
    }

    @ApiOperation(value = "订单的评价")
    @PostMapping("/queryOrderEvaluate")
    @ResponseBody
    public Object queryOrderEvaluate(@RequestBody Integer order_id, @RequestBody Integer user_id) {
        GoodsEvaluate goodsEvaluate = goodsEvaluateService.queryOrderEvaluate(order_id, user_id);

        if (goodsEvaluate != null) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", goodsEvaluate);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败-没有数据", null);
    }

    @ApiOperation(value = "删除评论")
    @PostMapping("/queryOrderEvaluate")
    @ResponseBody
    public Object delOrderEvaluate(@RequestBody Integer ga_id) {
        int i = tgoodsAppraisesMapper.deleteByPrimaryKey(ga_id);

        if (i > 0) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", i);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败-未能成功删除", null);
    }


    @ApiOperation(value = "发布的内容")
    @PostMapping("/queryArticle")
    @ResponseBody
    public Object queryArticle(@RequestBody Integer user_id) {
        TdynamicExample example = new TdynamicExample();
        example.createCriteria().andDyIdIsNotNull().andUserIdEqualTo(user_id);
        List<Tdynamic> tdynamics = tdynamicMapper.selectByExample(example);
        if (tdynamics != null && tdynamics.size() > 0) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", tdynamics);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败-没有数据", null);
    }

    @ApiOperation(value = "删除发布的内容（逻辑删除）")
    @PostMapping("/delArticle")
    @ResponseBody
    public Object delArticle(@RequestBody Tdynamic tdynamic) {
        int i = tdynamicMapper.updateByPrimaryKeySelective(tdynamic);
        if (i > 0) {
            return XuYangResult.ok(ResultConstant.code_ok, "成功", i);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "失败-未能成功删除", null);
    }

}
