package com.kimlien.novel.Service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.kimlien.novel.Core.Common.Resp.RestResp;
import com.kimlien.novel.dto.resp.ImgVerifyCodeRespDto;

public interface ResourceService {

    RestResp<ImgVerifyCodeRespDto> getImgVerifyCode() throws IOException;

    RestResp<String> uploadImage(MultipartFile file);
}
