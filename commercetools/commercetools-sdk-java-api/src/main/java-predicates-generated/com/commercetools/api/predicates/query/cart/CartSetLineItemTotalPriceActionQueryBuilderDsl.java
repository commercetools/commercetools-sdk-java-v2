package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetLineItemTotalPriceActionQueryBuilderDsl  {
    public CartSetLineItemTotalPriceActionQueryBuilderDsl() {
    }

    public static CartSetLineItemTotalPriceActionQueryBuilderDsl of() {
        return new CartSetLineItemTotalPriceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLineItemTotalPriceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetLineItemTotalPriceActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartSetLineItemTotalPriceActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, CartSetLineItemTotalPriceActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartSetLineItemTotalPriceActionQueryBuilderDsl> externalTotalPrice(
        Function<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalTotalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl.of())),
            CartSetLineItemTotalPriceActionQueryBuilderDsl::of);
    }
    
    
}
