package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetParcelItemsActionQueryBuilderDsl  {
    public OrderSetParcelItemsActionQueryBuilderDsl() {
    }

    public static OrderSetParcelItemsActionQueryBuilderDsl of() {
        return new OrderSetParcelItemsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetParcelItemsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetParcelItemsActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetParcelItemsActionQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
        p -> new CombinationQueryPredicate<>(p, OrderSetParcelItemsActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderSetParcelItemsActionQueryBuilderDsl> items(
        Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("items"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            OrderSetParcelItemsActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderSetParcelItemsActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
                p -> new CombinationQueryPredicate<>(p, OrderSetParcelItemsActionQueryBuilderDsl::of));
    }
    
}
