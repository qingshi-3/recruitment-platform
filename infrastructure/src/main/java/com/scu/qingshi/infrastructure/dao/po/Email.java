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
@ApiModel(value="Email对象", description="")
public class Email implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "email_id", type = IdType.AUTO)
    private Integer emailId;

    private String status;

    private String content;

    private Integer interId;

    private Date createTime;

    private Date modifyTime;


}
