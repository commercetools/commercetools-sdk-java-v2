
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl {
    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl() {
    }

    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl of() {
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p,
                CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p,
                CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl> targetsDelta(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("targetsDelta"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl.of())),
            CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl> targetsDelta() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("targetsDelta")),
            p -> new CombinationQueryPredicate<>(p,
                CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionQueryBuilderDsl::of));
    }

}
