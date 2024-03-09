package org.panda.usercenter.model.domain.request;

import java.io.Serializable;

import lombok.Data;

/**
 * 用户注册请求体
 *
 *  @author sunweipeng <https://github.com/ustc-panda?tab=repositories>
 *  Created on 2024-03-08
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 校验密码
     */
    private String checkPassword;

    /**
     * 星球编号
     */
    private String planetCode;
}