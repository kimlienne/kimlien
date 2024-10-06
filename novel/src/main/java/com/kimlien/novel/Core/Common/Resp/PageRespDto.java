package com.kimlien.novel.Core.Common.Resp;

import java.util.List;
import lombok.Getter;

@Getter
public class PageRespDto<T> {

    //Số trang
    private final long pageNum;

    //Kích thước mỗi trang
    private final long pageSize;

    //Tổng
    private final long total;

    //Tap dữ liệu được phân trang
    private final List<? extends T> list;

    //Truy vấn phân trang
    public PageRespDto(long pageNum, long pageSize, long total, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.list = list;
    }

    public static <T> PageRespDto<T> of(long pageNum, long pageSize, long total, List<T> list) {
        return new PageRespDto<>(pageNum, pageSize, total, list);
    }

    //Lấy số trang
    public long getPages() {
        if (this.pageSize == 0L) {
            return 0L;
        } else {
            long pages = this.total / this.pageSize;
            if (this.total % this.pageSize != 0L) {
                ++pages;
            }
            return pages;
        }
    }
}
