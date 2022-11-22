
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeQuotesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyMeQuotesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeQuotesKeyByKeyGet get() {
        return new ByProjectKeyMeQuotesKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMeQuotesKeyByKeyPost post(com.commercetools.api.models.me.MyQuoteUpdate myQuoteUpdate) {
        return new ByProjectKeyMeQuotesKeyByKeyPost(apiHttpClient, projectKey, key, myQuoteUpdate);
    }

    public ByProjectKeyMeQuotesKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.me.MyQuoteUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyQuoteUpdateBuilder.of()).build());
    }

}
