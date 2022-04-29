
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCountryActionImpl.class, name = MyCartSetCountryAction.SET_COUNTRY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCustomFieldActionImpl.class, name = MyCartSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCustomTypeActionImpl.class, name = MyCartSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetCustomerEmailActionImpl.class, name = MyCartSetCustomerEmailAction.SET_CUSTOMER_EMAIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationActionImpl.class, name = MyCartSetDeleteDaysAfterLastModificationAction.SET_DELETE_DAYS_AFTER_LAST_MODIFICATION),
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
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface MyCartUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<MyCartUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.me.MyCartAddDiscountCodeActionBuilder addDiscountCodeBuilder() {
        return com.commercetools.api.models.me.MyCartAddDiscountCodeActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartAddItemShippingAddressActionBuilder addItemShippingAddressBuilder() {
        return com.commercetools.api.models.me.MyCartAddItemShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartAddLineItemActionBuilder addLineItemBuilder() {
        return com.commercetools.api.models.me.MyCartAddLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartAddPaymentActionBuilder addPaymentBuilder() {
        return com.commercetools.api.models.me.MyCartAddPaymentActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder applyDeltaToLineItemShippingDetailsTargetsBuilder() {
        return com.commercetools.api.models.me.MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartChangeLineItemQuantityActionBuilder changeLineItemQuantityBuilder() {
        return com.commercetools.api.models.me.MyCartChangeLineItemQuantityActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartChangeTaxModeActionBuilder changeTaxModeBuilder() {
        return com.commercetools.api.models.me.MyCartChangeTaxModeActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartRecalculateActionBuilder recalculateBuilder() {
        return com.commercetools.api.models.me.MyCartRecalculateActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartRemoveDiscountCodeActionBuilder removeDiscountCodeBuilder() {
        return com.commercetools.api.models.me.MyCartRemoveDiscountCodeActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionBuilder removeItemShippingAddressBuilder() {
        return com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartRemoveLineItemActionBuilder removeLineItemBuilder() {
        return com.commercetools.api.models.me.MyCartRemoveLineItemActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartRemovePaymentActionBuilder removePaymentBuilder() {
        return com.commercetools.api.models.me.MyCartRemovePaymentActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetBillingAddressActionBuilder setBillingAddressBuilder() {
        return com.commercetools.api.models.me.MyCartSetBillingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetCountryActionBuilder setCountryBuilder() {
        return com.commercetools.api.models.me.MyCartSetCountryActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyCartSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyCartSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetCustomerEmailActionBuilder setCustomerEmailBuilder() {
        return com.commercetools.api.models.me.MyCartSetCustomerEmailActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationActionBuilder setDeleteDaysAfterLastModificationBuilder() {
        return com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetLineItemCustomFieldActionBuilder setLineItemCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyCartSetLineItemCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetLineItemCustomTypeActionBuilder setLineItemCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyCartSetLineItemCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelActionBuilder setLineItemDistributionChannelBuilder() {
        return com.commercetools.api.models.me.MyCartSetLineItemDistributionChannelActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsActionBuilder setLineItemShippingDetailsBuilder() {
        return com.commercetools.api.models.me.MyCartSetLineItemShippingDetailsActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetLineItemSupplyChannelActionBuilder setLineItemSupplyChannelBuilder() {
        return com.commercetools.api.models.me.MyCartSetLineItemSupplyChannelActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetLocaleActionBuilder setLocaleBuilder() {
        return com.commercetools.api.models.me.MyCartSetLocaleActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetShippingAddressActionBuilder setShippingAddressBuilder() {
        return com.commercetools.api.models.me.MyCartSetShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartSetShippingMethodActionBuilder setShippingMethodBuilder() {
        return com.commercetools.api.models.me.MyCartSetShippingMethodActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCartUpdateItemShippingAddressActionBuilder updateItemShippingAddressBuilder() {
        return com.commercetools.api.models.me.MyCartUpdateItemShippingAddressActionBuilder.of();
    }

    default <T> T withMyCartUpdateAction(Function<MyCartUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartUpdateAction>";
            }
        };
    }
}
