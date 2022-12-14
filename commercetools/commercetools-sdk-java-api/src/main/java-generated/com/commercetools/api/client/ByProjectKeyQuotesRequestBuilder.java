
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyQuotesRequestBuilder {

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

    public ByProjectKeyQuotesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.quote.Quote> quote,
            java.util.List<com.commercetools.api.models.quote.QuoteUpdateAction> actions) {
        return withId(quote.getId()).post(builder -> com.commercetools.api.models.quote.QuoteUpdate.builder()
                .version(quote.getVersion())
                .actions(actions));
    }

    public ByProjectKeyQuotesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.quote.Quote> quote,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.quote.QuoteUpdateAction, com.commercetools.api.models.quote.QuoteUpdateActionBuilder>> op) {
        return withId(quote.getId()).post(builder -> com.commercetools.api.models.quote.QuoteUpdate.builder()
                .version(quote.getVersion())
                .actions(op.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.quote.QuoteUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.quote.QuoteUpdateAction, com.commercetools.api.models.quote.QuoteUpdateActionBuilder, ByProjectKeyQuotesByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.quote.Quote> quote) {
        return builder -> withId(quote.getId()).post(b -> com.commercetools.api.models.quote.QuoteUpdate.builder()
                .version(quote.getVersion())
                .actions(builder.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.quote.QuoteUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyQuotesByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.quote.Quote> quote) {
        return withId(quote.getId()).delete().withVersion(quote.getVersion());
    }

    public ByProjectKeyQuotesPost create(com.commercetools.api.models.quote.QuoteDraft quoteDraft) {
        return post(quoteDraft);
    }

    public ByProjectKeyQuotesPost create(UnaryOperator<com.commercetools.api.models.quote.QuoteDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote.QuoteDraftBuilder.of()).build());
    }

}
