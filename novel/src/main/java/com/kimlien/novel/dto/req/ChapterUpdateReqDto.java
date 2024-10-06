package com.kimlien.novel.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class ChapterUpdateReqDto {

    @NotBlank
    @Schema(description = "Tên chương", required = true)
    private String chapterName;

    @Schema(description = "Nội dung", required = true)
    @NotBlank
    @Length(min = 50)
    private String chapterContent;

    @Schema(description = "Trả phí: 1 - co 0 - khong", required = true)
    @NotNull
    private Integer isVip;

}

