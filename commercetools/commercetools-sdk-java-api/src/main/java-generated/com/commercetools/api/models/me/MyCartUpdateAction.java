
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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

    public MyCartUpdateAction copyDeep();

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

        if (!(template instanceof MyCartUpdateActionImpl)) {
            return template.copyDeep();
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
     * builder for changeLineItemsOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartChangeLineItemsOrderActionBuilder changeLineItemsOrderBuilder() {
        return com.commercetools.api.models.me.MyCartChangeLineItemsOrderActionBuilder.of();
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
     * builder for setCustomLineItemRecurrenceInfo subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetCustomLineItemRecurrenceInfoActionBuilder setCustomLineItemRecurrenceInfoBuilder() {
        return com.commercetools.api.models.me.MyCartSetCustomLineItemRecurrenceInfoActionBuilder.of();
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
     * builder for setLineItemRecurrenceInfo subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCartSetLineItemRecurrenceInfoActionBuilder setLineItemRecurrenceInfoBuilder() {
        return com.commercetools.api.models.me.MyCartSetLineItemRecurrenceInfoActionBuilder.of();
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
