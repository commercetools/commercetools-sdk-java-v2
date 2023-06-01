package com.commercetools.history.client;

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
public class ByProjectKeyByResourceTypeRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String resourceType;
    

    public ByProjectKeyByResourceTypeRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String resourceType) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.resourceType = resourceType;
    }

    public ByProjectKeyByResourceTypeGet get() {
        return new ByProjectKeyByResourceTypeGet(apiHttpClient, projectKey, resourceType);
    }
    
    

    
    public ByProjectKeyByResourceTypeByIDRequestBuilder withIDValue(String ID) {
        return new ByProjectKeyByResourceTypeByIDRequestBuilder(apiHttpClient, projectKey, resourceType, ID);
    }
    
}
