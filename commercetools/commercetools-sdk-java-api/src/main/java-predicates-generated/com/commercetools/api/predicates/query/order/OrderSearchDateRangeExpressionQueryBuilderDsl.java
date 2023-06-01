package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchDateRangeExpressionQueryBuilderDsl  {
    public OrderSearchDateRangeExpressionQueryBuilderDsl() {
    }

    public static OrderSearchDateRangeExpressionQueryBuilderDsl of() {
        return new OrderSearchDateRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchDateRangeExpressionQueryBuilderDsl> range(
        Function<com.commercetools.api.predicates.query.order.OrderSearchDateRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchDateRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("range"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchDateRangeValueQueryBuilderDsl.of())),
            OrderSearchDateRangeExpressionQueryBuilderDsl::of);
    }
    
    
}
