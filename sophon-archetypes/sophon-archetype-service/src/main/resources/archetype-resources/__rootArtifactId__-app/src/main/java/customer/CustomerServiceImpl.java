#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.customer;

import com.zeron.sophon.dto.MultiResponse;
import com.zeron.sophon.dto.Response;
import com.zeron.sophon.catchlog.CatchAndLog;
import ${package}.api.ICustomerService;
import ${package}.dto.CustomerAddCmd;
import ${package}.dto.CustomerListByNameQry;
import ${package}.dto.data.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${package}.customer.executor.CustomerAddCmdExe;
import ${package}.customer.executor.query.CustomerListByNameQryExe;

import javax.annotation.Resource;

@Service
@CatchAndLog
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

}
