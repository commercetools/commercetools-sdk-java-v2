
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSearchLongRangeExpressionQueryBuilderDsl {
    public OrderSearchLongRangeExpressionQueryBuilderDsl() {
    }

    public static OrderSearchLongRangeExpressionQueryBuilderDsl of() {
        return new OrderSearchLongRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchLongRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.order.OrderSearchLongRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchLongRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("range"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.order.OrderSearchLongRangeValueQueryBuilderDsl.of())),
            OrderSearchLongRangeExpressionQueryBuilderDsl::of);
    }

}
