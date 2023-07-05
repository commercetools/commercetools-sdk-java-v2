
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountRemoveStoreActionQueryBuilderDsl {
    public CartDiscountRemoveStoreActionQueryBuilderDsl() {
    }

    public static CartDiscountRemoveStoreActionQueryBuilderDsl of() {
        return new CartDiscountRemoveStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountRemoveStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountRemoveStoreActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountRemoveStoreActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CartDiscountRemoveStoreActionQueryBuilderDsl::of);
    }

}
