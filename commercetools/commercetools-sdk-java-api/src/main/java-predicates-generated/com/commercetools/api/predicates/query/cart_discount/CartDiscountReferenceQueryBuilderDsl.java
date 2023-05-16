
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountReferenceQueryBuilderDsl {
    public CartDiscountReferenceQueryBuilderDsl() {
    }

    public static CartDiscountReferenceQueryBuilderDsl of() {
        return new CartDiscountReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDiscountReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl.of())),
            CartDiscountReferenceQueryBuilderDsl::of);
    }

}
