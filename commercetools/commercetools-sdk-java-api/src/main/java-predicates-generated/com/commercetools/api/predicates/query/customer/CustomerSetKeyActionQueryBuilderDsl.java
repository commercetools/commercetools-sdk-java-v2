
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerSetKeyActionQueryBuilderDsl {
    public CustomerSetKeyActionQueryBuilderDsl() {
    }

    public static CustomerSetKeyActionQueryBuilderDsl of() {
        return new CustomerSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetKeyActionQueryBuilderDsl::of));
    }

}
