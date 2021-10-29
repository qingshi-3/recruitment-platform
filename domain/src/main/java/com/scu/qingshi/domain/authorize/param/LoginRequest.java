package com.scu.qingshi.domain.authorize.param;

import lombok.Data;

/**
 * 登陆请求
 * @author qingshi
 */
@Data
public class LoginRequest extends BaseAuthorizationRequest{

    private String phone;

}
