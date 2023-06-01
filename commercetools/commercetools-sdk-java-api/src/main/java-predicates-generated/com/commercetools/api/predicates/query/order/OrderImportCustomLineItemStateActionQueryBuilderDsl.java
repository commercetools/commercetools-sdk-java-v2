package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderImportCustomLineItemStateActionQueryBuilderDsl  {
    public OrderImportCustomLineItemStateActionQueryBuilderDsl() {
    }

    public static OrderImportCustomLineItemStateActionQueryBuilderDsl of() {
        return new OrderImportCustomLineItemStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderImportCustomLineItemStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderImportCustomLineItemStateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderImportCustomLineItemStateActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
        p -> new CombinationQueryPredicate<>(p, OrderImportCustomLineItemStateActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderImportCustomLineItemStateActionQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl.of())),
            OrderImportCustomLineItemStateActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderImportCustomLineItemStateActionQueryBuilderDsl> state() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
                p -> new CombinationQueryPredicate<>(p, OrderImportCustomLineItemStateActionQueryBuilderDsl::of));
    }
    
}
