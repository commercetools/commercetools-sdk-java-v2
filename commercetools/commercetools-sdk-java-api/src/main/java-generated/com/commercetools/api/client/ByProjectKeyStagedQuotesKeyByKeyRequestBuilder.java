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
public class ByProjectKeyStagedQuotesKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyStagedQuotesKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyStagedQuotesKeyByKeyGet get() {
        return new ByProjectKeyStagedQuotesKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyStagedQuotesKeyByKeyPost post(com.commercetools.api.models.staged_quote.StagedQuoteUpdate stagedQuoteUpdate) {
        return new ByProjectKeyStagedQuotesKeyByKeyPost(apiHttpClient, projectKey, key, stagedQuoteUpdate);
    }
    
    
    public ByProjectKeyStagedQuotesKeyByKeyPostString post(final String stagedQuoteUpdate) {
        return new ByProjectKeyStagedQuotesKeyByKeyPostString(apiHttpClient, projectKey, key, stagedQuoteUpdate);
    }
    public ByProjectKeyStagedQuotesKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.staged_quote.StagedQuoteUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.staged_quote.StagedQuoteUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyStagedQuotesKeyByKeyDelete delete() {
        return new ByProjectKeyStagedQuotesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyStagedQuotesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
