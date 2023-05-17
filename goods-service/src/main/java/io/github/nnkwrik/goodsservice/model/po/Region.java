package io.github.nnkwrik.goodsservice.model.po;

import lombok.Data;

/**

 */
@Data
public class Region {
    private Integer id;
    private Integer parentId;
    private String name;
    private Integer type;
    private Integer agencyId;
}
