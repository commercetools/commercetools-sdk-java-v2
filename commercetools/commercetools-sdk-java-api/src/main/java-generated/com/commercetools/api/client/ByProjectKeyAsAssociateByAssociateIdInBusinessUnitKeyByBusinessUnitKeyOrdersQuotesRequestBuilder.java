
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersQuotesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String associateId;
    private final String businessUnitKey;

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersQuotesRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String associateId,
            final String businessUnitKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.businessUnitKey = businessUnitKey;
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersQuotesPost post(
            com.commercetools.api.models.order.OrderFromQuoteDraft orderFromQuoteDraft) {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersQuotesPost(apiHttpClient,
            projectKey, associateId, businessUnitKey, orderFromQuoteDraft);
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersQuotesPostString post(
            final String orderFromQuoteDraft) {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersQuotesPostString(
            apiHttpClient, projectKey, associateId, businessUnitKey, orderFromQuoteDraft);
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyOrdersQuotesPost post(
            UnaryOperator<com.commercetools.api.models.order.OrderFromQuoteDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order.OrderFromQuoteDraftBuilder.of()).build());
    }

}
