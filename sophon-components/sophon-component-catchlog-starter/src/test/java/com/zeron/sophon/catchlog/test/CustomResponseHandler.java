package com.zeron.sophon.catchlog.test;

import com.zeron.sophon.catchlog.IResponseHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomResponseHandler implements IResponseHandler {

    @Override
    public Object handle(Class returnType, String errCode, String errMsg) {
        System.out.println("==== This is Customized Response handler");
        Demo.DemoResponse response = new Demo.DemoResponse();
        response.setSuccess(false);
        return response;
    }
}
