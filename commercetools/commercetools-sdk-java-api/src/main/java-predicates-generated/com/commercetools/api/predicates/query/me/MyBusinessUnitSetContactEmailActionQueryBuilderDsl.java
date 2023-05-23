
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitSetContactEmailActionQueryBuilderDsl {
    public MyBusinessUnitSetContactEmailActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitSetContactEmailActionQueryBuilderDsl of() {
        return new MyBusinessUnitSetContactEmailActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitSetContactEmailActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetContactEmailActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitSetContactEmailActionQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetContactEmailActionQueryBuilderDsl::of));
    }

}
