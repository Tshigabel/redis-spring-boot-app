package com.redisExample.redisservice.api.controller;

import com.redisExample.redisservice.api.data.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/preference")
public class PostController {


    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Cacheable(value = "post-top", key = "#number")
    @GetMapping("/top")
    public List<Post> getTopPosts(@RequestParam("number") Integer number) {

        List<Post> posts = new ArrayList<>();
        for(int i =0; i< number ;i++)
        {
            Post temp =  new Post();
            temp.setCreatedTime(LocalDateTime.now());
            temp.setDescription("Item no "+ i);
            posts.add(temp);
        }
        //this.redisTemplate.convertAndSend("posts", "hello world");
        return posts;
    }
}
