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
public class ByProjectKeyStagedQuotesByIDRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyStagedQuotesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyStagedQuotesByIDGet get() {
        return new ByProjectKeyStagedQuotesByIDGet(apiHttpClient, projectKey, ID);
    }
    
    
    
    public ByProjectKeyStagedQuotesByIDPost post(com.commercetools.api.models.staged_quote.StagedQuoteUpdate stagedQuoteUpdate) {
        return new ByProjectKeyStagedQuotesByIDPost(apiHttpClient, projectKey, ID, stagedQuoteUpdate);
    }
    
    
    public ByProjectKeyStagedQuotesByIDPostString post(final String stagedQuoteUpdate) {
        return new ByProjectKeyStagedQuotesByIDPostString(apiHttpClient, projectKey, ID, stagedQuoteUpdate);
    }
    public ByProjectKeyStagedQuotesByIDPost post(UnaryOperator<com.commercetools.api.models.staged_quote.StagedQuoteUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.staged_quote.StagedQuoteUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyStagedQuotesByIDDelete delete() {
        return new ByProjectKeyStagedQuotesByIDDelete(apiHttpClient, projectKey, ID);
    }
    public <TValue> ByProjectKeyStagedQuotesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
