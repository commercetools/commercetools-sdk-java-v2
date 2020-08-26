package com.commercetools.ml.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyImageSearchConfigRequestBuilder {

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

}
