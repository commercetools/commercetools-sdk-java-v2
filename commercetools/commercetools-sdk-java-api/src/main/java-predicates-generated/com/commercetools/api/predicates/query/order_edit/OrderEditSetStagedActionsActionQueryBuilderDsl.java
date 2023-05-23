
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderEditSetStagedActionsActionQueryBuilderDsl {
    public OrderEditSetStagedActionsActionQueryBuilderDsl() {
    }

    public static OrderEditSetStagedActionsActionQueryBuilderDsl of() {
        return new OrderEditSetStagedActionsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditSetStagedActionsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderEditSetStagedActionsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderEditSetStagedActionsActionQueryBuilderDsl> stagedActions(
            Function<com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stagedActions"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl.of())),
            OrderEditSetStagedActionsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderEditSetStagedActionsActionQueryBuilderDsl> stagedActions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stagedActions")),
            p -> new CombinationQueryPredicate<>(p, OrderEditSetStagedActionsActionQueryBuilderDsl::of));
    }

}
