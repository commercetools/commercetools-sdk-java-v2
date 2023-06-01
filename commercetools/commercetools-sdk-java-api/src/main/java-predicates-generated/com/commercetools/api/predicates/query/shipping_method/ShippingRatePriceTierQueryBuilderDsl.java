package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShippingRatePriceTierQueryBuilderDsl  {
    public ShippingRatePriceTierQueryBuilderDsl() {
    }

    public static ShippingRatePriceTierQueryBuilderDsl of() {
        return new ShippingRatePriceTierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingRatePriceTierQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ShippingRatePriceTierQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<ShippingRatePriceTierQueryBuilderDsl> asCartClassification(
        Function<com.commercetools.api.predicates.query.shipping_method.CartClassificationTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.CartClassificationTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.shipping_method.CartClassificationTierQueryBuilderDsl.of()),
            ShippingRatePriceTierQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ShippingRatePriceTierQueryBuilderDsl> asCartScore(
        Function<com.commercetools.api.predicates.query.shipping_method.CartScoreTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.CartScoreTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.shipping_method.CartScoreTierQueryBuilderDsl.of()),
            ShippingRatePriceTierQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ShippingRatePriceTierQueryBuilderDsl> asCartValue(
        Function<com.commercetools.api.predicates.query.shipping_method.CartValueTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.CartValueTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.shipping_method.CartValueTierQueryBuilderDsl.of()),
            ShippingRatePriceTierQueryBuilderDsl::of);
    }
}
