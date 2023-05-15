
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartRemoveItemShippingAddressActionQueryBuilderDsl {
    public CartRemoveItemShippingAddressActionQueryBuilderDsl() {
    }

    public static CartRemoveItemShippingAddressActionQueryBuilderDsl of() {
        return new CartRemoveItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartRemoveItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartRemoveItemShippingAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartRemoveItemShippingAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, CartRemoveItemShippingAddressActionQueryBuilderDsl::of));
    }
}
