
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreSetNameActionQueryBuilderDsl {
    public StoreSetNameActionQueryBuilderDsl() {
    }

    public static StoreSetNameActionQueryBuilderDsl of() {
        return new StoreSetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreSetNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StoreSetNameActionQueryBuilderDsl::of);
    }

}
