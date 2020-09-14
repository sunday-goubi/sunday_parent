package com.sunday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: sunday
 * @License: (C) Copyright 2020-2099, 深圳市宏电技术股份有限公司
 * @Contact: www.hongdian.com
 * @Date: 2020/9/7 19:38
 * @Version: 1.0
 * @Description: books启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BooksApplication {
    public static void main(String[] args) {
        SpringApplication.run(BooksApplication.class,args);
        System.out.println("启动成功Successful");
    }
}
