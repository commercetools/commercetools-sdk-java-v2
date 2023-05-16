
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountUpdateQueryBuilderDsl {
    public CartDiscountUpdateQueryBuilderDsl() {
    }

    public static CartDiscountUpdateQueryBuilderDsl of() {
        return new CartDiscountUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CartDiscountUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart_discount.CartDiscountUpdateActionQueryBuilderDsl.of())),
            CartDiscountUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDiscountUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountUpdateQueryBuilderDsl::of));
    }

}
