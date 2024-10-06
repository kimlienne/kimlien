package com.kimlien.novel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookContentAboutRespDto {

    @Schema(description = "Thông tin truyện")
    private BookInfoRespDto bookInfo;

    @Schema(description = "Thông tin chương")
    private BookChapterRespDto chapterInfo;

    @Schema(description = "Nội dung truyện")
    private String bookContent;

}
