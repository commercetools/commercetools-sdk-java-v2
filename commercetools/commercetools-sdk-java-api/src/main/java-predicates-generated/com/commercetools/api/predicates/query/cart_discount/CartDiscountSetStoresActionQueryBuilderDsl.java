
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountSetStoresActionQueryBuilderDsl {
    public CartDiscountSetStoresActionQueryBuilderDsl() {
    }

    public static CartDiscountSetStoresActionQueryBuilderDsl of() {
        return new CartDiscountSetStoresActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountSetStoresActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetStoresActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountSetStoresActionQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stores"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CartDiscountSetStoresActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDiscountSetStoresActionQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetStoresActionQueryBuilderDsl::of));
    }

}
