
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderChangeOrderStateActionQueryBuilderDsl {
    public OrderChangeOrderStateActionQueryBuilderDsl() {
    }

    public static OrderChangeOrderStateActionQueryBuilderDsl of() {
        return new OrderChangeOrderStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderChangeOrderStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderChangeOrderStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderChangeOrderStateActionQueryBuilderDsl> orderState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderState")),
            p -> new CombinationQueryPredicate<>(p, OrderChangeOrderStateActionQueryBuilderDsl::of));
    }

}
