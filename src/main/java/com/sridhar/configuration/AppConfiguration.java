package com.sridhar.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = "com.sridhar")

public class AppConfiguration {


    public static void main(String[] args) {
        SpringApplication.run(AppConfiguration.class);
    }

}
