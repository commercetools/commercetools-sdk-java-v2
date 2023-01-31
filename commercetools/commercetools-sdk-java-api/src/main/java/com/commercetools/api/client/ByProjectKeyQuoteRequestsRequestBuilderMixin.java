
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.quote_request.QuoteRequest;
import com.commercetools.api.models.quote_request.QuoteRequestDraft;
import com.commercetools.api.models.quote_request.QuoteRequestDraftBuilder;
import com.commercetools.api.models.quote_request.QuoteRequestUpdate;
import com.commercetools.api.models.quote_request.QuoteRequestUpdateAction;
import com.commercetools.api.models.quote_request.QuoteRequestUpdateActionBuilder;

public interface ByProjectKeyQuoteRequestsRequestBuilderMixin {
    public ByProjectKeyQuoteRequestsPost post(QuoteRequestDraft quoteRequestDraft);

    public ByProjectKeyQuoteRequestsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyQuoteRequestsByIDPost update(Versioned<QuoteRequest> quoteRequest,
            List<QuoteRequestUpdateAction> actions) {
        return withId(quoteRequest.getId())
                .post(builder -> QuoteRequestUpdate.builder().version(quoteRequest.getVersion()).actions(actions));
    }

    public default ByProjectKeyQuoteRequestsByIDPost update(Versioned<QuoteRequest> quoteRequest,
            UnaryOperator<UpdateActionBuilder<QuoteRequestUpdateAction, QuoteRequestUpdateActionBuilder>> op) {
        return withId(quoteRequest.getId()).post(builder -> QuoteRequestUpdate.builder()
                .version(quoteRequest.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(QuoteRequestUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<QuoteRequestUpdateAction, QuoteRequestUpdateActionBuilder, ByProjectKeyQuoteRequestsByIDPost> update(
            Versioned<QuoteRequest> quoteRequest) {
        return builder -> withId(quoteRequest.getId()).post(b -> QuoteRequestUpdate.builder()
                .version(quoteRequest.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(QuoteRequestUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyQuoteRequestsByIDDelete delete(Versioned<QuoteRequest> quoteRequest) {
        return withId(quoteRequest.getId()).delete().withVersion(quoteRequest.getVersion());
    }

    public default ByProjectKeyQuoteRequestsPost create(QuoteRequestDraft quoteRequestDraft) {
        return post(quoteRequestDraft);
    }

    public default ByProjectKeyQuoteRequestsPost create(UnaryOperator<QuoteRequestDraftBuilder> op) {
        return post(op.apply(QuoteRequestDraftBuilder.of()).build());
    }
}
