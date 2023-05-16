
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartUnfreezeCartActionQueryBuilderDsl {
    public CartUnfreezeCartActionQueryBuilderDsl() {
    }

    public static CartUnfreezeCartActionQueryBuilderDsl of() {
        return new CartUnfreezeCartActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartUnfreezeCartActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartUnfreezeCartActionQueryBuilderDsl::of));
    }

}
