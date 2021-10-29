package com.scu.qingshi.domain.authorize.param;

import javax.validation.constraints.NotNull;

/**
 * 基础授信请求类，所有授信相关请求必须继承该类
 * @author qingshi
 */
public abstract class BaseAuthorizationRequest {

    /**
     * 权限验证类型
     * 注册/登录/注销
     * {@link com.scu.qingshi.domain.authorize.enums.AuthorizationTypeEnum}
     */
    @NotNull
    private String type;

}
