
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerSetCompanyNameActionQueryBuilderDsl {
    public CustomerSetCompanyNameActionQueryBuilderDsl() {
    }

    public static CustomerSetCompanyNameActionQueryBuilderDsl of() {
        return new CustomerSetCompanyNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetCompanyNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetCompanyNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSetCompanyNameActionQueryBuilderDsl> companyName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("companyName")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetCompanyNameActionQueryBuilderDsl::of));
    }
}
