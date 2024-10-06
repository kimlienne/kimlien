package com.kimlien.novel.Controller.Front;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kimlien.novel.Core.Common.Resp.RestResp;
import com.kimlien.novel.Core.Constant.ApiRouterConsts;
import com.kimlien.novel.Service.BookService;
import com.kimlien.novel.dto.resp.BookCategoryRespDto;
import com.kimlien.novel.dto.resp.BookChapterAboutRespDto;
import com.kimlien.novel.dto.resp.BookChapterRespDto;
import com.kimlien.novel.dto.resp.BookCommentRespDto;
import com.kimlien.novel.dto.resp.BookContentAboutRespDto;
import com.kimlien.novel.dto.resp.BookInfoRespDto;
import com.kimlien.novel.dto.resp.BookRankRespDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "BookController", description = "Modul truyen")
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_BOOK_URL_PREFIX)
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @Operation(summary = "Truy vấn danh sách thể loại mới")
    @GetMapping("category/list")
    public RestResp<List<BookCategoryRespDto>> listCategory(
        @Parameter(description = "Hướng truy vấn", required = true) Integer workDirection) {
        return bookService.listCategory(workDirection);
    }

    @Operation(summary = "Truy vấn thong tin mơi")
    @GetMapping("{id}")
    public RestResp<BookInfoRespDto> getBookById(
        @Parameter(description = "ID truyện") @PathVariable("id") Long bookId) {
        return bookService.getBookById(bookId);
    }

    @Operation(summary = "Tăng số luợt xem")
    @PostMapping("visit")
    public RestResp<Void> addVisitCount(@Parameter(description = "ID truyen") Long bookId) {
        return bookService.addVisitCount(bookId);
    }

    @Operation(summary = "Truy vấn các chuơng mới nhất của truyện")
    @GetMapping("last_chapter/about")
    public RestResp<BookChapterAboutRespDto> getLastChapterAbout(
        @Parameter(description = "ID truyện") Long bookId) {
        return bookService.getLastChapterAbout(bookId);
    }

    @Operation(summary = "Truy vấn danh sách đề xuât mới")
    @GetMapping("rec_list")
    public RestResp<List<BookInfoRespDto>> listRecBooks(
        @Parameter(description = "ID truyen") Long bookId) throws NoSuchAlgorithmException {
        return bookService.listRecBooks(bookId);
    }

    @Operation(summary = "Truy vấn danh sách các chương")
    @GetMapping("chapter/list")
    public RestResp<List<BookChapterRespDto>> listChapters(
        @Parameter(description = "ID truyện") Long bookId) {
        return bookService.listChapters(bookId);
    }

    @Operation(summary = "Truy vấn thông tin nội dung mới")
    @GetMapping("content/{chapterId}")
    public RestResp<BookContentAboutRespDto> getBookContentAbout(
        @Parameter(description = "ID chương") @PathVariable("chapterId") Long chapterId) {
        return bookService.getBookContentAbout(chapterId);
    }

    @Operation(summary = "Lấy ID chương trước")
    @GetMapping("pre_chapter_id/{chapterId}")
    public RestResp<Long> getPreChapterId(
        @Parameter(description = "ID chương") @PathVariable("chapterId") Long chapterId) {
        return bookService.getPreChapterId(chapterId);
    }

    @Operation(summary = "Lấy ID chương tiếp theo")
    @GetMapping("next_chapter_id/{chapterId}")
    public RestResp<Long> getNextChapterId(
        @Parameter(description = "ID chương") @PathVariable("chapterId") Long chapterId) {
        return bookService.getNextChapterId(chapterId);
    }

    @Operation(summary = "Danh sách xem")
    @GetMapping("visit_rank")
    public RestResp<List<BookRankRespDto>> listVisitRankBooks() {
        return bookService.listVisitRankBooks();
    }

    @Operation(summary = "Truy vấn danh sách mới")
    @GetMapping("newest_rank")
    public RestResp<List<BookRankRespDto>> listNewestRankBooks() {
        return bookService.listNewestRankBooks();
    }

    @Operation(summary = "Danh sách cập nhật")
    @GetMapping("update_rank")
    public RestResp<List<BookRankRespDto>> listUpdateRankBooks() {
        return bookService.listUpdateRankBooks();
    }

    @Operation(summary = "Bình luận mơi nhất")
    @GetMapping("comment/newest_list")
    public RestResp<BookCommentRespDto> listNewestComments(
        @Parameter(description = "ID truyeẹn") Long bookId) {
        return bookService.listNewestComments(bookId);
    }

}
