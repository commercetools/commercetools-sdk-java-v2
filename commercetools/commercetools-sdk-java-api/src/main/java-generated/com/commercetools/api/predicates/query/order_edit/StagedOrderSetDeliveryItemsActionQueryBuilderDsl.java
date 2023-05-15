
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetDeliveryItemsActionQueryBuilderDsl {
    public StagedOrderSetDeliveryItemsActionQueryBuilderDsl() {
    }

    public static StagedOrderSetDeliveryItemsActionQueryBuilderDsl of() {
        return new StagedOrderSetDeliveryItemsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryItemsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryItemsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryItemsActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryItemsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetDeliveryItemsActionQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            StagedOrderSetDeliveryItemsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderSetDeliveryItemsActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryItemsActionQueryBuilderDsl::of));
    }
}
