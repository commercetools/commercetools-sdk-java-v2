
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetLineItemTaxRateActionQueryBuilderDsl {
    public CartSetLineItemTaxRateActionQueryBuilderDsl() {
    }

    public static CartSetLineItemTaxRateActionQueryBuilderDsl of() {
        return new CartSetLineItemTaxRateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLineItemTaxRateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemTaxRateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemTaxRateActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemTaxRateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetLineItemTaxRateActionQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            CartSetLineItemTaxRateActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartSetLineItemTaxRateActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemTaxRateActionQueryBuilderDsl::of));
    }

}
