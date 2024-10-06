package com.kimlien.novel.Service;

import java.util.List;

import com.kimlien.novel.Core.Common.Resp.RestResp;
import com.kimlien.novel.dto.resp.NewsInfoRespDto;

public interface NewsService {

    RestResp<List<NewsInfoRespDto>> listLatestNews();

    RestResp<NewsInfoRespDto> getNews(Long id);
}