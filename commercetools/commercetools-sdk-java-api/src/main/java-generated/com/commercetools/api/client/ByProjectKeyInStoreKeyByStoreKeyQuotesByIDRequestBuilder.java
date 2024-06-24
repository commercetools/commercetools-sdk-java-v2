
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyQuotesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyQuotesByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesByIDHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesByIDHead(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesByIDPost post(
            com.commercetools.api.models.quote.QuoteUpdate quoteUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesByIDPost(apiHttpClient, projectKey, storeKey, ID, quoteUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesByIDPostString post(final String quoteUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesByIDPostString(apiHttpClient, projectKey, storeKey, ID,
            quoteUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesByIDPost post(
            UnaryOperator<com.commercetools.api.models.quote.QuoteUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote.QuoteUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuotesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
