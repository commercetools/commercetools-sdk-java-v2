
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategoryAddStoreWithDescendantsActionQueryBuilderDsl {
    public CategoryAddStoreWithDescendantsActionQueryBuilderDsl() {
    }

    public static CategoryAddStoreWithDescendantsActionQueryBuilderDsl of() {
        return new CategoryAddStoreWithDescendantsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryAddStoreWithDescendantsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategoryAddStoreWithDescendantsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategoryAddStoreWithDescendantsActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CategoryAddStoreWithDescendantsActionQueryBuilderDsl::of);
    }

}
