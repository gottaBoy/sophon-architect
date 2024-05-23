package com.zeron.sophon.catchlog;

public interface IResponseHandler {
    public Object handle(Class returnType, String errCode, String errMsg);
}
