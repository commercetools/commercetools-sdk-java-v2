
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergeRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String customerId;

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergeRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String storeKey,
            final String customerId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerId = customerId;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePost post(
            com.commercetools.api.models.cart.MergeCartDraft mergeCartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePost(apiHttpClient, projectKey,
            storeKey, customerId, mergeCartDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString post(
            final String mergeCartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePostString(apiHttpClient, projectKey,
            storeKey, customerId, mergeCartDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdMergePost post(
            UnaryOperator<com.commercetools.api.models.cart.MergeCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.MergeCartDraftBuilder.of()).build());
    }

}
