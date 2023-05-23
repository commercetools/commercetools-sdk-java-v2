
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSetCustomerIdActionQueryBuilderDsl {
    public OrderSetCustomerIdActionQueryBuilderDsl() {
    }

    public static OrderSetCustomerIdActionQueryBuilderDsl of() {
        return new OrderSetCustomerIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetCustomerIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetCustomerIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetCustomerIdActionQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetCustomerIdActionQueryBuilderDsl::of));
    }

}
