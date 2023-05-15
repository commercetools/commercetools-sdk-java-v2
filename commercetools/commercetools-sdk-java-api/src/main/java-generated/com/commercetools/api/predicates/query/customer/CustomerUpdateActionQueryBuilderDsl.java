
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerUpdateActionQueryBuilderDsl {
    public CustomerUpdateActionQueryBuilderDsl() {
    }

    public static CustomerUpdateActionQueryBuilderDsl of() {
        return new CustomerUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerUpdateActionQueryBuilderDsl::of));
    }
}
