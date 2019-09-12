package com.commercetools.models.Order;

import com.commercetools.models.OrderEdit.StagedOrderAddCustomLineItemAction;
import com.commercetools.models.OrderEdit.StagedOrderAddDeliveryAction;
import com.commercetools.models.OrderEdit.StagedOrderAddDiscountCodeAction;
import com.commercetools.models.OrderEdit.StagedOrderAddItemShippingAddressAction;
import com.commercetools.models.OrderEdit.StagedOrderAddLineItemAction;
import com.commercetools.models.OrderEdit.StagedOrderAddParcelToDeliveryAction;
import com.commercetools.models.OrderEdit.StagedOrderAddPaymentAction;
import com.commercetools.models.OrderEdit.StagedOrderAddReturnInfoAction;
import com.commercetools.models.OrderEdit.StagedOrderAddShoppingListAction;
import com.commercetools.models.OrderEdit.StagedOrderChangeCustomLineItemMoneyAction;
import com.commercetools.models.OrderEdit.StagedOrderChangeCustomLineItemQuantityAction;
import com.commercetools.models.OrderEdit.StagedOrderChangeLineItemQuantityAction;
import com.commercetools.models.OrderEdit.StagedOrderChangeOrderStateAction;
import com.commercetools.models.OrderEdit.StagedOrderChangePaymentStateAction;
import com.commercetools.models.OrderEdit.StagedOrderChangeShipmentStateAction;
import com.commercetools.models.OrderEdit.StagedOrderChangeTaxCalculationModeAction;
import com.commercetools.models.OrderEdit.StagedOrderChangeTaxModeAction;
import com.commercetools.models.OrderEdit.StagedOrderChangeTaxRoundingModeAction;
import com.commercetools.models.OrderEdit.StagedOrderImportCustomLineItemStateAction;
import com.commercetools.models.OrderEdit.StagedOrderImportLineItemStateAction;
import com.commercetools.models.OrderEdit.StagedOrderRemoveCustomLineItemAction;
import com.commercetools.models.OrderEdit.StagedOrderRemoveDeliveryAction;
import com.commercetools.models.OrderEdit.StagedOrderRemoveDiscountCodeAction;
import com.commercetools.models.OrderEdit.StagedOrderRemoveItemShippingAddressAction;
import com.commercetools.models.OrderEdit.StagedOrderRemoveLineItemAction;
import com.commercetools.models.OrderEdit.StagedOrderRemoveParcelFromDeliveryAction;
import com.commercetools.models.OrderEdit.StagedOrderRemovePaymentAction;
import com.commercetools.models.OrderEdit.StagedOrderSetBillingAddressAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCountryAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomFieldAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemCustomFieldAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemCustomTypeAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemShippingDetailsAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemTaxAmountAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemTaxRateAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomShippingMethodAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomTypeAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomerEmailAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomerGroupAction;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomerIdAction;
import com.commercetools.models.OrderEdit.StagedOrderSetDeliveryAddressAction;
import com.commercetools.models.OrderEdit.StagedOrderSetDeliveryItemsAction;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemCustomFieldAction;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemCustomTypeAction;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemPriceAction;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemShippingDetailsAction;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemTaxAmountAction;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemTaxRateAction;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemTotalPriceAction;
import com.commercetools.models.OrderEdit.StagedOrderSetLocaleAction;
import com.commercetools.models.OrderEdit.StagedOrderSetOrderNumberAction;
import com.commercetools.models.OrderEdit.StagedOrderSetOrderTotalTaxAction;
import com.commercetools.models.OrderEdit.StagedOrderSetParcelItemsAction;
import com.commercetools.models.OrderEdit.StagedOrderSetParcelMeasurementsAction;
import com.commercetools.models.OrderEdit.StagedOrderSetParcelTrackingDataAction;
import com.commercetools.models.OrderEdit.StagedOrderSetReturnPaymentStateAction;
import com.commercetools.models.OrderEdit.StagedOrderSetReturnShipmentStateAction;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingAddressAction;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingAddressAndCustomShippingMethodAction;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingAddressAndShippingMethodAction;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingMethodAction;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingMethodTaxAmountAction;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingMethodTaxRateAction;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingRateInputAction;
import com.commercetools.models.OrderEdit.StagedOrderTransitionCustomLineItemStateAction;
import com.commercetools.models.OrderEdit.StagedOrderTransitionLineItemStateAction;
import com.commercetools.models.OrderEdit.StagedOrderTransitionStateAction;
import com.commercetools.models.OrderEdit.StagedOrderUpdateItemShippingAddressAction;
import com.commercetools.models.OrderEdit.StagedOrderUpdateSyncInfoAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderAddCustomLineItemActionImpl.class, name = "addCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderAddDeliveryActionImpl.class, name = "addDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderAddDiscountCodeActionImpl.class, name = "addDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderAddParcelToDeliveryActionImpl.class, name = "addParcelToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderAddReturnInfoActionImpl.class, name = "addReturnInfo"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderAddShoppingListActionImpl.class, name = "addShoppingList"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderChangeCustomLineItemMoneyActionImpl.class, name = "changeCustomLineItemMoney"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderChangeCustomLineItemQuantityActionImpl.class, name = "changeCustomLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderChangeOrderStateActionImpl.class, name = "changeOrderState"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderChangePaymentStateActionImpl.class, name = "changePaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderChangeShipmentStateActionImpl.class, name = "changeShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderChangeTaxCalculationModeActionImpl.class, name = "changeTaxCalculationMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderChangeTaxModeActionImpl.class, name = "changeTaxMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderChangeTaxRoundingModeActionImpl.class, name = "changeTaxRoundingMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderImportCustomLineItemStateActionImpl.class, name = "importCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderImportLineItemStateActionImpl.class, name = "importLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderRemoveCustomLineItemActionImpl.class, name = "removeCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderRemoveDeliveryActionImpl.class, name = "removeDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderRemoveDiscountCodeActionImpl.class, name = "removeDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderRemoveParcelFromDeliveryActionImpl.class, name = "removeParcelFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCountryActionImpl.class, name = "setCountry"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemCustomFieldActionImpl.class, name = "setCustomLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemCustomTypeActionImpl.class, name = "setCustomLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemShippingDetailsActionImpl.class, name = "setCustomLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemTaxAmountActionImpl.class, name = "setCustomLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemTaxRateActionImpl.class, name = "setCustomLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCustomShippingMethodActionImpl.class, name = "setCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCustomerEmailActionImpl.class, name = "setCustomerEmail"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCustomerGroupActionImpl.class, name = "setCustomerGroup"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetCustomerIdActionImpl.class, name = "setCustomerId"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetDeliveryAddressActionImpl.class, name = "setDeliveryAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetDeliveryItemsActionImpl.class, name = "setDeliveryItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetLineItemPriceActionImpl.class, name = "setLineItemPrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetLineItemTaxAmountActionImpl.class, name = "setLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetLineItemTaxRateActionImpl.class, name = "setLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetLineItemTotalPriceActionImpl.class, name = "setLineItemTotalPrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetOrderNumberActionImpl.class, name = "setOrderNumber"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetOrderTotalTaxActionImpl.class, name = "setOrderTotalTax"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetParcelItemsActionImpl.class, name = "setParcelItems"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetParcelMeasurementsActionImpl.class, name = "setParcelMeasurements"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetParcelTrackingDataActionImpl.class, name = "setParcelTrackingData"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetReturnPaymentStateActionImpl.class, name = "setReturnPaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetReturnShipmentStateActionImpl.class, name = "setReturnShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl.class, name = "setShippingAddressAndCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetShippingAddressAndShippingMethodActionImpl.class, name = "setShippingAddressAndShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetShippingMethodActionImpl.class, name = "setShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetShippingMethodTaxAmountActionImpl.class, name = "setShippingMethodTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetShippingMethodTaxRateActionImpl.class, name = "setShippingMethodTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderSetShippingRateInputActionImpl.class, name = "setShippingRateInput"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderTransitionCustomLineItemStateActionImpl.class, name = "transitionCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderTransitionLineItemStateActionImpl.class, name = "transitionLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderTransitionStateActionImpl.class, name = "transitionState"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.OrderEdit.StagedOrderUpdateSyncInfoActionImpl.class, name = "updateSyncInfo")
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
public interface StagedOrderUpdateAction  {


   


}