package com.xuyang.util;

import redis.clients.jedis.Jedis;

/**
 * @author YangJie
 * @Discription Redis 工具类
 * @Time 2018年10月25日19:32:13
 */
public class RedisClinet {
    private static final String ip = "127.0.0.1";//服务器IP
    private static final int port = 6379; //默认端口
    protected static RedisClinet redis = new RedisClinet();
    protected static Jedis jedis = new Jedis(ip, port);

    static {

    }

    /**
     * 测试是否添加到redis 中
     */
    protected RedisClinet() {
        System.out.println(" init Redis ");
    }

    public static RedisClinet getInstance() {
        return redis;
    }

    /**
     * set Object
     */
    public String set(Object object, String key) {
        return jedis.set(key.getBytes(), SerializeUtil.serialize(object));
    }

    /**
     * get Object
     */
    public Object get(String key) {
        byte[] value = jedis.get(key.getBytes());
        return SerializeUtil.unserialize(value);
    }


    /**
     * delete a key
     **/
    public boolean del(String key) {
        return jedis.del(key.getBytes()) > 0;
    }
}
