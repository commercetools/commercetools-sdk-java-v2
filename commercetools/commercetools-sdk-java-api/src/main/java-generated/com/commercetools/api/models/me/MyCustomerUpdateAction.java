
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerAddAddressActionImpl.class, name = MyCustomerAddAddressAction.ADD_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerAddBillingAddressIdActionImpl.class, name = MyCustomerAddBillingAddressIdAction.ADD_BILLING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerAddShippingAddressIdActionImpl.class, name = MyCustomerAddShippingAddressIdAction.ADD_SHIPPING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerChangeAddressActionImpl.class, name = MyCustomerChangeAddressAction.CHANGE_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerChangeEmailActionImpl.class, name = MyCustomerChangeEmailAction.CHANGE_EMAIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerRemoveAddressActionImpl.class, name = MyCustomerRemoveAddressAction.REMOVE_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdActionImpl.class, name = MyCustomerRemoveBillingAddressIdAction.REMOVE_BILLING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdActionImpl.class, name = MyCustomerRemoveShippingAddressIdAction.REMOVE_SHIPPING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetCompanyNameActionImpl.class, name = MyCustomerSetCompanyNameAction.SET_COMPANY_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetCustomFieldActionImpl.class, name = MyCustomerSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetCustomTypeActionImpl.class, name = MyCustomerSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetDateOfBirthActionImpl.class, name = MyCustomerSetDateOfBirthAction.SET_DATE_OF_BIRTH),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressActionImpl.class, name = MyCustomerSetDefaultBillingAddressAction.SET_DEFAULT_BILLING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressActionImpl.class, name = MyCustomerSetDefaultShippingAddressAction.SET_DEFAULT_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetFirstNameActionImpl.class, name = MyCustomerSetFirstNameAction.SET_FIRST_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetLastNameActionImpl.class, name = MyCustomerSetLastNameAction.SET_LAST_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetLocaleActionImpl.class, name = MyCustomerSetLocaleAction.SET_LOCALE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetMiddleNameActionImpl.class, name = MyCustomerSetMiddleNameAction.SET_MIDDLE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetSalutationActionImpl.class, name = MyCustomerSetSalutationAction.SET_SALUTATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetTitleActionImpl.class, name = MyCustomerSetTitleAction.SET_TITLE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCustomerSetVatIdActionImpl.class, name = MyCustomerSetVatIdAction.SET_VAT_ID) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = MyCustomerUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = MyCustomerUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface MyCustomerUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<MyCustomerUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.me.MyCustomerAddAddressActionBuilder addAddressBuilder() {
        return com.commercetools.api.models.me.MyCustomerAddAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerAddBillingAddressIdActionBuilder addBillingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyCustomerAddBillingAddressIdActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerAddShippingAddressIdActionBuilder addShippingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyCustomerAddShippingAddressIdActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerChangeAddressActionBuilder changeAddressBuilder() {
        return com.commercetools.api.models.me.MyCustomerChangeAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerChangeEmailActionBuilder changeEmailBuilder() {
        return com.commercetools.api.models.me.MyCustomerChangeEmailActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerRemoveAddressActionBuilder removeAddressBuilder() {
        return com.commercetools.api.models.me.MyCustomerRemoveAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdActionBuilder removeBillingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdActionBuilder removeShippingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetCompanyNameActionBuilder setCompanyNameBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetCompanyNameActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetDateOfBirthActionBuilder setDateOfBirthBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetDateOfBirthActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressActionBuilder setDefaultBillingAddressBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressActionBuilder setDefaultShippingAddressBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetFirstNameActionBuilder setFirstNameBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetFirstNameActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetLastNameActionBuilder setLastNameBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetLastNameActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetLocaleActionBuilder setLocaleBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetLocaleActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetMiddleNameActionBuilder setMiddleNameBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetMiddleNameActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetSalutationActionBuilder setSalutationBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetSalutationActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetTitleActionBuilder setTitleBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetTitleActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyCustomerSetVatIdActionBuilder setVatIdBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetVatIdActionBuilder.of();
    }

    default <T> T withMyCustomerUpdateAction(Function<MyCustomerUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerUpdateAction>";
            }
        };
    }
}
