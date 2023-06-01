package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchOrExpressionQueryBuilderDsl  {
    public OrderSearchOrExpressionQueryBuilderDsl() {
    }

    public static OrderSearchOrExpressionQueryBuilderDsl of() {
        return new OrderSearchOrExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchOrExpressionQueryBuilderDsl> or(
        Function<com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("or"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl.of())),
            OrderSearchOrExpressionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderSearchOrExpressionQueryBuilderDsl> or() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("or")),
                p -> new CombinationQueryPredicate<>(p, OrderSearchOrExpressionQueryBuilderDsl::of));
    }
    
}
