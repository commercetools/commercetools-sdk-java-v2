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
public class ByProjectKeyProductProjectionsRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyProductProjectionsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductProjectionsGet get() {
        return new ByProjectKeyProductProjectionsGet(apiHttpClient, projectKey);
    }
    
    

    
    public ByProjectKeyProductProjectionsSearchRequestBuilder search() {
        return new ByProjectKeyProductProjectionsSearchRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyProductProjectionsSuggestRequestBuilder suggest() {
        return new ByProjectKeyProductProjectionsSuggestRequestBuilder(apiHttpClient, projectKey);
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyProductProjectionsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyProductProjectionsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyProductProjectionsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
    
}
