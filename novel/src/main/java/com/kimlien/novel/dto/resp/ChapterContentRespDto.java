package com.kimlien.novel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ChapterContentRespDto {

    @Schema(description = "Tên chương")
    private String chapterName;

    @Schema(description = "Noi dung chuong")
    private String chapterContent;

    @Schema(description = "Tra phi: 1 - co 0 - khong")
    private Integer isVip;

}