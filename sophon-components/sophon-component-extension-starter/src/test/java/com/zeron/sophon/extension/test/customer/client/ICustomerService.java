package com.zeron.sophon.extension.test.customer.client;

import com.zeron.sophon.dto.Response;
import com.zeron.sophon.dto.SingleResponse;

/**
 * CustomerServiceI
 *
 */
public interface ICustomerService {
    public Response addCustomer(AddCustomerCmd addCustomerCmd);
    public SingleResponse<CustomerDTO> getCustomer(GetOneCustomerQry getOneCustomerQry);
}
