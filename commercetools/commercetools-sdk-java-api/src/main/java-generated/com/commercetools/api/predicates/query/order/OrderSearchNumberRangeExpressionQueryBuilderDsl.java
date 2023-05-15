
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSearchNumberRangeExpressionQueryBuilderDsl {
    public OrderSearchNumberRangeExpressionQueryBuilderDsl() {
    }

    public static OrderSearchNumberRangeExpressionQueryBuilderDsl of() {
        return new OrderSearchNumberRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchNumberRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.order.OrderSearchNumberRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchNumberRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("range"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.order.OrderSearchNumberRangeValueQueryBuilderDsl.of())),
            OrderSearchNumberRangeExpressionQueryBuilderDsl::of);
    }

}
