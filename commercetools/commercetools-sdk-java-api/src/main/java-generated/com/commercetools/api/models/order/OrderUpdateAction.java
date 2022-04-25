
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderAddDeliveryActionImpl.class, name = OrderAddDeliveryAction.ADD_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderAddItemShippingAddressActionImpl.class, name = OrderAddItemShippingAddressAction.ADD_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderAddParcelToDeliveryActionImpl.class, name = OrderAddParcelToDeliveryAction.ADD_PARCEL_TO_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderAddPaymentActionImpl.class, name = OrderAddPaymentAction.ADD_PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderAddReturnInfoActionImpl.class, name = OrderAddReturnInfoAction.ADD_RETURN_INFO),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderChangeOrderStateActionImpl.class, name = OrderChangeOrderStateAction.CHANGE_ORDER_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderChangePaymentStateActionImpl.class, name = OrderChangePaymentStateAction.CHANGE_PAYMENT_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderChangeShipmentStateActionImpl.class, name = OrderChangeShipmentStateAction.CHANGE_SHIPMENT_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderImportCustomLineItemStateActionImpl.class, name = OrderImportCustomLineItemStateAction.IMPORT_CUSTOM_LINE_ITEM_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderImportLineItemStateActionImpl.class, name = OrderImportLineItemStateAction.IMPORT_LINE_ITEM_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderRemoveDeliveryActionImpl.class, name = OrderRemoveDeliveryAction.REMOVE_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderRemoveItemShippingAddressActionImpl.class, name = OrderRemoveItemShippingAddressAction.REMOVE_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryActionImpl.class, name = OrderRemoveParcelFromDeliveryAction.REMOVE_PARCEL_FROM_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderRemovePaymentActionImpl.class, name = OrderRemovePaymentAction.REMOVE_PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetBillingAddressActionImpl.class, name = OrderSetBillingAddressAction.SET_BILLING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetBillingAddressCustomFieldActionImpl.class, name = OrderSetBillingAddressCustomFieldAction.SET_BILLING_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetBillingAddressCustomTypeActionImpl.class, name = OrderSetBillingAddressCustomTypeAction.SET_BILLING_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomFieldActionImpl.class, name = OrderSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldActionImpl.class, name = OrderSetCustomLineItemCustomFieldAction.SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeActionImpl.class, name = OrderSetCustomLineItemCustomTypeAction.SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsActionImpl.class, name = OrderSetCustomLineItemShippingDetailsAction.SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomTypeActionImpl.class, name = OrderSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomerEmailActionImpl.class, name = OrderSetCustomerEmailAction.SET_CUSTOMER_EMAIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomerIdActionImpl.class, name = OrderSetCustomerIdAction.SET_CUSTOMER_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetDeliveryAddressActionImpl.class, name = OrderSetDeliveryAddressAction.SET_DELIVERY_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetDeliveryAddressCustomFieldActionImpl.class, name = OrderSetDeliveryAddressCustomFieldAction.SET_DELIVERY_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetDeliveryAddressCustomTypeActionImpl.class, name = OrderSetDeliveryAddressCustomTypeAction.SET_DELIVERY_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetDeliveryCustomFieldActionImpl.class, name = OrderSetDeliveryCustomFieldAction.SET_DELIVERY_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetDeliveryCustomTypeActionImpl.class, name = OrderSetDeliveryCustomTypeAction.SET_DELIVERY_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetDeliveryItemsActionImpl.class, name = OrderSetDeliveryItemsAction.SET_DELIVERY_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetItemShippingAddressCustomFieldActionImpl.class, name = OrderSetItemShippingAddressCustomFieldAction.SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetItemShippingAddressCustomTypeActionImpl.class, name = OrderSetItemShippingAddressCustomTypeAction.SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetLineItemCustomFieldActionImpl.class, name = OrderSetLineItemCustomFieldAction.SET_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetLineItemCustomTypeActionImpl.class, name = OrderSetLineItemCustomTypeAction.SET_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetLineItemShippingDetailsActionImpl.class, name = OrderSetLineItemShippingDetailsAction.SET_LINE_ITEM_SHIPPING_DETAILS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetLocaleActionImpl.class, name = OrderSetLocaleAction.SET_LOCALE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetOrderNumberActionImpl.class, name = OrderSetOrderNumberAction.SET_ORDER_NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetParcelCustomFieldActionImpl.class, name = OrderSetParcelCustomFieldAction.SET_PARCEL_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetParcelCustomTypeActionImpl.class, name = OrderSetParcelCustomTypeAction.SET_PARCEL_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetParcelItemsActionImpl.class, name = OrderSetParcelItemsAction.SET_PARCEL_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetParcelMeasurementsActionImpl.class, name = OrderSetParcelMeasurementsAction.SET_PARCEL_MEASUREMENTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetParcelTrackingDataActionImpl.class, name = OrderSetParcelTrackingDataAction.SET_PARCEL_TRACKING_DATA),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetReturnInfoActionImpl.class, name = OrderSetReturnInfoAction.SET_RETURN_INFO),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetReturnItemCustomFieldActionImpl.class, name = OrderSetReturnItemCustomFieldAction.SET_RETURN_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetReturnItemCustomTypeActionImpl.class, name = OrderSetReturnItemCustomTypeAction.SET_RETURN_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetReturnPaymentStateActionImpl.class, name = OrderSetReturnPaymentStateAction.SET_RETURN_PAYMENT_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetReturnShipmentStateActionImpl.class, name = OrderSetReturnShipmentStateAction.SET_RETURN_SHIPMENT_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetShippingAddressActionImpl.class, name = OrderSetShippingAddressAction.SET_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetShippingAddressCustomFieldActionImpl.class, name = OrderSetShippingAddressCustomFieldAction.SET_SHIPPING_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetShippingAddressCustomTypeActionImpl.class, name = OrderSetShippingAddressCustomTypeAction.SET_SHIPPING_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetStoreActionImpl.class, name = OrderSetStoreAction.SET_STORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderTransitionCustomLineItemStateActionImpl.class, name = OrderTransitionCustomLineItemStateAction.TRANSITION_CUSTOM_LINE_ITEM_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderTransitionLineItemStateActionImpl.class, name = OrderTransitionLineItemStateAction.TRANSITION_LINE_ITEM_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderTransitionStateActionImpl.class, name = OrderTransitionStateAction.TRANSITION_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderUpdateItemShippingAddressActionImpl.class, name = OrderUpdateItemShippingAddressAction.UPDATE_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderUpdateSyncInfoActionImpl.class, name = OrderUpdateSyncInfoAction.UPDATE_SYNC_INFO) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = OrderUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = OrderUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface OrderUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<OrderUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.order.OrderAddDeliveryActionBuilder addDeliveryBuilder() {
        return com.commercetools.api.models.order.OrderAddDeliveryActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
        return com.commercetools.api.models.order.OrderAddItemShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderAddParcelToDeliveryActionBuilder addParcelToDeliveryBuilder() {
        return com.commercetools.api.models.order.OrderAddParcelToDeliveryActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderAddPaymentActionBuilder addPaymentBuilder() {
        return com.commercetools.api.models.order.OrderAddPaymentActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderAddReturnInfoActionBuilder addReturnInfoBuilder() {
        return com.commercetools.api.models.order.OrderAddReturnInfoActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderChangeOrderStateActionBuilder changeOrderStateBuilder() {
        return com.commercetools.api.models.order.OrderChangeOrderStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderChangePaymentStateActionBuilder changePaymentStateBuilder() {
        return com.commercetools.api.models.order.OrderChangePaymentStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderChangeShipmentStateActionBuilder changeShipmentStateBuilder() {
        return com.commercetools.api.models.order.OrderChangeShipmentStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderImportCustomLineItemStateActionBuilder importCustomLineItemStateBuilder() {
        return com.commercetools.api.models.order.OrderImportCustomLineItemStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderImportLineItemStateActionBuilder importLineItemStateBuilder() {
        return com.commercetools.api.models.order.OrderImportLineItemStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderRemoveDeliveryActionBuilder removeDeliveryBuilder() {
        return com.commercetools.api.models.order.OrderRemoveDeliveryActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
        return com.commercetools.api.models.order.OrderRemoveItemShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryActionBuilder removeParcelFromDeliveryBuilder() {
        return com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderRemovePaymentActionBuilder removePaymentBuilder() {
        return com.commercetools.api.models.order.OrderRemovePaymentActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetBillingAddressActionBuilder setBillingAddressBuilder() {
        return com.commercetools.api.models.order.OrderSetBillingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetBillingAddressCustomFieldActionBuilder setBillingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetBillingAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetBillingAddressCustomTypeActionBuilder setBillingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetBillingAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldActionBuilder setCustomLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeActionBuilder setCustomLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsActionBuilder setCustomLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomerEmailActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetCustomerIdActionBuilder setCustomerIdBuilder() {
        return com.commercetools.api.models.order.OrderSetCustomerIdActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetDeliveryAddressActionBuilder setDeliveryAddressBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetDeliveryAddressCustomFieldActionBuilder setDeliveryAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetDeliveryAddressCustomTypeActionBuilder setDeliveryAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetDeliveryCustomFieldActionBuilder setDeliveryCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetDeliveryCustomTypeActionBuilder setDeliveryCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetDeliveryItemsActionBuilder setDeliveryItemsBuilder() {
        return com.commercetools.api.models.order.OrderSetDeliveryItemsActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetItemShippingAddressCustomFieldActionBuilder setItemShippingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetItemShippingAddressCustomTypeActionBuilder setItemShippingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetItemShippingAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetLineItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetLineItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.order.OrderSetLineItemShippingDetailsActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetLocaleActionBuilder setLocaleBuilder() {
        return com.commercetools.api.models.order.OrderSetLocaleActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetOrderNumberActionBuilder setOrderNumberBuilder() {
        return com.commercetools.api.models.order.OrderSetOrderNumberActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetParcelCustomFieldActionBuilder setParcelCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetParcelCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetParcelCustomTypeActionBuilder setParcelCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetParcelCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetParcelItemsActionBuilder setParcelItemsBuilder() {
        return com.commercetools.api.models.order.OrderSetParcelItemsActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetParcelMeasurementsActionBuilder setParcelMeasurementsBuilder() {
        return com.commercetools.api.models.order.OrderSetParcelMeasurementsActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetParcelTrackingDataActionBuilder setParcelTrackingDataBuilder() {
        return com.commercetools.api.models.order.OrderSetParcelTrackingDataActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetReturnInfoActionBuilder setReturnInfoBuilder() {
        return com.commercetools.api.models.order.OrderSetReturnInfoActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetReturnItemCustomFieldActionBuilder setReturnItemCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetReturnItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetReturnItemCustomTypeActionBuilder setReturnItemCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetReturnItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetReturnPaymentStateActionBuilder setReturnPaymentStateBuilder() {
        return com.commercetools.api.models.order.OrderSetReturnPaymentStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetReturnShipmentStateActionBuilder setReturnShipmentStateBuilder() {
        return com.commercetools.api.models.order.OrderSetReturnShipmentStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetShippingAddressActionBuilder setShippingAddressBuilder() {
        return com.commercetools.api.models.order.OrderSetShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetShippingAddressCustomFieldActionBuilder setShippingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.order.OrderSetShippingAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetShippingAddressCustomTypeActionBuilder setShippingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.order.OrderSetShippingAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderSetStoreActionBuilder setStoreBuilder() {
        return com.commercetools.api.models.order.OrderSetStoreActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderTransitionCustomLineItemStateActionBuilder transitionCustomLineItemStateBuilder() {
        return com.commercetools.api.models.order.OrderTransitionCustomLineItemStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderTransitionLineItemStateActionBuilder transitionLineItemStateBuilder() {
        return com.commercetools.api.models.order.OrderTransitionLineItemStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderTransitionStateActionBuilder transitionStateBuilder() {
        return com.commercetools.api.models.order.OrderTransitionStateActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
        return com.commercetools.api.models.order.OrderUpdateItemShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.order.OrderUpdateSyncInfoActionBuilder updateSyncInfoBuilder() {
        return com.commercetools.api.models.order.OrderUpdateSyncInfoActionBuilder.of();
    }

    default <T> T withOrderUpdateAction(Function<OrderUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderUpdateAction>";
            }
        };
    }
}
