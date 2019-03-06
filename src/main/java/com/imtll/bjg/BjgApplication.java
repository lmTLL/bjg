package com.imtll.bjg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.imtll.bjg.dao")
@EnableTransactionManagement//启用事务
public class BjgApplication {

    public static void main(String[] args) {
        SpringApplication.run(BjgApplication.class, args);
    }

}
