package io.github.nnkwrik.goodsservice.model.po;

import lombok.Data;

import java.util.Date;

/**
 */
@Data
public class UserPreference {
    private Integer id;
    private String userId;
    private Integer type;   //1:收藏，2：想要
    private Date createTime;
}
