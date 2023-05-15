
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerChangePasswordQueryBuilderDsl {
    public CustomerChangePasswordQueryBuilderDsl() {
    }

    public static CustomerChangePasswordQueryBuilderDsl of() {
        return new CustomerChangePasswordQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerChangePasswordQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerChangePasswordQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerChangePasswordQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerChangePasswordQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerChangePasswordQueryBuilderDsl> currentPassword() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currentPassword")),
            p -> new CombinationQueryPredicate<>(p, CustomerChangePasswordQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerChangePasswordQueryBuilderDsl> newPassword() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newPassword")),
            p -> new CombinationQueryPredicate<>(p, CustomerChangePasswordQueryBuilderDsl::of));
    }
}
