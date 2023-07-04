
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl {
    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl() {
    }

    public static MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl of() {
        return new MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p,
                MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p,
                MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl> targetsDelta(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("targetsDelta"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl.of())),
            MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl> targetsDelta() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("targetsDelta")),
            p -> new CombinationQueryPredicate<>(p,
                MyCartApplyDeltaToLineItemShippingDetailsTargetsActionQueryBuilderDsl::of));
    }

}
