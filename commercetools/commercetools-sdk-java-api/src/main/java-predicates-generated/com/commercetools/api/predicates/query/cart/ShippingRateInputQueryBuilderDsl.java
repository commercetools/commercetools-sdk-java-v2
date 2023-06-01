package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShippingRateInputQueryBuilderDsl  {
    public ShippingRateInputQueryBuilderDsl() {
    }

    public static ShippingRateInputQueryBuilderDsl of() {
        return new ShippingRateInputQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingRateInputQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ShippingRateInputQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<ShippingRateInputQueryBuilderDsl> asClassification(
        Function<com.commercetools.api.predicates.query.cart.ClassificationShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ClassificationShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.cart.ClassificationShippingRateInputQueryBuilderDsl.of()),
            ShippingRateInputQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ShippingRateInputQueryBuilderDsl> asScore(
        Function<com.commercetools.api.predicates.query.cart.ScoreShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ScoreShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.cart.ScoreShippingRateInputQueryBuilderDsl.of()),
            ShippingRateInputQueryBuilderDsl::of);
    }
}
