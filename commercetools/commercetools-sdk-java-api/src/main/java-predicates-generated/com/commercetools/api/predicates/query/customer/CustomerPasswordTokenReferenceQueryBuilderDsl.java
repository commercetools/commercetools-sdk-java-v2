
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerPasswordTokenReferenceQueryBuilderDsl {
    public CustomerPasswordTokenReferenceQueryBuilderDsl() {
    }

    public static CustomerPasswordTokenReferenceQueryBuilderDsl of() {
        return new CustomerPasswordTokenReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerPasswordTokenReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerPasswordTokenReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenReferenceQueryBuilderDsl::of));
    }

}
