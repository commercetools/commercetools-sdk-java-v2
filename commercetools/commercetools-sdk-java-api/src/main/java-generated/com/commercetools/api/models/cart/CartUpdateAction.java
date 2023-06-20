
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUpdateAction cartUpdateAction = CartUpdateAction.addCustomLineItemBuilder()
 *             money(moneyBuilder -> moneyBuilder)
 *             name(nameBuilder -> nameBuilder)
 *             slug("{slug}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddCustomLineItemActionImpl.class, name = CartAddCustomLineItemAction.ADD_CUSTOM_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddCustomShippingMethodActionImpl.class, name = CartAddCustomShippingMethodAction.ADD_CUSTOM_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddDiscountCodeActionImpl.class, name = CartAddDiscountCodeAction.ADD_DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddItemShippingAddressActionImpl.class, name = CartAddItemShippingAddressAction.ADD_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddLineItemActionImpl.class, name = CartAddLineItemAction.ADD_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddPaymentActionImpl.class, name = CartAddPaymentAction.ADD_PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddShippingMethodActionImpl.class, name = CartAddShippingMethodAction.ADD_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartAddShoppingListActionImpl.class, name = CartAddShoppingListAction.ADD_SHOPPING_LIST),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl.class, name = CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.APPLY_DELTA_TO_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_TARGETS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = CartApplyDeltaToLineItemShippingDetailsTargetsAction.APPLY_DELTA_TO_LINE_ITEM_SHIPPING_DETAILS_TARGETS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyActionImpl.class, name = CartChangeCustomLineItemMoneyAction.CHANGE_CUSTOM_LINE_ITEM_MONEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeCustomLineItemPriceModeActionImpl.class, name = CartChangeCustomLineItemPriceModeAction.CHANGE_CUSTOM_LINE_ITEM_PRICE_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityActionImpl.class, name = CartChangeCustomLineItemQuantityAction.CHANGE_CUSTOM_LINE_ITEM_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeLineItemQuantityActionImpl.class, name = CartChangeLineItemQuantityAction.CHANGE_LINE_ITEM_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeTaxCalculationModeActionImpl.class, name = CartChangeTaxCalculationModeAction.CHANGE_TAX_CALCULATION_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeTaxModeActionImpl.class, name = CartChangeTaxModeAction.CHANGE_TAX_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartChangeTaxRoundingModeActionImpl.class, name = CartChangeTaxRoundingModeAction.CHANGE_TAX_ROUNDING_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartFreezeCartActionImpl.class, name = CartFreezeCartAction.FREEZE_CART),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRecalculateActionImpl.class, name = CartRecalculateAction.RECALCULATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveCustomLineItemActionImpl.class, name = CartRemoveCustomLineItemAction.REMOVE_CUSTOM_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveDiscountCodeActionImpl.class, name = CartRemoveDiscountCodeAction.REMOVE_DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveItemShippingAddressActionImpl.class, name = CartRemoveItemShippingAddressAction.REMOVE_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveLineItemActionImpl.class, name = CartRemoveLineItemAction.REMOVE_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemovePaymentActionImpl.class, name = CartRemovePaymentAction.REMOVE_PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartRemoveShippingMethodActionImpl.class, name = CartRemoveShippingMethodAction.REMOVE_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetAnonymousIdActionImpl.class, name = CartSetAnonymousIdAction.SET_ANONYMOUS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetBillingAddressActionImpl.class, name = CartSetBillingAddressAction.SET_BILLING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldActionImpl.class, name = CartSetBillingAddressCustomFieldAction.SET_BILLING_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeActionImpl.class, name = CartSetBillingAddressCustomTypeAction.SET_BILLING_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetBusinessUnitActionImpl.class, name = CartSetBusinessUnitAction.SET_BUSINESS_UNIT),
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldActionImpl.class, name = CartSetDeliveryAddressCustomFieldAction.SET_DELIVERY_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeActionImpl.class, name = CartSetDeliveryAddressCustomTypeAction.SET_DELIVERY_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetDirectDiscountsActionImpl.class, name = CartSetDirectDiscountsAction.SET_DIRECT_DISCOUNTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldActionImpl.class, name = CartSetItemShippingAddressCustomFieldAction.SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeActionImpl.class, name = CartSetItemShippingAddressCustomTypeAction.SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetKeyActionImpl.class, name = CartSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemCustomFieldActionImpl.class, name = CartSetLineItemCustomFieldAction.SET_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemCustomTypeActionImpl.class, name = CartSetLineItemCustomTypeAction.SET_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemDistributionChannelActionImpl.class, name = CartSetLineItemDistributionChannelAction.SET_LINE_ITEM_DISTRIBUTION_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemInventoryModeActionImpl.class, name = CartSetLineItemInventoryModeAction.SET_LINE_ITEM_INVENTORY_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemPriceActionImpl.class, name = CartSetLineItemPriceAction.SET_LINE_ITEM_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemShippingDetailsActionImpl.class, name = CartSetLineItemShippingDetailsAction.SET_LINE_ITEM_SHIPPING_DETAILS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemSupplyChannelActionImpl.class, name = CartSetLineItemSupplyChannelAction.SET_LINE_ITEM_SUPPLY_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemTaxAmountActionImpl.class, name = CartSetLineItemTaxAmountAction.SET_LINE_ITEM_TAX_AMOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemTaxRateActionImpl.class, name = CartSetLineItemTaxRateAction.SET_LINE_ITEM_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLineItemTotalPriceActionImpl.class, name = CartSetLineItemTotalPriceAction.SET_LINE_ITEM_TOTAL_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetLocaleActionImpl.class, name = CartSetLocaleAction.SET_LOCALE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingAddressActionImpl.class, name = CartSetShippingAddressAction.SET_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldActionImpl.class, name = CartSetShippingAddressCustomFieldAction.SET_SHIPPING_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeActionImpl.class, name = CartSetShippingAddressCustomTypeAction.SET_SHIPPING_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingCustomFieldActionImpl.class, name = CartSetShippingCustomFieldAction.SET_SHIPPING_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingCustomTypeActionImpl.class, name = CartSetShippingCustomTypeAction.SET_SHIPPING_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodActionImpl.class, name = CartSetShippingMethodAction.SET_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionImpl.class, name = CartSetShippingMethodTaxAmountAction.SET_SHIPPING_METHOD_TAX_AMOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodTaxRateActionImpl.class, name = CartSetShippingMethodTaxRateAction.SET_SHIPPING_METHOD_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingRateInputActionImpl.class, name = CartSetShippingRateInputAction.SET_SHIPPING_RATE_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartUnfreezeCartActionImpl.class, name = CartUnfreezeCartAction.UNFREEZE_CART),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartUpdateItemShippingAddressActionImpl.class, name = CartUpdateItemShippingAddressAction.UPDATE_ITEM_SHIPPING_ADDRESS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = CartUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = CartUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<CartUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of CartUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartUpdateAction deepCopy(@Nullable final CartUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.cart.CartAddCustomLineItemAction) {
            return com.commercetools.api.models.cart.CartAddCustomLineItemAction
                    .deepCopy((com.commercetools.api.models.cart.CartAddCustomLineItemAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartAddCustomShippingMethodAction) {
            return com.commercetools.api.models.cart.CartAddCustomShippingMethodAction
                    .deepCopy((com.commercetools.api.models.cart.CartAddCustomShippingMethodAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartAddDiscountCodeAction) {
            return com.commercetools.api.models.cart.CartAddDiscountCodeAction
                    .deepCopy((com.commercetools.api.models.cart.CartAddDiscountCodeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartAddItemShippingAddressAction) {
            return com.commercetools.api.models.cart.CartAddItemShippingAddressAction
                    .deepCopy((com.commercetools.api.models.cart.CartAddItemShippingAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartAddLineItemAction) {
            return com.commercetools.api.models.cart.CartAddLineItemAction
                    .deepCopy((com.commercetools.api.models.cart.CartAddLineItemAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartAddPaymentAction) {
            return com.commercetools.api.models.cart.CartAddPaymentAction
                    .deepCopy((com.commercetools.api.models.cart.CartAddPaymentAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartAddShippingMethodAction) {
            return com.commercetools.api.models.cart.CartAddShippingMethodAction
                    .deepCopy((com.commercetools.api.models.cart.CartAddShippingMethodAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartAddShoppingListAction) {
            return com.commercetools.api.models.cart.CartAddShoppingListAction
                    .deepCopy((com.commercetools.api.models.cart.CartAddShoppingListAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction) {
            return com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
                    .deepCopy(
                        (com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction) {
            return com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction.deepCopy(
                (com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyAction) {
            return com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyAction
                    .deepCopy((com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartChangeCustomLineItemPriceModeAction) {
            return com.commercetools.api.models.cart.CartChangeCustomLineItemPriceModeAction
                    .deepCopy((com.commercetools.api.models.cart.CartChangeCustomLineItemPriceModeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityAction) {
            return com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityAction
                    .deepCopy((com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartChangeLineItemQuantityAction) {
            return com.commercetools.api.models.cart.CartChangeLineItemQuantityAction
                    .deepCopy((com.commercetools.api.models.cart.CartChangeLineItemQuantityAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartChangeTaxCalculationModeAction) {
            return com.commercetools.api.models.cart.CartChangeTaxCalculationModeAction
                    .deepCopy((com.commercetools.api.models.cart.CartChangeTaxCalculationModeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartChangeTaxModeAction) {
            return com.commercetools.api.models.cart.CartChangeTaxModeAction
                    .deepCopy((com.commercetools.api.models.cart.CartChangeTaxModeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartChangeTaxRoundingModeAction) {
            return com.commercetools.api.models.cart.CartChangeTaxRoundingModeAction
                    .deepCopy((com.commercetools.api.models.cart.CartChangeTaxRoundingModeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartFreezeCartAction) {
            return com.commercetools.api.models.cart.CartFreezeCartAction
                    .deepCopy((com.commercetools.api.models.cart.CartFreezeCartAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartRecalculateAction) {
            return com.commercetools.api.models.cart.CartRecalculateAction
                    .deepCopy((com.commercetools.api.models.cart.CartRecalculateAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartRemoveCustomLineItemAction) {
            return com.commercetools.api.models.cart.CartRemoveCustomLineItemAction
                    .deepCopy((com.commercetools.api.models.cart.CartRemoveCustomLineItemAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartRemoveDiscountCodeAction) {
            return com.commercetools.api.models.cart.CartRemoveDiscountCodeAction
                    .deepCopy((com.commercetools.api.models.cart.CartRemoveDiscountCodeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartRemoveItemShippingAddressAction) {
            return com.commercetools.api.models.cart.CartRemoveItemShippingAddressAction
                    .deepCopy((com.commercetools.api.models.cart.CartRemoveItemShippingAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartRemoveLineItemAction) {
            return com.commercetools.api.models.cart.CartRemoveLineItemAction
                    .deepCopy((com.commercetools.api.models.cart.CartRemoveLineItemAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartRemovePaymentAction) {
            return com.commercetools.api.models.cart.CartRemovePaymentAction
                    .deepCopy((com.commercetools.api.models.cart.CartRemovePaymentAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartRemoveShippingMethodAction) {
            return com.commercetools.api.models.cart.CartRemoveShippingMethodAction
                    .deepCopy((com.commercetools.api.models.cart.CartRemoveShippingMethodAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetAnonymousIdAction) {
            return com.commercetools.api.models.cart.CartSetAnonymousIdAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetAnonymousIdAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetBillingAddressAction) {
            return com.commercetools.api.models.cart.CartSetBillingAddressAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetBillingAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldAction) {
            return com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeAction) {
            return com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetBusinessUnitAction) {
            return com.commercetools.api.models.cart.CartSetBusinessUnitAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetBusinessUnitAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCartTotalTaxAction) {
            return com.commercetools.api.models.cart.CartSetCartTotalTaxAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCartTotalTaxAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCountryAction) {
            return com.commercetools.api.models.cart.CartSetCountryAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCountryAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCustomFieldAction) {
            return com.commercetools.api.models.cart.CartSetCustomFieldAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldAction) {
            return com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeAction) {
            return com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsAction) {
            return com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountAction) {
            return com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateAction) {
            return com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCustomShippingMethodAction) {
            return com.commercetools.api.models.cart.CartSetCustomShippingMethodAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCustomShippingMethodAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCustomTypeAction) {
            return com.commercetools.api.models.cart.CartSetCustomTypeAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCustomerEmailAction) {
            return com.commercetools.api.models.cart.CartSetCustomerEmailAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCustomerEmailAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCustomerGroupAction) {
            return com.commercetools.api.models.cart.CartSetCustomerGroupAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCustomerGroupAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetCustomerIdAction) {
            return com.commercetools.api.models.cart.CartSetCustomerIdAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetCustomerIdAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationAction) {
            return com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationAction.deepCopy(
                (com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldAction) {
            return com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeAction) {
            return com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetDirectDiscountsAction) {
            return com.commercetools.api.models.cart.CartSetDirectDiscountsAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetDirectDiscountsAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldAction) {
            return com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeAction) {
            return com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetKeyAction) {
            return com.commercetools.api.models.cart.CartSetKeyAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetLineItemCustomFieldAction) {
            return com.commercetools.api.models.cart.CartSetLineItemCustomFieldAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetLineItemCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetLineItemCustomTypeAction) {
            return com.commercetools.api.models.cart.CartSetLineItemCustomTypeAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetLineItemCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetLineItemDistributionChannelAction) {
            return com.commercetools.api.models.cart.CartSetLineItemDistributionChannelAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetLineItemDistributionChannelAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetLineItemInventoryModeAction) {
            return com.commercetools.api.models.cart.CartSetLineItemInventoryModeAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetLineItemInventoryModeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetLineItemPriceAction) {
            return com.commercetools.api.models.cart.CartSetLineItemPriceAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetLineItemPriceAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetLineItemShippingDetailsAction) {
            return com.commercetools.api.models.cart.CartSetLineItemShippingDetailsAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetLineItemShippingDetailsAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetLineItemSupplyChannelAction) {
            return com.commercetools.api.models.cart.CartSetLineItemSupplyChannelAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetLineItemSupplyChannelAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetLineItemTaxAmountAction) {
            return com.commercetools.api.models.cart.CartSetLineItemTaxAmountAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetLineItemTaxAmountAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetLineItemTaxRateAction) {
            return com.commercetools.api.models.cart.CartSetLineItemTaxRateAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetLineItemTaxRateAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetLineItemTotalPriceAction) {
            return com.commercetools.api.models.cart.CartSetLineItemTotalPriceAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetLineItemTotalPriceAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetLocaleAction) {
            return com.commercetools.api.models.cart.CartSetLocaleAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetLocaleAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetShippingAddressAction) {
            return com.commercetools.api.models.cart.CartSetShippingAddressAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetShippingAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldAction) {
            return com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeAction) {
            return com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetShippingCustomFieldAction) {
            return com.commercetools.api.models.cart.CartSetShippingCustomFieldAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetShippingCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetShippingCustomTypeAction) {
            return com.commercetools.api.models.cart.CartSetShippingCustomTypeAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetShippingCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetShippingMethodAction) {
            return com.commercetools.api.models.cart.CartSetShippingMethodAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetShippingMethodAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountAction) {
            return com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetShippingMethodTaxRateAction) {
            return com.commercetools.api.models.cart.CartSetShippingMethodTaxRateAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetShippingMethodTaxRateAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartSetShippingRateInputAction) {
            return com.commercetools.api.models.cart.CartSetShippingRateInputAction
                    .deepCopy((com.commercetools.api.models.cart.CartSetShippingRateInputAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartUnfreezeCartAction) {
            return com.commercetools.api.models.cart.CartUnfreezeCartAction
                    .deepCopy((com.commercetools.api.models.cart.CartUnfreezeCartAction) template);
        }
        if (template instanceof com.commercetools.api.models.cart.CartUpdateItemShippingAddressAction) {
            return com.commercetools.api.models.cart.CartUpdateItemShippingAddressAction
                    .deepCopy((com.commercetools.api.models.cart.CartUpdateItemShippingAddressAction) template);
        }
        CartUpdateActionImpl instance = new CartUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addCustomLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartAddCustomLineItemActionBuilder addCustomLineItemBuilder() {
        return com.commercetools.api.models.cart.CartAddCustomLineItemActionBuilder.of();
    }

    /**
     * builder for addCustomShippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartAddCustomShippingMethodActionBuilder addCustomShippingMethodBuilder() {
        return com.commercetools.api.models.cart.CartAddCustomShippingMethodActionBuilder.of();
    }

    /**
     * builder for addDiscountCode subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartAddDiscountCodeActionBuilder addDiscountCodeBuilder() {
        return com.commercetools.api.models.cart.CartAddDiscountCodeActionBuilder.of();
    }

    /**
     * builder for addItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
        return com.commercetools.api.models.cart.CartAddItemShippingAddressActionBuilder.of();
    }

    /**
     * builder for addLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartAddLineItemActionBuilder addLineItemBuilder() {
        return com.commercetools.api.models.cart.CartAddLineItemActionBuilder.of();
    }

    /**
     * builder for addPayment subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartAddPaymentActionBuilder addPaymentBuilder() {
        return com.commercetools.api.models.cart.CartAddPaymentActionBuilder.of();
    }

    /**
     * builder for addShippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartAddShippingMethodActionBuilder addShippingMethodBuilder() {
        return com.commercetools.api.models.cart.CartAddShippingMethodActionBuilder.of();
    }

    /**
     * builder for addShoppingList subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartAddShoppingListActionBuilder addShoppingListBuilder() {
        return com.commercetools.api.models.cart.CartAddShoppingListActionBuilder.of();
    }

    /**
     * builder for applyDeltaToCustomLineItemShippingDetailsTargets subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder applyDeltaToCustomLineItemShippingDetailsTargetsBuilder() {
        return com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder.of();
    }

    /**
     * builder for applyDeltaToLineItemShippingDetailsTargets subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder applyDeltaToLineItemShippingDetailsTargetsBuilder() {
        return com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of();
    }

    /**
     * builder for changeCustomLineItemMoney subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyActionBuilder changeCustomLineItemMoneyBuilder() {
        return com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyActionBuilder.of();
    }

    /**
     * builder for changeCustomLineItemPriceMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartChangeCustomLineItemPriceModeActionBuilder changeCustomLineItemPriceModeBuilder() {
        return com.commercetools.api.models.cart.CartChangeCustomLineItemPriceModeActionBuilder.of();
    }

    /**
     * builder for changeCustomLineItemQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityActionBuilder changeCustomLineItemQuantityBuilder() {
        return com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityActionBuilder.of();
    }

    /**
     * builder for changeLineItemQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
        return com.commercetools.api.models.cart.CartChangeLineItemQuantityActionBuilder.of();
    }

    /**
     * builder for changeTaxCalculationMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartChangeTaxCalculationModeActionBuilder changeTaxCalculationModeBuilder() {
        return com.commercetools.api.models.cart.CartChangeTaxCalculationModeActionBuilder.of();
    }

    /**
     * builder for changeTaxMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartChangeTaxModeActionBuilder changeTaxModeBuilder() {
        return com.commercetools.api.models.cart.CartChangeTaxModeActionBuilder.of();
    }

    /**
     * builder for changeTaxRoundingMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartChangeTaxRoundingModeActionBuilder changeTaxRoundingModeBuilder() {
        return com.commercetools.api.models.cart.CartChangeTaxRoundingModeActionBuilder.of();
    }

    /**
     * builder for freezeCart subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartFreezeCartActionBuilder freezeCartBuilder() {
        return com.commercetools.api.models.cart.CartFreezeCartActionBuilder.of();
    }

    /**
     * builder for recalculate subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartRecalculateActionBuilder recalculateBuilder() {
        return com.commercetools.api.models.cart.CartRecalculateActionBuilder.of();
    }

    /**
     * builder for removeCustomLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartRemoveCustomLineItemActionBuilder removeCustomLineItemBuilder() {
        return com.commercetools.api.models.cart.CartRemoveCustomLineItemActionBuilder.of();
    }

    /**
     * builder for removeDiscountCode subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartRemoveDiscountCodeActionBuilder removeDiscountCodeBuilder() {
        return com.commercetools.api.models.cart.CartRemoveDiscountCodeActionBuilder.of();
    }

    /**
     * builder for removeItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
        return com.commercetools.api.models.cart.CartRemoveItemShippingAddressActionBuilder.of();
    }

    /**
     * builder for removeLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartRemoveLineItemActionBuilder removeLineItemBuilder() {
        return com.commercetools.api.models.cart.CartRemoveLineItemActionBuilder.of();
    }

    /**
     * builder for removePayment subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartRemovePaymentActionBuilder removePaymentBuilder() {
        return com.commercetools.api.models.cart.CartRemovePaymentActionBuilder.of();
    }

    /**
     * builder for removeShippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartRemoveShippingMethodActionBuilder removeShippingMethodBuilder() {
        return com.commercetools.api.models.cart.CartRemoveShippingMethodActionBuilder.of();
    }

    /**
     * builder for setAnonymousId subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetAnonymousIdActionBuilder setAnonymousIdBuilder() {
        return com.commercetools.api.models.cart.CartSetAnonymousIdActionBuilder.of();
    }

    /**
     * builder for setBillingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetBillingAddressActionBuilder setBillingAddressBuilder() {
        return com.commercetools.api.models.cart.CartSetBillingAddressActionBuilder.of();
    }

    /**
     * builder for setBillingAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldActionBuilder setBillingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setBillingAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeActionBuilder setBillingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setBusinessUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetBusinessUnitActionBuilder setBusinessUnitBuilder() {
        return com.commercetools.api.models.cart.CartSetBusinessUnitActionBuilder.of();
    }

    /**
     * builder for setCartTotalTax subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCartTotalTaxActionBuilder setCartTotalTaxBuilder() {
        return com.commercetools.api.models.cart.CartSetCartTotalTaxActionBuilder.of();
    }

    /**
     * builder for setCountry subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCountryActionBuilder setCountryBuilder() {
        return com.commercetools.api.models.cart.CartSetCountryActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldActionBuilder setCustomLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeActionBuilder setCustomLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeActionBuilder.of();
    }

    /**
     * builder for setCustomLineItemShippingDetails subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsActionBuilder setCustomLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * builder for setCustomLineItemTaxAmount subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountActionBuilder setCustomLineItemTaxAmountBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountActionBuilder.of();
    }

    /**
     * builder for setCustomLineItemTaxRate subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateActionBuilder setCustomLineItemTaxRateBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateActionBuilder.of();
    }

    /**
     * builder for setCustomShippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomShippingMethodActionBuilder setCustomShippingMethodBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomShippingMethodActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setCustomerEmail subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomerEmailActionBuilder.of();
    }

    /**
     * builder for setCustomerGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomerGroupActionBuilder setCustomerGroupBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomerGroupActionBuilder.of();
    }

    /**
     * builder for setCustomerId subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomerIdActionBuilder setCustomerIdBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomerIdActionBuilder.of();
    }

    /**
     * builder for setDeleteDaysAfterLastModification subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
        return com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    /**
     * builder for setDeliveryAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldActionBuilder setDeliveryAddressCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setDeliveryAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeActionBuilder setDeliveryAddressCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDirectDiscounts subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetDirectDiscountsActionBuilder setDirectDiscountsBuilder() {
        return com.commercetools.api.models.cart.CartSetDirectDiscountsActionBuilder.of();
    }

    /**
     * builder for setItemShippingAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldActionBuilder setItemShippingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setItemShippingAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeActionBuilder setItemShippingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.cart.CartSetKeyActionBuilder.of();
    }

    /**
     * builder for setLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemCustomFieldActionBuilder.of();
    }

    /**
     * builder for setLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemCustomTypeActionBuilder.of();
    }

    /**
     * builder for setLineItemDistributionChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLineItemDistributionChannelActionBuilder setLineItemDistributionChannelBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemDistributionChannelActionBuilder.of();
    }

    /**
     * builder for setLineItemInventoryMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLineItemInventoryModeActionBuilder setLineItemInventoryModeBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemInventoryModeActionBuilder.of();
    }

    /**
     * builder for setLineItemPrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLineItemPriceActionBuilder setLineItemPriceBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemPriceActionBuilder.of();
    }

    /**
     * builder for setLineItemShippingDetails subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * builder for setLineItemSupplyChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLineItemSupplyChannelActionBuilder setLineItemSupplyChannelBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemSupplyChannelActionBuilder.of();
    }

    /**
     * builder for setLineItemTaxAmount subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLineItemTaxAmountActionBuilder setLineItemTaxAmountBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemTaxAmountActionBuilder.of();
    }

    /**
     * builder for setLineItemTaxRate subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLineItemTaxRateActionBuilder setLineItemTaxRateBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemTaxRateActionBuilder.of();
    }

    /**
     * builder for setLineItemTotalPrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLineItemTotalPriceActionBuilder setLineItemTotalPriceBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemTotalPriceActionBuilder.of();
    }

    /**
     * builder for setLocale subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLocaleActionBuilder setLocaleBuilder() {
        return com.commercetools.api.models.cart.CartSetLocaleActionBuilder.of();
    }

    /**
     * builder for setShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetShippingAddressActionBuilder setShippingAddressBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingAddressActionBuilder.of();
    }

    /**
     * builder for setShippingAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldActionBuilder setShippingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setShippingAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeActionBuilder setShippingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setShippingCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetShippingCustomFieldActionBuilder setShippingCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingCustomFieldActionBuilder.of();
    }

    /**
     * builder for setShippingCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetShippingCustomTypeActionBuilder setShippingCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingCustomTypeActionBuilder.of();
    }

    /**
     * builder for setShippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetShippingMethodActionBuilder setShippingMethodBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingMethodActionBuilder.of();
    }

    /**
     * builder for setShippingMethodTaxAmount subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionBuilder setShippingMethodTaxAmountBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionBuilder.of();
    }

    /**
     * builder for setShippingMethodTaxRate subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetShippingMethodTaxRateActionBuilder setShippingMethodTaxRateBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingMethodTaxRateActionBuilder.of();
    }

    /**
     * builder for setShippingRateInput subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetShippingRateInputActionBuilder setShippingRateInputBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingRateInputActionBuilder.of();
    }

    /**
     * builder for unfreezeCart subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartUnfreezeCartActionBuilder unfreezeCartBuilder() {
        return com.commercetools.api.models.cart.CartUnfreezeCartActionBuilder.of();
    }

    /**
     * builder for updateItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
        return com.commercetools.api.models.cart.CartUpdateItemShippingAddressActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartUpdateAction(Function<CartUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartUpdateAction>";
            }
        };
    }
}
