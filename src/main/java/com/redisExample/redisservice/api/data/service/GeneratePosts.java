package com.redisExample.redisservice.api.data.service;

import com.redisExample.redisservice.api.data.entity.Post;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class GeneratePosts {


    @Cacheable("addresses")
    public List<Post> getTopPosts(@RequestParam Integer number) {

        List<Post> posts = new ArrayList<>();
        for(int i =0; i< number ;i++)
        {
            Post temp =  new Post();
            temp.setCreatedTime(LocalDateTime.now());
            temp.setDescription("Item no "+ i);
            posts.add(temp);
        }
        return posts;
    }
}
