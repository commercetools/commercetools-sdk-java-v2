
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartUpdateActionQueryBuilderDsl {
    public CartUpdateActionQueryBuilderDsl() {
    }

    public static CartUpdateActionQueryBuilderDsl of() {
        return new CartUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartUpdateActionQueryBuilderDsl::of));
    }
}
