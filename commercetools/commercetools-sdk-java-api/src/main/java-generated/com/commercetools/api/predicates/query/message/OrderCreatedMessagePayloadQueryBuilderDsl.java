
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderCreatedMessagePayloadQueryBuilderDsl {
    public OrderCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCreatedMessagePayloadQueryBuilderDsl of() {
        return new OrderCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCreatedMessagePayloadQueryBuilderDsl> order(
            Function<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("order"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl.of())),
            OrderCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
