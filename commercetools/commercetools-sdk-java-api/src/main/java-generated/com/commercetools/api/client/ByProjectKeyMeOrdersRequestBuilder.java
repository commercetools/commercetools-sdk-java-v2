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
public class ByProjectKeyMeOrdersRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyMeOrdersRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeOrdersGet get() {
        return new ByProjectKeyMeOrdersGet(apiHttpClient, projectKey);
    }
    
    
    
    public ByProjectKeyMeOrdersPost post(com.commercetools.api.models.me.MyOrderFromCartDraft myOrderFromCartDraft) {
        return new ByProjectKeyMeOrdersPost(apiHttpClient, projectKey, myOrderFromCartDraft);
    }
    
    
    public ByProjectKeyMeOrdersPostString post(final String myOrderFromCartDraft) {
        return new ByProjectKeyMeOrdersPostString(apiHttpClient, projectKey, myOrderFromCartDraft);
    }
    public ByProjectKeyMeOrdersPost post(UnaryOperator<com.commercetools.api.models.me.MyOrderFromCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyOrderFromCartDraftBuilder.of()).build());
    }

    
    public ByProjectKeyMeOrdersByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyMeOrdersByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
    
    public ByProjectKeyMeOrdersQuotesRequestBuilder quotes() {
        return new ByProjectKeyMeOrdersQuotesRequestBuilder(apiHttpClient, projectKey);
    }
    
}
