package com.kimlien.novel.Service;

import com.kimlien.novel.Core.Common.Resp.PageRespDto;
import com.kimlien.novel.Core.Common.Resp.RestResp;
import com.kimlien.novel.dto.req.BookSearchReqDto;
import com.kimlien.novel.dto.resp.BookInfoRespDto;

public interface SearchService {

    RestResp<PageRespDto<BookInfoRespDto>> searchBooks(BookSearchReqDto condition);

}
