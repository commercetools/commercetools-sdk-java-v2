package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyOrdersSearchRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyOrdersSearchRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyOrdersSearchPost post(com.commercetools.api.models.order.OrderSearchRequest orderSearchRequest) {
        return new ByProjectKeyOrdersSearchPost(apiHttpClient, projectKey, orderSearchRequest);
    }
    
    
    public ByProjectKeyOrdersSearchPostString post(final String orderSearchRequest) {
        return new ByProjectKeyOrdersSearchPostString(apiHttpClient, projectKey, orderSearchRequest);
    }
    public ByProjectKeyOrdersSearchPost post(UnaryOperator<com.commercetools.api.models.order.OrderSearchRequestBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order.OrderSearchRequestBuilder.of()).build());
    }
    
    public ByProjectKeyOrdersSearchHead head() {
        return new ByProjectKeyOrdersSearchHead(apiHttpClient, projectKey);
    }
    
    

    
}
