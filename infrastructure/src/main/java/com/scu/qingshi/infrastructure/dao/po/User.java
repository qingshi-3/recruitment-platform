package com.scu.qingshi.infrastructure.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 青时
 * @since 2021-10-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    private String phone;

    private String openId;

    private String email;

    private String lastLoginIp;

    private Date creteTime;

    private Date modifyTime;

    private String status;


}
