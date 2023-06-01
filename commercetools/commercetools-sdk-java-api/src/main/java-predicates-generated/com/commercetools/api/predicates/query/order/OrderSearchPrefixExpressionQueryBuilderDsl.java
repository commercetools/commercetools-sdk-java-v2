package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchPrefixExpressionQueryBuilderDsl  {
    public OrderSearchPrefixExpressionQueryBuilderDsl() {
    }

    public static OrderSearchPrefixExpressionQueryBuilderDsl of() {
        return new OrderSearchPrefixExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchPrefixExpressionQueryBuilderDsl> prefix(
        Function<com.commercetools.api.predicates.query.order.OrderSearchStringValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchStringValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("prefix"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchStringValueQueryBuilderDsl.of())),
            OrderSearchPrefixExpressionQueryBuilderDsl::of);
    }
    
    
}
