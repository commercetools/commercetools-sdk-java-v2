
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShippingMethodsMatchingCartRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyShippingMethodsMatchingCartRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingCartGet get() {
        return new ByProjectKeyShippingMethodsMatchingCartGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyShippingMethodsMatchingCartHead head() {
        return new ByProjectKeyShippingMethodsMatchingCartHead(apiHttpClient, projectKey);
    }

}
