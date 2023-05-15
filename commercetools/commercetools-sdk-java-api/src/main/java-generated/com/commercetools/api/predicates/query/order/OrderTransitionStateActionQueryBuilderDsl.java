
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderTransitionStateActionQueryBuilderDsl {
    public OrderTransitionStateActionQueryBuilderDsl() {
    }

    public static OrderTransitionStateActionQueryBuilderDsl of() {
        return new OrderTransitionStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderTransitionStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionStateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderTransitionStateActionQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            OrderTransitionStateActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<OrderTransitionStateActionQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, OrderTransitionStateActionQueryBuilderDsl::of));
    }
}
