
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSetEstimatedDeliveryActionQueryBuilderDsl {
    public OrderSetEstimatedDeliveryActionQueryBuilderDsl() {
    }

    public static OrderSetEstimatedDeliveryActionQueryBuilderDsl of() {
        return new OrderSetEstimatedDeliveryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetEstimatedDeliveryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetEstimatedDeliveryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetEstimatedDeliveryActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, OrderSetEstimatedDeliveryActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSetEstimatedDeliveryActionQueryBuilderDsl> estimatedDelivery(
            Function<com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("estimatedDelivery"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl.of())),
            OrderSetEstimatedDeliveryActionQueryBuilderDsl::of);
    }

}
