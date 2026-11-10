
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategoryRemoveStoreWithDescendantsActionQueryBuilderDsl {
    public CategoryRemoveStoreWithDescendantsActionQueryBuilderDsl() {
    }

    public static CategoryRemoveStoreWithDescendantsActionQueryBuilderDsl of() {
        return new CategoryRemoveStoreWithDescendantsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryRemoveStoreWithDescendantsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategoryRemoveStoreWithDescendantsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategoryRemoveStoreWithDescendantsActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CategoryRemoveStoreWithDescendantsActionQueryBuilderDsl::of);
    }

}
