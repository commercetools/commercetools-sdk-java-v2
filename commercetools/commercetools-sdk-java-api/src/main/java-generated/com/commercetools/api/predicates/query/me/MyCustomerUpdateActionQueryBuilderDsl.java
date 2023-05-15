
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerUpdateActionQueryBuilderDsl {
    public MyCustomerUpdateActionQueryBuilderDsl() {
    }

    public static MyCustomerUpdateActionQueryBuilderDsl of() {
        return new MyCustomerUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerUpdateActionQueryBuilderDsl::of));
    }
}
