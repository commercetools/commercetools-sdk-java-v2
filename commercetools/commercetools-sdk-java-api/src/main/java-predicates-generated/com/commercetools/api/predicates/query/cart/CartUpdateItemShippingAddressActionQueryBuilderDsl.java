
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartUpdateItemShippingAddressActionQueryBuilderDsl {
    public CartUpdateItemShippingAddressActionQueryBuilderDsl() {
    }

    public static CartUpdateItemShippingAddressActionQueryBuilderDsl of() {
        return new CartUpdateItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartUpdateItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartUpdateItemShippingAddressActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartUpdateItemShippingAddressActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CartUpdateItemShippingAddressActionQueryBuilderDsl::of);
    }

}
