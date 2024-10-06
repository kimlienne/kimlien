package com.kimlien.novel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookChapterAboutRespDto {

    private BookChapterRespDto chapterInfo;

    @Schema(description = "Tổng số chương")
    private Long chapterTotal;

    @Schema(description = "Tổng quan")
    private String contentSummary;
}
