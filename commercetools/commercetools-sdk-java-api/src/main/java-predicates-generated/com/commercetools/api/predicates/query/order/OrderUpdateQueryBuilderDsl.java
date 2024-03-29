
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderUpdateQueryBuilderDsl {
    public OrderUpdateQueryBuilderDsl() {
    }

    public static OrderUpdateQueryBuilderDsl of() {
        return new OrderUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<OrderUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.order.OrderUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderUpdateActionQueryBuilderDsl.of())),
            OrderUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, OrderUpdateQueryBuilderDsl::of));
    }

}
