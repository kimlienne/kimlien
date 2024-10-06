package com.kimlien.novel.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BookAddReqDto {
   
    @Schema(description = "Giới tính; 0-Nam 1-Nữ", required = true)
    @NotNull
    private Integer workDirection;

    @Schema(description = "ID danh mục", required = true)
    @NotNull
    private Long categoryId;

    @Schema(description = "Tên danh mục", required = true)
    @NotBlank
    private String categoryName;

    @Schema(description = "Ảnh bìa", required = true)
    @NotBlank
    private String picUrl;

    @Schema(description = "Tên truyện", required = true)
    @NotBlank
    private String bookName;

    @Schema(description = "Nội dung", required = true)
    @NotBlank
    private String bookDesc;

    @Schema(description = "Tính phí;1- có 0-miễn phí", required = true)
    @NotNull
    private Integer isVip;
}
