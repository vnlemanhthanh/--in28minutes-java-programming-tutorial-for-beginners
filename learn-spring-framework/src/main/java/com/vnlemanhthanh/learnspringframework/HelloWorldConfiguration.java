/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Thanh";
    }
}
