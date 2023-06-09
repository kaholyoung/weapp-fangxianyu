package io.github.nnkwrik.imservice.model.po;

import lombok.Data;

import java.util.Date;

/**
 */
@Data
public class History {
    private Integer id;
    private Integer chatId;
    private Boolean u1ToU2;

    /*参考 constant.MessageType类*/
    private Integer messageType;
    private String messageBody;
    private Date sendTime;
}
