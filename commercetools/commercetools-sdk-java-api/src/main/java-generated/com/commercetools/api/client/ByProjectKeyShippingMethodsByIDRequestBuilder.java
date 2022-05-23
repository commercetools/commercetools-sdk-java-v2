
package com.commercetools.api.client;

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

    public ByProjectKeyShippingMethodsByIDDelete delete() {
        return new ByProjectKeyShippingMethodsByIDDelete(apiHttpClient, projectKey, ID);
    }

}
