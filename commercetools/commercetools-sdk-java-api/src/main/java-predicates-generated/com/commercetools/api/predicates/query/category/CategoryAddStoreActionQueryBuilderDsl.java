
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategoryAddStoreActionQueryBuilderDsl {
    public CategoryAddStoreActionQueryBuilderDsl() {
    }

    public static CategoryAddStoreActionQueryBuilderDsl of() {
        return new CategoryAddStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryAddStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategoryAddStoreActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategoryAddStoreActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CategoryAddStoreActionQueryBuilderDsl::of);
    }

}
