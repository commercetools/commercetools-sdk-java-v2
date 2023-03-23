
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShippingMethodsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyShippingMethodsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyShippingMethodsByIDGet get() {
        return new ByProjectKeyShippingMethodsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyShippingMethodsByIDPost post(
            com.commercetools.api.models.shipping_method.ShippingMethodUpdate shippingMethodUpdate) {
        return new ByProjectKeyShippingMethodsByIDPost(apiHttpClient, projectKey, ID, shippingMethodUpdate);
    }

    public ByProjectKeyShippingMethodsByIDPostString post(final String shippingMethodUpdate) {
        return new ByProjectKeyShippingMethodsByIDPostString(apiHttpClient, projectKey, ID, shippingMethodUpdate);
    }

    public ByProjectKeyShippingMethodsByIDPost post(
            UnaryOperator<com.commercetools.api.models.shipping_method.ShippingMethodUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shipping_method.ShippingMethodUpdateBuilder.of()).build());
    }

    public ByProjectKeyShippingMethodsByIDDelete delete() {
        return new ByProjectKeyShippingMethodsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyShippingMethodsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
