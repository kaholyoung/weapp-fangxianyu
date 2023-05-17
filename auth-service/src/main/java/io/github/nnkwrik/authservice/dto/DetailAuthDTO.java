package io.github.nnkwrik.authservice.dto;

import lombok.Data;


@Data
public class DetailAuthDTO {
    public String signature;
    public String rawData;
    public String encryptedData;
    public String iv;
}
