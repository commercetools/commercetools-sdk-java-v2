package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchAndExpressionQueryBuilderDsl  {
    public OrderSearchAndExpressionQueryBuilderDsl() {
    }

    public static OrderSearchAndExpressionQueryBuilderDsl of() {
        return new OrderSearchAndExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchAndExpressionQueryBuilderDsl> and(
        Function<com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("and"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl.of())),
            OrderSearchAndExpressionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderSearchAndExpressionQueryBuilderDsl> and() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("and")),
                p -> new CombinationQueryPredicate<>(p, OrderSearchAndExpressionQueryBuilderDsl::of));
    }
    
}
