
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerSetFirstNameActionQueryBuilderDsl {
    public MyCustomerSetFirstNameActionQueryBuilderDsl() {
    }

    public static MyCustomerSetFirstNameActionQueryBuilderDsl of() {
        return new MyCustomerSetFirstNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetFirstNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetFirstNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerSetFirstNameActionQueryBuilderDsl> firstName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("firstName")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetFirstNameActionQueryBuilderDsl::of));
    }
}
