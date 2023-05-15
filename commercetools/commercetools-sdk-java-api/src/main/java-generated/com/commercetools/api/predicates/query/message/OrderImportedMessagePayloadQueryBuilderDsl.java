
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderImportedMessagePayloadQueryBuilderDsl {
    public OrderImportedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderImportedMessagePayloadQueryBuilderDsl of() {
        return new OrderImportedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderImportedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderImportedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderImportedMessagePayloadQueryBuilderDsl> order(
            Function<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("order"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl.of())),
            OrderImportedMessagePayloadQueryBuilderDsl::of);
    }

}
