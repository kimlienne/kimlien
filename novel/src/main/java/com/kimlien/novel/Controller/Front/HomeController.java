package com.kimlien.novel.Controller.Front;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.kimlien.novel.Core.Common.Resp.RestResp;
import com.kimlien.novel.Core.Constant.ApiRouterConsts;
import com.kimlien.novel.Service.HomeService;
import com.kimlien.novel.dto.resp.HomeBookRespDto;
import com.kimlien.novel.dto.resp.HomeFriendLinkRespDto;

import lombok.RequiredArgsConstructor;

@Tag(name = "HomeController", description = "Modul trang chủ")
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_HOME_URL_PREFIX)
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @Operation(summary = "Truy vấn đề xuất truyện")
    @GetMapping("books")
    public RestResp<List<HomeBookRespDto>> listHomeBooks() {
        return homeService.listHomeBooks();
    }

    @Operation(summary = "Truy vấn danh sách liên kết")
    @GetMapping("friend_Link/list")
    public RestResp<List<HomeFriendLinkRespDto>> listHomeFriendLinks() {
        return homeService.listHomeFriendLinks();
    }

}
