
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategoryRemoveStoreActionQueryBuilderDsl {
    public CategoryRemoveStoreActionQueryBuilderDsl() {
    }

    public static CategoryRemoveStoreActionQueryBuilderDsl of() {
        return new CategoryRemoveStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryRemoveStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategoryRemoveStoreActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategoryRemoveStoreActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CategoryRemoveStoreActionQueryBuilderDsl::of);
    }

}
