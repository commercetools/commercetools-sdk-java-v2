
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderUpdateActionQueryBuilderDsl {
    public OrderUpdateActionQueryBuilderDsl() {
    }

    public static OrderUpdateActionQueryBuilderDsl of() {
        return new OrderUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderUpdateActionQueryBuilderDsl::of));
    }
}
