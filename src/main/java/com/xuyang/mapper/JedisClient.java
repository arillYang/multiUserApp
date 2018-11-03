package com.xuyang.mapper;

public interface JedisClient {
    String get(String string);
    void del(String string);
}
