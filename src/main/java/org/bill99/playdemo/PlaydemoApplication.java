package org.bill99.playdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.bill99.playdemo.dao")
public class PlaydemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(PlaydemoApplication.class, args);
    }
}
