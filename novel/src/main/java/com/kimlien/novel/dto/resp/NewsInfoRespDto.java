package com.kimlien.novel.dto.resp;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewsInfoRespDto {

    @Schema(description = "ID tin tức")
    private Long id;

    @Schema(description = "ID thể loaị")
    private Long categoryId;

    @Schema(description = "Tên thể loaị")
    private String categoryName;

    @Schema(description = "Nguồn")
    private String sourceName;

    @Schema(description = "Tiêu đề")
    private String title;

    @Schema(description = "Ngày tạo")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime updateTime;

    @Schema(description = "Nôị dung")
    private String content;


}
