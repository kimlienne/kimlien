package com.kimlien.novel.Core.Constant;

public class SystemConfigConsts {

    private SystemConfigConsts(){
        throw new IllegalStateException(CONST_INSTANCE_EXCEPTION_MSG);
    }

    public static final String HTTP_AUTH_HEADER_NAME = "Authorization";

    public static final String NOVEL_FRONT_KEY = "front";

    public static final String NOVEL_AUTHOR_KEY = "author";

    public static final String NOVEL_ADMIN_KEY = "admin";

    public static final String IMAGE_UPLOAD_DIRECTORY = "/image/";

    public static final String CONST_INSTANCE_EXCEPTION_MSG = "Constant class";
}
