package com.kimlien.novel.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class ChapterAddReqDto {

    @Schema(description = "ID truyện", required = true)
    private Long bookId;

    @NotBlank
    @Schema(description = "Tên chuơng", required = true)
    private String chapterName;

    @Schema(description = "Nội dung chuơng", required = true)
    @NotBlank
    @Length(min = 50)
    private String chapterContent;

    @Schema(description = "Trả phí: 1 - co phi 0 - mien phi", required = true)
    @NotNull
    private Integer isVip;
}
