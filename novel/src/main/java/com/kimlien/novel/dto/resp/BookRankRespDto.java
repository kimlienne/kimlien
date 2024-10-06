package com.kimlien.novel.dto.resp;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BookRankRespDto implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;
    
    @Schema(description = "ID truyện")
    private Long id;

    @Schema(description = "ID danh mục")
    private Long categoryId;

    @Schema(description = "Tên danh mục")
    private String categoryName;

    @Schema(description = "Ảnh bìa")
    private String picUrl;

    @Schema(description = "Tên truyện")
    private String bookName;

    @Schema(description = "Tác giả")
    private String authorName;

    @Schema(description = "Mô tả")
    private String bookDesc;

    @Schema(description = "Số chữ")
    private Integer wordCount;

    @Schema(description = "Chương đầu")
    private String lastChapterName;

    @Schema(description = "Thời gian cập nhật chương mới nhất")
    @JsonFormat(pattern = "MM/dd HH:mm")
    private LocalDateTime lastChapterUpdateTime;
}
