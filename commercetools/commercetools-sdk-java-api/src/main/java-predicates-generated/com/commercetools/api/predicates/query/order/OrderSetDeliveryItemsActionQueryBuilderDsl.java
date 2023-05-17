
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSetDeliveryItemsActionQueryBuilderDsl {
    public OrderSetDeliveryItemsActionQueryBuilderDsl() {
    }

    public static OrderSetDeliveryItemsActionQueryBuilderDsl of() {
        return new OrderSetDeliveryItemsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryItemsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryItemsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryItemsActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryItemsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryItemsActionQueryBuilderDsl> deliveryKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryKey")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryItemsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSetDeliveryItemsActionQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            OrderSetDeliveryItemsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderSetDeliveryItemsActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryItemsActionQueryBuilderDsl::of));
    }

}
