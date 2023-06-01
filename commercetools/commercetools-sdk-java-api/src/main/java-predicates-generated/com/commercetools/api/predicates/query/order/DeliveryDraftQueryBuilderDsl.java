package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DeliveryDraftQueryBuilderDsl  {
    public DeliveryDraftQueryBuilderDsl() {
    }

    public static DeliveryDraftQueryBuilderDsl of() {
        return new DeliveryDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, DeliveryDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryDraftQueryBuilderDsl> items(
        Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("items"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            DeliveryDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<DeliveryDraftQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
                p -> new CombinationQueryPredicate<>(p, DeliveryDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryDraftQueryBuilderDsl> parcels(
        Function<com.commercetools.api.predicates.query.order.ParcelDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("parcels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelDraftQueryBuilderDsl.of())),
            DeliveryDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<DeliveryDraftQueryBuilderDsl> parcels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcels")),
                p -> new CombinationQueryPredicate<>(p, DeliveryDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryDraftQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.AddressDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressDraftQueryBuilderDsl.of())),
            DeliveryDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<DeliveryDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            DeliveryDraftQueryBuilderDsl::of);
    }
    
    
}
