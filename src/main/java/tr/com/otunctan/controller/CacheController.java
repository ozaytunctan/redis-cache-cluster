package tr.com.otunctan.controller;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.otunctan.redis.model.RedisUser;
import tr.com.otunctan.redis.service.CacheService;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/users/cache")
public class CacheController {

    private final CacheService cacheService;


    public CacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }


    @PostMapping(path = "")
    public Object cacheUser(@RequestBody RedisUser user) {
        cacheService.set("USER", user);
        return user;
    }


    @PostMapping(path = "/{id}")
    public RedisUser getCachedUserByName( @RequestBody MultiValueMap<String, Object> body){
        System.out.println(body);
        return null;
    }

}