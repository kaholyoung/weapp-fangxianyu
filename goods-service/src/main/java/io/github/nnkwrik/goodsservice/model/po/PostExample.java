package io.github.nnkwrik.goodsservice.model.po;

import lombok.Data;

import java.util.List;

/**

 */
@Data
public class PostExample extends Goods{
    private List<String> images;
}
