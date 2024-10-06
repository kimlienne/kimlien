package com.kimlien.novel.Core.Common.Req;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;

@Data
public class PageReqDto {
    
    @Parameter(description = "Số trang yêu cầu, mặc định là 1")
    private int pageNum = 1;

    @Parameter(description = "Kích thước mỗi trang, mặc định là 10")
    private int pageSize = 10;

    //truy vấn tất cả, mặc định là không, nếu đúng PageNum và PageSize không hợp lệ
    @Parameter(hidden = true)
    private boolean fetchAll = false;
}
