
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyHead(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyPost post(
            com.commercetools.api.models.staged_quote.StagedQuoteUpdate stagedQuoteUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyPost(apiHttpClient, projectKey, storeKey, key,
            stagedQuoteUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyPostString post(final String stagedQuoteUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyPostString(apiHttpClient, projectKey, storeKey,
            key, stagedQuoteUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.staged_quote.StagedQuoteUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.staged_quote.StagedQuoteUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyDelete(apiHttpClient, projectKey, storeKey, key);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyStagedQuotesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
