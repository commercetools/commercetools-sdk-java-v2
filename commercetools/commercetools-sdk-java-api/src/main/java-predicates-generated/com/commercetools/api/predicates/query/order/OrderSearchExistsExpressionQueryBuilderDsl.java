
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSearchExistsExpressionQueryBuilderDsl {
    public OrderSearchExistsExpressionQueryBuilderDsl() {
    }

    public static OrderSearchExistsExpressionQueryBuilderDsl of() {
        return new OrderSearchExistsExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchExistsExpressionQueryBuilderDsl> exists(
            Function<com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("exists"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionValueQueryBuilderDsl.of())),
            OrderSearchExistsExpressionQueryBuilderDsl::of);
    }

}
