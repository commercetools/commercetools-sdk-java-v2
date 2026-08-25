
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreSetImprintUrlActionQueryBuilderDsl {
    public StoreSetImprintUrlActionQueryBuilderDsl() {
    }

    public static StoreSetImprintUrlActionQueryBuilderDsl of() {
        return new StoreSetImprintUrlActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetImprintUrlActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetImprintUrlActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetImprintUrlActionQueryBuilderDsl> imprintUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imprintUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreSetImprintUrlActionQueryBuilderDsl::of));
    }

}
