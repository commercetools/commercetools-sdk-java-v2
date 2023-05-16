
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetCustomLineItemTaxAmountActionQueryBuilderDsl {
    public CartSetCustomLineItemTaxAmountActionQueryBuilderDsl() {
    }

    public static CartSetCustomLineItemTaxAmountActionQueryBuilderDsl of() {
        return new CartSetCustomLineItemTaxAmountActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetCustomLineItemTaxAmountActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemTaxAmountActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetCustomLineItemTaxAmountActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemTaxAmountActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetCustomLineItemTaxAmountActionQueryBuilderDsl> externalTaxAmount(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTaxAmount"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl.of())),
            CartSetCustomLineItemTaxAmountActionQueryBuilderDsl::of);
    }

}
