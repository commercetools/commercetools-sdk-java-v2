
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersSearchRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCustomersSearchRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomersSearchPost post(
            com.commercetools.api.models.customer_search.CustomerSearchRequest customerSearchRequest) {
        return new ByProjectKeyCustomersSearchPost(apiHttpClient, projectKey, customerSearchRequest);
    }

    public ByProjectKeyCustomersSearchPostString post(final String customerSearchRequest) {
        return new ByProjectKeyCustomersSearchPostString(apiHttpClient, projectKey, customerSearchRequest);
    }

    public ByProjectKeyCustomersSearchPost post(
            UnaryOperator<com.commercetools.api.models.customer_search.CustomerSearchRequestBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer_search.CustomerSearchRequestBuilder.of()).build());
    }

    public ByProjectKeyCustomersSearchHead head() {
        return new ByProjectKeyCustomersSearchHead(apiHttpClient, projectKey);
    }

}
