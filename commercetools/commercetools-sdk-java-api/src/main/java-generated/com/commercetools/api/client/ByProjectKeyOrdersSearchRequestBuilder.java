
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrdersSearchRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyOrdersSearchRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyOrdersSearchPost post(com.commercetools.api.models.order.OrderSearchRequest orderSearchRequest) {
        return new ByProjectKeyOrdersSearchPost(apiHttpClient, projectKey, orderSearchRequest);
    }

    public ByProjectKeyOrdersSearchHead head() {
        return new ByProjectKeyOrdersSearchHead(apiHttpClient, projectKey);
    }

}
