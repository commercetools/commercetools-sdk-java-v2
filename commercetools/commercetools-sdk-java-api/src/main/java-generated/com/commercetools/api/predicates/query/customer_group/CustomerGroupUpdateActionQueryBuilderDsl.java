
package com.commercetools.api.predicates.query.customer_group;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupUpdateActionQueryBuilderDsl {
    public CustomerGroupUpdateActionQueryBuilderDsl() {
    }

    public static CustomerGroupUpdateActionQueryBuilderDsl of() {
        return new CustomerGroupUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupUpdateActionQueryBuilderDsl::of));
    }
}
