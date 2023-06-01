package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderAddDeliveryActionQueryBuilderDsl  {
    public OrderAddDeliveryActionQueryBuilderDsl() {
    }

    public static OrderAddDeliveryActionQueryBuilderDsl of() {
        return new OrderAddDeliveryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderAddDeliveryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderAddDeliveryActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderAddDeliveryActionQueryBuilderDsl> deliveryKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryKey")),
        p -> new CombinationQueryPredicate<>(p, OrderAddDeliveryActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderAddDeliveryActionQueryBuilderDsl> items(
        Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("items"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            OrderAddDeliveryActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderAddDeliveryActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
                p -> new CombinationQueryPredicate<>(p, OrderAddDeliveryActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderAddDeliveryActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
        p -> new CombinationQueryPredicate<>(p, OrderAddDeliveryActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderAddDeliveryActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            OrderAddDeliveryActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderAddDeliveryActionQueryBuilderDsl> parcels(
        Function<com.commercetools.api.predicates.query.order.ParcelDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("parcels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelDraftQueryBuilderDsl.of())),
            OrderAddDeliveryActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderAddDeliveryActionQueryBuilderDsl> parcels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcels")),
                p -> new CombinationQueryPredicate<>(p, OrderAddDeliveryActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderAddDeliveryActionQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            OrderAddDeliveryActionQueryBuilderDsl::of);
    }
    
    
}
