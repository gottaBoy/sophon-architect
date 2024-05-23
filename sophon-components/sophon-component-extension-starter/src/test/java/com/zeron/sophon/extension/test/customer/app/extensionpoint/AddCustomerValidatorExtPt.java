package com.zeron.sophon.extension.test.customer.app.extensionpoint;

import com.zeron.sophon.extension.IExtensionPoint;
import com.zeron.sophon.extension.test.customer.client.AddCustomerCmd;

/**
 * AddCustomerValidatorExtPt
 *
 */
public interface AddCustomerValidatorExtPt extends IExtensionPoint {

    public void validate(AddCustomerCmd addCustomerCmd);
}
