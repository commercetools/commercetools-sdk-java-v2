
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyStagedQuotesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesHead(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPost post(
            com.commercetools.api.models.staged_quote.StagedQuoteDraft stagedQuoteDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPost(apiHttpClient, projectKey, storeKey,
            stagedQuoteDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString post(final String stagedQuoteDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString(apiHttpClient, projectKey, storeKey,
            stagedQuoteDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPost post(
            UnaryOperator<com.commercetools.api.models.staged_quote.StagedQuoteDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.staged_quote.StagedQuoteDraftBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyRequestBuilder(apiHttpClient, projectKey,
            storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDRequestBuilder(apiHttpClient, projectKey, storeKey,
            ID);
    }

}
