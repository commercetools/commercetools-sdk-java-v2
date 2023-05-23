
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerSetVatIdActionQueryBuilderDsl {
    public CustomerSetVatIdActionQueryBuilderDsl() {
    }

    public static CustomerSetVatIdActionQueryBuilderDsl of() {
        return new CustomerSetVatIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetVatIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetVatIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSetVatIdActionQueryBuilderDsl> vatId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("vatId")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetVatIdActionQueryBuilderDsl::of));
    }

}
