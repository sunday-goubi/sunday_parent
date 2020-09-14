package com.sunday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: sunday
 * @License: (C) Copyright 2020-2099, 深圳市宏电技术股份有限公司
 * @Contact: www.hongdian.com
 * @Date: 2020/9/7 19:19
 * @Version: 1.0
 * @Description: 用户服务启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
        System.out.println("启动成功Successful");
    }
}
