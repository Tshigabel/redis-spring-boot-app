package com.redisExample.redisservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
@EnableCaching
@SpringBootApplication
public class RedisServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(RedisServiceApplication.class, args);
	}
}
