
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitSetCustomFieldActionQueryBuilderDsl {
    public MyBusinessUnitSetCustomFieldActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitSetCustomFieldActionQueryBuilderDsl of() {
        return new MyBusinessUnitSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetCustomFieldActionQueryBuilderDsl::of));
    }

}
