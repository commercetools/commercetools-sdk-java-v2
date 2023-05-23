
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerTokenQueryBuilderDsl {
    public CustomerTokenQueryBuilderDsl() {
    }

    public static CustomerTokenQueryBuilderDsl of() {
        return new CustomerTokenQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerTokenQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerTokenQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerTokenQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerTokenQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerTokenQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerTokenQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerTokenQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
            p -> new CombinationQueryPredicate<>(p, CustomerTokenQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerTokenQueryBuilderDsl> expiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expiresAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerTokenQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerTokenQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CustomerTokenQueryBuilderDsl::of));
    }

}
