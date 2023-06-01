package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetCustomLineItemTaxRateActionQueryBuilderDsl  {
    public CartSetCustomLineItemTaxRateActionQueryBuilderDsl() {
    }

    public static CartSetCustomLineItemTaxRateActionQueryBuilderDsl of() {
        return new CartSetCustomLineItemTaxRateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetCustomLineItemTaxRateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemTaxRateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartSetCustomLineItemTaxRateActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
        p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemTaxRateActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartSetCustomLineItemTaxRateActionQueryBuilderDsl> externalTaxRate(
        Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            CartSetCustomLineItemTaxRateActionQueryBuilderDsl::of);
    }
    
    
}
