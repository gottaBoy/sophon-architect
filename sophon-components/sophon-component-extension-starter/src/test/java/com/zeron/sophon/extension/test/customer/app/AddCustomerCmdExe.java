package com.zeron.sophon.extension.test.customer.app;

import com.zeron.sophon.dto.Response;
import com.zeron.sophon.extension.ExtensionExecutor;
import com.zeron.sophon.extension.test.customer.app.extensionpoint.CustomerConvertorExtPt;
import com.zeron.sophon.extension.test.customer.infra.DomainEventPublisher;
import com.zeron.sophon.extension.test.customer.client.AddCustomerCmd;
import com.zeron.sophon.extension.test.customer.domain.CustomerEntity;
import com.zeron.sophon.extension.test.customer.app.extensionpoint.AddCustomerValidatorExtPt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * AddCustomerCmdExe
 */
@Component
public class AddCustomerCmdExe {

    private Logger logger = LoggerFactory.getLogger(AddCustomerCmd.class);

    @Resource
    private ExtensionExecutor extensionExecutor;

    @Resource
    private DomainEventPublisher domainEventPublisher;


    public Response execute(AddCustomerCmd cmd) {
        logger.info("Start processing command:" + cmd);

        //validation
        extensionExecutor.executeVoid(AddCustomerValidatorExtPt.class, cmd.getBizScenario(), extension -> extension.validate(cmd));

        //Convert CO to Entity
        CustomerEntity customerEntity = extensionExecutor.execute(CustomerConvertorExtPt.class, cmd.getBizScenario(), extension -> extension.clientToEntity(cmd));

        //Call Domain Entity for business logic processing
        logger.info("Call Domain Entity for business logic processing..."+customerEntity);
        customerEntity.addNewCustomer();

        //domainEventPublisher.publish(new CustomerCreatedEvent());
        logger.info("End processing command:" + cmd);
        return Response.buildSuccess();
    }
}
