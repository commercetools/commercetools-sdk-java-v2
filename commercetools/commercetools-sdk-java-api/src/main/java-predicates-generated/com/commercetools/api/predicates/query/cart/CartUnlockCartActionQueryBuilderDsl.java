
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartUnlockCartActionQueryBuilderDsl {
    public CartUnlockCartActionQueryBuilderDsl() {
    }

    public static CartUnlockCartActionQueryBuilderDsl of() {
        return new CartUnlockCartActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartUnlockCartActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartUnlockCartActionQueryBuilderDsl::of));
    }

}
