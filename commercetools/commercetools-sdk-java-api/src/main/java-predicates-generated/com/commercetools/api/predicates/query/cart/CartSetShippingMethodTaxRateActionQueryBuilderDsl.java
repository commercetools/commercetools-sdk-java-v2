
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetShippingMethodTaxRateActionQueryBuilderDsl {
    public CartSetShippingMethodTaxRateActionQueryBuilderDsl() {
    }

    public static CartSetShippingMethodTaxRateActionQueryBuilderDsl of() {
        return new CartSetShippingMethodTaxRateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetShippingMethodTaxRateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetShippingMethodTaxRateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetShippingMethodTaxRateActionQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            CartSetShippingMethodTaxRateActionQueryBuilderDsl::of);
    }

}
