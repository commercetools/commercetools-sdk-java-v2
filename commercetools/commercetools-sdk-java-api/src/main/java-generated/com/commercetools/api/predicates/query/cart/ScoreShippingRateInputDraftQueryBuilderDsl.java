
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class ScoreShippingRateInputDraftQueryBuilderDsl {
    public ScoreShippingRateInputDraftQueryBuilderDsl() {
    }

    public static ScoreShippingRateInputDraftQueryBuilderDsl of() {
        return new ScoreShippingRateInputDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ScoreShippingRateInputDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ScoreShippingRateInputDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ScoreShippingRateInputDraftQueryBuilderDsl> score() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("score")),
            p -> new CombinationQueryPredicate<>(p, ScoreShippingRateInputDraftQueryBuilderDsl::of));
    }
}
