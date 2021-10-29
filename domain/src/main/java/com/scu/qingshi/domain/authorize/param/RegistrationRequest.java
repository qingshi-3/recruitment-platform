package com.scu.qingshi.domain.authorize.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 注册请求
 * @author qingshi
 */
@Data
public class RegistrationRequest extends BaseAuthorizationRequest {

    /**
     * 电话
     */
    @NotNull
    private String phone;

    /**
     * 邮箱
     */
    @NotNull
    private String email;

    /**
     * 密码
     */
    @NotNull
    private String password;

}
