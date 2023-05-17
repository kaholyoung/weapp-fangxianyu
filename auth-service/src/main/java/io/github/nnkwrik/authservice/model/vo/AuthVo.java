package io.github.nnkwrik.authservice.model.vo;

import io.github.nnkwrik.common.dto.JWTUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthVo {
    private String token;
    //    private String openId;
    //    private String nickName;
    //    private String avatarUrl;
    private JWTUser userInfo;


}