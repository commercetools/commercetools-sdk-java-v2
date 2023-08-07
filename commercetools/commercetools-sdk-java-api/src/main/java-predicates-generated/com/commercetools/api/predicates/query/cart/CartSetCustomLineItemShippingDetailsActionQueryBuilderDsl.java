
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl {
    public CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl() {
    }

    public static CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl of() {
        return new CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl> shippingDetails(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            CartSetCustomLineItemShippingDetailsActionQueryBuilderDsl::of);
    }

}
