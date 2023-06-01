package com.commercetools.ml.client;

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
public class ByProjectKeyImageSearchConfigRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyImageSearchConfigRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyImageSearchConfigGet get() {
        return new ByProjectKeyImageSearchConfigGet(apiHttpClient, projectKey);
    }
    
    
    
    public ByProjectKeyImageSearchConfigPost post(com.commercetools.ml.models.image_search_config.ImageSearchConfigRequest imageSearchConfigRequest) {
        return new ByProjectKeyImageSearchConfigPost(apiHttpClient, projectKey, imageSearchConfigRequest);
    }
    
    
    public ByProjectKeyImageSearchConfigPostString post(final String imageSearchConfigRequest) {
        return new ByProjectKeyImageSearchConfigPostString(apiHttpClient, projectKey, imageSearchConfigRequest);
    }
    public ByProjectKeyImageSearchConfigPost post(UnaryOperator<com.commercetools.ml.models.image_search_config.ImageSearchConfigRequestBuilder> op) {
        return post(op.apply(com.commercetools.ml.models.image_search_config.ImageSearchConfigRequestBuilder.of()).build());
    }

    
}
