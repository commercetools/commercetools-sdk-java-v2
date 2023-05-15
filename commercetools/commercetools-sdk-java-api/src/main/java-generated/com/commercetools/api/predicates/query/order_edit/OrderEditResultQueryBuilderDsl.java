
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class OrderEditResultQueryBuilderDsl {
    public OrderEditResultQueryBuilderDsl() {
    }

    public static OrderEditResultQueryBuilderDsl of() {
        return new OrderEditResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditResultQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderEditResultQueryBuilderDsl::of));
    }
}
