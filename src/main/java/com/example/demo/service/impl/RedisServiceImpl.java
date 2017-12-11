package com.example.demo.service.impl;


import com.example.demo.model.UserRedisModel;
import com.example.demo.service.IRedisService;
import org.springframework.stereotype.Service;

/**
 * @author fkj
 * @date 2017/12/11 13:54
 **/
@Service
public class RedisServiceImpl extends IRedisService<UserRedisModel> {
    private static final String REDIS_KEY = "TEST_REDIS_KEY";

    @Override
    protected String getRedisKey() {
        return REDIS_KEY;
    }
}