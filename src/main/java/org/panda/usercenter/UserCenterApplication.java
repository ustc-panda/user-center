package org.panda.usercenter;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 *  @author sunweipeng <https://github.com/ustc-panda?tab=repositories>
 *  Created on 2024-03-08
 */
@SpringBootApplication
@MapperScan("org.panda.usercenter.mapper")
public class UserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }

}
