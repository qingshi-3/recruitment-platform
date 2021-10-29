package com.scu.qingshi.common.response;

/**
 * 所有响应体需要实现该接口
 * @author qingshi
 */
@Deprecated
public interface GenerateResponseByMethod {

    public BaseResponse success(String code, String msg, Boolean success);

}
