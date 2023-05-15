
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class OrderEditUpdateActionQueryBuilderDsl {
    public OrderEditUpdateActionQueryBuilderDsl() {
    }

    public static OrderEditUpdateActionQueryBuilderDsl of() {
        return new OrderEditUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderEditUpdateActionQueryBuilderDsl::of));
    }
}
