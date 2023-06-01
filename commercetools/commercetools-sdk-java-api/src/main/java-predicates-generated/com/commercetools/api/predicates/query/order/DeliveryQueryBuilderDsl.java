package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DeliveryQueryBuilderDsl  {
    public DeliveryQueryBuilderDsl() {
    }

    public static DeliveryQueryBuilderDsl of() {
        return new DeliveryQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, DeliveryQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<DeliveryQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, DeliveryQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<DeliveryQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, DeliveryQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryQueryBuilderDsl> items(
        Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("items"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            DeliveryQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<DeliveryQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
                p -> new CombinationQueryPredicate<>(p, DeliveryQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryQueryBuilderDsl> parcels(
        Function<com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("parcels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl.of())),
            DeliveryQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<DeliveryQueryBuilderDsl> parcels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcels")),
                p -> new CombinationQueryPredicate<>(p, DeliveryQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            DeliveryQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<DeliveryQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            DeliveryQueryBuilderDsl::of);
    }
    
    
}
