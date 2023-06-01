package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderDeletedMessagePayloadQueryBuilderDsl  {
    public OrderDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderDeletedMessagePayloadQueryBuilderDsl of() {
        return new OrderDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderDeletedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderDeletedMessagePayloadQueryBuilderDsl> order(
        Function<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("order"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl.of())),
            OrderDeletedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
