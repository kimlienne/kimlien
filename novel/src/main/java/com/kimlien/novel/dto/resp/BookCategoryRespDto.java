package com.kimlien.novel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookCategoryRespDto {

    @Schema(description = "ID danh mục")
    private Long id;

    /**
     * 类别名
     */
    @Schema(description = "Tên danh mục")
    private String name;
}
