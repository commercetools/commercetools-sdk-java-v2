
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl {
    public CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl() {
    }

    public static CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl of() {
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p,
                CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl> targetsDelta(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("targetsDelta"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl.of())),
            CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl> targetsDelta() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("targetsDelta")),
            p -> new CombinationQueryPredicate<>(p,
                CartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl::of));
    }
}
