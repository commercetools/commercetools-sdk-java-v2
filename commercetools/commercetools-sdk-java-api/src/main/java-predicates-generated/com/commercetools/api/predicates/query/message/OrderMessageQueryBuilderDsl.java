
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderMessageQueryBuilderDsl {
    public OrderMessageQueryBuilderDsl() {
    }

    public static OrderMessageQueryBuilderDsl of() {
        return new OrderMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asCustomLineItemStateTransition(
            Function<com.commercetools.api.predicates.query.message.CustomLineItemStateTransitionMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomLineItemStateTransitionMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomLineItemStateTransitionMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asDeliveryAdded(
            Function<com.commercetools.api.predicates.query.message.DeliveryAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DeliveryAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DeliveryAddedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asDeliveryAddressSet(
            Function<com.commercetools.api.predicates.query.message.DeliveryAddressSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DeliveryAddressSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DeliveryAddressSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asDeliveryItemsUpdated(
            Function<com.commercetools.api.predicates.query.message.DeliveryItemsUpdatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DeliveryItemsUpdatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DeliveryItemsUpdatedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asDeliveryRemoved(
            Function<com.commercetools.api.predicates.query.message.DeliveryRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DeliveryRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DeliveryRemovedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asLineItemStateTransition(
            Function<com.commercetools.api.predicates.query.message.LineItemStateTransitionMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.LineItemStateTransitionMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.LineItemStateTransitionMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderBillingAddressSet(
            Function<com.commercetools.api.predicates.query.message.OrderBillingAddressSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderBillingAddressSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderBillingAddressSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderCreated(
            Function<com.commercetools.api.predicates.query.message.OrderCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderCreatedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderCustomLineItemAdded(
            Function<com.commercetools.api.predicates.query.message.OrderCustomLineItemAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomLineItemAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderCustomLineItemAddedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderCustomLineItemDiscountSet(
            Function<com.commercetools.api.predicates.query.message.OrderCustomLineItemDiscountSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomLineItemDiscountSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderCustomLineItemDiscountSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderCustomLineItemQuantityChanged(
            Function<com.commercetools.api.predicates.query.message.OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderCustomLineItemQuantityChangedMessageQueryBuilderDsl
                    .of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderCustomLineItemRemoved(
            Function<com.commercetools.api.predicates.query.message.OrderCustomLineItemRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomLineItemRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderCustomLineItemRemovedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderCustomerEmailSet(
            Function<com.commercetools.api.predicates.query.message.OrderCustomerEmailSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomerEmailSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderCustomerEmailSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderCustomerGroupSet(
            Function<com.commercetools.api.predicates.query.message.OrderCustomerGroupSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomerGroupSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderCustomerGroupSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderCustomerSet(
            Function<com.commercetools.api.predicates.query.message.OrderCustomerSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomerSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderCustomerSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderDeleted(
            Function<com.commercetools.api.predicates.query.message.OrderDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderDeletedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderDiscountCodeAdded(
            Function<com.commercetools.api.predicates.query.message.OrderDiscountCodeAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderDiscountCodeAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderDiscountCodeAddedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderDiscountCodeRemoved(
            Function<com.commercetools.api.predicates.query.message.OrderDiscountCodeRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderDiscountCodeRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderDiscountCodeRemovedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderDiscountCodeStateSet(
            Function<com.commercetools.api.predicates.query.message.OrderDiscountCodeStateSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderDiscountCodeStateSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderDiscountCodeStateSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderEditApplied(
            Function<com.commercetools.api.predicates.query.message.OrderEditAppliedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderEditAppliedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderEditAppliedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderImported(
            Function<com.commercetools.api.predicates.query.message.OrderImportedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderImportedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderImportedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderLineItemAdded(
            Function<com.commercetools.api.predicates.query.message.OrderLineItemAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderLineItemAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderLineItemAddedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderLineItemDiscountSet(
            Function<com.commercetools.api.predicates.query.message.OrderLineItemDiscountSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderLineItemDiscountSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderLineItemDiscountSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderLineItemDistributionChannelSet(
            Function<com.commercetools.api.predicates.query.message.OrderLineItemDistributionChannelSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderLineItemDistributionChannelSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderLineItemDistributionChannelSetMessageQueryBuilderDsl
                    .of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderLineItemRemoved(
            Function<com.commercetools.api.predicates.query.message.OrderLineItemRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderLineItemRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderLineItemRemovedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderPaymentStateChanged(
            Function<com.commercetools.api.predicates.query.message.OrderPaymentStateChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderPaymentStateChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderPaymentStateChangedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderPurchaseOrderNumberSet(
            Function<com.commercetools.api.predicates.query.message.OrderPurchaseOrderNumberSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderPurchaseOrderNumberSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderPurchaseOrderNumberSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderReturnShipmentStateChanged(
            Function<com.commercetools.api.predicates.query.message.OrderReturnShipmentStateChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderReturnShipmentStateChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderReturnShipmentStateChangedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderShipmentStateChanged(
            Function<com.commercetools.api.predicates.query.message.OrderShipmentStateChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderShipmentStateChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderShipmentStateChangedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderShippingAddressSet(
            Function<com.commercetools.api.predicates.query.message.OrderShippingAddressSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderShippingAddressSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderShippingAddressSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderShippingInfoSet(
            Function<com.commercetools.api.predicates.query.message.OrderShippingInfoSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderShippingInfoSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderShippingInfoSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderShippingRateInputSet(
            Function<com.commercetools.api.predicates.query.message.OrderShippingRateInputSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderShippingRateInputSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderShippingRateInputSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderStateChanged(
            Function<com.commercetools.api.predicates.query.message.OrderStateChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderStateChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderStateChangedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderStateTransition(
            Function<com.commercetools.api.predicates.query.message.OrderStateTransitionMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderStateTransitionMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderStateTransitionMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asOrderStoreSet(
            Function<com.commercetools.api.predicates.query.message.OrderStoreSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderStoreSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderStoreSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asParcelAddedToDelivery(
            Function<com.commercetools.api.predicates.query.message.ParcelAddedToDeliveryMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ParcelAddedToDeliveryMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ParcelAddedToDeliveryMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asParcelItemsUpdated(
            Function<com.commercetools.api.predicates.query.message.ParcelItemsUpdatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ParcelItemsUpdatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ParcelItemsUpdatedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asParcelMeasurementsUpdated(
            Function<com.commercetools.api.predicates.query.message.ParcelMeasurementsUpdatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ParcelMeasurementsUpdatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ParcelMeasurementsUpdatedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asParcelRemovedFromDelivery(
            Function<com.commercetools.api.predicates.query.message.ParcelRemovedFromDeliveryMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ParcelRemovedFromDeliveryMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ParcelRemovedFromDeliveryMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asParcelTrackingDataUpdated(
            Function<com.commercetools.api.predicates.query.message.ParcelTrackingDataUpdatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ParcelTrackingDataUpdatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ParcelTrackingDataUpdatedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asReturnInfoAdded(
            Function<com.commercetools.api.predicates.query.message.ReturnInfoAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ReturnInfoAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ReturnInfoAddedMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessageQueryBuilderDsl> asReturnInfoSet(
            Function<com.commercetools.api.predicates.query.message.ReturnInfoSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ReturnInfoSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ReturnInfoSetMessageQueryBuilderDsl.of()),
            OrderMessageQueryBuilderDsl::of);
    }
}
