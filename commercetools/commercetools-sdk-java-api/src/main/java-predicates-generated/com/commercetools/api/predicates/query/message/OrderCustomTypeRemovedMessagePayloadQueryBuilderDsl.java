
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class OrderCustomTypeRemovedMessagePayloadQueryBuilderDsl {
    public OrderCustomTypeRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomTypeRemovedMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomTypeRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomTypeRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomTypeRemovedMessagePayloadQueryBuilderDsl> previousTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousTypeId")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
