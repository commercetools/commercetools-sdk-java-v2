
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.quote.QuoteExpansionBuilderDsl;

public interface QuoteExpansionMixin<T extends ExpandableRequest<T, QuoteExpansionBuilderDsl>>
        extends ExpandableRequest<T, QuoteExpansionBuilderDsl> {
    @Override
    default QuoteExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.quote();
    }
}
