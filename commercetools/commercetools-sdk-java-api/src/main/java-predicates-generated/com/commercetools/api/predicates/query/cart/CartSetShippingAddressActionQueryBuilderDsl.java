package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetShippingAddressActionQueryBuilderDsl  {
    public CartSetShippingAddressActionQueryBuilderDsl() {
    }

    public static CartSetShippingAddressActionQueryBuilderDsl of() {
        return new CartSetShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetShippingAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartSetShippingAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CartSetShippingAddressActionQueryBuilderDsl::of);
    }
    
    
}
