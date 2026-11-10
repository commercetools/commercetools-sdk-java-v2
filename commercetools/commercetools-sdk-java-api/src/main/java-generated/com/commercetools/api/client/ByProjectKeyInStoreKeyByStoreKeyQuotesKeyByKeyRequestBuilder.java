
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;

    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyHead(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost post(
            com.commercetools.api.models.quote.QuoteUpdate quoteUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost(apiHttpClient, projectKey, storeKey, key,
            quoteUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPostString post(final String quoteUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPostString(apiHttpClient, projectKey, storeKey, key,
            quoteUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.quote.QuoteUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote.QuoteUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyDelete(apiHttpClient, projectKey, storeKey, key);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
