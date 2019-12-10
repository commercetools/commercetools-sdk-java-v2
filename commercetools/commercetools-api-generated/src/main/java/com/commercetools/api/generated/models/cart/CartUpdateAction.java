package com.commercetools.api.generated.models.cart;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartAddCustomLineItemActionImpl.class, name = "addCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartAddDiscountCodeActionImpl.class, name = "addDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartAddShoppingListActionImpl.class, name = "addShoppingList"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToCustomLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartChangeCustomLineItemMoneyActionImpl.class, name = "changeCustomLineItemMoney"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartChangeCustomLineItemQuantityActionImpl.class, name = "changeCustomLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartChangeTaxCalculationModeActionImpl.class, name = "changeTaxCalculationMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartChangeTaxModeActionImpl.class, name = "changeTaxMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartChangeTaxRoundingModeActionImpl.class, name = "changeTaxRoundingMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartRecalculateActionImpl.class, name = "recalculate"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartRemoveCustomLineItemActionImpl.class, name = "removeCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartRemoveDiscountCodeActionImpl.class, name = "removeDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetAnonymousIdActionImpl.class, name = "setAnonymousId"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCartTotalTaxActionImpl.class, name = "setCartTotalTax"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCountryActionImpl.class, name = "setCountry"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCustomLineItemCustomFieldActionImpl.class, name = "setCustomLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCustomLineItemCustomTypeActionImpl.class, name = "setCustomLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCustomLineItemShippingDetailsActionImpl.class, name = "setCustomLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCustomLineItemTaxAmountActionImpl.class, name = "setCustomLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCustomLineItemTaxRateActionImpl.class, name = "setCustomLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCustomShippingMethodActionImpl.class, name = "setCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCustomerEmailActionImpl.class, name = "setCustomerEmail"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCustomerGroupActionImpl.class, name = "setCustomerGroup"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetCustomerIdActionImpl.class, name = "setCustomerId"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetLineItemPriceActionImpl.class, name = "setLineItemPrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetLineItemTaxAmountActionImpl.class, name = "setLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetLineItemTaxRateActionImpl.class, name = "setLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetLineItemTotalPriceActionImpl.class, name = "setLineItemTotalPrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetShippingMethodActionImpl.class, name = "setShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetShippingMethodTaxAmountActionImpl.class, name = "setShippingMethodTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetShippingMethodTaxRateActionImpl.class, name = "setShippingMethodTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartSetShippingRateInputActionImpl.class, name = "setShippingRateInput"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.cart.CartUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action",
   defaultImpl = CartUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CartUpdateAction  {


   


}