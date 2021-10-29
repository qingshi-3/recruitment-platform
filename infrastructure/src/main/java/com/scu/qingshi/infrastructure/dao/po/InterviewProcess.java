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
@ApiModel(value="InterviewProcess对象", description="")
public class InterviewProcess implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "inter_id", type = IdType.AUTO)
    private Integer interId;

    private Integer curNodeId;

    private String nodes;

    private Integer nodeCount;

    private Integer userId;

    private Date createTime;

    private Date modifyTime;


}
