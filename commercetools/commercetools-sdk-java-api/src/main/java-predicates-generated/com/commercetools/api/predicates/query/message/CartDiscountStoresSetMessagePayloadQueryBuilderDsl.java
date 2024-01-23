
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountStoresSetMessagePayloadQueryBuilderDsl {
    public CartDiscountStoresSetMessagePayloadQueryBuilderDsl() {
    }

    public static CartDiscountStoresSetMessagePayloadQueryBuilderDsl of() {
        return new CartDiscountStoresSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountStoresSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountStoresSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountStoresSetMessagePayloadQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stores"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            CartDiscountStoresSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDiscountStoresSetMessagePayloadQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountStoresSetMessagePayloadQueryBuilderDsl::of));
    }

}
