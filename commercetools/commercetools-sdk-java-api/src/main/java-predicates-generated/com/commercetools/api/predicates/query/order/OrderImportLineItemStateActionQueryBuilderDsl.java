
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderImportLineItemStateActionQueryBuilderDsl {
    public OrderImportLineItemStateActionQueryBuilderDsl() {
    }

    public static OrderImportLineItemStateActionQueryBuilderDsl of() {
        return new OrderImportLineItemStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderImportLineItemStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderImportLineItemStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderImportLineItemStateActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderImportLineItemStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderImportLineItemStateActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, OrderImportLineItemStateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderImportLineItemStateActionQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl.of())),
            OrderImportLineItemStateActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderImportLineItemStateActionQueryBuilderDsl> state() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, OrderImportLineItemStateActionQueryBuilderDsl::of));
    }

}
