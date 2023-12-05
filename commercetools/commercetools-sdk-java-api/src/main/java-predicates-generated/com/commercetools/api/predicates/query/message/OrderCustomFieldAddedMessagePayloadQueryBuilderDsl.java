
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class OrderCustomFieldAddedMessagePayloadQueryBuilderDsl {
    public OrderCustomFieldAddedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomFieldAddedMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomFieldAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomFieldAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomFieldAddedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomFieldAddedMessagePayloadQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

}
