package com.luo.infrastructure.redis;


import org.redisson.client.RedisConnection;

import javax.annotation.Resource;

public class RedissonClient implements IRedissonClient{


    @Resource
    private RedisConnection redissonClient;


}
