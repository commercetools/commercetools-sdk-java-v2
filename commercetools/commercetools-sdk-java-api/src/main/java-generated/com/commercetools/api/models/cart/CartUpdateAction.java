
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
 *             quantity(0.3)
 *             slug("{slug}")
 *             .build()
 * </code></pre>
 * </div>
 */
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldActionImpl.class, name = CartSetBillingAddressCustomFieldAction.SET_BILLING_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeActionImpl.class, name = CartSetBillingAddressCustomTypeAction.SET_BILLING_ADDRESS_CUSTOM_TYPE),
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodActionImpl.class, name = CartSetShippingMethodAction.SET_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionImpl.class, name = CartSetShippingMethodTaxAmountAction.SET_SHIPPING_METHOD_TAX_AMOUNT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingMethodTaxRateActionImpl.class, name = CartSetShippingMethodTaxRateAction.SET_SHIPPING_METHOD_TAX_RATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartSetShippingRateInputActionImpl.class, name = CartSetShippingRateInputAction.SET_SHIPPING_RATE_INPUT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.CartUpdateItemShippingAddressActionImpl.class, name = CartUpdateItemShippingAddressAction.UPDATE_ITEM_SHIPPING_ADDRESS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = CartUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = CartUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<CartUpdateAction> {

    /**
     *
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.cart.CartAddCustomLineItemActionBuilder addCustomLineItemBuilder() {
        return com.commercetools.api.models.cart.CartAddCustomLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartAddDiscountCodeActionBuilder addDiscountCodeBuilder() {
        return com.commercetools.api.models.cart.CartAddDiscountCodeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
        return com.commercetools.api.models.cart.CartAddItemShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartAddLineItemActionBuilder addLineItemBuilder() {
        return com.commercetools.api.models.cart.CartAddLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartAddPaymentActionBuilder addPaymentBuilder() {
        return com.commercetools.api.models.cart.CartAddPaymentActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartAddShoppingListActionBuilder addShoppingListBuilder() {
        return com.commercetools.api.models.cart.CartAddShoppingListActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder applyDeltaToCustomLineItemShippingDetailsTargetsBuilder() {
        return com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder applyDeltaToLineItemShippingDetailsTargetsBuilder() {
        return com.commercetools.api.models.cart.CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyActionBuilder changeCustomLineItemMoneyBuilder() {
        return com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityActionBuilder changeCustomLineItemQuantityBuilder() {
        return com.commercetools.api.models.cart.CartChangeCustomLineItemQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
        return com.commercetools.api.models.cart.CartChangeLineItemQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartChangeTaxCalculationModeActionBuilder changeTaxCalculationModeBuilder() {
        return com.commercetools.api.models.cart.CartChangeTaxCalculationModeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartChangeTaxModeActionBuilder changeTaxModeBuilder() {
        return com.commercetools.api.models.cart.CartChangeTaxModeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartChangeTaxRoundingModeActionBuilder changeTaxRoundingModeBuilder() {
        return com.commercetools.api.models.cart.CartChangeTaxRoundingModeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartRecalculateActionBuilder recalculateBuilder() {
        return com.commercetools.api.models.cart.CartRecalculateActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartRemoveCustomLineItemActionBuilder removeCustomLineItemBuilder() {
        return com.commercetools.api.models.cart.CartRemoveCustomLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartRemoveDiscountCodeActionBuilder removeDiscountCodeBuilder() {
        return com.commercetools.api.models.cart.CartRemoveDiscountCodeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
        return com.commercetools.api.models.cart.CartRemoveItemShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartRemoveLineItemActionBuilder removeLineItemBuilder() {
        return com.commercetools.api.models.cart.CartRemoveLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartRemovePaymentActionBuilder removePaymentBuilder() {
        return com.commercetools.api.models.cart.CartRemovePaymentActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetAnonymousIdActionBuilder setAnonymousIdBuilder() {
        return com.commercetools.api.models.cart.CartSetAnonymousIdActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetBillingAddressActionBuilder setBillingAddressBuilder() {
        return com.commercetools.api.models.cart.CartSetBillingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldActionBuilder setBillingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeActionBuilder setBillingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetBillingAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCartTotalTaxActionBuilder setCartTotalTaxBuilder() {
        return com.commercetools.api.models.cart.CartSetCartTotalTaxActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCountryActionBuilder setCountryBuilder() {
        return com.commercetools.api.models.cart.CartSetCountryActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldActionBuilder setCustomLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeActionBuilder setCustomLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomLineItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsActionBuilder setCustomLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountActionBuilder setCustomLineItemTaxAmountBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateActionBuilder setCustomLineItemTaxRateBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCustomShippingMethodActionBuilder setCustomShippingMethodBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomShippingMethodActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomerEmailActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCustomerGroupActionBuilder setCustomerGroupBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomerGroupActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetCustomerIdActionBuilder setCustomerIdBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomerIdActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
        return com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldActionBuilder setDeliveryAddressCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeActionBuilder setDeliveryAddressCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetDirectDiscountsActionBuilder setDirectDiscountsBuilder() {
        return com.commercetools.api.models.cart.CartSetDirectDiscountsActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldActionBuilder setItemShippingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeActionBuilder setItemShippingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetItemShippingAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.cart.CartSetKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetLineItemDistributionChannelActionBuilder setLineItemDistributionChannelBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemDistributionChannelActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetLineItemPriceActionBuilder setLineItemPriceBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemPriceActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemShippingDetailsActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetLineItemSupplyChannelActionBuilder setLineItemSupplyChannelBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemSupplyChannelActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetLineItemTaxAmountActionBuilder setLineItemTaxAmountBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemTaxAmountActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetLineItemTaxRateActionBuilder setLineItemTaxRateBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemTaxRateActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetLineItemTotalPriceActionBuilder setLineItemTotalPriceBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemTotalPriceActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetLocaleActionBuilder setLocaleBuilder() {
        return com.commercetools.api.models.cart.CartSetLocaleActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetShippingAddressActionBuilder setShippingAddressBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldActionBuilder setShippingAddressCustomFieldBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeActionBuilder setShippingAddressCustomTypeBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetShippingMethodActionBuilder setShippingMethodBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingMethodActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionBuilder setShippingMethodTaxAmountBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetShippingMethodTaxRateActionBuilder setShippingMethodTaxRateBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingMethodTaxRateActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartSetShippingRateInputActionBuilder setShippingRateInputBuilder() {
        return com.commercetools.api.models.cart.CartSetShippingRateInputActionBuilder.of();
    }

    public static com.commercetools.api.models.cart.CartUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
        return com.commercetools.api.models.cart.CartUpdateItemShippingAddressActionBuilder.of();
    }

    default <T> T withCartUpdateAction(Function<CartUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartUpdateAction>";
            }
        };
    }
}
