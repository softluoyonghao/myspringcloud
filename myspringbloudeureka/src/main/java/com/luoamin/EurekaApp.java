package com.luoamin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 22931 on 2020/8/30.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
    /**
     * 访问localhost:7071可以成功说明eureka服务搭建成功，EnableEurekaServer代表的是服务端，需要服务提供方
     * 使用client，将接口注入
      */

    //
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class,args);
    }
}
