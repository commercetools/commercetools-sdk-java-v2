
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSearchQueryExpressionQueryBuilderDsl {
    public OrderSearchQueryExpressionQueryBuilderDsl() {
    }

    public static OrderSearchQueryExpressionQueryBuilderDsl of() {
        return new OrderSearchQueryExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionQueryBuilderDsl> asOrderSearchDateRangeExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchDateRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchDateRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchDateRangeExpressionQueryBuilderDsl.of()),
            OrderSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionQueryBuilderDsl> asOrderSearchExactExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchExactExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchExactExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchExactExpressionQueryBuilderDsl.of()),
            OrderSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionQueryBuilderDsl> asOrderSearchExistsExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchExistsExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchExistsExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchExistsExpressionQueryBuilderDsl.of()),
            OrderSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionQueryBuilderDsl> asOrderSearchFullTextExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchFullTextExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchFullTextExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchFullTextExpressionQueryBuilderDsl.of()),
            OrderSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionQueryBuilderDsl> asOrderSearchLongRangeExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchLongRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchLongRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchLongRangeExpressionQueryBuilderDsl.of()),
            OrderSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionQueryBuilderDsl> asOrderSearchNumberRangeExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchNumberRangeExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchNumberRangeExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchNumberRangeExpressionQueryBuilderDsl.of()),
            OrderSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionQueryBuilderDsl> asOrderSearchPrefixExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchPrefixExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchPrefixExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchPrefixExpressionQueryBuilderDsl.of()),
            OrderSearchQueryExpressionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionQueryBuilderDsl> asOrderSearchWildCardExpression(
            Function<com.commercetools.api.predicates.query.order.OrderSearchWildCardExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchWildCardExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchWildCardExpressionQueryBuilderDsl.of()),
            OrderSearchQueryExpressionQueryBuilderDsl::of);
    }
}
