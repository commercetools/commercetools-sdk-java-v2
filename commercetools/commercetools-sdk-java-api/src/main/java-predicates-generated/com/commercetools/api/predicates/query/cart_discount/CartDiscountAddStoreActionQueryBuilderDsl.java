
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountAddStoreActionQueryBuilderDsl {
    public CartDiscountAddStoreActionQueryBuilderDsl() {
    }

    public static CartDiscountAddStoreActionQueryBuilderDsl of() {
        return new CartDiscountAddStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountAddStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountAddStoreActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountAddStoreActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CartDiscountAddStoreActionQueryBuilderDsl::of);
    }

}
