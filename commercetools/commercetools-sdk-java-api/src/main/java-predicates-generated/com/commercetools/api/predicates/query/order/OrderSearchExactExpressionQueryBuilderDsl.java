package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchExactExpressionQueryBuilderDsl  {
    public OrderSearchExactExpressionQueryBuilderDsl() {
    }

    public static OrderSearchExactExpressionQueryBuilderDsl of() {
        return new OrderSearchExactExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchExactExpressionQueryBuilderDsl> exact(
        Function<com.commercetools.api.predicates.query.order.OrderSearchAnyValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchAnyValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("exact"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchAnyValueQueryBuilderDsl.of())),
            OrderSearchExactExpressionQueryBuilderDsl::of);
    }
    
    
}
