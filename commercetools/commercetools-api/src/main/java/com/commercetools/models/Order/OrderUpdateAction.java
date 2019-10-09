package com.commercetools.models.order;

import com.commercetools.models.order.OrderAddDeliveryAction;
import com.commercetools.models.order.OrderAddItemShippingAddressAction;
import com.commercetools.models.order.OrderAddParcelToDeliveryAction;
import com.commercetools.models.order.OrderAddPaymentAction;
import com.commercetools.models.order.OrderAddReturnInfoAction;
import com.commercetools.models.order.OrderChangeOrderStateAction;
import com.commercetools.models.order.OrderChangePaymentStateAction;
import com.commercetools.models.order.OrderChangeShipmentStateAction;
import com.commercetools.models.order.OrderImportCustomLineItemStateAction;
import com.commercetools.models.order.OrderImportLineItemStateAction;
import com.commercetools.models.order.OrderRemoveDeliveryAction;
import com.commercetools.models.order.OrderRemoveItemShippingAddressAction;
import com.commercetools.models.order.OrderRemoveParcelFromDeliveryAction;
import com.commercetools.models.order.OrderRemovePaymentAction;
import com.commercetools.models.order.OrderSetBillingAddressAction;
import com.commercetools.models.order.OrderSetCustomFieldAction;
import com.commercetools.models.order.OrderSetCustomLineItemCustomFieldAction;
import com.commercetools.models.order.OrderSetCustomLineItemCustomTypeAction;
import com.commercetools.models.order.OrderSetCustomLineItemShippingDetailsAction;
import com.commercetools.models.order.OrderSetCustomTypeAction;
import com.commercetools.models.order.OrderSetCustomerEmailAction;
import com.commercetools.models.order.OrderSetCustomerIdAction;
import com.commercetools.models.order.OrderSetDeliveryAddressAction;
import com.commercetools.models.order.OrderSetDeliveryItemsAction;
import com.commercetools.models.order.OrderSetLineItemCustomFieldAction;
import com.commercetools.models.order.OrderSetLineItemCustomTypeAction;
import com.commercetools.models.order.OrderSetLineItemShippingDetailsAction;
import com.commercetools.models.order.OrderSetLocaleAction;
import com.commercetools.models.order.OrderSetOrderNumberAction;
import com.commercetools.models.order.OrderSetParcelItemsAction;
import com.commercetools.models.order.OrderSetParcelMeasurementsAction;
import com.commercetools.models.order.OrderSetParcelTrackingDataAction;
import com.commercetools.models.order.OrderSetReturnPaymentStateAction;
import com.commercetools.models.order.OrderSetReturnShipmentStateAction;
import com.commercetools.models.order.OrderSetShippingAddressAction;
import com.commercetools.models.order.OrderTransitionCustomLineItemStateAction;
import com.commercetools.models.order.OrderTransitionLineItemStateAction;
import com.commercetools.models.order.OrderTransitionStateAction;
import com.commercetools.models.order.OrderUpdateItemShippingAddressAction;
import com.commercetools.models.order.OrderUpdateSyncInfoAction;


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
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderAddDeliveryActionImpl.class, name = "addDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderAddParcelToDeliveryActionImpl.class, name = "addParcelToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderAddReturnInfoActionImpl.class, name = "addReturnInfo"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderChangeOrderStateActionImpl.class, name = "changeOrderState"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderChangePaymentStateActionImpl.class, name = "changePaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderChangeShipmentStateActionImpl.class, name = "changeShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderImportCustomLineItemStateActionImpl.class, name = "importCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderImportLineItemStateActionImpl.class, name = "importLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderRemoveDeliveryActionImpl.class, name = "removeDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderRemoveParcelFromDeliveryActionImpl.class, name = "removeParcelFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetCustomLineItemCustomFieldActionImpl.class, name = "setCustomLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetCustomLineItemCustomTypeActionImpl.class, name = "setCustomLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetCustomLineItemShippingDetailsActionImpl.class, name = "setCustomLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetCustomerEmailActionImpl.class, name = "setCustomerEmail"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetCustomerIdActionImpl.class, name = "setCustomerId"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetDeliveryAddressActionImpl.class, name = "setDeliveryAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetDeliveryItemsActionImpl.class, name = "setDeliveryItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetOrderNumberActionImpl.class, name = "setOrderNumber"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetParcelItemsActionImpl.class, name = "setParcelItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetParcelMeasurementsActionImpl.class, name = "setParcelMeasurements"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetParcelTrackingDataActionImpl.class, name = "setParcelTrackingData"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetReturnPaymentStateActionImpl.class, name = "setReturnPaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetReturnShipmentStateActionImpl.class, name = "setReturnShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderTransitionCustomLineItemStateActionImpl.class, name = "transitionCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderTransitionLineItemStateActionImpl.class, name = "transitionLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderTransitionStateActionImpl.class, name = "transitionState"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.order.OrderUpdateSyncInfoActionImpl.class, name = "updateSyncInfo")
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