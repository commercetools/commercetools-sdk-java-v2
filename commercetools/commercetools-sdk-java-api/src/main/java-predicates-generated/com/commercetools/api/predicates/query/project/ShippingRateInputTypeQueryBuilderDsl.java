package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShippingRateInputTypeQueryBuilderDsl  {
    public ShippingRateInputTypeQueryBuilderDsl() {
    }

    public static ShippingRateInputTypeQueryBuilderDsl of() {
        return new ShippingRateInputTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingRateInputTypeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ShippingRateInputTypeQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<ShippingRateInputTypeQueryBuilderDsl> asCartClassification(
        Function<com.commercetools.api.predicates.query.project.CartClassificationTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.CartClassificationTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.project.CartClassificationTypeQueryBuilderDsl.of()),
            ShippingRateInputTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ShippingRateInputTypeQueryBuilderDsl> asCartScore(
        Function<com.commercetools.api.predicates.query.project.CartScoreTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.CartScoreTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.project.CartScoreTypeQueryBuilderDsl.of()),
            ShippingRateInputTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ShippingRateInputTypeQueryBuilderDsl> asCartValue(
        Function<com.commercetools.api.predicates.query.project.CartValueTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.CartValueTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.project.CartValueTypeQueryBuilderDsl.of()),
            ShippingRateInputTypeQueryBuilderDsl::of);
    }
}
