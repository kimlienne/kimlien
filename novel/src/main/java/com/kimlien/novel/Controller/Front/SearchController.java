package com.kimlien.novel.Controller.Front;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kimlien.novel.Core.Common.Resp.PageRespDto;
import com.kimlien.novel.Core.Common.Resp.RestResp;
import com.kimlien.novel.Core.Constant.ApiRouterConsts;
import com.kimlien.novel.Service.SearchService;
import com.kimlien.novel.dto.req.BookSearchReqDto;
import com.kimlien.novel.dto.resp.BookInfoRespDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "SearchController", description = "Model tim kiem")
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_SEARCH_URL_PREFIX)
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @Operation(summary = "Tìm kiếm")
    @GetMapping("books")
    public RestResp<PageRespDto<BookInfoRespDto>> searchBooks(
        @ParameterObject BookSearchReqDto condition) {
        return searchService.searchBooks(condition);
    }

}