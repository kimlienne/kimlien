package com.kimlien.novel.Controller.Front;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kimlien.novel.Core.Auth.UserHolder;
import com.kimlien.novel.Core.Common.Req.PageReqDto;
import com.kimlien.novel.Core.Common.Resp.PageRespDto;
import com.kimlien.novel.Core.Common.Resp.RestResp;
import com.kimlien.novel.Core.Constant.ApiRouterConsts;
import com.kimlien.novel.Core.Constant.SystemConfigConsts;
import com.kimlien.novel.Service.BookService;
import com.kimlien.novel.Service.UserService;
import com.kimlien.novel.dto.req.UserCommentReqDto;
import com.kimlien.novel.dto.req.UserInfoUptReqDto;
import com.kimlien.novel.dto.req.UserLoginReqDto;
import com.kimlien.novel.dto.req.UserRegisterReqDto;
import com.kimlien.novel.dto.resp.UserCommentRespDto;
import com.kimlien.novel.dto.resp.UserInfoRespDto;
import com.kimlien.novel.dto.resp.UserLoginRespDto;
import com.kimlien.novel.dto.resp.UserRegisterRespDto;

@Tag(name = "UserController", description = "Front Portal - Membership Module")
@SecurityRequirement(name = SystemConfigConsts.HTTP_AUTH_HEADER_NAME)
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_USER_URL_PREFIX)
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;

    private final BookService bookService;

    //Đăng ký tài khoản
    @Operation(summary = "Đăng ký tài khỏan")
    @PostMapping("register")
    public RestResp<UserRegisterRespDto> register(@Valid @RequestBody UserRegisterReqDto dto) {
        return userService.register(dto);
    }

    //Đăng nhập
    @Operation(summary = "Đăng nhập")
    @PostMapping("login")
    public RestResp<UserLoginRespDto> login(@Valid @RequestBody UserLoginReqDto dto) {
        return userService.login(dto);
    }

    @Operation(summary = "Giao diện truy vấn thông tin người dùng")
    @GetMapping
    public RestResp<UserInfoRespDto> getUserInfo() {
        return userService.getUserInfo(UserHolder.getUserId());
    }

    @Operation(summary = "Sua đoi thong tin")
    @PutMapping
    public RestResp<Void> updateUserInfo(@Valid @RequestBody UserInfoUptReqDto dto) {
        dto.setUserId(UserHolder.getUserId());
        return userService.updateUserInfo(dto);
    }

    @Operation(summary = "Gui phan hoi nguoi dung")
    @PostMapping("feedback")
    public RestResp<Void> submitFeedback(@RequestBody String content) {
        return userService.saveFeedback(UserHolder.getUserId(), content);
    }

    @Operation(summary = "Xoa phan hoi nguoi dung")
    @DeleteMapping("feedback/{id}")
    public RestResp<Void> deleteFeedback(@Parameter(description = "ID phan hoi") @PathVariable Long id) {
        return userService.deleteFeedback(UserHolder.getUserId(), id);
    }

    @Operation(summary = "Đăng bình luận")
    @PostMapping("comment")
    public RestResp<Void> comment(@Valid @RequestBody UserCommentReqDto dto) {
        dto.setUserId(UserHolder.getUserId());
        return bookService.saveComment(dto);
    }

    @Operation(summary = "Chinh sua binh luan")
    @PutMapping("comment/{id}")
    public RestResp<Void> updateComment(@Parameter(description = "ID binh luan") @PathVariable Long id,
        String content) {
        return bookService.updateComment(UserHolder.getUserId(), id, content);
    }

    @Operation(summary = "Xoa binh luan")
    @DeleteMapping("comment/{id}")
    public RestResp<Void> deleteComment(@Parameter(description = "ID bình luận") @PathVariable Long id) {
        return bookService.deleteComment(UserHolder.getUserId(), id);
    }

    // 0 - không có giá sách, 1 - có giá sách
    @Operation(summary = "Trang thai giá sach")
    @GetMapping("bookshelf_status")
    public RestResp<Integer> getBookshelfStatus(@Parameter(description = "ID truyện") String bookId) {
        return userService.getBookshelfStatus(UserHolder.getUserId(), bookId);
    }

    @Operation(summary = "Danh sách binh luận của thành viên")
    @GetMapping("comments")
    public RestResp<PageRespDto<UserCommentRespDto>> listComments(PageReqDto pageReqDto) {
        return bookService.listComments(UserHolder.getUserId(), pageReqDto);
    }
}
