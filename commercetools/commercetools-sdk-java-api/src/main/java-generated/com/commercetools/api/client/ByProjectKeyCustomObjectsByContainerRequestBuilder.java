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
public class ByProjectKeyCustomObjectsByContainerRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String container;
    

    public ByProjectKeyCustomObjectsByContainerRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String container) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.container = container;
    }

    public ByProjectKeyCustomObjectsByContainerGet get() {
        return new ByProjectKeyCustomObjectsByContainerGet(apiHttpClient, projectKey, container);
    }
    
    

    
}
