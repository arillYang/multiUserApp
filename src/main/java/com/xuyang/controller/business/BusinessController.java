/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: BusinessController
 * Author:   PanYin
 * Date:     2018/11/6 16:52
 * Description: 商家控制器
 */
package com.xuyang.controller.business;

import com.github.pagehelper.PageInfo;
import com.xuyang.mapper.*;
import com.xuyang.model.*;
import com.xuyang.mould.DynamicToUser;
import com.xuyang.service.DynamicToUserService;
import com.xuyang.service.TuserService;
import com.xuyang.util.JsonUtils;
import com.xuyang.util.ResultConstant;
import com.xuyang.util.XuYangResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商家控制器〉
 * @author PanYin
 * @create 2018/11/6
 * @since 1.0.0
 */
@RestController
@Api(description = "商家控制器")
@RequestMapping(value = "/business")
public class BusinessController {
    /* 导航模块 */
    //用户接口
    @Autowired
    private TuserService tuserService;
    //商家账户接口
    @Autowired
    private TaccountMapper taccountMapper;
    //资金明细接口
    @Autowired
    private TmoneyMapper tmoneyMapper;
    //订单接口
    @Autowired
    private TorderMapper torderMapper;
    //银行卡接口
    @Autowired
    private TbankCardMapper tbankCardMapper;
    //商品接口
    @Autowired
    private TgoodsMapper tgoodsMapper;
    //动态记录
    @Autowired
    private TdynamicMapper tdynamicMapper;
    //商推接口
    @Autowired
    private TquotientMapper tquotientMapper;
    //全球发布接口
    @Autowired
    private DynamicToUserService dynamicToUserService;
    @Autowired
    private TorderRefundMapper torderRefundMapper;


    //公用方法，验证token
    private Object yanToken(String token){
        Jedis je = new Jedis();
        if(token == null || token.isEmpty()){
            return "fail";
        }
        Tuser tuser = JsonUtils.jsonToPojo(je.get("user_" + token), Tuser.class);
        if(tuser == null || tuser.getUserId()==null){
            return "fail";
        }
        return tuser;
    }

    //我的账户
    @ApiOperation(value = "我的账户")
    @ResponseBody
    @RequestMapping(value = "/account",method = RequestMethod.POST)
    public Object queryMyAccount(@RequestBody @ApiParam(name = "用户ID",value = "数值") Integer id,
                                 @RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        //查询店铺名称，金额
        Tuser tuser = tuserService.selectByPrimaryKey(id);
        //资金表
        TaccountExample example = new TaccountExample();
        example.createCriteria().andAccountIdIsNotNull().andUserIdEqualTo(id);
        List<Taccount> taccounts = taccountMapper.selectByExample(example);
        Map<String,Object> map = new HashMap<>();
        map.put("info",tuser);
        map.put("accounts",taccounts);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",map);
    }
    @ApiOperation(value = "资金明细")
    @ResponseBody
    @RequestMapping(value = "/capitalDetail",method = RequestMethod.POST)
    public Object capital(@RequestBody @ApiParam(name = "用户ID",value = "数值即可") Integer id,
                          @RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        TmoneyExample example = new TmoneyExample();
        example.createCriteria().andMoneyIdIsNotNull().andUserIdEqualTo(id);
        List<Tmoney> tmonies = tmoneyMapper.selectByExample(example);

        return XuYangResult.ok(ResultConstant.code_ok,"成功",tmonies);
    }

    @ApiOperation(value = "交易账单")
    @ResponseBody
    @RequestMapping(value = "/GTransactionbill",method = RequestMethod.POST)
    public Object Transactionbill(@RequestBody @ApiParam(name = "商家ID",value = "字符串")String sid,
                                  @RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        if(sid == null || sid.equals("")){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-请传入参数",null);
        }
        //查询商家订单
        TorderExample example = new TorderExample();
        example.createCriteria().andOrderIdIsNotNull().andTenantSidEqualTo(sid);
        List<Torder> torders = torderMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",torders);
    }

