
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSearchQueryExpressionValueQueryBuilderDsl {
    public OrderSearchQueryExpressionValueQueryBuilderDsl() {
    }

    public static OrderSearchQueryExpressionValueQueryBuilderDsl of() {
        return new OrderSearchQueryExpressionValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSearchQueryExpressionValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchQueryExpressionValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderSearchQueryExpressionValueQueryBuilderDsl> boost() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchQueryExpressionValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchQueryExpressionValueQueryBuilderDsl> customType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customType")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchQueryExpressionValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionValueQueryBuilderDsl> asOrderSearchAnyValue(
            Function<com.commercetools.api.predicates.query.order.OrderSearchAnyValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchAnyValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchAnyValueQueryBuilderDsl.of()),
            OrderSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionValueQueryBuilderDsl> asOrderSearchDateRangeValue(
            Function<com.commercetools.api.predicates.query.order.OrderSearchDateRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchDateRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchDateRangeValueQueryBuilderDsl.of()),
            OrderSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionValueQueryBuilderDsl> asOrderSearchFullTextValue(
            Function<com.commercetools.api.predicates.query.order.OrderSearchFullTextValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchFullTextValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchFullTextValueQueryBuilderDsl.of()),
            OrderSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionValueQueryBuilderDsl> asOrderSearchLongRangeValue(
            Function<com.commercetools.api.predicates.query.order.OrderSearchLongRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchLongRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchLongRangeValueQueryBuilderDsl.of()),
            OrderSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionValueQueryBuilderDsl> asOrderSearchNumberRangeValue(
            Function<com.commercetools.api.predicates.query.order.OrderSearchNumberRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchNumberRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchNumberRangeValueQueryBuilderDsl.of()),
            OrderSearchQueryExpressionValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSearchQueryExpressionValueQueryBuilderDsl> asOrderSearchStringValue(
            Function<com.commercetools.api.predicates.query.order.OrderSearchStringValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchStringValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSearchStringValueQueryBuilderDsl.of()),
            OrderSearchQueryExpressionValueQueryBuilderDsl::of);
    }
}
