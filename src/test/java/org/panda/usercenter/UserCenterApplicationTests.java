package org.panda.usercenter;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

/**
 * 启动类测试
 *
 *  @author sunweipeng <https://github.com/ustc-panda?tab=repositories>
 *  Created on 2024-03-08
 */
@SpringBootTest
class UserCenterApplicationTests {


    @Test
    void testDigest() throws NoSuchAlgorithmException {
        String newPassword = DigestUtils.md5DigestAsHex(("abcd" + "mypassword").getBytes());
        System.out.println(newPassword);
    }


    @Test
    void contextLoads() {

    }

}