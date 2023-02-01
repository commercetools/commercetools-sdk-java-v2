
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyQuoteRequestsRequestBuilder implements ByProjectKeyQuoteRequestsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyQuoteRequestsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyQuoteRequestsGet get() {
        return new ByProjectKeyQuoteRequestsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyQuoteRequestsPost post(
            com.commercetools.api.models.quote_request.QuoteRequestDraft quoteRequestDraft) {
        return new ByProjectKeyQuoteRequestsPost(apiHttpClient, projectKey, quoteRequestDraft);
    }

    public ByProjectKeyQuoteRequestsPost post(
            UnaryOperator<com.commercetools.api.models.quote_request.QuoteRequestDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote_request.QuoteRequestDraftBuilder.of()).build());
    }

    public ByProjectKeyQuoteRequestsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyQuoteRequestsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyQuoteRequestsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyQuoteRequestsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyQuoteRequestsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.quote_request.QuoteRequest> quoteRequest,
            java.util.List<com.commercetools.api.models.quote_request.QuoteRequestUpdateAction> actions) {
        return withId(quoteRequest.getId())
                .post(builder -> com.commercetools.api.models.quote_request.QuoteRequestUpdate.builder()
                        .version(quoteRequest.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyQuoteRequestsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.quote_request.QuoteRequest> quoteRequest,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.quote_request.QuoteRequestUpdateAction, com.commercetools.api.models.quote_request.QuoteRequestUpdateActionBuilder>> op) {
        return withId(quoteRequest.getId())
                .post(builder -> com.commercetools.api.models.quote_request.QuoteRequestUpdate.builder()
                        .version(quoteRequest.getVersion())
                        .actions(op.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.quote_request.QuoteRequestUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.quote_request.QuoteRequestUpdateAction, com.commercetools.api.models.quote_request.QuoteRequestUpdateActionBuilder, ByProjectKeyQuoteRequestsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.quote_request.QuoteRequest> quoteRequest) {
        return builder -> withId(quoteRequest.getId())
                .post(b -> com.commercetools.api.models.quote_request.QuoteRequestUpdate.builder()
                        .version(quoteRequest.getVersion())
                        .actions(builder.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.quote_request.QuoteRequestUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyQuoteRequestsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.quote_request.QuoteRequest> quoteRequest) {
        return withId(quoteRequest.getId()).delete().withVersion(quoteRequest.getVersion());
    }

    public ByProjectKeyQuoteRequestsPost create(
            com.commercetools.api.models.quote_request.QuoteRequestDraft quoteRequestDraft) {
        return post(quoteRequestDraft);
    }

    public ByProjectKeyQuoteRequestsPost create(
            UnaryOperator<com.commercetools.api.models.quote_request.QuoteRequestDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote_request.QuoteRequestDraftBuilder.of()).build());
    }

}
