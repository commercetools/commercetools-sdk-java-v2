
package com.commercetools.api.client;

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

    public ByProjectKeyQuoteRequestsByIDDelete delete() {
        return new ByProjectKeyQuoteRequestsByIDDelete(apiHttpClient, projectKey, ID);
    }

}
