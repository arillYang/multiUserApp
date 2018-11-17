package com.xuyang.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailUtil {
    /**
     * @param to   给谁发
     * @param text 发送内容
     * @Discription 邮箱验证 发送邮件
     * @author create by YangJie
     */
    public static void send_mail(String to, String text) throws MessagingException {
        //创建连接对象 连接到邮件服务器
        Properties properties = new Properties();
        //设置发送邮件的基本参数
        //发送邮件服务器
        properties.put("mail.smtp.host", "smtp.163.com");
        //发送端口
        properties.put("mail.smtp.port", "25");
        properties.put("mail.smtp.auth", "true");
        //设置发送邮件的账号和密码
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                //两个参数分别是发送邮件的账户和密码【可换成企业邮箱】
                return new PasswordAuthentication("15823914401@163.com", "YJ123456789");
            }
        });

        //创建邮件对象
        Message message = new MimeMessage(session);
        //设置发件人
        message.setFrom(new InternetAddress("15823914401@163.com"));
        //设置收件人
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        //设置主题
        message.setSubject("这是一份测试邮件");
        //设置邮件正文  第二个参数是邮件发送的类型
        message.setContent(text, "text/html;charset=UTF-8");
        //发送一封邮件
        Transport.send(message);
    }


    public static void main(String[] args) {
        int code = (int) ((Math.random() * 9 + 1) * 100000);
        try {
            MailUtil.send_mail("15215157508@163.com", "【多用户商城】友情提示您：尊敬的用户您好，您本次的注册验证码是:" + String.valueOf(code) + ",请您在15分钟之内完成验证！");
            MailUtil.send_mail("1045524818@qq.com", "【多用户商城】友情提示您：尊敬的用户您好，您本次的注册验证码是:" + String.valueOf(code) + ",请您在15分钟之内完成验证！");
            System.out.println("邮件发送成功!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
