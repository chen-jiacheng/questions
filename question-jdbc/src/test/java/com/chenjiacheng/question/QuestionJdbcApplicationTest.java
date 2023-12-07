package com.chenjiacheng.question;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by chenjiacheng on 2023/12/7 23:35
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Slf4j
@SpringBootTest
class QuestionJdbcApplicationTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    void index() {
        System.out.println("ctx = " + ctx);
    }
}