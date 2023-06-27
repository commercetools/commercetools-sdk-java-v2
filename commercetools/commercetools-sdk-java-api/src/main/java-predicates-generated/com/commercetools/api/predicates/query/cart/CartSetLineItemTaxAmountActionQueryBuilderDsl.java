
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetLineItemTaxAmountActionQueryBuilderDsl {
    public CartSetLineItemTaxAmountActionQueryBuilderDsl() {
    }

    public static CartSetLineItemTaxAmountActionQueryBuilderDsl of() {
        return new CartSetLineItemTaxAmountActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLineItemTaxAmountActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemTaxAmountActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemTaxAmountActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemTaxAmountActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemTaxAmountActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemTaxAmountActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetLineItemTaxAmountActionQueryBuilderDsl> externalTaxAmount(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTaxAmount"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl.of())),
            CartSetLineItemTaxAmountActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartSetLineItemTaxAmountActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemTaxAmountActionQueryBuilderDsl::of));
    }

}
