/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: UserToAccount
 * Author:   PanYin
 * Date:     2018/11/20 11:12
 * Description: 用户和资金实体类
 */
package com.xuyang.mould;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户和资金实体类〉
 * @author PanYin
 * @create 2018/11/20
 * @since 1.0.0
 */
public class UserToAccount {
    private Integer userId;         //用户ID

    private String userNickname;    //用户昵称

    private String userHead;        //用户头像

    private String userPhone;       //手机号码

    private String userSex;         //性别

    private String userAddress;     //地址

    private String userDate;        //出生日期

    private String userPwd;         //密码

    private String userRegion;      //所属地区

    private String userQqsole;      //真实姓名

    private String userWxsole;      //职业

    private String userWbsole;      //爱好

    private String tenantSid;       //商家唯一标示

    private String tenantAddress;   //商家地址

    private String tenantBankEmail; //邮箱绑定

    private String tenantEnterinfo; //商家入驻信息

    private String userIdentity;    //身份标识1 表示普通会员  2 表示权限会员  3 表示商家

    private String shopName;        //店铺名称

    private String shopAddress;     //店铺地址

    private String shopHoldName;    //商家负责人

    private String shopHoldPhone;   //店铺联系电话

    private String mainbusiness;    //主营产品或业务

    private String businessImages;  //营业执照

    private String identityNumber;  //身份证号码

    private String identityImages;  //身份证正反面

    private String suppliesAddress; //供货地址

    private String suppliesPattern; //供货方式

    private Date suppliesDate;      //供货时段

    private String tenantPayPwd;    //支付密码

    private Integer accountId;      //资金ID
    private BigDecimal accountBalance;  //账户余额

    public UserToAccount(Integer userId, String userNickname, String userHead, String userPhone, String userSex, String userAddress, String userDate, String userPwd, String userRegion, String userQqsole, String userWxsole, String userWbsole, String tenantSid, String tenantAddress, String tenantBankEmail, String tenantEnterinfo, String userIdentity, String shopName, String shopAddress, String shopHoldName, String shopHoldPhone, String mainbusiness, String businessImages, String identityNumber, String identityImages, String suppliesAddress, String suppliesPattern, Date suppliesDate, String tenantPayPwd, Integer accountId, BigDecimal accountBalance) {
        this.userId = userId;
        this.userNickname = userNickname;
        this.userHead = userHead;
        this.userPhone = userPhone;
        this.userSex = userSex;
        this.userAddress = userAddress;
        this.userDate = userDate;
        this.userPwd = userPwd;
        this.userRegion = userRegion;
        this.userQqsole = userQqsole;
        this.userWxsole = userWxsole;
        this.userWbsole = userWbsole;
        this.tenantSid = tenantSid;
        this.tenantAddress = tenantAddress;
        this.tenantBankEmail = tenantBankEmail;
        this.tenantEnterinfo = tenantEnterinfo;
        this.userIdentity = userIdentity;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopHoldName = shopHoldName;
        this.shopHoldPhone = shopHoldPhone;
        this.mainbusiness = mainbusiness;
        this.businessImages = businessImages;
        this.identityNumber = identityNumber;
        this.identityImages = identityImages;
        this.suppliesAddress = suppliesAddress;
        this.suppliesPattern = suppliesPattern;
        this.suppliesDate = suppliesDate;
        this.tenantPayPwd = tenantPayPwd;
        this.accountId = accountId;
        this.accountBalance = accountBalance;
    }

    public UserToAccount() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserDate() {
        return userDate;
    }

    public void setUserDate(String userDate) {
        this.userDate = userDate;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserRegion() {
        return userRegion;
    }

    public void setUserRegion(String userRegion) {
        this.userRegion = userRegion;
    }

    public String getUserQqsole() {
        return userQqsole;
    }

    public void setUserQqsole(String userQqsole) {
        this.userQqsole = userQqsole;
    }

    public String getUserWxsole() {
        return userWxsole;
    }

    public void setUserWxsole(String userWxsole) {
        this.userWxsole = userWxsole;
    }

    public String getUserWbsole() {
        return userWbsole;
    }

    public void setUserWbsole(String userWbsole) {
        this.userWbsole = userWbsole;
    }

    public String getTenantSid() {
        return tenantSid;
    }

    public void setTenantSid(String tenantSid) {
        this.tenantSid = tenantSid;
    }

    public String getTenantAddress() {
        return tenantAddress;
    }

    public void setTenantAddress(String tenantAddress) {
        this.tenantAddress = tenantAddress;
    }

    public String getTenantBankEmail() {
        return tenantBankEmail;
    }

    public void setTenantBankEmail(String tenantBankEmail) {
        this.tenantBankEmail = tenantBankEmail;
    }

    public String getTenantEnterinfo() {
        return tenantEnterinfo;
    }

    public void setTenantEnterinfo(String tenantEnterinfo) {
        this.tenantEnterinfo = tenantEnterinfo;
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopHoldName() {
        return shopHoldName;
    }

    public void setShopHoldName(String shopHoldName) {
        this.shopHoldName = shopHoldName;
    }

    public String getShopHoldPhone() {
        return shopHoldPhone;
    }

    public void setShopHoldPhone(String shopHoldPhone) {
        this.shopHoldPhone = shopHoldPhone;
    }

    public String getMainbusiness() {
        return mainbusiness;
    }

    public void setMainbusiness(String mainbusiness) {
        this.mainbusiness = mainbusiness;
    }

    public String getBusinessImages() {
        return businessImages;
    }

    public void setBusinessImages(String businessImages) {
        this.businessImages = businessImages;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getIdentityImages() {
        return identityImages;
    }

    public void setIdentityImages(String identityImages) {
        this.identityImages = identityImages;
    }

    public String getSuppliesAddress() {
        return suppliesAddress;
    }

    public void setSuppliesAddress(String suppliesAddress) {
        this.suppliesAddress = suppliesAddress;
    }

    public String getSuppliesPattern() {
        return suppliesPattern;
    }

    public void setSuppliesPattern(String suppliesPattern) {
        this.suppliesPattern = suppliesPattern;
    }

    public Date getSuppliesDate() {
        return suppliesDate;
    }

    public void setSuppliesDate(Date suppliesDate) {
        this.suppliesDate = suppliesDate;
    }

    public String getTenantPayPwd() {
        return tenantPayPwd;
    }

    public void setTenantPayPwd(String tenantPayPwd) {
        this.tenantPayPwd = tenantPayPwd;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }
}
