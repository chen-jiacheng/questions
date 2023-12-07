package com.chenjiacheng.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by chenjiacheng on 2023/12/7 23:09
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@SpringBootApplication
@RestController
@RequestMapping("/app")
public class QuestionJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuestionJdbcApplication.class, args);

    }

    @GetMapping("/")
    public String index(){
        return LocalDateTime.now().toString();
    }

}