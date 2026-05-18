
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartLockCartActionQueryBuilderDsl {
    public CartLockCartActionQueryBuilderDsl() {
    }

    public static CartLockCartActionQueryBuilderDsl of() {
        return new CartLockCartActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartLockCartActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartLockCartActionQueryBuilderDsl::of));
    }

}
