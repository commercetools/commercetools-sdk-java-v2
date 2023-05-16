
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderMessagePayloadQueryBuilderDsl {
    public OrderMessagePayloadQueryBuilderDsl() {
    }

    public static OrderMessagePayloadQueryBuilderDsl of() {
        return new OrderMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asCustomLineItemStateTransition(
            Function<com.commercetools.api.predicates.query.message.CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomLineItemStateTransitionMessagePayloadQueryBuilderDsl
                    .of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asDeliveryAdded(
            Function<com.commercetools.api.predicates.query.message.DeliveryAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DeliveryAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DeliveryAddedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asDeliveryAddressSet(
            Function<com.commercetools.api.predicates.query.message.DeliveryAddressSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DeliveryAddressSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.DeliveryAddressSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asDeliveryItemsUpdated(
            Function<com.commercetools.api.predicates.query.message.DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.DeliveryItemsUpdatedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asDeliveryRemoved(
            Function<com.commercetools.api.predicates.query.message.DeliveryRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DeliveryRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DeliveryRemovedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asLineItemStateTransition(
            Function<com.commercetools.api.predicates.query.message.LineItemStateTransitionMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.LineItemStateTransitionMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.LineItemStateTransitionMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderBillingAddressSet(
            Function<com.commercetools.api.predicates.query.message.OrderBillingAddressSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderBillingAddressSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderBillingAddressSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderCreated(
            Function<com.commercetools.api.predicates.query.message.OrderCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderCreatedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderCustomLineItemAdded(
            Function<com.commercetools.api.predicates.query.message.OrderCustomLineItemAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomLineItemAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderCustomLineItemAddedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderCustomLineItemDiscountSet(
            Function<com.commercetools.api.predicates.query.message.OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl
                    .of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderCustomLineItemQuantityChanged(
            Function<com.commercetools.api.predicates.query.message.OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl
                    .of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderCustomLineItemRemoved(
            Function<com.commercetools.api.predicates.query.message.OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderCustomerEmailSet(
            Function<com.commercetools.api.predicates.query.message.OrderCustomerEmailSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomerEmailSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderCustomerEmailSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderCustomerGroupSet(
            Function<com.commercetools.api.predicates.query.message.OrderCustomerGroupSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomerGroupSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderCustomerGroupSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderCustomerSet(
            Function<com.commercetools.api.predicates.query.message.OrderCustomerSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderCustomerSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderCustomerSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderDeleted(
            Function<com.commercetools.api.predicates.query.message.OrderDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderDeletedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderDiscountCodeAdded(
            Function<com.commercetools.api.predicates.query.message.OrderDiscountCodeAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderDiscountCodeAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderDiscountCodeAddedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderDiscountCodeRemoved(
            Function<com.commercetools.api.predicates.query.message.OrderDiscountCodeRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderDiscountCodeRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderDiscountCodeRemovedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderDiscountCodeStateSet(
            Function<com.commercetools.api.predicates.query.message.OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderEditApplied(
            Function<com.commercetools.api.predicates.query.message.OrderEditAppliedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderEditAppliedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderEditAppliedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderImported(
            Function<com.commercetools.api.predicates.query.message.OrderImportedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderImportedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderImportedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderLineItemAdded(
            Function<com.commercetools.api.predicates.query.message.OrderLineItemAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderLineItemAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderLineItemAddedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderLineItemDiscountSet(
            Function<com.commercetools.api.predicates.query.message.OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderLineItemDistributionChannelSet(
            Function<com.commercetools.api.predicates.query.message.OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderLineItemDistributionChannelSetMessagePayloadQueryBuilderDsl
                    .of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderLineItemRemoved(
            Function<com.commercetools.api.predicates.query.message.OrderLineItemRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderLineItemRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderLineItemRemovedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderPaymentStateChanged(
            Function<com.commercetools.api.predicates.query.message.OrderPaymentStateChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderPaymentStateChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderPaymentStateChangedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderPurchaseOrderNumberSet(
            Function<com.commercetools.api.predicates.query.message.OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl
                    .of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderReturnShipmentStateChanged(
            Function<com.commercetools.api.predicates.query.message.OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl
                    .of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderShipmentStateChanged(
            Function<com.commercetools.api.predicates.query.message.OrderShipmentStateChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderShipmentStateChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderShipmentStateChangedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderShippingAddressSet(
            Function<com.commercetools.api.predicates.query.message.OrderShippingAddressSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderShippingAddressSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderShippingAddressSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderShippingInfoSet(
            Function<com.commercetools.api.predicates.query.message.OrderShippingInfoSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderShippingInfoSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderShippingInfoSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderShippingRateInputSet(
            Function<com.commercetools.api.predicates.query.message.OrderShippingRateInputSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderShippingRateInputSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.OrderShippingRateInputSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderStateChanged(
            Function<com.commercetools.api.predicates.query.message.OrderStateChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderStateChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderStateChangedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderStateTransition(
            Function<com.commercetools.api.predicates.query.message.OrderStateTransitionMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderStateTransitionMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderStateTransitionMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asOrderStoreSet(
            Function<com.commercetools.api.predicates.query.message.OrderStoreSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderStoreSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderStoreSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asParcelAddedToDelivery(
            Function<com.commercetools.api.predicates.query.message.ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asParcelItemsUpdated(
            Function<com.commercetools.api.predicates.query.message.ParcelItemsUpdatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ParcelItemsUpdatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ParcelItemsUpdatedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asParcelMeasurementsUpdated(
            Function<com.commercetools.api.predicates.query.message.ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asParcelRemovedFromDelivery(
            Function<com.commercetools.api.predicates.query.message.ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asParcelTrackingDataUpdated(
            Function<com.commercetools.api.predicates.query.message.ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ParcelTrackingDataUpdatedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asReturnInfoAdded(
            Function<com.commercetools.api.predicates.query.message.ReturnInfoAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ReturnInfoAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ReturnInfoAddedMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderMessagePayloadQueryBuilderDsl> asReturnInfoSet(
            Function<com.commercetools.api.predicates.query.message.ReturnInfoSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ReturnInfoSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ReturnInfoSetMessagePayloadQueryBuilderDsl.of()),
            OrderMessagePayloadQueryBuilderDsl::of);
    }
}
