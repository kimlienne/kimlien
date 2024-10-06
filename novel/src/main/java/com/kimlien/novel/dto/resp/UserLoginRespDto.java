package com.kimlien.novel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserLoginRespDto {
    @Schema(description = "ID tài khoản")
    private Long uid;

    @Schema(description = "Tên tài khoản")
    private String nickName;

    @Schema(description = "token")
    private String token;
}
