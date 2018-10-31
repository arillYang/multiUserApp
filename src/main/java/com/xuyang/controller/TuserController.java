package com.xuyang.controller;

import com.xuyang.model.Tuser;
import com.xuyang.model.Tworldtype;
import com.xuyang.service.RedisService;
import com.xuyang.service.TuserService;
import com.xuyang.service.TworldTypeService;
import com.xuyang.util.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

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
    //redis 依赖注入
    @Autowired
    private RedisService redisService;

    @Autowired
    private TworldTypeService tworldTypeService;


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
     * 测试redis中是否存在 用户信息
     *
     * @return 返回受影响的值
     * @Time 2018年10月25日18:01:04
     */
    @ApiOperation(value = "测试redis中是否存在")
    @ResponseBody
    @GetMapping("/queryRedisUser")
    public Object queryRedisUser() {
        //从redis 中取出用户注册信息
        Object o1 = RedisClinet.getInstance().get("user");
        Tuser g1 = (Tuser) o1;
        System.out.println(g1);
        if (o1 != null) {
            System.out.println(g1.getUserPwd());
            System.out.println(g1.getUserNickname());
            System.out.println(g1.getUserPhone());
        }
        //转换为JSON 格式
        return o1;
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
    public int registerUser(@RequestBody Tuser user) {
        String md5Code = MD5Util.GetMD5Code(user.getUserPwd());
        user.setUserPwd(md5Code);
        //将用户注册信息存放redis
        /* redisService.set("userInfo", user.toString());*/
        String temp = RedisClinet.getInstance().set(user, "user");
        /* System.out.println(temp);*/
        Jedis jedis = new Jedis();
        jedis.expire("user", 100);
       /* Object o = RedisClinet.getInstance().get("userInfo3");
        if (o != null) {
            Tuser g1 = (Tuser) o;
            System.out.println(g1.getUserPwd());
            System.out.println(g1.getUserNickname());
            System.out.println(jedis.ttl("userInfo3"));
        }*/
        return tuserService.insertSelective(user);
    }


    /**
     * 分页查询
     *
     * @param pageNum  起始页
     * @param pageSize 每页显示数据条数
     * @return 返回JSON 集合对象
     * @Time 2018年10月25日18:00:53
     */
  /*  @ApiOperation(value = "分页查询")
    @ResponseBody
    @GetMapping("/queryUser")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize) {
        return tuserService.queryUser(pageNum, pageSize);
    }*/

    /**
     * 查询单个用户信息
     *
     * @param Tuser 用户参数【JSON格式】
     * @return 返回受影响的行数
     * @Time 2018年10月25日18:00:42
     */
    @ApiOperation(value = "单个用户查询")
    @ResponseBody
    @DeleteMapping("/queryOne")
    public Object queryUserByUserId(@RequestBody Tuser Tuser) {
        return tuserService.selectByPrimaryKey(Tuser.getUserId());
    }


    /**
     * 修改用户信息
     *
     * @param Tuser 用户参数【实体对象】
     * @return 返回受影响的行数
     * @Time 2018年10月25日18:00:42
     */
    @ApiOperation(value = "修改用户")
    @ResponseBody
    @PutMapping("/updateUser")
    public Object updateUser(@RequestBody Tuser Tuser) {
        String md5Code = MD5Util.GetMD5Code(Tuser.getUserPwd());
        Tuser.setUserPwd(md5Code);
        return tuserService.updateByPrimaryKey(Tuser);
    }


    /**
     * 删除用户信息
     *
     * @param Tuser 用户参数【JSON格式】
     * @return 返回受影响的行数
     * @Time 2018年10月25日18:00:42
     */
    @ApiOperation(value = "删除用户")
    @ResponseBody
    @DeleteMapping("/deleteUser")
    public Object deleteUserById(@RequestBody Tuser Tuser) {
        return tuserService.deleteByPrimaryKey(Tuser.getUserId());
    }


    /**
     * 用户登录
     *
     * @param map 用户参数【JSON格式】
     * @return 返回受影响的行数
     * @Time 2018年10月25日18:00:42
     */
    @ApiOperation(value = "用户登录")
    @ResponseBody
    @DeleteMapping("/userForLogin")
    public Object selectUserForLogin(@RequestBody Map map) {
        //获取用户手机号码参数
        String userPhone = map.get("userPhone").toString();
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
            Jedis jedis = new Jedis();
            jedis.set("user_" + token, JsonUtils.objectToJson(user));
            jedis.set("token", token);
            jedis.expire("user_" + token, 100);
            jedis.expire("token", 100);
            //返回值
            return XuYangResult.ok(ResultConstant.code_ok, "登录成功", token);
        }
        return XuYangResult.ok(ResultConstant.code_failue, "登录失败", null);
    }

}
