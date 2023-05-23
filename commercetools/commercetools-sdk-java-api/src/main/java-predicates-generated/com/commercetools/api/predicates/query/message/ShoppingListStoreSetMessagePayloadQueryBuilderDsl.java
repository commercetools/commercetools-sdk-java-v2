
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListStoreSetMessagePayloadQueryBuilderDsl {
    public ShoppingListStoreSetMessagePayloadQueryBuilderDsl() {
    }

    public static ShoppingListStoreSetMessagePayloadQueryBuilderDsl of() {
        return new ShoppingListStoreSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListStoreSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListStoreSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListStoreSetMessagePayloadQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            ShoppingListStoreSetMessagePayloadQueryBuilderDsl::of);
    }

}
