package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderAddDeliveryActionQueryBuilderDsl  {
    public StagedOrderAddDeliveryActionQueryBuilderDsl() {
    }

    public static StagedOrderAddDeliveryActionQueryBuilderDsl of() {
        return new StagedOrderAddDeliveryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderAddDeliveryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderAddDeliveryActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderAddDeliveryActionQueryBuilderDsl> deliveryKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryKey")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderAddDeliveryActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderAddDeliveryActionQueryBuilderDsl> items(
        Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("items"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            StagedOrderAddDeliveryActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StagedOrderAddDeliveryActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
                p -> new CombinationQueryPredicate<>(p, StagedOrderAddDeliveryActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderAddDeliveryActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            StagedOrderAddDeliveryActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedOrderAddDeliveryActionQueryBuilderDsl> parcels(
        Function<com.commercetools.api.predicates.query.order.ParcelDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("parcels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelDraftQueryBuilderDsl.of())),
            StagedOrderAddDeliveryActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StagedOrderAddDeliveryActionQueryBuilderDsl> parcels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcels")),
                p -> new CombinationQueryPredicate<>(p, StagedOrderAddDeliveryActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderAddDeliveryActionQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            StagedOrderAddDeliveryActionQueryBuilderDsl::of);
    }
    
    
}
