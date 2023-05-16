
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerChangeEmailActionQueryBuilderDsl {
    public CustomerChangeEmailActionQueryBuilderDsl() {
    }

    public static CustomerChangeEmailActionQueryBuilderDsl of() {
        return new CustomerChangeEmailActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerChangeEmailActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerChangeEmailActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerChangeEmailActionQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
            p -> new CombinationQueryPredicate<>(p, CustomerChangeEmailActionQueryBuilderDsl::of));
    }

}
