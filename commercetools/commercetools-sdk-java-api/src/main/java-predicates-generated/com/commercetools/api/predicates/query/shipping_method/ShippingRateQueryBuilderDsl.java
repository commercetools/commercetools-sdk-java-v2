
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingRateQueryBuilderDsl {
    public ShippingRateQueryBuilderDsl() {
    }

    public static ShippingRateQueryBuilderDsl of() {
        return new ShippingRateQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ShippingRateQueryBuilderDsl> price(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("price"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            ShippingRateQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingRateQueryBuilderDsl> freeAbove(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("freeAbove"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            ShippingRateQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ShippingRateQueryBuilderDsl> isMatching() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isMatching")),
            p -> new CombinationQueryPredicate<>(p, ShippingRateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingRateQueryBuilderDsl> tiers(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRatePriceTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRatePriceTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("tiers"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shipping_method.ShippingRatePriceTierQueryBuilderDsl.of())),
            ShippingRateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ShippingRateQueryBuilderDsl> tiers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tiers")),
            p -> new CombinationQueryPredicate<>(p, ShippingRateQueryBuilderDsl::of));
    }

}
