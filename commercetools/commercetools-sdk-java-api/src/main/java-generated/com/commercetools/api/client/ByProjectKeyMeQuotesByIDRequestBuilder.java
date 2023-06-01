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
public class ByProjectKeyMeQuotesByIDRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyMeQuotesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMeQuotesByIDGet get() {
        return new ByProjectKeyMeQuotesByIDGet(apiHttpClient, projectKey, ID);
    }
    
    
    
    public ByProjectKeyMeQuotesByIDPost post(com.commercetools.api.models.me.MyQuoteUpdate myQuoteUpdate) {
        return new ByProjectKeyMeQuotesByIDPost(apiHttpClient, projectKey, ID, myQuoteUpdate);
    }
    
    
    public ByProjectKeyMeQuotesByIDPostString post(final String myQuoteUpdate) {
        return new ByProjectKeyMeQuotesByIDPostString(apiHttpClient, projectKey, ID, myQuoteUpdate);
    }
    public ByProjectKeyMeQuotesByIDPost post(UnaryOperator<com.commercetools.api.models.me.MyQuoteUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyQuoteUpdateBuilder.of()).build());
    }

    
}
