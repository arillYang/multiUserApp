package com.xuyang.util;

/**
 * @author create by YangJie
 * @Discription 验证码工具类
 * @Time 2018年11月13日13:37:01
 */
public class HttpSendSmsUtil {
    //用户的账号唯一标识“Account Sid”，在开发者控制台获取
    private static final String sid = "bdf0c4e30027eca39979405f8b98d441";
    //用户密钥“Auth Token”，在开发者控制台获取
    private static final String token = "59ab6204521fc162672e3dd07bf67925";
    //创建应用时系统分配的唯一标示
    private static final String appid = "5b7ffdf6d674456c8a358d1565c5b5a0";
    //可在后台短信产品→选择接入的应用→短信模板-模板ID，查看该模板ID
    private static final String templateid = "397338";

    public static String getSid() {
        return sid;
    }

    public static String getToken() {
        return token;
    }

    public static String getAppid() {
        return appid;
    }

    public static String getTemplateid() {
        return templateid;
    }
}
