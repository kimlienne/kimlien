package com.kimlien.novel.dto.req;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kimlien.novel.Core.Common.Req.PageReqDto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;

@Data
public class BookSearchReqDto extends PageReqDto {

    @Parameter(description = "Từ khoá")
    private String keyword;

    @Parameter(description = "Hướng làm việc")
    private Integer workDirection;

    @Parameter(description = "ID thể loại")
    private Integer categoryId;

    @Parameter(description = "Tính phí: 1 - có, 0 - không")
    private Integer isVip;

    @Parameter(description = "Trạng thái: 0 - Đang ra, 1 -full")
    private Integer bookStatus;

    @Parameter(description = "Số từ tối thiểu")
    private Integer wordCountMin;

    @Parameter(description = "So tư toi da")
    private Integer wordCountMax;

    @Parameter(description = "Thoi gian cap nhat")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateTimeMin;

    @Parameter(description = "Truong sap xep")
    private String sort;
}

