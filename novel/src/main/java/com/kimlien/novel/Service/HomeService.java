package com.kimlien.novel.Service;

import java.util.List;

import com.kimlien.novel.Core.Common.Resp.RestResp;
import com.kimlien.novel.dto.resp.HomeBookRespDto;
import com.kimlien.novel.dto.resp.HomeFriendLinkRespDto;

public interface HomeService {
    
    //Danh sach de xuat moi
    RestResp<List<HomeBookRespDto>> listHomeBooks();

    //Truy van danh sach lien ket
    RestResp<List<HomeFriendLinkRespDto>> listHomeFriendLinks();
}
