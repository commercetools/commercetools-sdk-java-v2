
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSetCustomerEmailActionQueryBuilderDsl {
    public OrderSetCustomerEmailActionQueryBuilderDsl() {
    }

    public static OrderSetCustomerEmailActionQueryBuilderDsl of() {
        return new OrderSetCustomerEmailActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetCustomerEmailActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetCustomerEmailActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetCustomerEmailActionQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
            p -> new CombinationQueryPredicate<>(p, OrderSetCustomerEmailActionQueryBuilderDsl::of));
    }

}
