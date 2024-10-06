package com.kimlien.novel.dto.resp;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookInfoRespDto {
   
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

    @Schema(description = "ID tác giả")
    private Long authorId;

    @Schema(description = "Tên tác giả")
    private String authorName;

    @Schema(description = "Mô tả")
    private String bookDesc;

    @Schema(description = "Trạng thái: 0 - Hoàn thành, 1 - Đang ra")
    private Integer bookStatus;

    @Schema(description = "Lượt xem")
    private Long visitCount;

    @Schema(description = "Số từ")
    private Integer wordCount;

    @Schema(description = "Nhận xét")
    private Integer commentCount;

    @Schema(description = "ID chương đầu")
    private Long firstChapterId;

    @Schema(description = "ID chương cuối")
    private Long lastChapterId;

    @Schema(description = "Tên chương đầu")
    private String lastChapterName;

    @Schema(description = "Ngày cập nhật")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime updateTime;
}
