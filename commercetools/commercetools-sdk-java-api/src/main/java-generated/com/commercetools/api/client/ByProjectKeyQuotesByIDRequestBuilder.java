
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyQuotesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyQuotesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyQuotesByIDGet get() {
        return new ByProjectKeyQuotesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyQuotesByIDHead head() {
        return new ByProjectKeyQuotesByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyQuotesByIDPost post(com.commercetools.api.models.quote.QuoteUpdate quoteUpdate) {
        return new ByProjectKeyQuotesByIDPost(apiHttpClient, projectKey, ID, quoteUpdate);
    }

    public ByProjectKeyQuotesByIDPostString post(final String quoteUpdate) {
        return new ByProjectKeyQuotesByIDPostString(apiHttpClient, projectKey, ID, quoteUpdate);
    }

    public ByProjectKeyQuotesByIDPost post(UnaryOperator<com.commercetools.api.models.quote.QuoteUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote.QuoteUpdateBuilder.of()).build());
    }

    public ByProjectKeyQuotesByIDDelete delete() {
        return new ByProjectKeyQuotesByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyQuotesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
