
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCartSetCountryActionQueryBuilderDsl {
    public MyCartSetCountryActionQueryBuilderDsl() {
    }

    public static MyCartSetCountryActionQueryBuilderDsl of() {
        return new MyCartSetCountryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetCountryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetCountryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetCountryActionQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetCountryActionQueryBuilderDsl::of));
    }

}
