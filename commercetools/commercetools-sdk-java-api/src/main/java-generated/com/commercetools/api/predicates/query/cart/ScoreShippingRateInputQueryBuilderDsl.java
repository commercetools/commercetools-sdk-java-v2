
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class ScoreShippingRateInputQueryBuilderDsl {
    public ScoreShippingRateInputQueryBuilderDsl() {
    }

    public static ScoreShippingRateInputQueryBuilderDsl of() {
        return new ScoreShippingRateInputQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ScoreShippingRateInputQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ScoreShippingRateInputQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ScoreShippingRateInputQueryBuilderDsl> score() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("score")),
            p -> new CombinationQueryPredicate<>(p, ScoreShippingRateInputQueryBuilderDsl::of));
    }
}
