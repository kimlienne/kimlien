package com.kimlien.novel.Controller.Front;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kimlien.novel.Core.Common.Resp.RestResp;
import com.kimlien.novel.Core.Constant.ApiRouterConsts;
import com.kimlien.novel.Service.NewsService;
import com.kimlien.novel.dto.resp.NewsInfoRespDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "NewsController", description = "Modul tin tức")
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_NEWS_URL_PREFIX)
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @Operation(summary = "Danh sách tin tức mới nhất")
    @GetMapping("latest_list")
    public RestResp<List<NewsInfoRespDto>> listLatestNews() {
        return newsService.listLatestNews();
    }

    @Operation(summary = "Truy vấn thông tin tin tức")
    @GetMapping("{id}")
    public RestResp<NewsInfoRespDto> getNews(
        @Parameter(description = "ID tin tức") @PathVariable Long id) {
        return newsService.getNews(id);
    }
}

