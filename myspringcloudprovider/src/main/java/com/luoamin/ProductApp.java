package com.luoamin;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.luoamin.mapper")
public class ProductApp{
    /**
     * springboot版本过高，spring-boot-starter-parent(parent标签)
     * 会导致class not found，org.springframework.core.log.LogMessage
     * 可以从2.3.2切换为2.1.2
     * */
    public static void main(String[] args) {
        SpringApplication.run(ProductApp.class,args);
    }
}