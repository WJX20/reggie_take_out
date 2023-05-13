package com.wjx.reggie;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName ReggieApplication
 * @Description TODO
 * @Author 王锦翔
 * @Date 2023/4/22 17:39
 * @Version 1.0
 **/

@Slf4j
@SpringBootApplication
@ServletComponentScan
//@MapperScan
@EnableCaching
@EnableTransactionManagement
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class,args);
        log.info("我要启动日志");
    }
}
