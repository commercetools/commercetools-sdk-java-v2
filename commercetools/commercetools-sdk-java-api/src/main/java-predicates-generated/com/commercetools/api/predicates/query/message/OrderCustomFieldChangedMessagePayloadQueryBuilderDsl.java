
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class OrderCustomFieldChangedMessagePayloadQueryBuilderDsl {
    public OrderCustomFieldChangedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomFieldChangedMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomFieldChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomFieldChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomFieldChangedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomFieldChangedMessagePayloadQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomFieldChangedMessagePayloadQueryBuilderDsl> previousValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousValue")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

}
