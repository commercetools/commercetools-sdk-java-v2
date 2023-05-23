
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSearchCompoundExpressionQueryBuilderDsl {
    public OrderSearchCompoundExpressionQueryBuilderDsl() {
    }

    public static OrderSearchCompoundExpressionQueryBuilderDsl of() {
        return new OrderSearchCompoundExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchCompoundExpressionQueryBuilderDsl> asOrderSearchAndExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchAndExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchAndExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchAndExpressionQueryBuilderDsl.of()),
            OrderSearchCompoundExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchCompoundExpressionQueryBuilderDsl> asOrderSearchFilterExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchFilterExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchFilterExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchFilterExpressionQueryBuilderDsl.of()),
            OrderSearchCompoundExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchCompoundExpressionQueryBuilderDsl> asOrderSearchNotExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchNotExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchNotExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchNotExpressionQueryBuilderDsl.of()),
            OrderSearchCompoundExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchCompoundExpressionQueryBuilderDsl> asOrderSearchOrExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchOrExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchOrExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchOrExpressionQueryBuilderDsl.of()),
            OrderSearchCompoundExpressionQueryBuilderDsl::of);
    }
}
