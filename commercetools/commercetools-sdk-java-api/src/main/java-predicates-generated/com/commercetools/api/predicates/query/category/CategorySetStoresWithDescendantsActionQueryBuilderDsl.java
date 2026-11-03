
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategorySetStoresWithDescendantsActionQueryBuilderDsl {
    public CategorySetStoresWithDescendantsActionQueryBuilderDsl() {
    }

    public static CategorySetStoresWithDescendantsActionQueryBuilderDsl of() {
        return new CategorySetStoresWithDescendantsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetStoresWithDescendantsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategorySetStoresWithDescendantsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategorySetStoresWithDescendantsActionQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stores"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CategorySetStoresWithDescendantsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CategorySetStoresWithDescendantsActionQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, CategorySetStoresWithDescendantsActionQueryBuilderDsl::of));
    }

}
