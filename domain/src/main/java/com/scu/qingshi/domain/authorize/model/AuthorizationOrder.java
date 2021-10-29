package com.scu.qingshi.domain.authorize.model;

/**
 * 授信单
 * @author qingshi
 */
public class AuthorizationOrder {

    /**
     * 电话
     */
    private String phone;

    /**
     * 授信单状态
     * {@link com.scu.qingshi.domain.authorize.enums.AuthorizationStatusEnum}
     */
    private String status;

    /**
     * 授信单号
     */
    private String creditNo;

}
