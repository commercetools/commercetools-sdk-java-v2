
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCartSetLocaleActionQueryBuilderDsl {
    public MyCartSetLocaleActionQueryBuilderDsl() {
    }

    public static MyCartSetLocaleActionQueryBuilderDsl of() {
        return new MyCartSetLocaleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetLocaleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLocaleActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetLocaleActionQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLocaleActionQueryBuilderDsl::of));
    }

}
