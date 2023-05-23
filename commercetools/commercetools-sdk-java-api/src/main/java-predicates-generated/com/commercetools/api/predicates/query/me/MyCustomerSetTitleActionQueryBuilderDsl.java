
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerSetTitleActionQueryBuilderDsl {
    public MyCustomerSetTitleActionQueryBuilderDsl() {
    }

    public static MyCustomerSetTitleActionQueryBuilderDsl of() {
        return new MyCustomerSetTitleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetTitleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetTitleActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerSetTitleActionQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetTitleActionQueryBuilderDsl::of));
    }

}
