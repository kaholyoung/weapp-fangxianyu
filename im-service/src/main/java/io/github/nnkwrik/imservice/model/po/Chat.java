package io.github.nnkwrik.imservice.model.po;

import lombok.Data;

/**

 */
@Data
public class Chat {
    private Integer id;
    private String u1;   //u1 < u2
    private String u2;
    private Integer goodsId;

    private Boolean showToU1;
    private Boolean showToU2;
}
