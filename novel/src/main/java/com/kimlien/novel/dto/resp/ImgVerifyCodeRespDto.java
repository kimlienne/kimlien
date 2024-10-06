package com.kimlien.novel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ImgVerifyCodeRespDto {

    @Schema(description = "sessionId")
    private String sessionId;

    @Schema(description = "Base64 Hinh anh ma xac minh duoc ma hoa")
    private String img;

}
