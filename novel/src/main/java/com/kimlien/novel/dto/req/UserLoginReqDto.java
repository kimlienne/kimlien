package com.kimlien.novel.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserLoginReqDto {
    @Schema(description = "Số điện thoại", required = true, example = "18888888888")
    @NotBlank(message = "Không được để trống số điện thoại")
    @Pattern(regexp = "^1[3|4|5|6|7|8|9][0-9]{9}$", message = "Định dạng số điện thoại sai")
    private String username;

    @Schema(description = "Mật khẩu", required = true, example = "123456")
    @NotBlank(message = "Không được để trống mật khẩu")
    private String password;
}
