package com.kimlien.novel.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import com.kimlien.novel.Core.Common.Req.PageReqDto;
import com.kimlien.novel.Core.Common.Resp.PageRespDto;
import com.kimlien.novel.Core.Common.Resp.RestResp;
import com.kimlien.novel.dto.req.BookAddReqDto;
import com.kimlien.novel.dto.req.ChapterAddReqDto;
import com.kimlien.novel.dto.req.ChapterUpdateReqDto;
import com.kimlien.novel.dto.req.UserCommentReqDto;
import com.kimlien.novel.dto.resp.BookCategoryRespDto;
import com.kimlien.novel.dto.resp.BookChapterAboutRespDto;
import com.kimlien.novel.dto.resp.BookChapterRespDto;
import com.kimlien.novel.dto.resp.BookCommentRespDto;
import com.kimlien.novel.dto.resp.BookContentAboutRespDto;
import com.kimlien.novel.dto.resp.BookInfoRespDto;
import com.kimlien.novel.dto.resp.BookRankRespDto;
import com.kimlien.novel.dto.resp.ChapterContentRespDto;
import com.kimlien.novel.dto.resp.UserCommentRespDto;

public interface BookService {
    
    //Danh sách lượt xem
    RestResp<List<BookRankRespDto>> listVisitRankBooks();

    //Danh sách mới
    RestResp<List<BookRankRespDto>> listNewestRankBooks();

    //Danh sách cập nhật
    RestResp<List<BookRankRespDto>> listUpdateRankBooks();

    //Tìm kiếm
    RestResp<BookInfoRespDto> getBookById(Long bookId);

    //Xem thông tin
    RestResp<BookContentAboutRespDto> getBookContentAbout(Long chapterId);

    //Xem chương
    RestResp<BookChapterAboutRespDto> getLastChapterAbout(Long bookId);

    //Danh sách tin nhắn
    RestResp<List<BookInfoRespDto>> listRecBooks(Long bookId) throws NoSuchAlgorithmException;

    //Tăng số lượt xem
    RestResp<Void> addVisitCount(Long bookId);

    // Chương trước
    RestResp<Long> getPreChapterId(Long chapterId);

    //Chương sau
    RestResp<Long> getNextChapterId(Long chapterId);

    //List chương
    RestResp<List<BookChapterRespDto>> listChapters(Long bookId);

    //List thể loại
    RestResp<List<BookCategoryRespDto>> listCategory(Integer workDirection);

    //Bình luận
    RestResp<Void> saveComment(UserCommentReqDto dto);

    //Xem bình luận mới nhất
    RestResp<BookCommentRespDto> listNewestComments(Long bookId);

    //Xóa bình luận
    RestResp<Void> deleteComment(Long userId, Long commentId);

    //Update bình luận
    RestResp<Void> updateComment(Long userId, Long id, String content);

    //Lưu thông tin
    RestResp<Void> saveBook(BookAddReqDto dto);

    //Lưu chương
    RestResp<Void> saveBookChapter(ChapterAddReqDto dto);

    //Xem danh sách của tác giả
    RestResp<PageRespDto<BookInfoRespDto>> listAuthorBooks(PageReqDto dto);

    //Danh sách chương phân trang
    RestResp<PageRespDto<BookChapterRespDto>> listBookChapters(Long bookId, PageReqDto dto);

    //Phân trang bình luận
    RestResp<PageRespDto<UserCommentRespDto>> listComments(Long userId, PageReqDto pageReqDto);

    //xóa chương
    RestResp<Void> deleteBookChapter(Long chapterId);

    //Xem nội dung chương
    RestResp<ChapterContentRespDto> getBookChapter(Long chapterId);

    //Cập nhật nội dung chương    
    RestResp<Void> updateBookChapter(Long chapterId, ChapterUpdateReqDto dto);
}
