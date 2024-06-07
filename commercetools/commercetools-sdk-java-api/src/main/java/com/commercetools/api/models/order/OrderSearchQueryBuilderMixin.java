
package com.commercetools.api.models.order;

import java.util.function.Function;

public interface OrderSearchQueryBuilderMixin {
    public default OrderSearchAndExpression and(final OrderSearchQuery... expression) {
        return OrderSearchAndExpression.builder().and(expression).build();
    }

    public default OrderSearchOrExpression or(final OrderSearchQuery... expression) {
        return OrderSearchOrExpression.builder().or(expression).build();
    }

    public default OrderSearchNotExpression not(final OrderSearchQuery... expression) {
        return OrderSearchNotExpression.builder().not(expression).build();
    }

    public default OrderSearchFilterExpression filter(final OrderSearchQueryExpression... expression) {
        return OrderSearchFilterExpression.builder().filter(expression).build();
    }

    public default OrderSearchExactExpression exact(final OrderSearchAnyValue value) {
        return OrderSearchExactExpression.builder().exact(value).build();
    }

    public default OrderSearchFullTextExpression fullText(final OrderSearchFullTextValue value) {
        return OrderSearchFullTextExpression.builder().fullText(value).build();
    }

    public default OrderSearchPrefixExpression prefix(final OrderSearchStringValue value) {
        return OrderSearchPrefixExpression.builder().prefix(value).build();
    }

    public default OrderSearchDateRangeExpression dateRange(final OrderSearchDateRangeValue value) {
        return OrderSearchDateRangeExpression.builder().range(value).build();
    }

    public default OrderSearchNumberRangeExpression numberRange(final OrderSearchNumberRangeValue value) {
        return OrderSearchNumberRangeExpression.builder().range(value).build();
    }

    public default OrderSearchLongRangeExpression longRange(final OrderSearchLongRangeValue value) {
        return OrderSearchLongRangeExpression.builder().range(value).build();
    }

    public default OrderSearchWildCardExpression wildcard(final OrderSearchStringValue value) {
        return OrderSearchWildCardExpression.builder().wildcard(value).build();
    }

    public default OrderSearchExistsExpression exists(final OrderSearchQueryExpressionValue value) {
        return OrderSearchExistsExpression.builder().exists(value).build();
    }

    public default OrderSearchAndExpression and(
            final Function<OrderSearchAndExpressionBuilder, OrderSearchAndExpressionBuilder> query) {
        return query.apply(OrderSearchAndExpression.builder()).build();
    }

    public default OrderSearchOrExpression or(
            final Function<OrderSearchOrExpressionBuilder, OrderSearchOrExpressionBuilder> query) {
        return query.apply(OrderSearchOrExpression.builder()).build();
    }

    public default OrderSearchNotExpression not(
            final Function<OrderSearchNotExpressionBuilder, OrderSearchNotExpressionBuilder> query) {
        return query.apply(OrderSearchNotExpression.builder()).build();
    }

    public default OrderSearchFilterExpression filter(
            final Function<OrderSearchFilterExpressionBuilder, OrderSearchFilterExpressionBuilder> filter) {
        return filter.apply(OrderSearchFilterExpressionBuilder.of()).build();
    }

    public default OrderSearchExactExpression exact(
            final Function<OrderSearchAnyValueBuilder, OrderSearchAnyValueBuilder> value) {
        return OrderSearchExactExpression.builder().exact(value.apply(OrderSearchAnyValue.builder()).build()).build();
    }

    public default OrderSearchFullTextExpression fullText(
            final Function<OrderSearchFullTextValueBuilder, OrderSearchFullTextValueBuilder> value) {
        return OrderSearchFullTextExpression.builder()
                .fullText(value.apply(OrderSearchFullTextValue.builder()).build())
                .build();
    }

    public default OrderSearchPrefixExpression prefix(
            final Function<OrderSearchStringValueBuilder, OrderSearchStringValueBuilder> value) {
        return OrderSearchPrefixExpression.builder()
                .prefix(value.apply(OrderSearchStringValue.builder()).build())
                .build();
    }

    public default OrderSearchDateRangeExpression dateRange(
            final Function<OrderSearchDateRangeValueBuilder, OrderSearchDateRangeValueBuilder> value) {
        return OrderSearchDateRangeExpression.builder()
                .range(value.apply(OrderSearchDateRangeValue.builder()).build())
                .build();
    }

    public default OrderSearchNumberRangeExpression numberRange(
            final Function<OrderSearchNumberRangeValueBuilder, OrderSearchNumberRangeValueBuilder> value) {
        return OrderSearchNumberRangeExpression.builder()
                .range(value.apply(OrderSearchNumberRangeValue.builder()).build())
                .build();
    }

    public default OrderSearchLongRangeExpression longRange(
            final Function<OrderSearchLongRangeValueBuilder, OrderSearchLongRangeValueBuilder> value) {
        return OrderSearchLongRangeExpression.builder()
                .range(value.apply(OrderSearchLongRangeValue.builder()).build())
                .build();
    }

    public default OrderSearchWildCardExpression wildcard(
            final Function<OrderSearchStringValueBuilder, OrderSearchStringValueBuilder> value) {
        return OrderSearchWildCardExpression.builder()
                .wildcard(value.apply(OrderSearchStringValue.builder()).build())
                .build();
    }

    public default OrderSearchExistsExpression exists(
            final Function<OrderSearchQueryExpressionValueBuilder, OrderSearchQueryExpressionValueBuilder> value) {
        return OrderSearchExistsExpression.builder()
                .exists(value.apply(OrderSearchQueryExpressionValue.builder()).build())
                .build();
    }
}
