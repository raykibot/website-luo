package com.luo.infrastructure.redis;


import com.luo.infrastructure.model.Project;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RedissonService implements IRedissonService {


    @Resource
    private RedissonClient redissonClient;


    @Override
    public <T> void setValue(String key, T value) {
        RBucket<Object> bucket = redissonClient.getBucket(key);
        bucket.set(value);
    }

    @Override
    public <T> T getValue(String key) {
        return redissonClient.<T>getBucket(key).get();
    }
}
