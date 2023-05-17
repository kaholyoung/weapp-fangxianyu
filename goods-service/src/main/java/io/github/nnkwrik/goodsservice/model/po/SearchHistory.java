package io.github.nnkwrik.goodsservice.model.po;

import lombok.Data;

import java.util.Date;

/**
 */
@Data
public class SearchHistory {
    private Integer id;
    private String userId;
    private String keyword;
    private Date searchTime;
}
