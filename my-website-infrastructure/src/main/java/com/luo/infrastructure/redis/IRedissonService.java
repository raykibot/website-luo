package com.luo.infrastructure.redis;


import com.luo.infrastructure.model.Project;

import java.util.List;

public interface IRedissonService {

    <T> void setValue(String key, T value);

    <T> T getValue(String key);


}
