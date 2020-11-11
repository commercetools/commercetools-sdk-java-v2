package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderAddDeliveryAction;
import com.commercetools.api.models.order.OrderAddItemShippingAddressAction;
import com.commercetools.api.models.order.OrderAddParcelToDeliveryAction;
import com.commercetools.api.models.order.OrderAddPaymentAction;
import com.commercetools.api.models.order.OrderAddReturnInfoAction;
import com.commercetools.api.models.order.OrderChangeOrderStateAction;
import com.commercetools.api.models.order.OrderChangePaymentStateAction;
import com.commercetools.api.models.order.OrderChangeShipmentStateAction;
import com.commercetools.api.models.order.OrderImportCustomLineItemStateAction;
import com.commercetools.api.models.order.OrderImportLineItemStateAction;
import com.commercetools.api.models.order.OrderRemoveDeliveryAction;
import com.commercetools.api.models.order.OrderRemoveItemShippingAddressAction;
import com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryAction;
import com.commercetools.api.models.order.OrderRemovePaymentAction;
import com.commercetools.api.models.order.OrderSetBillingAddressAction;
import com.commercetools.api.models.order.OrderSetCustomFieldAction;
import com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldAction;
import com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeAction;
import com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.models.order.OrderSetCustomTypeAction;
import com.commercetools.api.models.order.OrderSetCustomerEmailAction;
import com.commercetools.api.models.order.OrderSetCustomerIdAction;
import com.commercetools.api.models.order.OrderSetDeliveryAddressAction;
import com.commercetools.api.models.order.OrderSetDeliveryItemsAction;
import com.commercetools.api.models.order.OrderSetLineItemCustomFieldAction;
import com.commercetools.api.models.order.OrderSetLineItemCustomTypeAction;
import com.commercetools.api.models.order.OrderSetLineItemShippingDetailsAction;
import com.commercetools.api.models.order.OrderSetLocaleAction;
import com.commercetools.api.models.order.OrderSetOrderNumberAction;
import com.commercetools.api.models.order.OrderSetParcelItemsAction;
import com.commercetools.api.models.order.OrderSetParcelMeasurementsAction;
import com.commercetools.api.models.order.OrderSetParcelTrackingDataAction;
import com.commercetools.api.models.order.OrderSetReturnPaymentStateAction;
import com.commercetools.api.models.order.OrderSetReturnShipmentStateAction;
import com.commercetools.api.models.order.OrderSetShippingAddressAction;
import com.commercetools.api.models.order.OrderSetStoreAction;
import com.commercetools.api.models.order.OrderTransitionCustomLineItemStateAction;
import com.commercetools.api.models.order.OrderTransitionLineItemStateAction;
import com.commercetools.api.models.order.OrderTransitionStateAction;
import com.commercetools.api.models.order.OrderUpdateItemShippingAddressAction;
import com.commercetools.api.models.order.OrderUpdateSyncInfoAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderAddDeliveryActionImpl.class, name = "addDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderAddParcelToDeliveryActionImpl.class, name = "addParcelToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderAddReturnInfoActionImpl.class, name = "addReturnInfo"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderChangeOrderStateActionImpl.class, name = "changeOrderState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderChangePaymentStateActionImpl.class, name = "changePaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderChangeShipmentStateActionImpl.class, name = "changeShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderImportCustomLineItemStateActionImpl.class, name = "importCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderImportLineItemStateActionImpl.class, name = "importLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderRemoveDeliveryActionImpl.class, name = "removeDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryActionImpl.class, name = "removeParcelFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomLineItemCustomFieldActionImpl.class, name = "setCustomLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomLineItemCustomTypeActionImpl.class, name = "setCustomLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomLineItemShippingDetailsActionImpl.class, name = "setCustomLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomerEmailActionImpl.class, name = "setCustomerEmail"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetCustomerIdActionImpl.class, name = "setCustomerId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetDeliveryAddressActionImpl.class, name = "setDeliveryAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetDeliveryItemsActionImpl.class, name = "setDeliveryItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetOrderNumberActionImpl.class, name = "setOrderNumber"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetParcelItemsActionImpl.class, name = "setParcelItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetParcelMeasurementsActionImpl.class, name = "setParcelMeasurements"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetParcelTrackingDataActionImpl.class, name = "setParcelTrackingData"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetReturnPaymentStateActionImpl.class, name = "setReturnPaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetReturnShipmentStateActionImpl.class, name = "setReturnShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderSetStoreActionImpl.class, name = "setStore"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderTransitionCustomLineItemStateActionImpl.class, name = "transitionCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderTransitionLineItemStateActionImpl.class, name = "transitionLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderTransitionStateActionImpl.class, name = "transitionState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.OrderUpdateSyncInfoActionImpl.class, name = "updateSyncInfo")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = OrderUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface OrderUpdateAction  {

    
    @NotNull
    @JsonProperty("action")
    public String getAction();




    default <T> T withOrderUpdateAction(Function<OrderUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
