
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartUpdateAction myCartUpdateAction = MyCartUpdateAction.addDiscountCodeBuilder()
 *             code("{code}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddDiscountCodeActionImpl.class, name = MyCartAddDiscountCodeAction.ADD_DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddItemShippingAddressActionImpl.class, name = MyCartAddItemShippingAddressAction.ADD_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddLineItemActionImpl.class, name = MyCartAddLineItemAction.ADD_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartAddPaymentActionImpl.class, name = MyCartAddPaymentAction.ADD_PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class, name = MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.APPLY_DELTA_TO_LINE_ITEM_SHIPPING_DETAILS_TARGETS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartChangeLineItemQuantityActionImpl.class, name = MyCartChangeLineItemQuantityAction.CHANGE_LINE_ITEM_QUANTITY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartChangeTaxModeActionImpl.class, name = MyCartChangeTaxModeAction.CHANGE_TAX_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRecalculateActionImpl.class, name = MyCartRecalculateAction.RECALCULATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemoveDiscountCodeActionImpl.class, name = MyCartRemoveDiscountCodeAction.REMOVE_DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionImpl.class, name = MyCartRemoveItemShippingAddressAction.REMOVE_ITEM_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemoveLineItemActionImpl.class, name = MyCartRemoveLineItemAction.REMOVE_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartRemovePaymentActionImpl.class, name = MyCartRemovePaymentAction.REMOVE_PAYMENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetBillingAddressActionImpl.class, name = MyCartSetBillingAddressAction.SET_BILLING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetBusinessUnitActionImpl.class, name = MyCartSetBusinessUnitAction.SET_BUSINESS_UNIT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCountryActionImpl.class, name = MyCartSetCountryAction.SET_COUNTRY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCustomFieldActionImpl.class, name = MyCartSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCustomTypeActionImpl.class, name = MyCartSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCustomerEmailActionImpl.class, name = MyCartSetCustomerEmailAction.SET_CUSTOMER_EMAIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationActionImpl.class, name = MyCartSetDeleteDaysAfterLastModificationAction.SET_DELETE_DAYS_AFTER_LAST_MODIFICATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetDirectDiscountsActionImpl.class, name = MyCartSetDirectDiscountsAction.SET_DIRECT_DISCOUNTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemCustomFieldActionImpl.class, name = MyCartSetLineItemCustomFieldAction.SET_LINE_ITEM_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemCustomTypeActionImpl.class, name = MyCartSetLineItemCustomTypeAction.SET_LINE_ITEM_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelActionImpl.class, name = MyCartSetLineItemDistributionChannelAction.SET_LINE_ITEM_DISTRIBUTION_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsActionImpl.class, name = MyCartSetLineItemShippingDetailsAction.SET_LINE_ITEM_SHIPPING_DETAILS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLineItemSupplyChannelActionImpl.class, name = MyCartSetLineItemSupplyChannelAction.SET_LINE_ITEM_SUPPLY_CHANNEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetLocaleActionImpl.class, name = MyCartSetLocaleAction.SET_LOCALE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetShippingAddressActionImpl.class, name = MyCartSetShippingAddressAction.SET_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetShippingMethodActionImpl.class, name = MyCartSetShippingMethodAction.SET_SHIPPING_METHOD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartUpdateItemShippingAddressActionImpl.class, name = MyCartUpdateItemShippingAddressAction.UPDATE_ITEM_SHIPPING_ADDRESS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = MyCartUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = MyCartUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MyCartUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<MyCartUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of MyCartUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartUpdateAction deepCopy(@Nullable final MyCartUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.me.MyCartAddDiscountCodeAction) {
            return com.commercetools.api.models.me.MyCartAddDiscountCodeAction
                    .deepCopy((com.commercetools.api.models.me.MyCartAddDiscountCodeAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartAddItemShippingAddressAction) {
            return com.commercetools.api.models.me.MyCartAddItemShippingAddressAction
                    .deepCopy((com.commercetools.api.models.me.MyCartAddItemShippingAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartAddLineItemAction) {
            return com.commercetools.api.models.me.MyCartAddLineItemAction
                    .deepCopy((com.commercetools.api.models.me.MyCartAddLineItemAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartAddPaymentAction) {
            return com.commercetools.api.models.me.MyCartAddPaymentAction
                    .deepCopy((com.commercetools.api.models.me.MyCartAddPaymentAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsAction) {
            return com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.deepCopy(
                (com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartChangeLineItemQuantityAction) {
            return com.commercetools.api.models.me.MyCartChangeLineItemQuantityAction
                    .deepCopy((com.commercetools.api.models.me.MyCartChangeLineItemQuantityAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartChangeTaxModeAction) {
            return com.commercetools.api.models.me.MyCartChangeTaxModeAction
                    .deepCopy((com.commercetools.api.models.me.MyCartChangeTaxModeAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartRecalculateAction) {
            return com.commercetools.api.models.me.MyCartRecalculateAction
                    .deepCopy((com.commercetools.api.models.me.MyCartRecalculateAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartRemoveDiscountCodeAction) {
            return com.commercetools.api.models.me.MyCartRemoveDiscountCodeAction
                    .deepCopy((com.commercetools.api.models.me.MyCartRemoveDiscountCodeAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartRemoveItemShippingAddressAction) {
            return com.commercetools.api.models.me.MyCartRemoveItemShippingAddressAction
                    .deepCopy((com.commercetools.api.models.me.MyCartRemoveItemShippingAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartRemoveLineItemAction) {
            return com.commercetools.api.models.me.MyCartRemoveLineItemAction
                    .deepCopy((com.commercetools.api.models.me.MyCartRemoveLineItemAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartRemovePaymentAction) {
            return com.commercetools.api.models.me.MyCartRemovePaymentAction
                    .deepCopy((com.commercetools.api.models.me.MyCartRemovePaymentAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetBillingAddressAction) {
            return com.commercetools.api.models.me.MyCartSetBillingAddressAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetBillingAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetBusinessUnitAction) {
            return com.commercetools.api.models.me.MyCartSetBusinessUnitAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetBusinessUnitAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetCountryAction) {
            return com.commercetools.api.models.me.MyCartSetCountryAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetCountryAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetCustomFieldAction) {
            return com.commercetools.api.models.me.MyCartSetCustomFieldAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetCustomTypeAction) {
            return com.commercetools.api.models.me.MyCartSetCustomTypeAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetCustomerEmailAction) {
            return com.commercetools.api.models.me.MyCartSetCustomerEmailAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetCustomerEmailAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationAction) {
            return com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationAction.deepCopy(
                (com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetDirectDiscountsAction) {
            return com.commercetools.api.models.me.MyCartSetDirectDiscountsAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetDirectDiscountsAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetLineItemCustomFieldAction) {
            return com.commercetools.api.models.me.MyCartSetLineItemCustomFieldAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetLineItemCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetLineItemCustomTypeAction) {
            return com.commercetools.api.models.me.MyCartSetLineItemCustomTypeAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetLineItemCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelAction) {
            return com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsAction) {
            return com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetLineItemSupplyChannelAction) {
            return com.commercetools.api.models.me.MyCartSetLineItemSupplyChannelAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetLineItemSupplyChannelAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetLocaleAction) {
            return com.commercetools.api.models.me.MyCartSetLocaleAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetLocaleAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetShippingAddressAction) {
            return com.commercetools.api.models.me.MyCartSetShippingAddressAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetShippingAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartSetShippingMethodAction) {
            return com.commercetools.api.models.me.MyCartSetShippingMethodAction
                    .deepCopy((com.commercetools.api.models.me.MyCartSetShippingMethodAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCartUpdateItemShippingAddressAction) {
            return com.commercetools.api.models.me.MyCartUpdateItemShippingAddressAction
                    .deepCopy((com.commercetools.api.models.me.MyCartUpdateItemShippingAddressAction) template);
        }
        MyCartUpdateActionImpl instance = new MyCartUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addDiscountCode subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartAddDiscountCodeActionBuilder addDiscountCodeBuilder() {
        return com.commercetools.api.models.me.MyCartAddDiscountCodeActionBuilder.of();
    }

    /**
     * builder for addItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
        return com.commercetools.api.models.me.MyCartAddItemShippingAddressActionBuilder.of();
    }

    /**
     * builder for addLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartAddLineItemActionBuilder addLineItemBuilder() {
        return com.commercetools.api.models.me.MyCartAddLineItemActionBuilder.of();
    }

    /**
     * builder for addPayment subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartAddPaymentActionBuilder addPaymentBuilder() {
        return com.commercetools.api.models.me.MyCartAddPaymentActionBuilder.of();
    }

    /**
     * builder for applyDeltaToLineItemShippingDetailsTargets subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder applyDeltaToLineItemShippingDetailsTargetsBuilder() {
        return com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of();
    }

    /**
     * builder for changeLineItemQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
        return com.commercetools.api.models.me.MyCartChangeLineItemQuantityActionBuilder.of();
    }

    /**
     * builder for changeTaxMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartChangeTaxModeActionBuilder changeTaxModeBuilder() {
        return com.commercetools.api.models.me.MyCartChangeTaxModeActionBuilder.of();
    }

    /**
     * builder for recalculate subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartRecalculateActionBuilder recalculateBuilder() {
        return com.commercetools.api.models.me.MyCartRecalculateActionBuilder.of();
    }

    /**
     * builder for removeDiscountCode subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartRemoveDiscountCodeActionBuilder removeDiscountCodeBuilder() {
        return com.commercetools.api.models.me.MyCartRemoveDiscountCodeActionBuilder.of();
    }

    /**
     * builder for removeItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
        return com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionBuilder.of();
    }

    /**
     * builder for removeLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartRemoveLineItemActionBuilder removeLineItemBuilder() {
        return com.commercetools.api.models.me.MyCartRemoveLineItemActionBuilder.of();
    }

    /**
     * builder for removePayment subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartRemovePaymentActionBuilder removePaymentBuilder() {
        return com.commercetools.api.models.me.MyCartRemovePaymentActionBuilder.of();
    }

    /**
     * builder for setBillingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetBillingAddressActionBuilder setBillingAddressBuilder() {
        return com.commercetools.api.models.me.MyCartSetBillingAddressActionBuilder.of();
    }

    /**
     * builder for setBusinessUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetBusinessUnitActionBuilder setBusinessUnitBuilder() {
        return com.commercetools.api.models.me.MyCartSetBusinessUnitActionBuilder.of();
    }

    /**
     * builder for setCountry subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetCountryActionBuilder setCountryBuilder() {
        return com.commercetools.api.models.me.MyCartSetCountryActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyCartSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyCartSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setCustomerEmail subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
        return com.commercetools.api.models.me.MyCartSetCustomerEmailActionBuilder.of();
    }

    /**
     * builder for setDeleteDaysAfterLastModification subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
        return com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    /**
     * builder for setDirectDiscounts subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetDirectDiscountsActionBuilder setDirectDiscountsBuilder() {
        return com.commercetools.api.models.me.MyCartSetDirectDiscountsActionBuilder.of();
    }

    /**
     * builder for setLineItemCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyCartSetLineItemCustomFieldActionBuilder.of();
    }

    /**
     * builder for setLineItemCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyCartSetLineItemCustomTypeActionBuilder.of();
    }

    /**
     * builder for setLineItemDistributionChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelActionBuilder setLineItemDistributionChannelBuilder() {
        return com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelActionBuilder.of();
    }

    /**
     * builder for setLineItemShippingDetails subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * builder for setLineItemSupplyChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetLineItemSupplyChannelActionBuilder setLineItemSupplyChannelBuilder() {
        return com.commercetools.api.models.me.MyCartSetLineItemSupplyChannelActionBuilder.of();
    }

    /**
     * builder for setLocale subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetLocaleActionBuilder setLocaleBuilder() {
        return com.commercetools.api.models.me.MyCartSetLocaleActionBuilder.of();
    }

    /**
     * builder for setShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetShippingAddressActionBuilder setShippingAddressBuilder() {
        return com.commercetools.api.models.me.MyCartSetShippingAddressActionBuilder.of();
    }

    /**
     * builder for setShippingMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetShippingMethodActionBuilder setShippingMethodBuilder() {
        return com.commercetools.api.models.me.MyCartSetShippingMethodActionBuilder.of();
    }

    /**
     * builder for updateItemShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
        return com.commercetools.api.models.me.MyCartUpdateItemShippingAddressActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartUpdateAction(Function<MyCartUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartUpdateAction>";
            }
        };
    }
}
