package com.kimlien.novel.dto.req;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserInfoUptReqDto {
    private Long userId;

    @Schema(description = "Biệt danh")
    @Length(min = 2,max = 10)
    private String nickName;

    @Schema(description = "Địa chỉ hồ sơ")
    @Pattern(regexp="^/[^\s]{10,}\\.(png|PNG|jpg|JPG|jpeg|JPEG|gif|GIF|bpm|BPM)$")
    private String userPhoto;

    @Schema(description = "Giới tính")
    @Min(value = 0)
    @Max(value = 1)
    private Integer userSex;
}
