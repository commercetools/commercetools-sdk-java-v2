package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartAddCustomLineItemAction;
import com.commercetools.models.Cart.CartAddDiscountCodeAction;
import com.commercetools.models.Cart.CartAddItemShippingAddressAction;
import com.commercetools.models.Cart.CartAddLineItemAction;
import com.commercetools.models.Cart.CartAddPaymentAction;
import com.commercetools.models.Cart.CartAddShoppingListAction;
import com.commercetools.models.Cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction;
import com.commercetools.models.Cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction;
import com.commercetools.models.Cart.CartChangeCustomLineItemMoneyAction;
import com.commercetools.models.Cart.CartChangeCustomLineItemQuantityAction;
import com.commercetools.models.Cart.CartChangeLineItemQuantityAction;
import com.commercetools.models.Cart.CartChangeTaxCalculationModeAction;
import com.commercetools.models.Cart.CartChangeTaxModeAction;
import com.commercetools.models.Cart.CartChangeTaxRoundingModeAction;
import com.commercetools.models.Cart.CartRecalculateAction;
import com.commercetools.models.Cart.CartRemoveCustomLineItemAction;
import com.commercetools.models.Cart.CartRemoveDiscountCodeAction;
import com.commercetools.models.Cart.CartRemoveItemShippingAddressAction;
import com.commercetools.models.Cart.CartRemoveLineItemAction;
import com.commercetools.models.Cart.CartRemovePaymentAction;
import com.commercetools.models.Cart.CartSetAnonymousIdAction;
import com.commercetools.models.Cart.CartSetBillingAddressAction;
import com.commercetools.models.Cart.CartSetCartTotalTaxAction;
import com.commercetools.models.Cart.CartSetCountryAction;
import com.commercetools.models.Cart.CartSetCustomFieldAction;
import com.commercetools.models.Cart.CartSetCustomLineItemCustomFieldAction;
import com.commercetools.models.Cart.CartSetCustomLineItemCustomTypeAction;
import com.commercetools.models.Cart.CartSetCustomLineItemShippingDetailsAction;
import com.commercetools.models.Cart.CartSetCustomLineItemTaxAmountAction;
import com.commercetools.models.Cart.CartSetCustomLineItemTaxRateAction;
import com.commercetools.models.Cart.CartSetCustomShippingMethodAction;
import com.commercetools.models.Cart.CartSetCustomTypeAction;
import com.commercetools.models.Cart.CartSetCustomerEmailAction;
import com.commercetools.models.Cart.CartSetCustomerGroupAction;
import com.commercetools.models.Cart.CartSetCustomerIdAction;
import com.commercetools.models.Cart.CartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.models.Cart.CartSetLineItemCustomFieldAction;
import com.commercetools.models.Cart.CartSetLineItemCustomTypeAction;
import com.commercetools.models.Cart.CartSetLineItemPriceAction;
import com.commercetools.models.Cart.CartSetLineItemShippingDetailsAction;
import com.commercetools.models.Cart.CartSetLineItemTaxAmountAction;
import com.commercetools.models.Cart.CartSetLineItemTaxRateAction;
import com.commercetools.models.Cart.CartSetLineItemTotalPriceAction;
import com.commercetools.models.Cart.CartSetLocaleAction;
import com.commercetools.models.Cart.CartSetShippingAddressAction;
import com.commercetools.models.Cart.CartSetShippingMethodAction;
import com.commercetools.models.Cart.CartSetShippingMethodTaxAmountAction;
import com.commercetools.models.Cart.CartSetShippingMethodTaxRateAction;
import com.commercetools.models.Cart.CartSetShippingRateInputAction;
import com.commercetools.models.Cart.CartUpdateItemShippingAddressAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartAddCustomLineItemActionImpl.class, name = "addCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartAddDiscountCodeActionImpl.class, name = "addDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartAddShoppingListActionImpl.class, name = "addShoppingList"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToCustomLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartChangeCustomLineItemMoneyActionImpl.class, name = "changeCustomLineItemMoney"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartChangeCustomLineItemQuantityActionImpl.class, name = "changeCustomLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartChangeTaxCalculationModeActionImpl.class, name = "changeTaxCalculationMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartChangeTaxModeActionImpl.class, name = "changeTaxMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartChangeTaxRoundingModeActionImpl.class, name = "changeTaxRoundingMode"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartRecalculateActionImpl.class, name = "recalculate"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartRemoveCustomLineItemActionImpl.class, name = "removeCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartRemoveDiscountCodeActionImpl.class, name = "removeDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetAnonymousIdActionImpl.class, name = "setAnonymousId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCartTotalTaxActionImpl.class, name = "setCartTotalTax"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCountryActionImpl.class, name = "setCountry"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCustomLineItemCustomFieldActionImpl.class, name = "setCustomLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCustomLineItemCustomTypeActionImpl.class, name = "setCustomLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCustomLineItemShippingDetailsActionImpl.class, name = "setCustomLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCustomLineItemTaxAmountActionImpl.class, name = "setCustomLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCustomLineItemTaxRateActionImpl.class, name = "setCustomLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCustomShippingMethodActionImpl.class, name = "setCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCustomerEmailActionImpl.class, name = "setCustomerEmail"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCustomerGroupActionImpl.class, name = "setCustomerGroup"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetCustomerIdActionImpl.class, name = "setCustomerId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetLineItemPriceActionImpl.class, name = "setLineItemPrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetLineItemTaxAmountActionImpl.class, name = "setLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetLineItemTaxRateActionImpl.class, name = "setLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetLineItemTotalPriceActionImpl.class, name = "setLineItemTotalPrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetShippingMethodActionImpl.class, name = "setShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetShippingMethodTaxAmountActionImpl.class, name = "setShippingMethodTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetShippingMethodTaxRateActionImpl.class, name = "setShippingMethodTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartSetShippingRateInputActionImpl.class, name = "setShippingRateInput"),
   @JsonSubTypes.Type(value = com.commercetools.models.Cart.CartUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress")
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