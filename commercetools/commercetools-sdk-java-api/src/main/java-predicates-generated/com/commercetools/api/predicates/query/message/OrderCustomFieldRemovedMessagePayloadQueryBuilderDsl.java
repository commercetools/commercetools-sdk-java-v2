
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class OrderCustomFieldRemovedMessagePayloadQueryBuilderDsl {
    public OrderCustomFieldRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomFieldRemovedMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomFieldRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomFieldRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomFieldRemovedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
