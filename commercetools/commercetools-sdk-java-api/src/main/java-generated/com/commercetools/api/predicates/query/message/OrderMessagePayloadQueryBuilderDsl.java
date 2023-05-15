
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class OrderMessagePayloadQueryBuilderDsl {
    public OrderMessagePayloadQueryBuilderDsl() {
    }

    public static OrderMessagePayloadQueryBuilderDsl of() {
        return new OrderMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderMessagePayloadQueryBuilderDsl::of));
    }
}
