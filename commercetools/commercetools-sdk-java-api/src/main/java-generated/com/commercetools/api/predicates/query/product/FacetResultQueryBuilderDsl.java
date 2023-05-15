
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class FacetResultQueryBuilderDsl {
    public FacetResultQueryBuilderDsl() {
    }

    public static FacetResultQueryBuilderDsl of() {
        return new FacetResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<FacetResultQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, FacetResultQueryBuilderDsl::of));
    }
}
