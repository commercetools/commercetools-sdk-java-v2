package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderEditAddStagedActionActionQueryBuilderDsl  {
    public OrderEditAddStagedActionActionQueryBuilderDsl() {
    }

    public static OrderEditAddStagedActionActionQueryBuilderDsl of() {
        return new OrderEditAddStagedActionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditAddStagedActionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderEditAddStagedActionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderEditAddStagedActionActionQueryBuilderDsl> stagedAction(
        Function<com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("stagedAction"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl.of())),
            OrderEditAddStagedActionActionQueryBuilderDsl::of);
    }
    
    
}
