
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.staged_quote.StagedQuoteExpansionBuilderDsl;

public interface StagedQuoteExpansionMixin<T extends ExpandableRequest<T, StagedQuoteExpansionBuilderDsl>>
        extends ExpandableRequest<T, StagedQuoteExpansionBuilderDsl> {
    @Override
    default StagedQuoteExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.stagedQuote();
    }
}
