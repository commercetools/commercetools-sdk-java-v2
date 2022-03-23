
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

    default <T> T withOrderUpdateAction(Function<OrderUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
