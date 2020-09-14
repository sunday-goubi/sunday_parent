package com.sunday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: sunday
 * @License: (C) Copyright 2020-2099, 深圳市宏电技术股份有限公司
 * @Contact: www.hongdian.com
 * @Date: 2020/9/8 19:26
 * @Version: 1.0
 * @Description: 网关启动类
 */
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
        System.out.println("启动成功Successful");
    }
}
