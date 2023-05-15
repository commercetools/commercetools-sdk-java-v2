
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class OrderEditSetKeyActionQueryBuilderDsl {
    public OrderEditSetKeyActionQueryBuilderDsl() {
    }

    public static OrderEditSetKeyActionQueryBuilderDsl of() {
        return new OrderEditSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderEditSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderEditSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, OrderEditSetKeyActionQueryBuilderDsl::of));
    }
}
