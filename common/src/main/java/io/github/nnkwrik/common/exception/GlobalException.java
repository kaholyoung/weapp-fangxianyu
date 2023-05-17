package io.github.nnkwrik.common.exception;

import lombok.Data;


@Data
public class GlobalException extends Exception {
    private int errno;
    private String errmsg;


    public GlobalException(int errno, String errmsg) {
        this.errno = errno;
        this.errmsg = errmsg;
    }
}
