
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShippingMethodsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyShippingMethodsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyShippingMethodsKeyByKeyGet get() {
        return new ByProjectKeyShippingMethodsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyShippingMethodsKeyByKeyPost post(
            com.commercetools.api.models.shipping_method.ShippingMethodUpdate shippingMethodUpdate) {
        return new ByProjectKeyShippingMethodsKeyByKeyPost(apiHttpClient, projectKey, key, shippingMethodUpdate);
    }

    public ByProjectKeyShippingMethodsKeyByKeyPostString post(final String shippingMethodUpdate) {
        return new ByProjectKeyShippingMethodsKeyByKeyPostString(apiHttpClient, projectKey, key, shippingMethodUpdate);
    }

    public ByProjectKeyShippingMethodsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.shipping_method.ShippingMethodUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shipping_method.ShippingMethodUpdateBuilder.of()).build());
    }

    public ByProjectKeyShippingMethodsKeyByKeyDelete delete() {
        return new ByProjectKeyShippingMethodsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyShippingMethodsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
