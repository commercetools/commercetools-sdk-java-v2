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
public class ByProjectKeyMeQuotesRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyMeQuotesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeQuotesGet get() {
        return new ByProjectKeyMeQuotesGet(apiHttpClient, projectKey);
    }
    
    

    
    public ByProjectKeyMeQuotesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyMeQuotesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
    
    public ByProjectKeyMeQuotesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyMeQuotesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
    
}
