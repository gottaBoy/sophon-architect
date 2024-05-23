//package com.zeron.sophon.dto.spi;
//
///**
// * 响应体构建器
// *
// * @author yi.min
// * @version 2024/05/22
// **/
//@Order(-1)
//public class SophonResponseBuilder implements ResponseBuilder<Response> {
//
//    @Override
//    public Response buildSuccess() {
//        Response response = new Response();
//        response.setSuccess(true);
//        return response;
//    }
//
//    @Override
//    public <Body> Response buildSuccess(Body data) {
//        SingleResponse<Body> response = new SingleResponse<>();
//        response.setSuccess(true);
//        response.setData(data);
//        return response;
//    }
//
//    @Override
//    public Response buildFailure(@PropertyKey(resourceBundle = ErrorCodeLoader.BUNDLE_NAME) String errCode,
//                                 Object... params) {
//        Response response = new Response();
//        response.setSuccess(false);
//        response.setErrCode(errCode);
//        response.setErrMessage(ErrorCodeLoader.getErrMessage(errCode, params));
//        return response;
//    }
//
//    @Override
//    public Response buildFailure(@PropertyKey(resourceBundle = ErrorCodeLoader.BUNDLE_NAME) String errCode,
//                                 String errMessage, Object... params) {
//        Response response = new Response();
//        response.setSuccess(false);
//        response.setErrCode(errCode);
//        response.setErrMessage(MessageFormatUtils.format(errMessage, params));
//        return response;
//    }
//}
