
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderTransitionLineItemStateActionQueryBuilderDsl {
    public OrderTransitionLineItemStateActionQueryBuilderDsl() {
    }

    public static OrderTransitionLineItemStateActionQueryBuilderDsl of() {
        return new OrderTransitionLineItemStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderTransitionLineItemStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionLineItemStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderTransitionLineItemStateActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionLineItemStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderTransitionLineItemStateActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionLineItemStateActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderTransitionLineItemStateActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionLineItemStateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderTransitionLineItemStateActionQueryBuilderDsl> fromState(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fromState"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            OrderTransitionLineItemStateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderTransitionLineItemStateActionQueryBuilderDsl> toState(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("toState"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            OrderTransitionLineItemStateActionQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<OrderTransitionLineItemStateActionQueryBuilderDsl> actualTransitionDate() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actualTransitionDate")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionLineItemStateActionQueryBuilderDsl::of));
    }

}
