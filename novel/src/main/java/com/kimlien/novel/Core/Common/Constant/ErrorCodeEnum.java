package com.kimlien.novel.Core.Common.Constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {

    //Trả lại sau khi thực hiện đúng
    OK("00000", "Tất cả ok"),

    //Lỗi người dùng
    USER_ERROR("A0001", "Lỗi người dùng"),

    //Lỗi đăng ký người dùng
    USER_REGISTER_ERROR("A0100", "Lỗi đăng ký người dùng"),

    //Người dùng không đồng ý thỏa thuận bảo mật
    USER_NO_AGREE_PRIVATE_ERROR("A0101", "Người dùng không đồng ý thỏa thuận bảo mật"),

    //Quốc gia hạn chế
    USER_REGISTER_AREA_LIMIT_ERROR("A0102", "Quốc gia hạn chế"),

    //Lỗi mã xác minh
    USER_VERIFY_CODE_ERROR("A0240", "Mã xác minh người dùng sai"),

    //Tên tài khoản tồn tại
    USER_NAME_EXIST("A0111", "Tài khoản đã tồn tại"),

    //Tài khoản không tồn tại
    USER_ACCOUNT_NOT_EXIST("A0201", "Tài khoản không tồn tại"),

    //Mật khẩu sai
    USER_PASSWORD_ERROR("A0210", "Mật khẩu sai"),

    //Lỗi thông số yêu cầu người dùng
    USER_REQUEST_PARAM_ERROR("A0400", "Lỗi thông số yêu cầu người dùng"),

    USER_LOGIN_EXPIRED("A0230", "Đăng nhập hết hạn"),

    USER_UN_AUTH("A0301", "Không có quyền truy cập"),

    USER_REQ_EXCEPTION("A0500", "Yêu cầu dịch vụ"),

    USER_REQ_MANY("A0501", "Yêu cầu vượt quá giới hạn"),

    USER_COMMENT("A2000", "Nhận xét người dùng"),

    USER_COMMENTED("A2001", "Đã bình luận"),

    AUTHOR_PUBLISH("A3000", "Tác gủa"),

    AUTHOR_BOOK_NAME_EXIST("A3001", "Tên đã tồn tại"),

    USER_UPLOAD_FILE_ERROR("A0700", "Tải tệp người dùng lên"),

    USER_UPLOAD_FILE_TYPE_NOT_MATCH("A0701", "Định dạng không phù hợp"),

    SYSTEM_ERROR("B0001", "Chạy hệ thống"),

    SYSTEM_TIMEOUT_ERROR("B0100", "Time"),

    THIRD_SERVICE_ERROR("C0001", "Lỗi dịch vụ thứ ba"),

    MIDDLEWARE_SERVICE_ERROR("C0100", "Lỗi dịch vụ trung gian");

    private final String code;

    private final String message;
}
