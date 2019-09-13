package com.commercetools.models.cart;

import com.commercetools.models.cart.CartAddCustomLineItemAction;
import com.commercetools.models.cart.CartAddDiscountCodeAction;
import com.commercetools.models.cart.CartAddItemShippingAddressAction;
import com.commercetools.models.cart.CartAddLineItemAction;
import com.commercetools.models.cart.CartAddPaymentAction;
import com.commercetools.models.cart.CartAddShoppingListAction;
import com.commercetools.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction;
import com.commercetools.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction;
import com.commercetools.models.cart.CartChangeCustomLineItemMoneyAction;
import com.commercetools.models.cart.CartChangeCustomLineItemQuantityAction;
import com.commercetools.models.cart.CartChangeLineItemQuantityAction;
import com.commercetools.models.cart.CartChangeTaxCalculationModeAction;
import com.commercetools.models.cart.CartChangeTaxModeAction;
import com.commercetools.models.cart.CartChangeTaxRoundingModeAction;
import com.commercetools.models.cart.CartRecalculateAction;
import com.commercetools.models.cart.CartRemoveCustomLineItemAction;
import com.commercetools.models.cart.CartRemoveDiscountCodeAction;
import com.commercetools.models.cart.CartRemoveItemShippingAddressAction;
import com.commercetools.models.cart.CartRemoveLineItemAction;
import com.commercetools.models.cart.CartRemovePaymentAction;
import com.commercetools.models.cart.CartSetAnonymousIdAction;
import com.commercetools.models.cart.CartSetBillingAddressAction;
import com.commercetools.models.cart.CartSetCartTotalTaxAction;
import com.commercetools.models.cart.CartSetCountryAction;
import com.commercetools.models.cart.CartSetCustomFieldAction;
import com.commercetools.models.cart.CartSetCustomLineItemCustomFieldAction;
import com.commercetools.models.cart.CartSetCustomLineItemCustomTypeAction;
import com.commercetools.models.cart.CartSetCustomLineItemShippingDetailsAction;
import com.commercetools.models.cart.CartSetCustomLineItemTaxAmountAction;
import com.commercetools.models.cart.CartSetCustomLineItemTaxRateAction;
import com.commercetools.models.cart.CartSetCustomShippingMethodAction;
import com.commercetools.models.cart.CartSetCustomTypeAction;
import com.commercetools.models.cart.CartSetCustomerEmailAction;
import com.commercetools.models.cart.CartSetCustomerGroupAction;
import com.commercetools.models.cart.CartSetCustomerIdAction;
import com.commercetools.models.cart.CartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.models.cart.CartSetLineItemCustomFieldAction;
import com.commercetools.models.cart.CartSetLineItemCustomTypeAction;
import com.commercetools.models.cart.CartSetLineItemPriceAction;
import com.commercetools.models.cart.CartSetLineItemShippingDetailsAction;
import com.commercetools.models.cart.CartSetLineItemTaxAmountAction;
import com.commercetools.models.cart.CartSetLineItemTaxRateAction;
import com.commercetools.models.cart.CartSetLineItemTotalPriceAction;
import com.commercetools.models.cart.CartSetLocaleAction;
import com.commercetools.models.cart.CartSetShippingAddressAction;
import com.commercetools.models.cart.CartSetShippingMethodAction;
import com.commercetools.models.cart.CartSetShippingMethodTaxAmountAction;
import com.commercetools.models.cart.CartSetShippingMethodTaxRateAction;
import com.commercetools.models.cart.CartSetShippingRateInputAction;
import com.commercetools.models.cart.CartUpdateItemShippingAddressAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartAddCustomLineItemActionImpl.class, name = "addCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartAddDiscountCodeActionImpl.class, name = "addDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartAddShoppingListActionImpl.class, name = "addShoppingList"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToCustomLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartChangeCustomLineItemMoneyActionImpl.class, name = "changeCustomLineItemMoney"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartChangeCustomLineItemQuantityActionImpl.class, name = "changeCustomLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartChangeTaxCalculationModeActionImpl.class, name = "changeTaxCalculationMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartChangeTaxModeActionImpl.class, name = "changeTaxMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartChangeTaxRoundingModeActionImpl.class, name = "changeTaxRoundingMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartRecalculateActionImpl.class, name = "recalculate"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartRemoveCustomLineItemActionImpl.class, name = "removeCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartRemoveDiscountCodeActionImpl.class, name = "removeDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetAnonymousIdActionImpl.class, name = "setAnonymousId"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCartTotalTaxActionImpl.class, name = "setCartTotalTax"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCountryActionImpl.class, name = "setCountry"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCustomLineItemCustomFieldActionImpl.class, name = "setCustomLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCustomLineItemCustomTypeActionImpl.class, name = "setCustomLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCustomLineItemShippingDetailsActionImpl.class, name = "setCustomLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCustomLineItemTaxAmountActionImpl.class, name = "setCustomLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCustomLineItemTaxRateActionImpl.class, name = "setCustomLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCustomShippingMethodActionImpl.class, name = "setCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCustomerEmailActionImpl.class, name = "setCustomerEmail"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCustomerGroupActionImpl.class, name = "setCustomerGroup"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetCustomerIdActionImpl.class, name = "setCustomerId"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetLineItemPriceActionImpl.class, name = "setLineItemPrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetLineItemTaxAmountActionImpl.class, name = "setLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetLineItemTaxRateActionImpl.class, name = "setLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetLineItemTotalPriceActionImpl.class, name = "setLineItemTotalPrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetShippingMethodActionImpl.class, name = "setShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetShippingMethodTaxAmountActionImpl.class, name = "setShippingMethodTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetShippingMethodTaxRateActionImpl.class, name = "setShippingMethodTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartSetShippingRateInputActionImpl.class, name = "setShippingRateInput"),
   @JsonSubTypes.Type(value = com.commercetools.models.cart.CartUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress")
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
public interface CartUpdateAction  {


   


}