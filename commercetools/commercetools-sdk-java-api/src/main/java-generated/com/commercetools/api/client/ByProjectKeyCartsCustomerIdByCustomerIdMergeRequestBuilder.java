
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCartsCustomerIdByCustomerIdMergeRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String customerId;

    public ByProjectKeyCartsCustomerIdByCustomerIdMergeRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String customerId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.customerId = customerId;
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdMergePost post(
            com.commercetools.api.models.cart.MergeCartDraft mergeCartDraft) {
        return new ByProjectKeyCartsCustomerIdByCustomerIdMergePost(apiHttpClient, projectKey, customerId,
            mergeCartDraft);
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdMergePostString post(final String mergeCartDraft) {
        return new ByProjectKeyCartsCustomerIdByCustomerIdMergePostString(apiHttpClient, projectKey, customerId,
            mergeCartDraft);
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdMergePost post(
            UnaryOperator<com.commercetools.api.models.cart.MergeCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.MergeCartDraftBuilder.of()).build());
    }

}
