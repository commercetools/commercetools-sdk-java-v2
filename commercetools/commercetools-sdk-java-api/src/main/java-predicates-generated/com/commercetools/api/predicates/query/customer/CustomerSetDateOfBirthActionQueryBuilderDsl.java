
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerSetDateOfBirthActionQueryBuilderDsl {
    public CustomerSetDateOfBirthActionQueryBuilderDsl() {
    }

    public static CustomerSetDateOfBirthActionQueryBuilderDsl of() {
        return new CustomerSetDateOfBirthActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetDateOfBirthActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetDateOfBirthActionQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<CustomerSetDateOfBirthActionQueryBuilderDsl> dateOfBirth() {
        return new DateComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dateOfBirth")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetDateOfBirthActionQueryBuilderDsl::of));
    }

}
