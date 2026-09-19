package com.beeru.Greetings.config;

import java.time.LocalTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeConfig {

    public TimeConfig() {
        System.out.println("TimeConfig bean created");
    }

    @Bean
    public LocalTime createTime() {
        return LocalTime.now();
    }
}