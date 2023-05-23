
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerSetMiddleNameActionQueryBuilderDsl {
    public MyCustomerSetMiddleNameActionQueryBuilderDsl() {
    }

    public static MyCustomerSetMiddleNameActionQueryBuilderDsl of() {
        return new MyCustomerSetMiddleNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetMiddleNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetMiddleNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerSetMiddleNameActionQueryBuilderDsl> middleName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("middleName")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetMiddleNameActionQueryBuilderDsl::of));
    }

}
