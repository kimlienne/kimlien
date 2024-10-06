package com.kimlien.novel.Core.Common.Resp;

import java.util.Objects;

import com.kimlien.novel.Core.Common.Constant.ErrorCodeEnum;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
public class RestResp <T> {
    //Mã thông báo
    @Schema(description = "Mã lỗi，00000-Không có lỗi")
    private String code;

    //Tin nhắn trả lời
    @Schema(description = "Tin nhắn trả lời")
    private String message;

    //Dữ liệu phản ứng
    @Schema(description = "Dữ liệu phản ứng")
    private T data;

    private RestResp() {
        this.code = ErrorCodeEnum.OK.getCode();
        this.message = ErrorCodeEnum.OK.getMessage();
    }

    private RestResp(ErrorCodeEnum errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    private RestResp(T data) {
        this();
        this.data = data;
    }

    //Xử lý thành công, không trả về dữ liệu
    public static RestResp<Void> ok() {
        return new RestResp<>();
    }

    //Xử lý thành công, trả về dữ liệu
    public static <T> RestResp<T> ok(T data) {
        return new RestResp<>(data);
    }

    //Xử lý không thành công
    public static RestResp<Void> fail(ErrorCodeEnum errorCode) {
        return new RestResp<>(errorCode);
    }

    //Lỗi hệ thống
    public static RestResp<Void> error() {
        return new RestResp<>(ErrorCodeEnum.SYSTEM_ERROR);
    }

    // Phán đoán thành thông hay không
    public boolean isOk() {
        return Objects.equals(this.code, ErrorCodeEnum.OK.getCode());
    }
}
