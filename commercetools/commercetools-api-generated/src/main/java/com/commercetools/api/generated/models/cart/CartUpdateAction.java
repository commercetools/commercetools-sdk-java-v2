package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartAddCustomLineItemAction;
import com.commercetools.api.generated.models.cart.CartAddDiscountCodeAction;
import com.commercetools.api.generated.models.cart.CartAddItemShippingAddressAction;
import com.commercetools.api.generated.models.cart.CartAddLineItemAction;
import com.commercetools.api.generated.models.cart.CartAddPaymentAction;
import com.commercetools.api.generated.models.cart.CartAddShoppingListAction;
import com.commercetools.api.generated.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction;
import com.commercetools.api.generated.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction;
import com.commercetools.api.generated.models.cart.CartChangeCustomLineItemMoneyAction;
import com.commercetools.api.generated.models.cart.CartChangeCustomLineItemQuantityAction;
import com.commercetools.api.generated.models.cart.CartChangeLineItemQuantityAction;
import com.commercetools.api.generated.models.cart.CartChangeTaxCalculationModeAction;
import com.commercetools.api.generated.models.cart.CartChangeTaxModeAction;
import com.commercetools.api.generated.models.cart.CartChangeTaxRoundingModeAction;
import com.commercetools.api.generated.models.cart.CartRecalculateAction;
import com.commercetools.api.generated.models.cart.CartRemoveCustomLineItemAction;
import com.commercetools.api.generated.models.cart.CartRemoveDiscountCodeAction;
import com.commercetools.api.generated.models.cart.CartRemoveItemShippingAddressAction;
import com.commercetools.api.generated.models.cart.CartRemoveLineItemAction;
import com.commercetools.api.generated.models.cart.CartRemovePaymentAction;
import com.commercetools.api.generated.models.cart.CartSetAnonymousIdAction;
import com.commercetools.api.generated.models.cart.CartSetBillingAddressAction;
import com.commercetools.api.generated.models.cart.CartSetCartTotalTaxAction;
import com.commercetools.api.generated.models.cart.CartSetCountryAction;
import com.commercetools.api.generated.models.cart.CartSetCustomFieldAction;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemCustomFieldAction;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemCustomTypeAction;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemTaxAmountAction;
import com.commercetools.api.generated.models.cart.CartSetCustomLineItemTaxRateAction;
import com.commercetools.api.generated.models.cart.CartSetCustomShippingMethodAction;
import com.commercetools.api.generated.models.cart.CartSetCustomTypeAction;
import com.commercetools.api.generated.models.cart.CartSetCustomerEmailAction;
import com.commercetools.api.generated.models.cart.CartSetCustomerGroupAction;
import com.commercetools.api.generated.models.cart.CartSetCustomerIdAction;
import com.commercetools.api.generated.models.cart.CartSetDeleteDaysAfterLastModificationAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemCustomFieldAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemCustomTypeAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemPriceAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemShippingDetailsAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemTaxAmountAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemTaxRateAction;
import com.commercetools.api.generated.models.cart.CartSetLineItemTotalPriceAction;
import com.commercetools.api.generated.models.cart.CartSetLocaleAction;
import com.commercetools.api.generated.models.cart.CartSetShippingAddressAction;
import com.commercetools.api.generated.models.cart.CartSetShippingMethodAction;
import com.commercetools.api.generated.models.cart.CartSetShippingMethodTaxAmountAction;
import com.commercetools.api.generated.models.cart.CartSetShippingMethodTaxRateAction;
import com.commercetools.api.generated.models.cart.CartSetShippingRateInputAction;
import com.commercetools.api.generated.models.cart.CartUpdateItemShippingAddressAction;


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
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CartUpdateAction  {


   


}