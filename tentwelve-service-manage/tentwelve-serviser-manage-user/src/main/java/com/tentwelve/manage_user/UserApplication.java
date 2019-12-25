package com.tentwelve.manage_user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/24 10:30 下午
 * @Description:
 */

@SpringBootApplication
@MapperScan("com.tentwelve.manage_user.mapper") //扫描 com.tentwelve.manage_article.mapper
@EntityScan("com.tentwelve.entity.base")//扫描实体类
@ComponentScan(basePackages={"com.tentwelve.api"})//扫描接口
@ComponentScan(basePackages={"com.tentwelve.manage_user"})
@ComponentScan(basePackages={"com.tentwelve"})//扫描common下的所有类
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
