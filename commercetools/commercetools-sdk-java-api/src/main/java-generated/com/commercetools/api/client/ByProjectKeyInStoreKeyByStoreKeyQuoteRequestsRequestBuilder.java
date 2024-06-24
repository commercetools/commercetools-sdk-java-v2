
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsHead(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost post(
            com.commercetools.api.models.quote_request.QuoteRequestDraft quoteRequestDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost(apiHttpClient, projectKey, storeKey,
            quoteRequestDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPostString post(final String quoteRequestDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPostString(apiHttpClient, projectKey, storeKey,
            quoteRequestDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost post(
            UnaryOperator<com.commercetools.api.models.quote_request.QuoteRequestDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote_request.QuoteRequestDraftBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsKeyByKeyRequestBuilder(apiHttpClient, projectKey,
            storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDRequestBuilder(apiHttpClient, projectKey, storeKey,
            ID);
    }

}
