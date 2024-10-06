package com.kimlien.novel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class HomeBookRespDto {

    @Schema(description = "Loai;0-Băng truyền 1-Thanh trên 2-Đề xuất tuần 3-Đe xuat hap dan 4-Đề xuất chất lượng cao")
    private Integer type;

    @Schema(description = "ID truyện")
    private Long bookId;

    @Schema(description = "Anh bia")
    private String picUrl;

    @Schema(description = "Tên truyện")
    private String bookName;

    @Schema(description = "Ten tac gia")
    private String authorName;

    @Schema(description = "Mô tả sách")
    private String bookDesc;

}
