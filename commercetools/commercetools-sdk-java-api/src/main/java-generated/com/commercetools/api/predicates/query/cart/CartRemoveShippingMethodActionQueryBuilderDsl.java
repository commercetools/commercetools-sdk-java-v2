
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartRemoveShippingMethodActionQueryBuilderDsl {
    public CartRemoveShippingMethodActionQueryBuilderDsl() {
    }

    public static CartRemoveShippingMethodActionQueryBuilderDsl of() {
        return new CartRemoveShippingMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartRemoveShippingMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartRemoveShippingMethodActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartRemoveShippingMethodActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, CartRemoveShippingMethodActionQueryBuilderDsl::of));
    }
}
