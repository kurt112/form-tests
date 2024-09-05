package com.onboarding.test.zoloz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

@Configuration
public class CacheManagerConfig {

    @Bean
    RedisCacheManager cacheManager(RedisConnectionFactory redisConnectionFactory,
                                   RedisCacheConfiguration redisCacheConfiguration) {

        return RedisCacheManager.builder(redisConnectionFactory)
                .cacheDefaults(redisCacheConfiguration)
                .transactionAware()
                .build();
    }
}
