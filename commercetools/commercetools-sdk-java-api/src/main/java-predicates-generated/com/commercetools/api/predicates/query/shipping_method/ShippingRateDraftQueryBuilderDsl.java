
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingRateDraftQueryBuilderDsl {
    public ShippingRateDraftQueryBuilderDsl() {
    }

    public static ShippingRateDraftQueryBuilderDsl of() {
        return new ShippingRateDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ShippingRateDraftQueryBuilderDsl> price(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("price"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            ShippingRateDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingRateDraftQueryBuilderDsl> freeAbove(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("freeAbove"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            ShippingRateDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingRateDraftQueryBuilderDsl> tiers(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRatePriceTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRatePriceTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("tiers"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shipping_method.ShippingRatePriceTierQueryBuilderDsl.of())),
            ShippingRateDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ShippingRateDraftQueryBuilderDsl> tiers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tiers")),
            p -> new CombinationQueryPredicate<>(p, ShippingRateDraftQueryBuilderDsl::of));
    }

}
