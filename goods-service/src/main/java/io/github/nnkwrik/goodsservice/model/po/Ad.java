package io.github.nnkwrik.goodsservice.model.po;

import lombok.Data;

import java.util.Date;

/**

 */
@Data
public class Ad {
    private Integer id;
    private String name;
    private String imageUrl;
    private String link;
    private Integer sortOrder;
    private Boolean enable;
    private Date create;
}
