
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetEstimatedDeliveryActionQueryBuilderDsl {
    public CartSetEstimatedDeliveryActionQueryBuilderDsl() {
    }

    public static CartSetEstimatedDeliveryActionQueryBuilderDsl of() {
        return new CartSetEstimatedDeliveryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetEstimatedDeliveryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetEstimatedDeliveryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetEstimatedDeliveryActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, CartSetEstimatedDeliveryActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetEstimatedDeliveryActionQueryBuilderDsl> estimatedDelivery(
            Function<com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("estimatedDelivery"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl.of())),
            CartSetEstimatedDeliveryActionQueryBuilderDsl::of);
    }

}
