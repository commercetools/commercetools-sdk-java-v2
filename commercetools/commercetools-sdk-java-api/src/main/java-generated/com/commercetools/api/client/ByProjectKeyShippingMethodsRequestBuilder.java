
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShippingMethodsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyShippingMethodsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsGet get() {
        return new ByProjectKeyShippingMethodsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyShippingMethodsPost post(
            com.commercetools.api.models.shipping_method.ShippingMethodDraft shippingMethodDraft) {
        return new ByProjectKeyShippingMethodsPost(apiHttpClient, projectKey, shippingMethodDraft);
    }

    public ByProjectKeyShippingMethodsPost post(
            UnaryOperator<com.commercetools.api.models.shipping_method.ShippingMethodDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shipping_method.ShippingMethodDraftBuilder.of()).build());
    }

    public ByProjectKeyShippingMethodsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyShippingMethodsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyShippingMethodsMatchingCartRequestBuilder matchingCart() {
        return new ByProjectKeyShippingMethodsMatchingCartRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditRequestBuilder matchingOrderedit() {
        return new ByProjectKeyShippingMethodsMatchingOrdereditRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyShippingMethodsMatchingLocationRequestBuilder matchingLocation() {
        return new ByProjectKeyShippingMethodsMatchingLocationRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyShippingMethodsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyShippingMethodsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
