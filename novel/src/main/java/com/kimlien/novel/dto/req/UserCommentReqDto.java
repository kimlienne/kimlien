package com.kimlien.novel.dto.req;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserCommentReqDto {
    private Long userId;

    @Schema(description = "ID truyện", required = true)
    @NotNull(message="ID truyện không được để trống")
    private Long bookId;

    @Schema(description = "Nội dung bình luận", required = true)
    @NotBlank(message="Không được bình luận")
    @Length(min = 10,max = 512)
    private String commentContent;
}
