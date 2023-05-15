
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCartSetCustomerEmailActionQueryBuilderDsl {
    public MyCartSetCustomerEmailActionQueryBuilderDsl() {
    }

    public static MyCartSetCustomerEmailActionQueryBuilderDsl of() {
        return new MyCartSetCustomerEmailActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetCustomerEmailActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetCustomerEmailActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetCustomerEmailActionQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetCustomerEmailActionQueryBuilderDsl::of));
    }
}
