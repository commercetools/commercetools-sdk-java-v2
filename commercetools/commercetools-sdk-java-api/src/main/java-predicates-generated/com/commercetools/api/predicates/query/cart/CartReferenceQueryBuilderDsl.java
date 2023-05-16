
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartReferenceQueryBuilderDsl {
    public CartReferenceQueryBuilderDsl() {
    }

    public static CartReferenceQueryBuilderDsl of() {
        return new CartReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, CartReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CartReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl.of())),
            CartReferenceQueryBuilderDsl::of);
    }

}
