
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl {
    public CartSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl() {
    }

    public static CartSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl of() {
        return new CartSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                CartSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<CartSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl> directDiscountsIgnoreCartDiscounts() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("directDiscountsIgnoreCartDiscounts")),
            p -> new CombinationQueryPredicate<>(p,
                CartSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl::of));
    }

}
