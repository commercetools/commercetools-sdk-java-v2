
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetDirectDiscountsActionQueryBuilderDsl {
    public CartSetDirectDiscountsActionQueryBuilderDsl() {
    }

    public static CartSetDirectDiscountsActionQueryBuilderDsl of() {
        return new CartSetDirectDiscountsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetDirectDiscountsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetDirectDiscountsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetDirectDiscountsActionQueryBuilderDsl> discounts(
            Function<com.commercetools.api.predicates.query.cart.DirectDiscountDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DirectDiscountDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discounts"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.DirectDiscountDraftQueryBuilderDsl.of())),
            CartSetDirectDiscountsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartSetDirectDiscountsActionQueryBuilderDsl> discounts() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discounts")),
            p -> new CombinationQueryPredicate<>(p, CartSetDirectDiscountsActionQueryBuilderDsl::of));
    }
}
