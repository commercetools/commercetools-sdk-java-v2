
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
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface MyCustomerUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<MyCustomerUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withMyCustomerUpdateAction(Function<MyCustomerUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
