package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderAddDeliveryAction;
import com.commercetools.api.generated.models.order.OrderAddItemShippingAddressAction;
import com.commercetools.api.generated.models.order.OrderAddParcelToDeliveryAction;
import com.commercetools.api.generated.models.order.OrderAddPaymentAction;
import com.commercetools.api.generated.models.order.OrderAddReturnInfoAction;
import com.commercetools.api.generated.models.order.OrderChangeOrderStateAction;
import com.commercetools.api.generated.models.order.OrderChangePaymentStateAction;
import com.commercetools.api.generated.models.order.OrderChangeShipmentStateAction;
import com.commercetools.api.generated.models.order.OrderImportCustomLineItemStateAction;
import com.commercetools.api.generated.models.order.OrderImportLineItemStateAction;
import com.commercetools.api.generated.models.order.OrderRemoveDeliveryAction;
import com.commercetools.api.generated.models.order.OrderRemoveItemShippingAddressAction;
import com.commercetools.api.generated.models.order.OrderRemoveParcelFromDeliveryAction;
import com.commercetools.api.generated.models.order.OrderRemovePaymentAction;
import com.commercetools.api.generated.models.order.OrderSetBillingAddressAction;
import com.commercetools.api.generated.models.order.OrderSetCustomFieldAction;
import com.commercetools.api.generated.models.order.OrderSetCustomLineItemCustomFieldAction;
import com.commercetools.api.generated.models.order.OrderSetCustomLineItemCustomTypeAction;
import com.commercetools.api.generated.models.order.OrderSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.order.OrderSetCustomTypeAction;
import com.commercetools.api.generated.models.order.OrderSetCustomerEmailAction;
import com.commercetools.api.generated.models.order.OrderSetCustomerIdAction;
import com.commercetools.api.generated.models.order.OrderSetDeliveryAddressAction;
import com.commercetools.api.generated.models.order.OrderSetDeliveryItemsAction;
import com.commercetools.api.generated.models.order.OrderSetLineItemCustomFieldAction;
import com.commercetools.api.generated.models.order.OrderSetLineItemCustomTypeAction;
import com.commercetools.api.generated.models.order.OrderSetLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.order.OrderSetLocaleAction;
import com.commercetools.api.generated.models.order.OrderSetOrderNumberAction;
import com.commercetools.api.generated.models.order.OrderSetParcelItemsAction;
import com.commercetools.api.generated.models.order.OrderSetParcelMeasurementsAction;
import com.commercetools.api.generated.models.order.OrderSetParcelTrackingDataAction;
import com.commercetools.api.generated.models.order.OrderSetReturnPaymentStateAction;
import com.commercetools.api.generated.models.order.OrderSetReturnShipmentStateAction;
import com.commercetools.api.generated.models.order.OrderSetShippingAddressAction;
import com.commercetools.api.generated.models.order.OrderTransitionCustomLineItemStateAction;
import com.commercetools.api.generated.models.order.OrderTransitionLineItemStateAction;
import com.commercetools.api.generated.models.order.OrderTransitionStateAction;
import com.commercetools.api.generated.models.order.OrderUpdateItemShippingAddressAction;
import com.commercetools.api.generated.models.order.OrderUpdateSyncInfoAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderAddDeliveryActionImpl.class, name = "addDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderAddParcelToDeliveryActionImpl.class, name = "addParcelToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderAddReturnInfoActionImpl.class, name = "addReturnInfo"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderChangeOrderStateActionImpl.class, name = "changeOrderState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderChangePaymentStateActionImpl.class, name = "changePaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderChangeShipmentStateActionImpl.class, name = "changeShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderImportCustomLineItemStateActionImpl.class, name = "importCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderImportLineItemStateActionImpl.class, name = "importLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderRemoveDeliveryActionImpl.class, name = "removeDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderRemoveParcelFromDeliveryActionImpl.class, name = "removeParcelFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetCustomLineItemCustomFieldActionImpl.class, name = "setCustomLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetCustomLineItemCustomTypeActionImpl.class, name = "setCustomLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetCustomLineItemShippingDetailsActionImpl.class, name = "setCustomLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetCustomerEmailActionImpl.class, name = "setCustomerEmail"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetCustomerIdActionImpl.class, name = "setCustomerId"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetDeliveryAddressActionImpl.class, name = "setDeliveryAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetDeliveryItemsActionImpl.class, name = "setDeliveryItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetOrderNumberActionImpl.class, name = "setOrderNumber"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetParcelItemsActionImpl.class, name = "setParcelItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetParcelMeasurementsActionImpl.class, name = "setParcelMeasurements"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetParcelTrackingDataActionImpl.class, name = "setParcelTrackingData"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetReturnPaymentStateActionImpl.class, name = "setReturnPaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetReturnShipmentStateActionImpl.class, name = "setReturnShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderTransitionCustomLineItemStateActionImpl.class, name = "transitionCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderTransitionLineItemStateActionImpl.class, name = "transitionLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderTransitionStateActionImpl.class, name = "transitionState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order.OrderUpdateSyncInfoActionImpl.class, name = "updateSyncInfo")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action",
   defaultImpl = OrderUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface OrderUpdateAction  {


   


}