    /* 商家信息 */
    @ApiOperation(value = "添加银行卡")
    @ResponseBody
    @RequestMapping(value = "/bindingCard",method = RequestMethod.POST)
    public Object addBankCard(@RequestBody @ApiParam(name = "传递银行卡对象",value = "json格式")TbankCard tbankCard,
                              @RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        if(tbankCard == null || (tbankCard.getTenantSid()==null || tbankCard.getTenantSid().equals(""))){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-请传递正确的数据",null);
        }
        int insert = tbankCardMapper.insert(tbankCard);
        if( insert > 0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",insert);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-未能添加成功",null);
    }

    @ApiOperation(value = "商家修改信息")
    @ResponseBody
    @RequestMapping(value = "/operationEmail",method = RequestMethod.POST)
    public Object addOrUpdateEmail(@RequestBody Tuser tuser,@RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        if(tuser.getUserId() ==  null || tuser==null){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-请按照规定访问",null);
        }
        int i = tuserService.updateByPrimaryKeySelective(tuser);
        if(i>0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-未能修改成功",null);
    }

    @ApiOperation(value = "查询入驻信息")
    @ResponseBody
    @RequestMapping(value = "/enter",method = RequestMethod.POST)
    public Object queryEnter(@RequestBody Integer id,@RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        if(id != null && id != 0){
            Tuser tuser = tuserService.selectByPrimaryKey(id);
            if(tuser !=  null){
                return XuYangResult.ok(ResultConstant.code_ok,"成功",tuser.getTenantEnterinfo());
            }
            return XuYangResult.ok(ResultConstant.code_failue,"失败-为查询到数据",null);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-传递的数据有误",null);
    }

    @ApiOperation(value = "设置支付密码")
    @ResponseBody
    @RequestMapping(value = "/setpaypwd",method = RequestMethod.POST)
    public Object settingPay(@RequestBody String phone,@RequestBody String paypwd,
                             @RequestBody String token,@RequestBody String code){
        Jedis je = new Jedis();
        String ncode = je.get(token+"_code");

        if(token == null || token.isEmpty()){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-您登录已失效，请重新登录",null);
        }
        if(ncode != code || (ncode == null || ncode.equals("")) || code.equals("") || code == null){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-请检查验证码/验证码不正确",null);
        }
        Tuser user = JsonUtils.jsonToPojo(je.get("user_" + token),Tuser.class);
        if(user.getUserPhone() != phone){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-输入的账号和登录账号不是同一人",null);
        }
        user.setTenantPayPwd(paypwd);
        je.set("user_"+token,JsonUtils.objectToJson(user));
        return XuYangResult.ok(ResultConstant.code_ok,"成功",1);
    }
    @ApiOperation(value = "发送验证码")
    @ResponseBody
    @RequestMapping(value = "/sendcode",method = RequestMethod.POST)
    public Object sendCode(@RequestBody String token){
        System.out.println(token);
        /* 需要存redis,5分钟 */
        return "暂时未实现，没有短信接口";
    }
    @ApiOperation(value = "修改支付密码")
    @ResponseBody
    @RequestMapping(value = "/updatepaypwd",method = RequestMethod.POST)
    public Object updatePaypwd(@RequestBody String token,@RequestBody String code,@RequestBody String phone,
                               @RequestBody String newpwd,@RequestBody String quenewpwd){
        //验证参数
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        Tuser user = (Tuser)s;
        if(code == null || phone == null || newpwd == null || quenewpwd == null){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-请确认参数是否正确",null);
        }
        if(user.getUserPhone() != phone){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-号码输入有误",null);
        }
        if(newpwd != quenewpwd){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-两次密码输入不一致",null);
        }
        //验证码还没验证
        user.setTenantPayPwd(quenewpwd);
        int i = tuserService.updateByPrimaryKeySelective(user);
        if(i>0){
            Jedis jedis = new Jedis();
            jedis.set("user_"+token,JsonUtils.objectToJson(user));
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-未能修改成功","验证码未实现");
    }

    @ApiOperation(value = "重置支付密码")
    @ResponseBody
    @RequestMapping(value = "/resetpwd",method = RequestMethod.POST)
    public Object resetpwd(@RequestBody String jiupwd,@RequestBody String newpwd,@RequestBody String quenewpwd,
                           @RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        Tuser user = (Tuser)s;
        if(user.getTenantPayPwd() != jiupwd){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-旧密码不正确",null);
        }
        if(newpwd != quenewpwd){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-新密码和确认密码不一致",null);
        }
        if(newpwd == user.getTenantPayPwd()){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-新密码不能与旧密码一致",null);
        }
        user.setTenantPayPwd(quenewpwd);
        int i = tuserService.updateByPrimaryKeySelective(user);
        if(i>0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-未修改成功",null);
    }


    /***商家-商品管理***/
    @ApiOperation(value = "商品发布")
    @ResponseBody
    @RequestMapping(value = "/goodsissue",method = RequestMethod.POST)
    public Object goodsissue(@RequestBody Tgoods tgoods,@RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        int i = tgoodsMapper.insertSelective(tgoods);
        if(i>0){
            XuYangResult.ok(ResultConstant.code_ok,"发布成功",i);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败，未发布成功",null);
    }
    @ApiOperation(value = "查看未审核过的商品")
    @ResponseBody
    @RequestMapping(value = "/queryGoodsstate",method = RequestMethod.POST)
    public Object queryGoodsstate(@RequestBody @ApiParam(name="商家ID",value = "字符串类型") String id,
                                  @RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        TgoodsExample example = new TgoodsExample();
        example.createCriteria().andGIdIsNotNull().andTenantSidEqualTo(id).andGFlagEqualTo("0");
        List<Tgoods> tgoods = tgoodsMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",tgoods);
    }

    @ApiOperation(value = "查看审核通过的商品")
    @ResponseBody
    @RequestMapping(value = "/goodsisyes",method = RequestMethod.POST)
    public Object queryGoodsyes(@RequestBody @ApiParam(name="商家ID",value = "字符串类型") String id,
                                  @RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        TgoodsExample example = new TgoodsExample();
        example.createCriteria().andGIdIsNotNull().andTenantSidEqualTo(id).andGFlagEqualTo("1");
        List<Tgoods> tgoods = tgoodsMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",tgoods);
    }

    @ApiOperation(value = "查看下架的商品")
    @ResponseBody
    @RequestMapping(value = "/goodsissaleno",method = RequestMethod.POST)
    public Object queryGoodsaleno(@RequestBody @ApiParam(name="商家ID",value = "字符串类型") String id,
                                @RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        TgoodsExample example = new TgoodsExample();
        example.createCriteria().andGIdIsNotNull().andTenantSidEqualTo(id).andGSaleEqualTo("0");
        List<Tgoods> tgoods = tgoodsMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",tgoods);
    }
    @ApiOperation(value = "查看上架的商品")
    @ResponseBody
    @RequestMapping(value = "/goodsissaleyes",method = RequestMethod.POST)
    public Object queryGoodsaleyes(@RequestBody @ApiParam(name="商家ID",value = "字符串类型") String id,
                                  @RequestBody String token){
        Object s = this.yanToken(token);
        if(s.toString() == "fail"){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-身份认证失败，请重新登录",null);
        }
        TgoodsExample example = new TgoodsExample();
        example.createCriteria().andGIdIsNotNull().andTenantSidEqualTo(id).andGSaleEqualTo("1");
        List<Tgoods> tgoods = tgoodsMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",tgoods);
    }

    @ApiOperation(value = "查询商家发布的全球发现")
    @ResponseBody
    @RequestMapping(value = "/queryQuan",method = RequestMethod.POST)
    public Object queryQuanqiu(@RequestBody @ApiParam(name = "用户ID(不是商家ID)",value = "数值类型") Integer id){
        TdynamicExample example = new TdynamicExample();
        example.createCriteria().andDyIdIsNotNull().andUserIdEqualTo(id);
        List<Tdynamic> tdynamics = tdynamicMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",tdynamics);
    }

    @ApiOperation(value = "商家商推记录")
    @ResponseBody
    @RequestMapping(value = "/quotient",method = RequestMethod.POST)
    public Object quotient(@RequestBody Integer id){
        TquotientExample example = new TquotientExample();
        example.createCriteria().andQuotientIdIsNotNull().andUserIdEqualTo(id);
        List<Tquotient> tquotients = tquotientMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",tquotients);
    }

    @ResponseBody
    @ApiOperation(value = "查询商家发表的帖子")
    @RequestMapping(value = "/queryToUser",method = RequestMethod.POST)
    public Object queryToUser(@RequestBody Integer id){
        PageInfo<DynamicToUser> info = dynamicToUserService.reasonidcard(0, 5,id);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",info);
    }
    @ResponseBody
    @ApiOperation(value = "商家订单")
    @RequestMapping(value = "/sellerOrder",method = RequestMethod.POST)
    public Object sellerOrder(@RequestBody @ApiParam(name = "商家ID")Integer id,
                              @RequestBody @ApiParam(name = "订单状态")String orderState){
        TorderExample example = new TorderExample();
        example.createCriteria().andOrderIdIsNotNull().andUserIdEqualTo(id).andOrderStateEqualTo(orderState);
        List<Torder> torders = torderMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",torders);
    }
    @ResponseBody
    @ApiOperation(value = "查询退款的订单")
    @RequestMapping(value = "/refundHandle",method = RequestMethod.POST)
    public Object refundHandle(@RequestBody @ApiParam(name = "商家ID")Integer id,
                               @RequestBody @ApiParam(name = "订单状态(退款的状态)")String orderState){
        TorderExample example = new TorderExample();
        example.createCriteria().andOrderIdIsNotNull().andUserIdEqualTo(id).andOrderIsrefundEqualTo(orderState);
        List<Torder> torders = torderMapper.selectByExample(example);
        return XuYangResult.ok(ResultConstant.code_ok,"成功",torders);
    }

    @ResponseBody
    @ApiOperation(value = "添加退款记录")
    @RequestMapping(value = "/addOrderRefund",method = RequestMethod.POST)
    public Object addOrderRefund(@RequestBody TorderRefund torderRefund){
        if( torderRefund == null){
            return XuYangResult.ok(ResultConstant.code_failue,"失败-参数不正确",null);
        }
        int insert = torderRefundMapper.insert(torderRefund);
        if(insert > 0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",insert);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-未能添加成功",null);
    }

    @ResponseBody
    @ApiOperation(value = "拒绝退款")
    @RequestMapping(value = "/refuseRefund",method = RequestMethod.POST)
    public Object refuseRefund(@RequestBody @ApiParam(name = "退款ID")Integer orderid,
                               @RequestBody @ApiParam(name = "拒绝理由")String remark){
        TorderExample example = new TorderExample();
        example.createCriteria().andOrderIdIsNotNull().andUserIdEqualTo(orderid);
        TorderRefund torderRefund = new TorderRefund();
        torderRefund.setOreId(orderid);
        torderRefund.setHandleRemark(remark);
        int i = torderRefundMapper.updateByPrimaryKeySelective(torderRefund);
        if(i > 0){
            return XuYangResult.ok(ResultConstant.code_ok,"成功",i);
        }
        return XuYangResult.ok(ResultConstant.code_failue,"失败-未能提交原因",null);
    }
}
