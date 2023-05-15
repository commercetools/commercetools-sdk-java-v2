
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreSetCustomFieldActionQueryBuilderDsl {
    public StoreSetCustomFieldActionQueryBuilderDsl() {
    }

    public static StoreSetCustomFieldActionQueryBuilderDsl of() {
        return new StoreSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, StoreSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, StoreSetCustomFieldActionQueryBuilderDsl::of));
    }
}
