package com.zeron.sophon.catchlog;

public class ResponseHandlerFactory {

    public static IResponseHandler get(){
        if(ApplicationContextHelper.getBean(IResponseHandler.class) != null){
            return ApplicationContextHelper.getBean(IResponseHandler.class);
        }
        return new DefaultResponseHandler();
    }
}
