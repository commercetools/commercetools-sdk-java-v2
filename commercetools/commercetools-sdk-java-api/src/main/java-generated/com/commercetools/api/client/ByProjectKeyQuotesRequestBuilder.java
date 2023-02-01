
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyQuotesRequestBuilder implements ByProjectKeyQuotesRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyQuotesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyQuotesGet get() {
        return new ByProjectKeyQuotesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyQuotesPost post(com.commercetools.api.models.quote.QuoteDraft quoteDraft) {
        return new ByProjectKeyQuotesPost(apiHttpClient, projectKey, quoteDraft);
    }

    public ByProjectKeyQuotesPost post(UnaryOperator<com.commercetools.api.models.quote.QuoteDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote.QuoteDraftBuilder.of()).build());
    }

    public ByProjectKeyQuotesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyQuotesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyQuotesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyQuotesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
