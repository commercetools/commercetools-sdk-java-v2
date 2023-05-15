
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreUpdateQueryBuilderDsl {
    public StoreUpdateQueryBuilderDsl() {
    }

    public static StoreUpdateQueryBuilderDsl of() {
        return new StoreUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<StoreUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StoreUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.store.StoreUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreUpdateActionQueryBuilderDsl.of())),
            StoreUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, StoreUpdateQueryBuilderDsl::of));
    }
}
