
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class CartScoreTypeQueryBuilderDsl {
    public CartScoreTypeQueryBuilderDsl() {
    }

    public static CartScoreTypeQueryBuilderDsl of() {
        return new CartScoreTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartScoreTypeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartScoreTypeQueryBuilderDsl::of));
    }
}
