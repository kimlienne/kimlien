package com.kimlien.novel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfoRespDto {
    //Tên riêng
    @Schema(description = "Biệt danh")
    private String nickName;

    //Ảnh đại diện
    @Schema(description = "Ảnh đại diện")
    private String userPhoto;

    //Giới tính
    @Schema(description = "Giới tính")
    private Integer userSex;
}
