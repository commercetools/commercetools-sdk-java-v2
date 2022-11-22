
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyQuotesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyQuotesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyQuotesKeyByKeyGet get() {
        return new ByProjectKeyQuotesKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyQuotesKeyByKeyPost post(com.commercetools.api.models.quote.QuoteUpdate quoteUpdate) {
        return new ByProjectKeyQuotesKeyByKeyPost(apiHttpClient, projectKey, key, quoteUpdate);
    }

    public ByProjectKeyQuotesKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.quote.QuoteUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote.QuoteUpdateBuilder.of()).build());
    }

    public ByProjectKeyQuotesKeyByKeyDelete delete() {
        return new ByProjectKeyQuotesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyQuotesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
