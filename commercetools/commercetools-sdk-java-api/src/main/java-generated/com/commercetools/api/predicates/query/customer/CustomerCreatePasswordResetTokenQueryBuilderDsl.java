
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerCreatePasswordResetTokenQueryBuilderDsl {
    public CustomerCreatePasswordResetTokenQueryBuilderDsl() {
    }

    public static CustomerCreatePasswordResetTokenQueryBuilderDsl of() {
        return new CustomerCreatePasswordResetTokenQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerCreatePasswordResetTokenQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
            p -> new CombinationQueryPredicate<>(p, CustomerCreatePasswordResetTokenQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerCreatePasswordResetTokenQueryBuilderDsl> ttlMinutes() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("ttlMinutes")),
            p -> new CombinationQueryPredicate<>(p, CustomerCreatePasswordResetTokenQueryBuilderDsl::of));
    }
}
