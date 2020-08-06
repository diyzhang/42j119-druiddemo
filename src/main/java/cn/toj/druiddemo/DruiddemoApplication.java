package cn.toj.druiddemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.toj.druiddemo")
public class DruiddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DruiddemoApplication.class, args);
    }

}
