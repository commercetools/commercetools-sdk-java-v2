
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderEstimatedDeliverySetMessagePayloadQueryBuilderDsl {
    public OrderEstimatedDeliverySetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderEstimatedDeliverySetMessagePayloadQueryBuilderDsl of() {
        return new OrderEstimatedDeliverySetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEstimatedDeliverySetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderEstimatedDeliverySetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderEstimatedDeliverySetMessagePayloadQueryBuilderDsl> estimatedDelivery(
            Function<com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("estimatedDelivery"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl.of())),
            OrderEstimatedDeliverySetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderEstimatedDeliverySetMessagePayloadQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, OrderEstimatedDeliverySetMessagePayloadQueryBuilderDsl::of));
    }

}
