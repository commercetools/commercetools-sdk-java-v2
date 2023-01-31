
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.staged_quote.StagedQuote;
import com.commercetools.api.models.staged_quote.StagedQuoteDraft;
import com.commercetools.api.models.staged_quote.StagedQuoteDraftBuilder;
import com.commercetools.api.models.staged_quote.StagedQuoteUpdate;
import com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction;
import com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionBuilder;

public interface ByProjectKeyStagedQuotesRequestBuilderMixin {
    public ByProjectKeyStagedQuotesPost post(StagedQuoteDraft stagedQuoteDraft);

    public ByProjectKeyStagedQuotesByIDRequestBuilder withId(String ID);

    public default ByProjectKeyStagedQuotesByIDPost update(Versioned<StagedQuote> stagedQuote,
            java.util.List<StagedQuoteUpdateAction> actions) {
        return withId(stagedQuote.getId())
                .post(builder -> StagedQuoteUpdate.builder().version(stagedQuote.getVersion()).actions(actions));
    }

    public default ByProjectKeyStagedQuotesByIDPost update(Versioned<StagedQuote> stagedQuote,
            UnaryOperator<UpdateActionBuilder<StagedQuoteUpdateAction, StagedQuoteUpdateActionBuilder>> op) {
        return withId(stagedQuote.getId()).post(builder -> StagedQuoteUpdate.builder()
                .version(stagedQuote.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(StagedQuoteUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<StagedQuoteUpdateAction, StagedQuoteUpdateActionBuilder, ByProjectKeyStagedQuotesByIDPost> update(
            Versioned<StagedQuote> stagedQuote) {
        return builder -> withId(stagedQuote.getId()).post(b -> StagedQuoteUpdate.builder()
                .version(stagedQuote.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(StagedQuoteUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyStagedQuotesByIDDelete delete(Versioned<StagedQuote> stagedQuote) {
        return withId(stagedQuote.getId()).delete().withVersion(stagedQuote.getVersion());
    }

    public default ByProjectKeyStagedQuotesPost create(StagedQuoteDraft stagedQuoteDraft) {
        return post(stagedQuoteDraft);
    }

    public default ByProjectKeyStagedQuotesPost create(UnaryOperator<StagedQuoteDraftBuilder> op) {
        return post(op.apply(StagedQuoteDraftBuilder.of()).build());
    }
}
