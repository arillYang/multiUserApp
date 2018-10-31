package com.xuyang.util;

import java.util.UUID;

/**
 * @author create by YangJie
 * @Discription UUid 生成工厂
 * @Time 2018年10月30日14:28:43
 */
public class UUIDFactory {
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("\\-", "");
    }
}
