
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartSetCountryActionQueryBuilderDsl {
    public CartSetCountryActionQueryBuilderDsl() {
    }

    public static CartSetCountryActionQueryBuilderDsl of() {
        return new CartSetCountryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetCountryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetCountryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetCountryActionQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, CartSetCountryActionQueryBuilderDsl::of));
    }
}
