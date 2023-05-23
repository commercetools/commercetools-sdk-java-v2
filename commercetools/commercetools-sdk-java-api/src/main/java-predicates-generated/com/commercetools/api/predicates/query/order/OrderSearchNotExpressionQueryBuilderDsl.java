
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSearchNotExpressionQueryBuilderDsl {
    public OrderSearchNotExpressionQueryBuilderDsl() {
    }

    public static OrderSearchNotExpressionQueryBuilderDsl of() {
        return new OrderSearchNotExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchNotExpressionQueryBuilderDsl> not(
            Function<com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("not"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl.of())),
            OrderSearchNotExpressionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderSearchNotExpressionQueryBuilderDsl> not() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("not")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchNotExpressionQueryBuilderDsl::of));
    }

}
