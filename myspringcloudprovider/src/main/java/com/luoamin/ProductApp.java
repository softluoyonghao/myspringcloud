package com.luoamin;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.luoamin.mapper")
@EnableEurekaClient
public class ProductApp{
    /**
     * springboot版本过高，spring-boot-starter-parent(parent标签)
     * 会导致class not found，org.springframework.core.log.LogMessage
     * 可以从2.3.2切换为2.1.2,EnableEurekaClient注解代表eureka客户端
     * */
    public static void main(String[] args) {
        SpringApplication.run(ProductApp.class,args);
    }
}