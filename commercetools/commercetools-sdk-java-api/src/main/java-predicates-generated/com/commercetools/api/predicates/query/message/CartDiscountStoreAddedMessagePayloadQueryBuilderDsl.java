
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountStoreAddedMessagePayloadQueryBuilderDsl {
    public CartDiscountStoreAddedMessagePayloadQueryBuilderDsl() {
    }

    public static CartDiscountStoreAddedMessagePayloadQueryBuilderDsl of() {
        return new CartDiscountStoreAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountStoreAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountStoreAddedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountStoreAddedMessagePayloadQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            CartDiscountStoreAddedMessagePayloadQueryBuilderDsl::of);
    }

}
