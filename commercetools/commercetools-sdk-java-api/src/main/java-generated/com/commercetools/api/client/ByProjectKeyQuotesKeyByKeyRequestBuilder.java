
package com.commercetools.api.client;

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

    public ByProjectKeyQuotesKeyByKeyDelete delete() {
        return new ByProjectKeyQuotesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
