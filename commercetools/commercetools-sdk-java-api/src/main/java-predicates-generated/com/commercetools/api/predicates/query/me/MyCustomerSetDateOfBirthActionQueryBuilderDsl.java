
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerSetDateOfBirthActionQueryBuilderDsl {
    public MyCustomerSetDateOfBirthActionQueryBuilderDsl() {
    }

    public static MyCustomerSetDateOfBirthActionQueryBuilderDsl of() {
        return new MyCustomerSetDateOfBirthActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetDateOfBirthActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetDateOfBirthActionQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<MyCustomerSetDateOfBirthActionQueryBuilderDsl> dateOfBirth() {
        return new DateComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dateOfBirth")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetDateOfBirthActionQueryBuilderDsl::of));
    }

}
