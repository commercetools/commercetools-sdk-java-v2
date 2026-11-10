
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyQuotesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyQuotesRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesHead(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesPost post(com.commercetools.api.models.quote.QuoteDraft quoteDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesPost(apiHttpClient, projectKey, storeKey, quoteDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesPostString post(final String quoteDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesPostString(apiHttpClient, projectKey, storeKey, quoteDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesPost post(
            UnaryOperator<com.commercetools.api.models.quote.QuoteDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote.QuoteDraftBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyRequestBuilder(apiHttpClient, projectKey, storeKey,
            key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
    }

}
