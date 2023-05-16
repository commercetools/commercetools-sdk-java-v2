
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerChangeEmailActionQueryBuilderDsl {
    public MyCustomerChangeEmailActionQueryBuilderDsl() {
    }

    public static MyCustomerChangeEmailActionQueryBuilderDsl of() {
        return new MyCustomerChangeEmailActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerChangeEmailActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerChangeEmailActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerChangeEmailActionQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerChangeEmailActionQueryBuilderDsl::of));
    }

}
