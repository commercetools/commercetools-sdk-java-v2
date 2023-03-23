
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyQuoteRequestsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyQuoteRequestsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyQuoteRequestsByIDGet get() {
        return new ByProjectKeyQuoteRequestsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyQuoteRequestsByIDPost post(
            com.commercetools.api.models.quote_request.QuoteRequestUpdate quoteRequestUpdate) {
        return new ByProjectKeyQuoteRequestsByIDPost(apiHttpClient, projectKey, ID, quoteRequestUpdate);
    }

    public ByProjectKeyQuoteRequestsByIDPostString post(final String quoteRequestUpdate) {
        return new ByProjectKeyQuoteRequestsByIDPostString(apiHttpClient, projectKey, ID, quoteRequestUpdate);
    }

    public ByProjectKeyQuoteRequestsByIDPost post(
            UnaryOperator<com.commercetools.api.models.quote_request.QuoteRequestUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote_request.QuoteRequestUpdateBuilder.of()).build());
    }

    public ByProjectKeyQuoteRequestsByIDDelete delete() {
        return new ByProjectKeyQuoteRequestsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyQuoteRequestsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
