package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartAddCustomLineItemAction;
import com.commercetools.api.models.cart.CartAddDiscountCodeAction;
import com.commercetools.api.models.cart.CartAddItemShippingAddressAction;
import com.commercetools.api.models.cart.CartAddLineItemAction;
import com.commercetools.api.models.cart.CartAddPaymentAction;
import com.commercetools.api.models.cart.CartAddShoppingListAction;
import com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction;
import com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction;
import com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyAction;
import com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityAction;
import com.commercetools.api.models.cart.CartChangeLineItemQuantityAction;
import com.commercetools.api.models.cart.CartChangeTaxCalculationModeAction;
import com.commercetools.api.models.cart.CartChangeTaxModeAction;
import com.commercetools.api.models.cart.CartChangeTaxRoundingModeAction;
import com.commercetools.api.models.cart.CartRecalculateAction;
import com.commercetools.api.models.cart.CartRemoveCustomLineItemAction;
import com.commercetools.api.models.cart.CartRemoveDiscountCodeAction;
import com.commercetools.api.models.cart.CartRemoveItemShippingAddressAction;
import com.commercetools.api.models.cart.CartRemoveLineItemAction;
import com.commercetools.api.models.cart.CartRemovePaymentAction;
import com.commercetools.api.models.cart.CartSetAnonymousIdAction;
import com.commercetools.api.models.cart.CartSetBillingAddressAction;
import com.commercetools.api.models.cart.CartSetCartTotalTaxAction;
import com.commercetools.api.models.cart.CartSetCountryAction;
import com.commercetools.api.models.cart.CartSetCustomFieldAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountAction;
import com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateAction;
import com.commercetools.api.models.cart.CartSetCustomShippingMethodAction;
import com.commercetools.api.models.cart.CartSetCustomTypeAction;
import com.commercetools.api.models.cart.CartSetCustomerEmailAction;
import com.commercetools.api.models.cart.CartSetCustomerGroupAction;
import com.commercetools.api.models.cart.CartSetCustomerIdAction;
import com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.models.cart.CartSetLineItemCustomFieldAction;
import com.commercetools.api.models.cart.CartSetLineItemCustomTypeAction;
import com.commercetools.api.models.cart.CartSetLineItemPriceAction;
import com.commercetools.api.models.cart.CartSetLineItemShippingDetailsAction;
import com.commercetools.api.models.cart.CartSetLineItemTaxAmountAction;
import com.commercetools.api.models.cart.CartSetLineItemTaxRateAction;
import com.commercetools.api.models.cart.CartSetLineItemTotalPriceAction;
import com.commercetools.api.models.cart.CartSetLocaleAction;
import com.commercetools.api.models.cart.CartSetShippingAddressAction;
import com.commercetools.api.models.cart.CartSetShippingMethodAction;
import com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountAction;
import com.commercetools.api.models.cart.CartSetShippingMethodTaxRateAction;
import com.commercetools.api.models.cart.CartSetShippingRateInputAction;
import com.commercetools.api.models.cart.CartUpdateItemShippingAddressAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddCustomLineItemActionImpl.class, name = "addCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddDiscountCodeActionImpl.class, name = "addDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddItemShippingAddressActionImpl.class, name = "addItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddLineItemActionImpl.class, name = "addLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddPaymentActionImpl.class, name = "addPayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddShoppingListActionImpl.class, name = "addShoppingList"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToCustomLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = "applyDeltaToLineItemShippingDetailsTargets"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyActionImpl.class, name = "changeCustomLineItemMoney"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityActionImpl.class, name = "changeCustomLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeLineItemQuantityActionImpl.class, name = "changeLineItemQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeTaxCalculationModeActionImpl.class, name = "changeTaxCalculationMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeTaxModeActionImpl.class, name = "changeTaxMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeTaxRoundingModeActionImpl.class, name = "changeTaxRoundingMode"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRecalculateActionImpl.class, name = "recalculate"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveCustomLineItemActionImpl.class, name = "removeCustomLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveDiscountCodeActionImpl.class, name = "removeDiscountCode"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveItemShippingAddressActionImpl.class, name = "removeItemShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveLineItemActionImpl.class, name = "removeLineItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemovePaymentActionImpl.class, name = "removePayment"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetAnonymousIdActionImpl.class, name = "setAnonymousId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetBillingAddressActionImpl.class, name = "setBillingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCartTotalTaxActionImpl.class, name = "setCartTotalTax"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCountryActionImpl.class, name = "setCountry"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldActionImpl.class, name = "setCustomLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeActionImpl.class, name = "setCustomLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsActionImpl.class, name = "setCustomLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountActionImpl.class, name = "setCustomLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateActionImpl.class, name = "setCustomLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomShippingMethodActionImpl.class, name = "setCustomShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomerEmailActionImpl.class, name = "setCustomerEmail"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomerGroupActionImpl.class, name = "setCustomerGroup"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomerIdActionImpl.class, name = "setCustomerId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationActionImpl.class, name = "setDeleteDaysAfterLastModification"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemCustomFieldActionImpl.class, name = "setLineItemCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemCustomTypeActionImpl.class, name = "setLineItemCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemPriceActionImpl.class, name = "setLineItemPrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemShippingDetailsActionImpl.class, name = "setLineItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemTaxAmountActionImpl.class, name = "setLineItemTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemTaxRateActionImpl.class, name = "setLineItemTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemTotalPriceActionImpl.class, name = "setLineItemTotalPrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLocaleActionImpl.class, name = "setLocale"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingAddressActionImpl.class, name = "setShippingAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodActionImpl.class, name = "setShippingMethod"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionImpl.class, name = "setShippingMethodTaxAmount"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodTaxRateActionImpl.class, name = "setShippingMethodTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingRateInputActionImpl.class, name = "setShippingRateInput"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartUpdateItemShippingAddressActionImpl.class, name = "updateItemShippingAddress")
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
