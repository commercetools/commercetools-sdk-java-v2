
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartFreezeCartActionQueryBuilderDsl {
    public CartFreezeCartActionQueryBuilderDsl() {
    }

    public static CartFreezeCartActionQueryBuilderDsl of() {
        return new CartFreezeCartActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartFreezeCartActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartFreezeCartActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartFreezeCartActionQueryBuilderDsl> strategy() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("strategy")),
            p -> new CombinationQueryPredicate<>(p, CartFreezeCartActionQueryBuilderDsl::of));
    }

}
