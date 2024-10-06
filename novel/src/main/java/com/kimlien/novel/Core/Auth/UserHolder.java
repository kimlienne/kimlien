package com.kimlien.novel.Core.Auth;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UserHolder {

    //ID người dùng
    private static final ThreadLocal<Long> userIdTL = new ThreadLocal<>();

    //Id người viết
    private static final ThreadLocal<Long> authorIdTL = new ThreadLocal<>();

    public void setUserId(Long userId) {
        userIdTL.set(userId);
    }

    public Long getUserId() {
        return userIdTL.get();
    }

    public void setAuthorId(Long authorId) {
        authorIdTL.set(authorId);
    }

    public Long getAuthorId() {
        return authorIdTL.get();
    }

    public void clear() {
        userIdTL.remove();
        authorIdTL.remove();
    }

}
