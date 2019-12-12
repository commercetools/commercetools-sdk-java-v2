package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order_edit.StagedOrderAddCustomLineItemAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddDeliveryAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddDiscountCodeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddItemShippingAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddLineItemAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddParcelToDeliveryAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddPaymentAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddReturnInfoAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddShoppingListAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeCustomLineItemMoneyAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeCustomLineItemQuantityAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeLineItemQuantityAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeOrderStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangePaymentStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeShipmentStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxCalculationModeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxModeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxRoundingModeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderImportCustomLineItemStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderImportLineItemStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveCustomLineItemAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveDeliveryAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveDiscountCodeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveItemShippingAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveLineItemAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveParcelFromDeliveryAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemovePaymentAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetBillingAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCountryAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomFieldAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemCustomFieldAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemCustomTypeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemTaxAmountAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemTaxRateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomShippingMethodAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomTypeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomerEmailAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomerGroupAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomerIdAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetDeliveryAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetDeliveryItemsAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemCustomFieldAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemCustomTypeAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemPriceAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTaxAmountAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTaxRateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTotalPriceAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLocaleAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetOrderNumberAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetOrderTotalTaxAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetParcelItemsAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetParcelMeasurementsAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetParcelTrackingDataAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetReturnPaymentStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetReturnShipmentStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodTaxAmountAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodTaxRateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingRateInputAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderTransitionCustomLineItemStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderTransitionLineItemStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderTransitionStateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderUpdateItemShippingAddressAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderUpdateSyncInfoAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderAddCustomLineItemActionImpl.class, name = "addCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderAddDeliveryActionImpl.class, name = "addDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderAddDiscountCodeActionImpl.class, name = "addDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderAddParcelToDeliveryActionImpl.class, name = "addParcelToDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderAddReturnInfoActionImpl.class, name = "addReturnInfo"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderAddShoppingListActionImpl.class, name = "addShoppingList"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderChangeCustomLineItemMoneyActionImpl.class, name = "changeCustomLineItemMoney"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderChangeCustomLineItemQuantityActionImpl.class, name = "changeCustomLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderChangeOrderStateActionImpl.class, name = "changeOrderState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderChangePaymentStateActionImpl.class, name = "changePaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderChangeShipmentStateActionImpl.class, name = "changeShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxCalculationModeActionImpl.class, name = "changeTaxCalculationMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxModeActionImpl.class, name = "changeTaxMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxRoundingModeActionImpl.class, name = "changeTaxRoundingMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderImportCustomLineItemStateActionImpl.class, name = "importCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderImportLineItemStateActionImpl.class, name = "importLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderRemoveCustomLineItemActionImpl.class, name = "removeCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderRemoveDeliveryActionImpl.class, name = "removeDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderRemoveDiscountCodeActionImpl.class, name = "removeDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderRemoveParcelFromDeliveryActionImpl.class, name = "removeParcelFromDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCountryActionImpl.class, name = "setCountry"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemCustomFieldActionImpl.class, name = "setCustomLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemCustomTypeActionImpl.class, name = "setCustomLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsActionImpl.class, name = "setCustomLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemTaxAmountActionImpl.class, name = "setCustomLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomLineItemTaxRateActionImpl.class, name = "setCustomLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomShippingMethodActionImpl.class, name = "setCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomerEmailActionImpl.class, name = "setCustomerEmail"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomerGroupActionImpl.class, name = "setCustomerGroup"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomerIdActionImpl.class, name = "setCustomerId"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetDeliveryAddressActionImpl.class, name = "setDeliveryAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetDeliveryItemsActionImpl.class, name = "setDeliveryItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemPriceActionImpl.class, name = "setLineItemPrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTaxAmountActionImpl.class, name = "setLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTaxRateActionImpl.class, name = "setLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTotalPriceActionImpl.class, name = "setLineItemTotalPrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetOrderNumberActionImpl.class, name = "setOrderNumber"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetOrderTotalTaxActionImpl.class, name = "setOrderTotalTax"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetParcelItemsActionImpl.class, name = "setParcelItems"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetParcelMeasurementsActionImpl.class, name = "setParcelMeasurements"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetParcelTrackingDataActionImpl.class, name = "setParcelTrackingData"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetReturnPaymentStateActionImpl.class, name = "setReturnPaymentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetReturnShipmentStateActionImpl.class, name = "setReturnShipmentState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl.class, name = "setShippingAddressAndCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodActionImpl.class, name = "setShippingAddressAndShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodActionImpl.class, name = "setShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodTaxAmountActionImpl.class, name = "setShippingMethodTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodTaxRateActionImpl.class, name = "setShippingMethodTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingRateInputActionImpl.class, name = "setShippingRateInput"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderTransitionCustomLineItemStateActionImpl.class, name = "transitionCustomLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderTransitionLineItemStateActionImpl.class, name = "transitionLineItemState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderTransitionStateActionImpl.class, name = "transitionState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.order_edit.StagedOrderUpdateSyncInfoActionImpl.class, name = "updateSyncInfo")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action",
   defaultImpl = StagedOrderUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface StagedOrderUpdateAction  {


   


}