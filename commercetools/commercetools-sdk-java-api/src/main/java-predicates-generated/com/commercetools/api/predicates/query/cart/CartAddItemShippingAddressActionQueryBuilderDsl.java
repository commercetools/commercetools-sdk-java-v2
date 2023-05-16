
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartAddItemShippingAddressActionQueryBuilderDsl {
    public CartAddItemShippingAddressActionQueryBuilderDsl() {
    }

    public static CartAddItemShippingAddressActionQueryBuilderDsl of() {
        return new CartAddItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartAddItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartAddItemShippingAddressActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartAddItemShippingAddressActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CartAddItemShippingAddressActionQueryBuilderDsl::of);
    }

}
