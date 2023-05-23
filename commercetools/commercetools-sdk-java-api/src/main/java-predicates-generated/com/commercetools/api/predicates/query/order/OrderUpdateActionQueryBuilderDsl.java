
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderUpdateActionQueryBuilderDsl {
    public OrderUpdateActionQueryBuilderDsl() {
    }

    public static OrderUpdateActionQueryBuilderDsl of() {
        return new OrderUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asAddDelivery(
            Function<com.commercetools.api.predicates.query.order.OrderAddDeliveryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderAddDeliveryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderAddDeliveryActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asAddItemShippingAddress(
            Function<com.commercetools.api.predicates.query.order.OrderAddItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderAddItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderAddItemShippingAddressActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asAddParcelToDelivery(
            Function<com.commercetools.api.predicates.query.order.OrderAddParcelToDeliveryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderAddParcelToDeliveryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderAddParcelToDeliveryActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asAddPayment(
            Function<com.commercetools.api.predicates.query.order.OrderAddPaymentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderAddPaymentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderAddPaymentActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asAddReturnInfo(
            Function<com.commercetools.api.predicates.query.order.OrderAddReturnInfoActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderAddReturnInfoActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderAddReturnInfoActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asChangeOrderState(
            Function<com.commercetools.api.predicates.query.order.OrderChangeOrderStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderChangeOrderStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderChangeOrderStateActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asChangePaymentState(
            Function<com.commercetools.api.predicates.query.order.OrderChangePaymentStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderChangePaymentStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderChangePaymentStateActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asChangeShipmentState(
            Function<com.commercetools.api.predicates.query.order.OrderChangeShipmentStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderChangeShipmentStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderChangeShipmentStateActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asImportCustomLineItemState(
            Function<com.commercetools.api.predicates.query.order.OrderImportCustomLineItemStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderImportCustomLineItemStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderImportCustomLineItemStateActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asImportLineItemState(
            Function<com.commercetools.api.predicates.query.order.OrderImportLineItemStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderImportLineItemStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderImportLineItemStateActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asRemoveDelivery(
            Function<com.commercetools.api.predicates.query.order.OrderRemoveDeliveryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderRemoveDeliveryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderRemoveDeliveryActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asRemoveItemShippingAddress(
            Function<com.commercetools.api.predicates.query.order.OrderRemoveItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderRemoveItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderRemoveItemShippingAddressActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asRemoveParcelFromDelivery(
            Function<com.commercetools.api.predicates.query.order.OrderRemoveParcelFromDeliveryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderRemoveParcelFromDeliveryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderRemoveParcelFromDeliveryActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asRemovePayment(
            Function<com.commercetools.api.predicates.query.order.OrderRemovePaymentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderRemovePaymentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderRemovePaymentActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetBillingAddress(
            Function<com.commercetools.api.predicates.query.order.OrderSetBillingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetBillingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetBillingAddressActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetBillingAddressCustomField(
            Function<com.commercetools.api.predicates.query.order.OrderSetBillingAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetBillingAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderSetBillingAddressCustomFieldActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetBillingAddressCustomType(
            Function<com.commercetools.api.predicates.query.order.OrderSetBillingAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetBillingAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderSetBillingAddressCustomTypeActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.order.OrderSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetCustomFieldActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetCustomLineItemCustomField(
            Function<com.commercetools.api.predicates.query.order.OrderSetCustomLineItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetCustomLineItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderSetCustomLineItemCustomFieldActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetCustomLineItemCustomType(
            Function<com.commercetools.api.predicates.query.order.OrderSetCustomLineItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetCustomLineItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderSetCustomLineItemCustomTypeActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetCustomLineItemShippingDetails(
            Function<com.commercetools.api.predicates.query.order.OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl
                    .of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.order.OrderSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetCustomTypeActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetCustomerEmail(
            Function<com.commercetools.api.predicates.query.order.OrderSetCustomerEmailActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetCustomerEmailActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetCustomerEmailActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetCustomerId(
            Function<com.commercetools.api.predicates.query.order.OrderSetCustomerIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetCustomerIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetCustomerIdActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetDeliveryAddress(
            Function<com.commercetools.api.predicates.query.order.OrderSetDeliveryAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetDeliveryAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetDeliveryAddressActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetDeliveryAddressCustomField(
            Function<com.commercetools.api.predicates.query.order.OrderSetDeliveryAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetDeliveryAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderSetDeliveryAddressCustomFieldActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetDeliveryAddressCustomType(
            Function<com.commercetools.api.predicates.query.order.OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetDeliveryCustomField(
            Function<com.commercetools.api.predicates.query.order.OrderSetDeliveryCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetDeliveryCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderSetDeliveryCustomFieldActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetDeliveryCustomType(
            Function<com.commercetools.api.predicates.query.order.OrderSetDeliveryCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetDeliveryCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetDeliveryCustomTypeActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetDeliveryItems(
            Function<com.commercetools.api.predicates.query.order.OrderSetDeliveryItemsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetDeliveryItemsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetDeliveryItemsActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetItemShippingAddressCustomField(
            Function<com.commercetools.api.predicates.query.order.OrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl
                    .of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetItemShippingAddressCustomType(
            Function<com.commercetools.api.predicates.query.order.OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl
                    .of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetLineItemCustomField(
            Function<com.commercetools.api.predicates.query.order.OrderSetLineItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetLineItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderSetLineItemCustomFieldActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetLineItemCustomType(
            Function<com.commercetools.api.predicates.query.order.OrderSetLineItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetLineItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetLineItemCustomTypeActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetLineItemShippingDetails(
            Function<com.commercetools.api.predicates.query.order.OrderSetLineItemShippingDetailsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetLineItemShippingDetailsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderSetLineItemShippingDetailsActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetLocale(
            Function<com.commercetools.api.predicates.query.order.OrderSetLocaleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetLocaleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetLocaleActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetOrderNumber(
            Function<com.commercetools.api.predicates.query.order.OrderSetOrderNumberActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetOrderNumberActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetOrderNumberActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetParcelCustomField(
            Function<com.commercetools.api.predicates.query.order.OrderSetParcelCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetParcelCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetParcelCustomFieldActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetParcelCustomType(
            Function<com.commercetools.api.predicates.query.order.OrderSetParcelCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetParcelCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetParcelCustomTypeActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetParcelItems(
            Function<com.commercetools.api.predicates.query.order.OrderSetParcelItemsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetParcelItemsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetParcelItemsActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetParcelMeasurements(
            Function<com.commercetools.api.predicates.query.order.OrderSetParcelMeasurementsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetParcelMeasurementsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetParcelMeasurementsActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetParcelTrackingData(
            Function<com.commercetools.api.predicates.query.order.OrderSetParcelTrackingDataActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetParcelTrackingDataActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetParcelTrackingDataActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetPurchaseOrderNumber(
            Function<com.commercetools.api.predicates.query.order.OrderSetPurchaseOrderNumberActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetPurchaseOrderNumberActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderSetPurchaseOrderNumberActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetReturnInfo(
            Function<com.commercetools.api.predicates.query.order.OrderSetReturnInfoActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetReturnInfoActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetReturnInfoActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetReturnItemCustomField(
            Function<com.commercetools.api.predicates.query.order.OrderSetReturnItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetReturnItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderSetReturnItemCustomFieldActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetReturnItemCustomType(
            Function<com.commercetools.api.predicates.query.order.OrderSetReturnItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetReturnItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderSetReturnItemCustomTypeActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetReturnPaymentState(
            Function<com.commercetools.api.predicates.query.order.OrderSetReturnPaymentStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetReturnPaymentStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetReturnPaymentStateActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetReturnShipmentState(
            Function<com.commercetools.api.predicates.query.order.OrderSetReturnShipmentStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetReturnShipmentStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderSetReturnShipmentStateActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetShippingAddress(
            Function<com.commercetools.api.predicates.query.order.OrderSetShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetShippingAddressActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetShippingAddressCustomField(
            Function<com.commercetools.api.predicates.query.order.OrderSetShippingAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetShippingAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderSetShippingAddressCustomFieldActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetShippingAddressCustomType(
            Function<com.commercetools.api.predicates.query.order.OrderSetShippingAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetShippingAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderSetShippingAddressCustomTypeActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asSetStore(
            Function<com.commercetools.api.predicates.query.order.OrderSetStoreActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSetStoreActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderSetStoreActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asTransitionCustomLineItemState(
            Function<com.commercetools.api.predicates.query.order.OrderTransitionCustomLineItemStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderTransitionCustomLineItemStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.order.OrderTransitionCustomLineItemStateActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asTransitionLineItemState(
            Function<com.commercetools.api.predicates.query.order.OrderTransitionLineItemStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderTransitionLineItemStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderTransitionLineItemStateActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asTransitionState(
            Function<com.commercetools.api.predicates.query.order.OrderTransitionStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderTransitionStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderTransitionStateActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asUpdateItemShippingAddress(
            Function<com.commercetools.api.predicates.query.order.OrderUpdateItemShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderUpdateItemShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order.OrderUpdateItemShippingAddressActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderUpdateActionQueryBuilderDsl> asUpdateSyncInfo(
            Function<com.commercetools.api.predicates.query.order.OrderUpdateSyncInfoActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderUpdateSyncInfoActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order.OrderUpdateSyncInfoActionQueryBuilderDsl.of()),
            OrderUpdateActionQueryBuilderDsl::of);
    }
}
