
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitChangeNameActionQueryBuilderDsl {
    public MyBusinessUnitChangeNameActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitChangeNameActionQueryBuilderDsl of() {
        return new MyBusinessUnitChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitChangeNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitChangeNameActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitChangeNameActionQueryBuilderDsl::of));
    }

}
