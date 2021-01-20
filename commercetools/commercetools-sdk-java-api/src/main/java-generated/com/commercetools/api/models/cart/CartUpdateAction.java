
package com.commercetools.api.models.cart;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
import com.commercetools.api.models.cart.CartSetKeyAction;
import com.commercetools.api.models.cart.CartSetLineItemCustomFieldAction;
import com.commercetools.api.models.cart.CartSetLineItemCustomTypeAction;
import com.commercetools.api.models.cart.CartSetLineItemDistributionChannelAction;
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

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddCustomLineItemActionImpl.class, name = CartAddCustomLineItemAction.ADD_CUSTOM_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddDiscountCodeActionImpl.class, name = CartAddDiscountCodeAction.ADD_DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddItemShippingAddressActionImpl.class, name = CartAddItemShippingAddressAction.ADD_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddLineItemActionImpl.class, name = CartAddLineItemAction.ADD_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddPaymentActionImpl.class, name = CartAddPaymentAction.ADD_PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddShoppingListActionImpl.class, name = CartAddShoppingListAction.ADD_SHOPPING_LIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl.class, name = CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.APPLY_DELTA_TO_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_TARGETS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = CartApplyDeltaToLineItemShippingDetailsTargetsAction.APPLY_DELTA_TO_LINE_ITEM_SHIPPING_DETAILS_TARGETS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyActionImpl.class, name = CartChangeCustomLineItemMoneyAction.CHANGE_CUSTOM_LINE_ITEM_MONEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityActionImpl.class, name = CartChangeCustomLineItemQuantityAction.CHANGE_CUSTOM_LINE_ITEM_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeLineItemQuantityActionImpl.class, name = CartChangeLineItemQuantityAction.CHANGE_LINE_ITEM_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeTaxCalculationModeActionImpl.class, name = CartChangeTaxCalculationModeAction.CHANGE_TAX_CALCULATION_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeTaxModeActionImpl.class, name = CartChangeTaxModeAction.CHANGE_TAX_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeTaxRoundingModeActionImpl.class, name = CartChangeTaxRoundingModeAction.CHANGE_TAX_ROUNDING_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRecalculateActionImpl.class, name = CartRecalculateAction.RECALCULATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveCustomLineItemActionImpl.class, name = CartRemoveCustomLineItemAction.REMOVE_CUSTOM_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveDiscountCodeActionImpl.class, name = CartRemoveDiscountCodeAction.REMOVE_DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveItemShippingAddressActionImpl.class, name = CartRemoveItemShippingAddressAction.REMOVE_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveLineItemActionImpl.class, name = CartRemoveLineItemAction.REMOVE_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemovePaymentActionImpl.class, name = CartRemovePaymentAction.REMOVE_PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetAnonymousIdActionImpl.class, name = CartSetAnonymousIdAction.SET_ANONYMOUS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetBillingAddressActionImpl.class, name = CartSetBillingAddressAction.SET_BILLING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCartTotalTaxActionImpl.class, name = CartSetCartTotalTaxAction.SET_CART_TOTAL_TAX),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCountryActionImpl.class, name = CartSetCountryAction.SET_COUNTRY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomFieldActionImpl.class, name = CartSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldActionImpl.class, name = CartSetCustomLineItemCustomFieldAction.SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeActionImpl.class, name = CartSetCustomLineItemCustomTypeAction.SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsActionImpl.class, name = CartSetCustomLineItemShippingDetailsAction.SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountActionImpl.class, name = CartSetCustomLineItemTaxAmountAction.SET_CUSTOM_LINE_ITEM_TAX_AMOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateActionImpl.class, name = CartSetCustomLineItemTaxRateAction.SET_CUSTOM_LINE_ITEM_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomShippingMethodActionImpl.class, name = CartSetCustomShippingMethodAction.SET_CUSTOM_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomTypeActionImpl.class, name = CartSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomerEmailActionImpl.class, name = CartSetCustomerEmailAction.SET_CUSTOMER_EMAIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomerGroupActionImpl.class, name = CartSetCustomerGroupAction.SET_CUSTOMER_GROUP),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetCustomerIdActionImpl.class, name = CartSetCustomerIdAction.SET_CUSTOMER_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationActionImpl.class, name = CartSetDeleteDaysAfterLastModificationAction.SET_DELETE_DAYS_AFTER_LAST_MODIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetKeyActionImpl.class, name = CartSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemCustomFieldActionImpl.class, name = CartSetLineItemCustomFieldAction.SET_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemCustomTypeActionImpl.class, name = CartSetLineItemCustomTypeAction.SET_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemDistributionChannelActionImpl.class, name = CartSetLineItemDistributionChannelAction.SET_LINE_ITEM_DISTRIBUTION_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemPriceActionImpl.class, name = CartSetLineItemPriceAction.SET_LINE_ITEM_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemShippingDetailsActionImpl.class, name = CartSetLineItemShippingDetailsAction.SET_LINE_ITEM_SHIPPING_DETAILS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemTaxAmountActionImpl.class, name = CartSetLineItemTaxAmountAction.SET_LINE_ITEM_TAX_AMOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemTaxRateActionImpl.class, name = CartSetLineItemTaxRateAction.SET_LINE_ITEM_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemTotalPriceActionImpl.class, name = CartSetLineItemTotalPriceAction.SET_LINE_ITEM_TOTAL_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLocaleActionImpl.class, name = CartSetLocaleAction.SET_LOCALE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingAddressActionImpl.class, name = CartSetShippingAddressAction.SET_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodActionImpl.class, name = CartSetShippingMethodAction.SET_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionImpl.class, name = CartSetShippingMethodTaxAmountAction.SET_SHIPPING_METHOD_TAX_AMOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodTaxRateActionImpl.class, name = CartSetShippingMethodTaxRateAction.SET_SHIPPING_METHOD_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingRateInputActionImpl.class, name = CartSetShippingRateInputAction.SET_SHIPPING_RATE_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartUpdateItemShippingAddressActionImpl.class, name = CartUpdateItemShippingAddressAction.UPDATE_ITEM_SHIPPING_ADDRESS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = CartUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CartUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<CartUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withCartUpdateAction(Function<CartUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
