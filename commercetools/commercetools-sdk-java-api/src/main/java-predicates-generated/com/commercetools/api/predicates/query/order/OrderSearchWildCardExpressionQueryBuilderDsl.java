package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchWildCardExpressionQueryBuilderDsl  {
    public OrderSearchWildCardExpressionQueryBuilderDsl() {
    }

    public static OrderSearchWildCardExpressionQueryBuilderDsl of() {
        return new OrderSearchWildCardExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchWildCardExpressionQueryBuilderDsl> wildcard(
        Function<com.commercetools.api.predicates.query.order.OrderSearchStringValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchStringValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("wildcard"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchStringValueQueryBuilderDsl.of())),
            OrderSearchWildCardExpressionQueryBuilderDsl::of);
    }
    
    
}
