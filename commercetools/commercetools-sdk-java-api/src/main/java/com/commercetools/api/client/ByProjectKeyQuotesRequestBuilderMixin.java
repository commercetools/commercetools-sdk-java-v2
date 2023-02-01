
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.quote.Quote;
import com.commercetools.api.models.quote.QuoteDraft;
import com.commercetools.api.models.quote.QuoteDraftBuilder;
import com.commercetools.api.models.quote.QuoteUpdate;
import com.commercetools.api.models.quote.QuoteUpdateAction;
import com.commercetools.api.models.quote.QuoteUpdateActionBuilder;

public interface ByProjectKeyQuotesRequestBuilderMixin {
    public ByProjectKeyQuotesPost post(QuoteDraft quoteDraft);

    public ByProjectKeyQuotesByIDRequestBuilder withId(String ID);

    public default ByProjectKeyQuotesByIDPost update(Versioned<Quote> quote,
            java.util.List<QuoteUpdateAction> actions) {
        return withId(quote.getId())
                .post(builder -> QuoteUpdate.builder().version(quote.getVersion()).actions(actions));
    }

    public default ByProjectKeyQuotesByIDPost update(Versioned<Quote> quote,
            UnaryOperator<UpdateActionBuilder<QuoteUpdateAction, QuoteUpdateActionBuilder>> op) {
        return withId(quote.getId()).post(builder -> QuoteUpdate.builder()
                .version(quote.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(QuoteUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<QuoteUpdateAction, QuoteUpdateActionBuilder, ByProjectKeyQuotesByIDPost> update(
            Versioned<Quote> quote) {
        return builder -> withId(quote.getId()).post(b -> QuoteUpdate.builder()
                .version(quote.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(QuoteUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyQuotesByIDDelete delete(Versioned<Quote> quote) {
        return withId(quote.getId()).delete().withVersion(quote.getVersion());
    }

    public default ByProjectKeyQuotesPost create(QuoteDraft quoteDraft) {
        return post(quoteDraft);
    }

    public default ByProjectKeyQuotesPost create(UnaryOperator<QuoteDraftBuilder> op) {
        return post(op.apply(QuoteDraftBuilder.of()).build());
    }
}
