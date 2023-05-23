
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingRateInputDraftQueryBuilderDsl {
    public ShippingRateInputDraftQueryBuilderDsl() {
    }

    public static ShippingRateInputDraftQueryBuilderDsl of() {
        return new ShippingRateInputDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingRateInputDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShippingRateInputDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingRateInputDraftQueryBuilderDsl> asClassification(
            Function<com.commercetools.api.predicates.query.cart.ClassificationShippingRateInputDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ClassificationShippingRateInputDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart.ClassificationShippingRateInputDraftQueryBuilderDsl.of()),
            ShippingRateInputDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingRateInputDraftQueryBuilderDsl> asScore(
            Function<com.commercetools.api.predicates.query.cart.ScoreShippingRateInputDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ScoreShippingRateInputDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.ScoreShippingRateInputDraftQueryBuilderDsl.of()),
            ShippingRateInputDraftQueryBuilderDsl::of);
    }
}
