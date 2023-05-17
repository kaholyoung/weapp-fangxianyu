package io.github.nnkwrik.goodsservice.model.po;

import lombok.Data;

/**

 */
@Data
public class Category {
    private Integer id;
    private String name;
    private Integer parentId;
    private String iconUrl;
    private Integer sortOrder;
}
