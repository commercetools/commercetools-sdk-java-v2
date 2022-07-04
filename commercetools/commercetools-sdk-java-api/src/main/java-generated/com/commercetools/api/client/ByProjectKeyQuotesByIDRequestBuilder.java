
package com.commercetools.api.client;

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

    public ByProjectKeyQuotesByIDPost post(com.commercetools.api.models.quote.QuoteUpdate quoteUpdate) {
        return new ByProjectKeyQuotesByIDPost(apiHttpClient, projectKey, ID, quoteUpdate);
    }

    public ByProjectKeyQuotesByIDDelete delete() {
        return new ByProjectKeyQuotesByIDDelete(apiHttpClient, projectKey, ID);
    }

}
