package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderAddDeliveryAction;
import com.commercetools.models.Order.OrderAddItemShippingAddressAction;
import com.commercetools.models.Order.OrderAddParcelToDeliveryAction;
import com.commercetools.models.Order.OrderAddPaymentAction;
import com.commercetools.models.Order.OrderAddReturnInfoAction;
import com.commercetools.models.Order.OrderChangeOrderStateAction;
import com.commercetools.models.Order.OrderChangePaymentStateAction;
import com.commercetools.models.Order.OrderChangeShipmentStateAction;
import com.commercetools.models.Order.OrderImportCustomLineItemStateAction;
import com.commercetools.models.Order.OrderImportLineItemStateAction;
import com.commercetools.models.Order.OrderRemoveDeliveryAction;
import com.commercetools.models.Order.OrderRemoveItemShippingAddressAction;
import com.commercetools.models.Order.OrderRemoveParcelFromDeliveryAction;
import com.commercetools.models.Order.OrderRemovePaymentAction;
import com.commercetools.models.Order.OrderSetBillingAddressAction;
import com.commercetools.models.Order.OrderSetCustomFieldAction;
import com.commercetools.models.Order.OrderSetCustomLineItemCustomFieldAction;
import com.commercetools.models.Order.OrderSetCustomLineItemCustomTypeAction;
import com.commercetools.models.Order.OrderSetCustomLineItemShippingDetailsAction;
import com.commercetools.models.Order.OrderSetCustomTypeAction;
import com.commercetools.models.Order.OrderSetCustomerEmailAction;
import com.commercetools.models.Order.OrderSetCustomerIdAction;
import com.commercetools.models.Order.OrderSetDeliveryAddressAction;
import com.commercetools.models.Order.OrderSetDeliveryItemsAction;
import com.commercetools.models.Order.OrderSetLineItemCustomFieldAction;
import com.commercetools.models.Order.OrderSetLineItemCustomTypeAction;
import com.commercetools.models.Order.OrderSetLineItemShippingDetailsAction;
import com.commercetools.models.Order.OrderSetLocaleAction;
import com.commercetools.models.Order.OrderSetOrderNumberAction;
import com.commercetools.models.Order.OrderSetParcelItemsAction;
import com.commercetools.models.Order.OrderSetParcelMeasurementsAction;
import com.commercetools.models.Order.OrderSetParcelTrackingDataAction;
import com.commercetools.models.Order.OrderSetReturnPaymentStateAction;
import com.commercetools.models.Order.OrderSetReturnShipmentStateAction;
import com.commercetools.models.Order.OrderSetShippingAddressAction;
import com.commercetools.models.Order.OrderTransitionCustomLineItemStateAction;
import com.commercetools.models.Order.OrderTransitionLineItemStateAction;
import com.commercetools.models.Order.OrderTransitionStateAction;
import com.commercetools.models.Order.OrderUpdateItemShippingAddressAction;
import com.commercetools.models.Order.OrderUpdateSyncInfoAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderAddDeliveryActionImpl.class, name = "addDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderAddParcelToDeliveryActionImpl.class, name = "addParcelToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderAddReturnInfoActionImpl.class, name = "addReturnInfo"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderChangeOrderStateActionImpl.class, name = "changeOrderState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderChangePaymentStateActionImpl.class, name = "changePaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderChangeShipmentStateActionImpl.class, name = "changeShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderImportCustomLineItemStateActionImpl.class, name = "importCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderImportLineItemStateActionImpl.class, name = "importLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderRemoveDeliveryActionImpl.class, name = "removeDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderRemoveParcelFromDeliveryActionImpl.class, name = "removeParcelFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetCustomLineItemCustomFieldActionImpl.class, name = "setCustomLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetCustomLineItemCustomTypeActionImpl.class, name = "setCustomLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetCustomLineItemShippingDetailsActionImpl.class, name = "setCustomLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetCustomerEmailActionImpl.class, name = "setCustomerEmail"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetCustomerIdActionImpl.class, name = "setCustomerId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetDeliveryAddressActionImpl.class, name = "setDeliveryAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetDeliveryItemsActionImpl.class, name = "setDeliveryItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetOrderNumberActionImpl.class, name = "setOrderNumber"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetParcelItemsActionImpl.class, name = "setParcelItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetParcelMeasurementsActionImpl.class, name = "setParcelMeasurements"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetParcelTrackingDataActionImpl.class, name = "setParcelTrackingData"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetReturnPaymentStateActionImpl.class, name = "setReturnPaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetReturnShipmentStateActionImpl.class, name = "setReturnShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderTransitionCustomLineItemStateActionImpl.class, name = "transitionCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderTransitionLineItemStateActionImpl.class, name = "transitionLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderTransitionStateActionImpl.class, name = "transitionState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.OrderUpdateSyncInfoActionImpl.class, name = "updateSyncInfo")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface OrderUpdateAction  {


   


}