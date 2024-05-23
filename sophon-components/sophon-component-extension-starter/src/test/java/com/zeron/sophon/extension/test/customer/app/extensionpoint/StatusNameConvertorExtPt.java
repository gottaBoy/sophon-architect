package com.zeron.sophon.extension.test.customer.app.extensionpoint;

import com.zeron.sophon.extension.IExtensionPoint;

public interface StatusNameConvertorExtPt extends IExtensionPoint {
    String statusNameConvertor(Integer statusCode);
}
