package com.kimlien.novel.dto.req;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserRegisterReqDto {

    @Schema(description = "Số điện thoại", required = true)
    @NotBlank(message="Không được để trống số điện thoại")
    @Pattern(regexp="^1[3|4|5|6|7|8|9][0-9]{9}$",message="Định dạng số điện thoại sai")
    private String username;

    @Schema(description = "Mật khẩu", required = true)
    @NotBlank(message="Không được để trống mật khẩu")
    private String password;

    @Schema(description = "Mã xác thực", required = true)
    @NotBlank(message="Không để trống mã xác thực")
    @Pattern(regexp="^\\d{4}$",message="Định dạng mã xác thực sai")
    private String velCode;

    //Hiển thị yêu cầu xem mã thuộc về phiên đồ họa
    @Schema(description = "sessionId", required = true)
    @NotBlank
    @Length(min = 32,max = 32)
    
    private String sessionId;
}
