package io.github.nnkwrik.goodsservice.model.po;

import lombok.Data;

import java.util.Date;

/**

 */
@Data
public class GoodsComment {
    private Integer id;
    private Integer goodsId;
    private String userId;
    private Integer replyCommentId;
    private String replyUserId;
    private String content;
    private Boolean isDelete;
    private Date createTime;
}
