package com.kimlien.novel.dto.resp;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class HomeFriendLinkRespDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Tên liên kết")
    private String linkName;

    @Schema(description = "url liên kết")
    private String linkUrl;
}