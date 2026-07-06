
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartLockQueryBuilderDsl {
    public CartLockQueryBuilderDsl() {
    }

    public static CartLockQueryBuilderDsl of() {
        return new CartLockQueryBuilderDsl();
    }

    public DateTimeComparisonPredicateBuilder<CartLockQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CartLockQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartLockQueryBuilderDsl> clientId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("clientId")),
            p -> new CombinationQueryPredicate<>(p, CartLockQueryBuilderDsl::of));
    }

}
