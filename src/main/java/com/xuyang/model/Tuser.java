package com.xuyang.model;

import java.io.Serializable;
import java.util.Date;

public class Tuser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_nickname
     *
     * @mbg.generated
     */
    private String userNickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_head
     *
     * @mbg.generated
     */
    private String userHead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_phone
     *
     * @mbg.generated
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_sex
     *
     * @mbg.generated
     */
    private String userSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_address
     *
     * @mbg.generated
     */
    private String userAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_date
     *
     * @mbg.generated
     */
    private String userDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_pwd
     *
     * @mbg.generated
     */
    private String userPwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_region
     *
     * @mbg.generated
     */
    private String userRegion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_qqsole
     *
     * @mbg.generated
     */
    private String userQqsole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_wxsole
     *
     * @mbg.generated
     */
    private String userWxsole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_wbsole
     *
     * @mbg.generated
     */
    private String userWbsole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.tenant_sid
     *
     * @mbg.generated
     */
    private String tenantSid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.tenant_address
     *
     * @mbg.generated
     */
    private String tenantAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.tenant_bank_email
     *
     * @mbg.generated
     */
    private String tenantBankEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.tenant_enterinfo
     *
     * @mbg.generated
     */
    private String tenantEnterinfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_identity
     *
     * @mbg.generated
     */
    private String userIdentity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.shop_name
     *
     * @mbg.generated
     */
    private String shopName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.shop_address
     *
     * @mbg.generated
     */
    private String shopAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.shop_hold_name
     *
     * @mbg.generated
     */
    private String shopHoldName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.shop_hold_phone
     *
     * @mbg.generated
     */
    private String shopHoldPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.mainbusiness
     *
     * @mbg.generated
     */
    private String mainbusiness;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.business_images
     *
     * @mbg.generated
     */
    private String businessImages;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.identity_number
     *
     * @mbg.generated
     */
    private String identityNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.identity_images
     *
     * @mbg.generated
     */
    private String identityImages;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.supplies_address
     *
     * @mbg.generated
     */
    private String suppliesAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.supplies_pattern
     *
     * @mbg.generated
     */
    private String suppliesPattern;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.supplies_date
     *
     * @mbg.generated
     */
    private Date suppliesDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.tenant_pay_pwd
     *
     * @mbg.generated
     */
    private String tenantPayPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_id
     *
     * @return the value of t_user.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_id
     *
     * @param userId the value for t_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_nickname
     *
     * @return the value of t_user.user_nickname
     *
     * @mbg.generated
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_nickname
     *
     * @param userNickname the value for t_user.user_nickname
     *
     * @mbg.generated
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_head
     *
     * @return the value of t_user.user_head
     *
     * @mbg.generated
     */
    public String getUserHead() {
        return userHead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_head
     *
     * @param userHead the value for t_user.user_head
     *
     * @mbg.generated
     */
    public void setUserHead(String userHead) {
        this.userHead = userHead == null ? null : userHead.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_phone
     *
     * @return the value of t_user.user_phone
     *
     * @mbg.generated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_phone
     *
     * @param userPhone the value for t_user.user_phone
     *
     * @mbg.generated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_sex
     *
     * @return the value of t_user.user_sex
     *
     * @mbg.generated
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_sex
     *
     * @param userSex the value for t_user.user_sex
     *
     * @mbg.generated
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_address
     *
     * @return the value of t_user.user_address
     *
     * @mbg.generated
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_address
     *
     * @param userAddress the value for t_user.user_address
     *
     * @mbg.generated
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_date
     *
     * @return the value of t_user.user_date
     *
     * @mbg.generated
     */
    public String getUserDate() {
        return userDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_date
     *
     * @param userDate the value for t_user.user_date
     *
     * @mbg.generated
     */
    public void setUserDate(String userDate) {
        this.userDate = userDate == null ? null : userDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_pwd
     *
     * @return the value of t_user.user_pwd
     *
     * @mbg.generated
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_pwd
     *
     * @param userPwd the value for t_user.user_pwd
     *
     * @mbg.generated
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_region
     *
     * @return the value of t_user.user_region
     *
     * @mbg.generated
     */
    public String getUserRegion() {
        return userRegion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_region
     *
     * @param userRegion the value for t_user.user_region
     *
     * @mbg.generated
     */
    public void setUserRegion(String userRegion) {
        this.userRegion = userRegion == null ? null : userRegion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_qqsole
     *
     * @return the value of t_user.user_qqsole
     *
     * @mbg.generated
     */
    public String getUserQqsole() {
        return userQqsole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_qqsole
     *
     * @param userQqsole the value for t_user.user_qqsole
     *
     * @mbg.generated
     */
    public void setUserQqsole(String userQqsole) {
        this.userQqsole = userQqsole == null ? null : userQqsole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_wxsole
     *
     * @return the value of t_user.user_wxsole
     *
     * @mbg.generated
     */
    public String getUserWxsole() {
        return userWxsole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_wxsole
     *
     * @param userWxsole the value for t_user.user_wxsole
     *
     * @mbg.generated
     */
    public void setUserWxsole(String userWxsole) {
        this.userWxsole = userWxsole == null ? null : userWxsole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_wbsole
     *
     * @return the value of t_user.user_wbsole
     *
     * @mbg.generated
     */
    public String getUserWbsole() {
        return userWbsole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_wbsole
     *
     * @param userWbsole the value for t_user.user_wbsole
     *
     * @mbg.generated
     */
    public void setUserWbsole(String userWbsole) {
        this.userWbsole = userWbsole == null ? null : userWbsole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.tenant_sid
     *
     * @return the value of t_user.tenant_sid
     *
     * @mbg.generated
     */
    public String getTenantSid() {
        return tenantSid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.tenant_sid
     *
     * @param tenantSid the value for t_user.tenant_sid
     *
     * @mbg.generated
     */
    public void setTenantSid(String tenantSid) {
        this.tenantSid = tenantSid == null ? null : tenantSid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.tenant_address
     *
     * @return the value of t_user.tenant_address
     *
     * @mbg.generated
     */
    public String getTenantAddress() {
        return tenantAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.tenant_address
     *
     * @param tenantAddress the value for t_user.tenant_address
     *
     * @mbg.generated
     */
    public void setTenantAddress(String tenantAddress) {
        this.tenantAddress = tenantAddress == null ? null : tenantAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.tenant_bank_email
     *
     * @return the value of t_user.tenant_bank_email
     *
     * @mbg.generated
     */
    public String getTenantBankEmail() {
        return tenantBankEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.tenant_bank_email
     *
     * @param tenantBankEmail the value for t_user.tenant_bank_email
     *
     * @mbg.generated
     */
    public void setTenantBankEmail(String tenantBankEmail) {
        this.tenantBankEmail = tenantBankEmail == null ? null : tenantBankEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.tenant_enterinfo
     *
     * @return the value of t_user.tenant_enterinfo
     *
     * @mbg.generated
     */
    public String getTenantEnterinfo() {
        return tenantEnterinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.tenant_enterinfo
     *
     * @param tenantEnterinfo the value for t_user.tenant_enterinfo
     *
     * @mbg.generated
     */
    public void setTenantEnterinfo(String tenantEnterinfo) {
        this.tenantEnterinfo = tenantEnterinfo == null ? null : tenantEnterinfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_identity
     *
     * @return the value of t_user.user_identity
     *
     * @mbg.generated
     */
    public String getUserIdentity() {
        return userIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_identity
     *
     * @param userIdentity the value for t_user.user_identity
     *
     * @mbg.generated
     */
    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity == null ? null : userIdentity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.shop_name
     *
     * @return the value of t_user.shop_name
     *
     * @mbg.generated
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.shop_name
     *
     * @param shopName the value for t_user.shop_name
     *
     * @mbg.generated
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.shop_address
     *
     * @return the value of t_user.shop_address
     *
     * @mbg.generated
     */
    public String getShopAddress() {
        return shopAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.shop_address
     *
     * @param shopAddress the value for t_user.shop_address
     *
     * @mbg.generated
     */
    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.shop_hold_name
     *
     * @return the value of t_user.shop_hold_name
     *
     * @mbg.generated
     */
    public String getShopHoldName() {
        return shopHoldName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.shop_hold_name
     *
     * @param shopHoldName the value for t_user.shop_hold_name
     *
     * @mbg.generated
     */
    public void setShopHoldName(String shopHoldName) {
        this.shopHoldName = shopHoldName == null ? null : shopHoldName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.shop_hold_phone
     *
     * @return the value of t_user.shop_hold_phone
     *
     * @mbg.generated
     */
    public String getShopHoldPhone() {
        return shopHoldPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.shop_hold_phone
     *
     * @param shopHoldPhone the value for t_user.shop_hold_phone
     *
     * @mbg.generated
     */
    public void setShopHoldPhone(String shopHoldPhone) {
        this.shopHoldPhone = shopHoldPhone == null ? null : shopHoldPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.mainbusiness
     *
     * @return the value of t_user.mainbusiness
     *
     * @mbg.generated
     */
    public String getMainbusiness() {
        return mainbusiness;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.mainbusiness
     *
     * @param mainbusiness the value for t_user.mainbusiness
     *
     * @mbg.generated
     */
    public void setMainbusiness(String mainbusiness) {
        this.mainbusiness = mainbusiness == null ? null : mainbusiness.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.business_images
     *
     * @return the value of t_user.business_images
     *
     * @mbg.generated
     */
    public String getBusinessImages() {
        return businessImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.business_images
     *
     * @param businessImages the value for t_user.business_images
     *
     * @mbg.generated
     */
    public void setBusinessImages(String businessImages) {
        this.businessImages = businessImages == null ? null : businessImages.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.identity_number
     *
     * @return the value of t_user.identity_number
     *
     * @mbg.generated
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.identity_number
     *
     * @param identityNumber the value for t_user.identity_number
     *
     * @mbg.generated
     */
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber == null ? null : identityNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.identity_images
     *
     * @return the value of t_user.identity_images
     *
     * @mbg.generated
     */
    public String getIdentityImages() {
        return identityImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.identity_images
     *
     * @param identityImages the value for t_user.identity_images
     *
     * @mbg.generated
     */
    public void setIdentityImages(String identityImages) {
        this.identityImages = identityImages == null ? null : identityImages.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.supplies_address
     *
     * @return the value of t_user.supplies_address
     *
     * @mbg.generated
     */
    public String getSuppliesAddress() {
        return suppliesAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.supplies_address
     *
     * @param suppliesAddress the value for t_user.supplies_address
     *
     * @mbg.generated
     */
    public void setSuppliesAddress(String suppliesAddress) {
        this.suppliesAddress = suppliesAddress == null ? null : suppliesAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.supplies_pattern
     *
     * @return the value of t_user.supplies_pattern
     *
     * @mbg.generated
     */
    public String getSuppliesPattern() {
        return suppliesPattern;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.supplies_pattern
     *
     * @param suppliesPattern the value for t_user.supplies_pattern
     *
     * @mbg.generated
     */
    public void setSuppliesPattern(String suppliesPattern) {
        this.suppliesPattern = suppliesPattern == null ? null : suppliesPattern.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.supplies_date
     *
     * @return the value of t_user.supplies_date
     *
     * @mbg.generated
     */
    public Date getSuppliesDate() {
        return suppliesDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.supplies_date
     *
     * @param suppliesDate the value for t_user.supplies_date
     *
     * @mbg.generated
     */
    public void setSuppliesDate(Date suppliesDate) {
        this.suppliesDate = suppliesDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.tenant_pay_pwd
     *
     * @return the value of t_user.tenant_pay_pwd
     *
     * @mbg.generated
     */
    public String getTenantPayPwd() {
        return tenantPayPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.tenant_pay_pwd
     *
     * @param tenantPayPwd the value for t_user.tenant_pay_pwd
     *
     * @mbg.generated
     */
    public void setTenantPayPwd(String tenantPayPwd) {
        this.tenantPayPwd = tenantPayPwd == null ? null : tenantPayPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", userHead=").append(userHead);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userSex=").append(userSex);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", userDate=").append(userDate);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", userRegion=").append(userRegion);
        sb.append(", userQqsole=").append(userQqsole);
        sb.append(", userWxsole=").append(userWxsole);
        sb.append(", userWbsole=").append(userWbsole);
        sb.append(", tenantSid=").append(tenantSid);
        sb.append(", tenantAddress=").append(tenantAddress);
        sb.append(", tenantBankEmail=").append(tenantBankEmail);
        sb.append(", tenantEnterinfo=").append(tenantEnterinfo);
        sb.append(", userIdentity=").append(userIdentity);
        sb.append(", shopName=").append(shopName);
        sb.append(", shopAddress=").append(shopAddress);
        sb.append(", shopHoldName=").append(shopHoldName);
        sb.append(", shopHoldPhone=").append(shopHoldPhone);
        sb.append(", mainbusiness=").append(mainbusiness);
        sb.append(", businessImages=").append(businessImages);
        sb.append(", identityNumber=").append(identityNumber);
        sb.append(", identityImages=").append(identityImages);
        sb.append(", suppliesAddress=").append(suppliesAddress);
        sb.append(", suppliesPattern=").append(suppliesPattern);
        sb.append(", suppliesDate=").append(suppliesDate);
        sb.append(", tenantPayPwd=").append(tenantPayPwd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}