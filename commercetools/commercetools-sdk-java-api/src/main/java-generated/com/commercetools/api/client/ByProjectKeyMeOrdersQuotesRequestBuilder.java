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
public class ByProjectKeyMeOrdersQuotesRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyMeOrdersQuotesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeOrdersQuotesPost post(com.commercetools.api.models.me.MyOrderFromQuoteDraft myOrderFromQuoteDraft) {
        return new ByProjectKeyMeOrdersQuotesPost(apiHttpClient, projectKey, myOrderFromQuoteDraft);
    }
    
    
    public ByProjectKeyMeOrdersQuotesPostString post(final String myOrderFromQuoteDraft) {
        return new ByProjectKeyMeOrdersQuotesPostString(apiHttpClient, projectKey, myOrderFromQuoteDraft);
    }
    public ByProjectKeyMeOrdersQuotesPost post(UnaryOperator<com.commercetools.api.models.me.MyOrderFromQuoteDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyOrderFromQuoteDraftBuilder.of()).build());
    }

    
}
