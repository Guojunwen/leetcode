package com.guo.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LeetcodeApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LeetcodeApplication.class, args);
        String serverPort = context.getEnvironment().getProperty("server.port");
        System.out.println("started at http://localhost:" + serverPort);
    }

}
