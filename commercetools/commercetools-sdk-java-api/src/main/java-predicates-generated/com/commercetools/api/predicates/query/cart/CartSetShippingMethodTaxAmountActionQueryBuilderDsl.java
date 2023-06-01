
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetShippingMethodTaxAmountActionQueryBuilderDsl {
    public CartSetShippingMethodTaxAmountActionQueryBuilderDsl() {
    }

    public static CartSetShippingMethodTaxAmountActionQueryBuilderDsl of() {
        return new CartSetShippingMethodTaxAmountActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetShippingMethodTaxAmountActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetShippingMethodTaxAmountActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetShippingMethodTaxAmountActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, CartSetShippingMethodTaxAmountActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetShippingMethodTaxAmountActionQueryBuilderDsl> externalTaxAmount(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTaxAmount"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl.of())),
            CartSetShippingMethodTaxAmountActionQueryBuilderDsl::of);
    }

}
