
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderTransitionCustomLineItemStateActionQueryBuilderDsl {
    public OrderTransitionCustomLineItemStateActionQueryBuilderDsl() {
    }

    public static OrderTransitionCustomLineItemStateActionQueryBuilderDsl of() {
        return new OrderTransitionCustomLineItemStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderTransitionCustomLineItemStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionCustomLineItemStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderTransitionCustomLineItemStateActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionCustomLineItemStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderTransitionCustomLineItemStateActionQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionCustomLineItemStateActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderTransitionCustomLineItemStateActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionCustomLineItemStateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderTransitionCustomLineItemStateActionQueryBuilderDsl> fromState(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fromState"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            OrderTransitionCustomLineItemStateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderTransitionCustomLineItemStateActionQueryBuilderDsl> toState(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("toState"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            OrderTransitionCustomLineItemStateActionQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<OrderTransitionCustomLineItemStateActionQueryBuilderDsl> actualTransitionDate() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actualTransitionDate")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionCustomLineItemStateActionQueryBuilderDsl::of));
    }

}
