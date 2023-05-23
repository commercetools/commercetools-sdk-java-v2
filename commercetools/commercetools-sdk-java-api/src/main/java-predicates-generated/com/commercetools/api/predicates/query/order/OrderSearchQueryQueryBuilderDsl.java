
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSearchQueryQueryBuilderDsl {
    public OrderSearchQueryQueryBuilderDsl() {
    }

    public static OrderSearchQueryQueryBuilderDsl of() {
        return new OrderSearchQueryQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchQueryQueryBuilderDsl> asOrderSearchCompoundExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchCompoundExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchCompoundExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchCompoundExpressionQueryBuilderDsl.of()),
            OrderSearchQueryQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryQueryBuilderDsl> asOrderSearchQueryExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionQueryBuilderDsl.of()),
            OrderSearchQueryQueryBuilderDsl::of);
    }
}
