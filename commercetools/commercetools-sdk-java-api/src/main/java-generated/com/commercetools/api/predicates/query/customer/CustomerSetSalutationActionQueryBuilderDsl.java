
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerSetSalutationActionQueryBuilderDsl {
    public CustomerSetSalutationActionQueryBuilderDsl() {
    }

    public static CustomerSetSalutationActionQueryBuilderDsl of() {
        return new CustomerSetSalutationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetSalutationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetSalutationActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSetSalutationActionQueryBuilderDsl> salutation() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("salutation")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetSalutationActionQueryBuilderDsl::of));
    }
}
