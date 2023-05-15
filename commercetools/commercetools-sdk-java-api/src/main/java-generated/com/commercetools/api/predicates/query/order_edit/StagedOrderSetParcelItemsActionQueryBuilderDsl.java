
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetParcelItemsActionQueryBuilderDsl {
    public StagedOrderSetParcelItemsActionQueryBuilderDsl() {
    }

    public static StagedOrderSetParcelItemsActionQueryBuilderDsl of() {
        return new StagedOrderSetParcelItemsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetParcelItemsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetParcelItemsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetParcelItemsActionQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetParcelItemsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetParcelItemsActionQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            StagedOrderSetParcelItemsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderSetParcelItemsActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetParcelItemsActionQueryBuilderDsl::of));
    }
}
