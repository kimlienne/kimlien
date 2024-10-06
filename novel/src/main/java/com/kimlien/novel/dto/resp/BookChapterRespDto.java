package com.kimlien.novel.dto.resp;

import java.io.Serial;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookChapterRespDto {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "ID chapter")
    private Long id;

    @Schema(description = "ID truyện")
    private Long bookId;

    @Schema(description = "Số chương")
    private Integer chapterNum;

    @Schema(description = "Tên chương")
    private String chapterName;

    @Schema(description = "Số từ của chương")
    private Integer chapterWordCount;

    @Schema(description = "Ngày cập nhật chương")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime chapterUpdateTime;

    @Schema(description = "Trả phí: 1 - trả phí, 0 - miễn phí")
    private Integer isVip;
}
