package com.xuyang.service.Impl;

import com.xuyang.service.RedisService;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author YangJie
 * @Time 2018年10月25日19:27:50
 * @Discription Redis 实现类
 */
@Service("redisService")
public class RedisServiceImpl implements RedisService {

    @Resource
    private RedisTemplate<String, ?> redisTemplate;

    /**
     * @param key   目标key
     * @param value 目标值
     * @return 返回 true或false
     * @Discription 将要存储的对象或者集合设置到redis中去
     */
    @Override
    public boolean set(final String key, final String value) {
        boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                connection.set(serializer.serialize(key), serializer.serialize(value));
                return true;
            }
        });
        return result;
    }

    /**
     * @param key 目标key
     * @return 返回String 字符串
     * @Discription 从redis 中取出目标KEY
     */
    @Override
    public String get(final String key) {
        String result = redisTemplate.execute(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                byte[] value = connection.get(serializer.serialize(key));
                return serializer.deserialize(value);
            }
        });
        return result;
    }

    /**
     * 设置redis中存放数据的时间
     *
     * @param key    目标KEY
     * @param expire 时间
     * @return 返回true或false
     */
    @Override
    public boolean expire(final String key, long expire) {
        return redisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }

    /**
     * @param key 目标KEY
     * @return 返回 true或false
     * @Discription 从redis 中移除Key
     */
    @Override
    public boolean remove(final String key) {
        boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                connection.del(key.getBytes());
                return true;
            }
        });
        return result;
    }
}
