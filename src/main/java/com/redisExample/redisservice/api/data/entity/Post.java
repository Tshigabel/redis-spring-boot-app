package com.redisExample.redisservice.api.data.entity;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Post implements Serializable {
    private String id;
    private String title;
    private String description;
    private String image;
    private int shares;
    private LocalDateTime createdTime;
}