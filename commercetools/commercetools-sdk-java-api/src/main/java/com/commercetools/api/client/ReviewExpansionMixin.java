
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.review.ReviewExpansionBuilderDsl;

public interface ReviewExpansionMixin<T extends ExpandableRequest<T, ReviewExpansionBuilderDsl>>
        extends ExpandableRequest<T, ReviewExpansionBuilderDsl> {
    @Override
    default ReviewExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.review();
    }
}
