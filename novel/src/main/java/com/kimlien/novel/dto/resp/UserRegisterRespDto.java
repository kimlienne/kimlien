package com.kimlien.novel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisterRespDto {
    @Schema(description = "Tài khoản")
    private Long uid;

    @Schema(description = "Token")
    private String token;
}
