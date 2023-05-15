
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class MyCustomerChangePasswordQueryBuilderDsl {
    public MyCustomerChangePasswordQueryBuilderDsl() {
    }

    public static MyCustomerChangePasswordQueryBuilderDsl of() {
        return new MyCustomerChangePasswordQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MyCustomerChangePasswordQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerChangePasswordQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerChangePasswordQueryBuilderDsl> currentPassword() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currentPassword")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerChangePasswordQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerChangePasswordQueryBuilderDsl> newPassword() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newPassword")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerChangePasswordQueryBuilderDsl::of));
    }
}
