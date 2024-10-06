package com.kimlien.novel.dto.resp;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.kimlien.novel.Core.Json.Serializer.UsernameSerializer;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookCommentRespDto {
    @Schema(description = "Tổng bình luận")
    private Long commentTotal;

    @Schema(description = "Danh sách bình luận")
    private List<CommentInfo> comments;

    @Data
    @Builder
    public static class CommentInfo {

        @Schema(description = "ID bình luận")
        private Long id;

        @Schema(description = "Nội dung")
        private String commentContent;

        @Schema(description = "Tài khoản bình luận")
        @JsonSerialize(using = UsernameSerializer.class)
        private String commentUser;

        @Schema(description = "ID người bình luận")
        private Long commentUserId;

        @Schema(description = "Ảnh đại diện")
        private String commentUserPhoto;

        @Schema(description = "Thời gian bình luận")
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime commentTime;

    }
}
