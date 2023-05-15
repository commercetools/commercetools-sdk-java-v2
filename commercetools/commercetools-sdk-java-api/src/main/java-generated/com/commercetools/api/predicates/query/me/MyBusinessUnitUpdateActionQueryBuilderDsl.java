
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitUpdateActionQueryBuilderDsl {
    public MyBusinessUnitUpdateActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitUpdateActionQueryBuilderDsl of() {
        return new MyBusinessUnitUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitUpdateActionQueryBuilderDsl::of));
    }
}
