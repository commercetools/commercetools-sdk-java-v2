
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderReferenceQueryBuilderDsl {
    public OrderReferenceQueryBuilderDsl() {
    }

    public static OrderReferenceQueryBuilderDsl of() {
        return new OrderReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, OrderReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl.of())),
            OrderReferenceQueryBuilderDsl::of);
    }

}
