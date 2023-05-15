
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCartUpdateActionQueryBuilderDsl {
    public MyCartUpdateActionQueryBuilderDsl() {
    }

    public static MyCartUpdateActionQueryBuilderDsl of() {
        return new MyCartUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartUpdateActionQueryBuilderDsl::of));
    }
}
