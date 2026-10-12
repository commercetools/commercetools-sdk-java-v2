
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategorySetStoresActionQueryBuilderDsl {
    public CategorySetStoresActionQueryBuilderDsl() {
    }

    public static CategorySetStoresActionQueryBuilderDsl of() {
        return new CategorySetStoresActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetStoresActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategorySetStoresActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategorySetStoresActionQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stores"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CategorySetStoresActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CategorySetStoresActionQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, CategorySetStoresActionQueryBuilderDsl::of));
    }

}
