
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDHead(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPost post(
            com.commercetools.api.models.quote_request.QuoteRequestUpdate quoteRequestUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPost(apiHttpClient, projectKey, storeKey, ID,
            quoteRequestUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString post(final String quoteRequestUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString(apiHttpClient, projectKey, storeKey, ID,
            quoteRequestUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPost post(
            UnaryOperator<com.commercetools.api.models.quote_request.QuoteRequestUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote_request.QuoteRequestUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
