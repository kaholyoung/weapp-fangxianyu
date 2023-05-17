package io.github.nnkwrik.goodsservice.model.po;

import lombok.Data;

/**

 */
@Data
public class Channel{
    private Integer id;
    private String name;
    private String url;
    private String iconUrl;
    private Integer sortOrder;
}
