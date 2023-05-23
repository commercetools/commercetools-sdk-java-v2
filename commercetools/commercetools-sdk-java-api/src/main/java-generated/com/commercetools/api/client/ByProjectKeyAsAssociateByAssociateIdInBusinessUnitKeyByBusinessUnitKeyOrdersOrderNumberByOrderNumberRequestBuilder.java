
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersOrderNumberByOrderNumberRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String associateId;
    private final String businessUnitKey;
    private final String orderNumber;

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersOrderNumberByOrderNumberRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String associateId,
            final String businessUnitKey, final String orderNumber) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.businessUnitKey = businessUnitKey;
        this.orderNumber = orderNumber;
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersOrderNumberByOrderNumberGet get() {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersOrderNumberByOrderNumberGet(
            apiHttpClient, projectKey, associateId, businessUnitKey, orderNumber);
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersOrderNumberByOrderNumberPost post(
            com.commercetools.api.models.order.OrderUpdate orderUpdate) {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersOrderNumberByOrderNumberPost(
            apiHttpClient, projectKey, associateId, businessUnitKey, orderNumber, orderUpdate);
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersOrderNumberByOrderNumberPostString post(
            final String orderUpdate) {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersOrderNumberByOrderNumberPostString(
            apiHttpClient, projectKey, associateId, businessUnitKey, orderNumber, orderUpdate);
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersOrderNumberByOrderNumberPost post(
            UnaryOperator<com.commercetools.api.models.order.OrderUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order.OrderUpdateBuilder.of()).build());
    }

}
