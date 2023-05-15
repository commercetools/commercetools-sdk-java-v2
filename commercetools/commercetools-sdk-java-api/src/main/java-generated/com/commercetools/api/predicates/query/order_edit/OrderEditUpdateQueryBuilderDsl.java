
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderEditUpdateQueryBuilderDsl {
    public OrderEditUpdateQueryBuilderDsl() {
    }

    public static OrderEditUpdateQueryBuilderDsl of() {
        return new OrderEditUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<OrderEditUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderEditUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderEditUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.order_edit.OrderEditUpdateActionQueryBuilderDsl.of())),
            OrderEditUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderEditUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, OrderEditUpdateQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<OrderEditUpdateQueryBuilderDsl> dryRun() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dryRun")),
            p -> new CombinationQueryPredicate<>(p, OrderEditUpdateQueryBuilderDsl::of));
    }
}
