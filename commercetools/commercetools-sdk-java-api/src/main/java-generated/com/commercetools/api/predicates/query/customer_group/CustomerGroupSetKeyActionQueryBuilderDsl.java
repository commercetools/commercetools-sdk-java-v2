
package com.commercetools.api.predicates.query.customer_group;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupSetKeyActionQueryBuilderDsl {
    public CustomerGroupSetKeyActionQueryBuilderDsl() {
    }

    public static CustomerGroupSetKeyActionQueryBuilderDsl of() {
        return new CustomerGroupSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerGroupSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupSetKeyActionQueryBuilderDsl::of));
    }
}
