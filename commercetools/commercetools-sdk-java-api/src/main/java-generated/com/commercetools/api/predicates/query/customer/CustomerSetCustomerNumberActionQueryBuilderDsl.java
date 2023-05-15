
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerSetCustomerNumberActionQueryBuilderDsl {
    public CustomerSetCustomerNumberActionQueryBuilderDsl() {
    }

    public static CustomerSetCustomerNumberActionQueryBuilderDsl of() {
        return new CustomerSetCustomerNumberActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetCustomerNumberActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetCustomerNumberActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSetCustomerNumberActionQueryBuilderDsl> customerNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetCustomerNumberActionQueryBuilderDsl::of));
    }
}
