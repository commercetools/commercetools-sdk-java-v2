
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyHead(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyPost post(
            com.commercetools.api.models.quote_request.QuoteRequestUpdate quoteRequestUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyPost(apiHttpClient, projectKey, storeKey, key,
            quoteRequestUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyPostString post(final String quoteRequestUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyPostString(apiHttpClient, projectKey, storeKey,
            key, quoteRequestUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.quote_request.QuoteRequestUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote_request.QuoteRequestUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyDelete(apiHttpClient, projectKey, storeKey,
            key);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
