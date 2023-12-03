package tr.com.otunctan.redis.service;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import tr.com.otunctan.redis.model.RedisUser;

import java.time.Duration;

@Service
public class CacheServiceImpl implements CacheService {

    private final RedisTemplate<String, Object> redisTemplate;

    public CacheServiceImpl(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public <T> T get(String key) {
        Object value = redisTemplate.opsForValue().get(key);
        return (T) value;
    }

    @Override
    public <T> void set(String key, T value) {
        redisTemplate.opsForValue().set(key, value, Duration.ofMinutes(2L));
    }


    @Override
    public void cacheUser(String key, RedisUser redisUser) {
        set(key, redisUser);
    }

    @Override
    public RedisUser getCacheUser(String key) {
        return get(key);
    }


    @Override
    public RedisUser getCacheUserById(Long id) {
        return null;
    }
}