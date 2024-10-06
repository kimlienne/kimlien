package com.kimlien.novel.Service;

import com.kimlien.novel.Core.Common.Resp.RestResp;
import com.kimlien.novel.dto.req.UserInfoUptReqDto;
import com.kimlien.novel.dto.req.UserLoginReqDto;
import com.kimlien.novel.dto.req.UserRegisterReqDto;
import com.kimlien.novel.dto.resp.UserInfoRespDto;
import com.kimlien.novel.dto.resp.UserLoginRespDto;
import com.kimlien.novel.dto.resp.UserRegisterRespDto;

public interface UserService {

    // Đăng ký
    RestResp<UserRegisterRespDto> register(UserRegisterReqDto dto);

    //Đăng nhập
    RestResp<UserLoginRespDto> login(UserLoginReqDto dto);

    //Phản hồi của người dùng
    RestResp<Void> saveFeedback(Long userId, String content);

    //Cập nhật thông tin tài khoản
    RestResp<Void> updateUserInfo(UserInfoUptReqDto dto);

    //Xóa phản hồi người dùng
    RestResp<Void> deleteFeedback(Long userId, Long id);

    //Trạng thái kệ sách
    RestResp<Integer> getBookshelfStatus(Long userId, String bookId);

    //Truy vấn thông tin người dùng
    RestResp<UserInfoRespDto> getUserInfo(Long userId);
}
