
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCartsCustomerIdByCustomerIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String customerId;

    public ByProjectKeyCartsCustomerIdByCustomerIdRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String customerId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.customerId = customerId;
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdGet get() {
        return new ByProjectKeyCartsCustomerIdByCustomerIdGet(apiHttpClient, projectKey, customerId);
    }

}
