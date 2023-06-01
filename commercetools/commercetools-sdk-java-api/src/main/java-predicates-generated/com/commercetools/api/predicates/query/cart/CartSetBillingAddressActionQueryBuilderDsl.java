package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetBillingAddressActionQueryBuilderDsl  {
    public CartSetBillingAddressActionQueryBuilderDsl() {
    }

    public static CartSetBillingAddressActionQueryBuilderDsl of() {
        return new CartSetBillingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetBillingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetBillingAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartSetBillingAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CartSetBillingAddressActionQueryBuilderDsl::of);
    }
    
    
}
