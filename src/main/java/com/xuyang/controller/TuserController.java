package com.xuyang.controller;

import com.xuyang.mapper.TuserMapper;
import com.xuyang.model.Tuser;
import com.xuyang.model.TuserExample;
import com.xuyang.model.Tworldtype;
import com.xuyang.service.RedisService;
import com.xuyang.service.TuserService;
import com.xuyang.service.TworldTypeService;
import com.xuyang.util.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
    private TworldTypeService tworldTypeService;

    @Autowired
    private TuserMapper tuserMapper;

    @Autowired
    private RedisService redisService;

    @Autowired
    private RedisTemplate<Object, Object> template;


    /**
     * @param tworldType 实体对象
     * @return 返回受影响的值
     * @Time 2018年10月25日18:01:04
     */
    @ApiOperation(value = "新增数据")
    @ResponseBody
    @PostMapping("/insertTworldType")
    public int insertTworldType(@RequestBody Tworldtype tworldType) {
        return tworldTypeService.insert(tworldType);
    }


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
     * 用户注册
     *
     * @param user 用户实体对象
     * @return 返回受影响的值
     * @Time 2018年10月25日18:01:04
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
                    int pageSize) {
        return tuserService.queryUser(pageNum, pageSize);
    }

    /**
     * 查询单个用户信息
     *
     * @param tuser 用户参数【JSON格式】
     * @return 返回受影响的行数
     * @Time 2018年10月25日18:00:42
     */
    @ApiOperation(value = "获取个人信息--userId")
    @ResponseBody
    @PostMapping("/queryOne")
    public Object queryUserByUserId(@RequestBody Tuser tuser) {
        Tuser tuser1 = tuserService.selectByPrimaryKey(tuser.getUserId());
        if (tuser1 != null) {
            return XuYangResult.ok(ResultConstant.code_ok, "获取数据成功", tuser1);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "获取失败", null);
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
        String md5Code = MD5Util.GetMD5Code(tuser.getUserPwd());
        tuser.setUserPwd(md5Code);
        return tuserService.updateByPrimaryKey(tuser);
    }


    /**
     * 删除用户信息
     *
     * @param tuser 用户参数【JSON格式】
     * @return 返回受影响的行数
     * @Time 2018年10月25日18:00:42
     */
    @ApiOperation(value = "删除用户--后台管理对用户进行测试用户进行删除")
    @ResponseBody
    @DeleteMapping("/deleteUser")
    public Object deleteUserById(@RequestBody Tuser tuser) {
        return tuserService.deleteByPrimaryKey(tuser.getUserId());
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
                Tuser result = (Tuser) template.opsForValue().get("user_" + token);
                //返回值
                return XuYangResult.ok(ResultConstant.code_ok, "登录成功", result);
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
    @RequestMapping(value = "setPassword", method = RequestMethod.POST)
    @ResponseBody
    public Object setPassword(@RequestBody Map<String, String> map) {
        try {
            String userPhone = "";
            String pin = "";
            String userPwd = "";
            StringBuffer sb = new StringBuffer();
            if (map.containsKey("userPhone")) {
                userPhone = map.get("userPhone");
            } else {
                sb.append("userPhone").append(",");
            }
            if (map.containsKey("pin"))
                pin = map.get("pin");
            else {
                sb.append("pin").append(",");
            }
            if (map.containsKey("userPwd"))
                userPwd = map.get("userPwd");
            else {
                sb.append("userPwd").append(",");
            }
            if (sb.length() != 0) {
                return XuYangResult.build(ResultConstant.code_param, "以下参数不能为空" + sb.toString(), "");
            }
            if (!redisService.checkSmsCode(userPhone, pin, 2)) {
                return XuYangResult.build(ResultConstant.code_SmsError, "验证码错误或已过期", "");
            }
            return tuserService.resetPassword(userPhone, userPwd);
        } catch (Exception e) {
            return XuYangResult.build(ResultConstant.code_exception, "数据异常", "");
        }
    }

}
