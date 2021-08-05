
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")

public class ByProjectKeyCartsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCartsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCartsGet get() {
        return new ByProjectKeyCartsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCartsPost post(com.commercetools.api.models.cart.CartDraft cartDraft) {
        return new ByProjectKeyCartsPost(apiHttpClient, projectKey, cartDraft);
    }

    public ByProjectKeyCartsReplicateRequestBuilder replicate() {
        return new ByProjectKeyCartsReplicateRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdRequestBuilder withCustomerId(String customerId) {
        return new ByProjectKeyCartsCustomerIdByCustomerIdRequestBuilder(apiHttpClient, projectKey, customerId);
    }

    public ByProjectKeyCartsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCartsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCartsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCartsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
