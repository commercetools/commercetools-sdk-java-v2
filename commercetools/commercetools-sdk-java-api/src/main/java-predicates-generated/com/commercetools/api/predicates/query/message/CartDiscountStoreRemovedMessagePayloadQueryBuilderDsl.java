
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountStoreRemovedMessagePayloadQueryBuilderDsl {
    public CartDiscountStoreRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static CartDiscountStoreRemovedMessagePayloadQueryBuilderDsl of() {
        return new CartDiscountStoreRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountStoreRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountStoreRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountStoreRemovedMessagePayloadQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            CartDiscountStoreRemovedMessagePayloadQueryBuilderDsl::of);
    }

}
