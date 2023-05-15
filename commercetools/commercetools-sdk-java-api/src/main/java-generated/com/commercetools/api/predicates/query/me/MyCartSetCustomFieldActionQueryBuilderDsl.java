
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCartSetCustomFieldActionQueryBuilderDsl {
    public MyCartSetCustomFieldActionQueryBuilderDsl() {
    }

    public static MyCartSetCustomFieldActionQueryBuilderDsl of() {
        return new MyCartSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetCustomFieldActionQueryBuilderDsl::of));
    }
}
