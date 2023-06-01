package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchFilterExpressionQueryBuilderDsl  {
    public OrderSearchFilterExpressionQueryBuilderDsl() {
    }

    public static OrderSearchFilterExpressionQueryBuilderDsl of() {
        return new OrderSearchFilterExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchFilterExpressionQueryBuilderDsl> filter(
        Function<com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("filter"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionQueryBuilderDsl.of())),
            OrderSearchFilterExpressionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderSearchFilterExpressionQueryBuilderDsl> filter() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("filter")),
                p -> new CombinationQueryPredicate<>(p, OrderSearchFilterExpressionQueryBuilderDsl::of));
    }
    
}
