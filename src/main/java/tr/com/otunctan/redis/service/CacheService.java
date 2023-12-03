package tr.com.otunctan.redis.service;


import tr.com.otunctan.redis.model.RedisUser;

public interface CacheService {

    <T> T get(String key);

    <T> void set(String key, T value);


    void cacheUser(String key, RedisUser redisUser);

    RedisUser getCacheUser(String key);


    RedisUser getCacheUserById(Long id);
}