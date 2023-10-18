
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyQuotesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String associateId;
    private final String businessUnitKey;
    private final String key;

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyQuotesKeyByKeyRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String associateId,
            final String businessUnitKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.businessUnitKey = businessUnitKey;
        this.key = key;
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyQuotesKeyByKeyGet get() {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyQuotesKeyByKeyGet(
            apiHttpClient, projectKey, associateId, businessUnitKey, key);
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyQuotesKeyByKeyHead head() {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyQuotesKeyByKeyHead(
            apiHttpClient, projectKey, associateId, businessUnitKey, key);
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyQuotesKeyByKeyPost post(
            com.commercetools.api.models.quote.QuoteUpdate quoteUpdate) {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyQuotesKeyByKeyPost(
            apiHttpClient, projectKey, associateId, businessUnitKey, key, quoteUpdate);
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyQuotesKeyByKeyPostString post(
            final String quoteUpdate) {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyQuotesKeyByKeyPostString(
            apiHttpClient, projectKey, associateId, businessUnitKey, key, quoteUpdate);
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyQuotesKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.quote.QuoteUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote.QuoteUpdateBuilder.of()).build());
    }

}
