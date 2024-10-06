package com.kimlien.novel.dto.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Builder
public class UserCommentRespDto {

    @Schema(description = "Nội dung binh luận")
    private String commentContent;

    @Schema(description = "Binh luan ve anh truyen")
    private String commentBookPic;

    @Schema(description = "Bình luận truyện")
    private String commentBook;

    @Schema(description = "Ngày bình luận")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime commentTime;

}
