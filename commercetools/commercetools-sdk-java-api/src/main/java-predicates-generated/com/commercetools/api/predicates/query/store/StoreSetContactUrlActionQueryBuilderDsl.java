
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreSetContactUrlActionQueryBuilderDsl {
    public StoreSetContactUrlActionQueryBuilderDsl() {
    }

    public static StoreSetContactUrlActionQueryBuilderDsl of() {
        return new StoreSetContactUrlActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetContactUrlActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetContactUrlActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetContactUrlActionQueryBuilderDsl> contactUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreSetContactUrlActionQueryBuilderDsl::of));
    }

}
