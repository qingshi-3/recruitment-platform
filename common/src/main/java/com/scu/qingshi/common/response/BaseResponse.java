package com.scu.qingshi.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 响应类基类，所有响应体必须继承该类
 * @author qingshi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse {

    String code;

    String msg;

    Boolean success;

}
