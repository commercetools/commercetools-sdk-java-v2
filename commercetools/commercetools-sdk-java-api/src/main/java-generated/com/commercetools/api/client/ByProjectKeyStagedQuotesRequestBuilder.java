
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStagedQuotesRequestBuilder implements ByProjectKeyStagedQuotesRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyStagedQuotesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyStagedQuotesGet get() {
        return new ByProjectKeyStagedQuotesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyStagedQuotesPost post(
            com.commercetools.api.models.staged_quote.StagedQuoteDraft stagedQuoteDraft) {
        return new ByProjectKeyStagedQuotesPost(apiHttpClient, projectKey, stagedQuoteDraft);
    }

    public ByProjectKeyStagedQuotesPost post(
            UnaryOperator<com.commercetools.api.models.staged_quote.StagedQuoteDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.staged_quote.StagedQuoteDraftBuilder.of()).build());
    }

    public ByProjectKeyStagedQuotesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyStagedQuotesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStagedQuotesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyStagedQuotesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyStagedQuotesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.staged_quote.StagedQuote> stagedQuote,
            java.util.List<com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction> actions) {
        return withId(stagedQuote.getId())
                .post(builder -> com.commercetools.api.models.staged_quote.StagedQuoteUpdate.builder()
                        .version(stagedQuote.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyStagedQuotesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.staged_quote.StagedQuote> stagedQuote,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction, com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionBuilder>> op) {
        return withId(stagedQuote.getId()).post(builder -> com.commercetools.api.models.staged_quote.StagedQuoteUpdate
                .builder()
                .version(stagedQuote.getVersion())
                .actions(op.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction, com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionBuilder, ByProjectKeyStagedQuotesByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.staged_quote.StagedQuote> stagedQuote) {
        return builder -> withId(stagedQuote.getId())
                .post(b -> com.commercetools.api.models.staged_quote.StagedQuoteUpdate.builder()
                        .version(stagedQuote.getVersion())
                        .actions(builder.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyStagedQuotesByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.staged_quote.StagedQuote> stagedQuote) {
        return withId(stagedQuote.getId()).delete().withVersion(stagedQuote.getVersion());
    }

    public ByProjectKeyStagedQuotesPost create(
            com.commercetools.api.models.staged_quote.StagedQuoteDraft stagedQuoteDraft) {
        return post(stagedQuoteDraft);
    }

    public ByProjectKeyStagedQuotesPost create(
            UnaryOperator<com.commercetools.api.models.staged_quote.StagedQuoteDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.staged_quote.StagedQuoteDraftBuilder.of()).build());
    }

}
