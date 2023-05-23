
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSetOrderNumberActionQueryBuilderDsl {
    public OrderSetOrderNumberActionQueryBuilderDsl() {
    }

    public static OrderSetOrderNumberActionQueryBuilderDsl of() {
        return new OrderSetOrderNumberActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetOrderNumberActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetOrderNumberActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetOrderNumberActionQueryBuilderDsl> orderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderSetOrderNumberActionQueryBuilderDsl::of));
    }

}
