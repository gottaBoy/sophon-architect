package com.zeron.sophon.extension.test.customer.app.extensionpoint;

import com.zeron.sophon.extension.IExtensionPoint;
import com.zeron.sophon.extension.test.customer.client.AddCustomerCmd;
import com.zeron.sophon.extension.test.customer.domain.CustomerEntity;

/**
 * CustomerConvertorExtPt
 *
 */
public interface CustomerConvertorExtPt extends IExtensionPoint {

    public CustomerEntity clientToEntity(AddCustomerCmd addCustomerCmd);
}
