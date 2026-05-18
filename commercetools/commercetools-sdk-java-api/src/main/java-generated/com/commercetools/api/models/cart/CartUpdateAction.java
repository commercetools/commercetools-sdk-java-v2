
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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

    public CartUpdateAction copyDeep();

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

        if (!(template instanceof CartUpdateActionImpl)) {
            return template.copyDeep();
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
     * builder for changeLineItemsOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartChangeLineItemsOrderActionBuilder changeLineItemsOrderBuilder() {
        return com.commercetools.api.models.cart.CartChangeLineItemsOrderActionBuilder.of();
    }

    /**
     * builder for changePriceRoundingMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartChangePriceRoundingModeActionBuilder changePriceRoundingModeBuilder() {
        return com.commercetools.api.models.cart.CartChangePriceRoundingModeActionBuilder.of();
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
     * builder for lockCart subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartLockCartActionBuilder lockCartBuilder() {
        return com.commercetools.api.models.cart.CartLockCartActionBuilder.of();
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
     * builder for setCustomLineItemRecurrenceInfo subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetCustomLineItemRecurrenceInfoActionBuilder setCustomLineItemRecurrenceInfoBuilder() {
        return com.commercetools.api.models.cart.CartSetCustomLineItemRecurrenceInfoActionBuilder.of();
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
     * builder for setLineItemRecurrenceInfo subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetLineItemRecurrenceInfoActionBuilder setLineItemRecurrenceInfoBuilder() {
        return com.commercetools.api.models.cart.CartSetLineItemRecurrenceInfoActionBuilder.of();
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
     * builder for setPurchaseOrderNumber subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartSetPurchaseOrderNumberActionBuilder setPurchaseOrderNumberBuilder() {
        return com.commercetools.api.models.cart.CartSetPurchaseOrderNumberActionBuilder.of();
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
     * builder for unlockCart subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.CartUnlockCartActionBuilder unlockCartBuilder() {
        return com.commercetools.api.models.cart.CartUnlockCartActionBuilder.of();
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
