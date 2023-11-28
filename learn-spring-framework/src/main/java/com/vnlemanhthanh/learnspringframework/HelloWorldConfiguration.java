/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String firstLine, String city) {}

record Person(String name, int age, Address address) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Thanh";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age,Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifiers(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address4() {
        return new Address("Motinagar Street", "Hyderrabad");
    }

    @Bean
    public Person person3Params(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }
}
