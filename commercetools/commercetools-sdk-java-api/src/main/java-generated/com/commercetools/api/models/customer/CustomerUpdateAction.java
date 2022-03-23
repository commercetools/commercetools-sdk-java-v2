
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerAddAddressActionImpl.class, name = CustomerAddAddressAction.ADD_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerAddBillingAddressIdActionImpl.class, name = CustomerAddBillingAddressIdAction.ADD_BILLING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerAddShippingAddressIdActionImpl.class, name = CustomerAddShippingAddressIdAction.ADD_SHIPPING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerAddStoreActionImpl.class, name = CustomerAddStoreAction.ADD_STORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerChangeAddressActionImpl.class, name = CustomerChangeAddressAction.CHANGE_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerChangeEmailActionImpl.class, name = CustomerChangeEmailAction.CHANGE_EMAIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerRemoveAddressActionImpl.class, name = CustomerRemoveAddressAction.REMOVE_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdActionImpl.class, name = CustomerRemoveBillingAddressIdAction.REMOVE_BILLING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdActionImpl.class, name = CustomerRemoveShippingAddressIdAction.REMOVE_SHIPPING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerRemoveStoreActionImpl.class, name = CustomerRemoveStoreAction.REMOVE_STORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetAddressCustomFieldActionImpl.class, name = CustomerSetAddressCustomFieldAction.SET_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetAddressCustomTypeActionImpl.class, name = CustomerSetAddressCustomTypeAction.SET_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetAuthenticationModeActionImpl.class, name = CustomerSetAuthenticationModeAction.SET_AUTHENTICATION_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetCompanyNameActionImpl.class, name = CustomerSetCompanyNameAction.SET_COMPANY_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetCustomFieldActionImpl.class, name = CustomerSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetCustomTypeActionImpl.class, name = CustomerSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetCustomerGroupActionImpl.class, name = CustomerSetCustomerGroupAction.SET_CUSTOMER_GROUP),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetCustomerNumberActionImpl.class, name = CustomerSetCustomerNumberAction.SET_CUSTOMER_NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetDateOfBirthActionImpl.class, name = CustomerSetDateOfBirthAction.SET_DATE_OF_BIRTH),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressActionImpl.class, name = CustomerSetDefaultBillingAddressAction.SET_DEFAULT_BILLING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressActionImpl.class, name = CustomerSetDefaultShippingAddressAction.SET_DEFAULT_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetExternalIdActionImpl.class, name = CustomerSetExternalIdAction.SET_EXTERNAL_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetFirstNameActionImpl.class, name = CustomerSetFirstNameAction.SET_FIRST_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetKeyActionImpl.class, name = CustomerSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetLastNameActionImpl.class, name = CustomerSetLastNameAction.SET_LAST_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetLocaleActionImpl.class, name = CustomerSetLocaleAction.SET_LOCALE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetMiddleNameActionImpl.class, name = CustomerSetMiddleNameAction.SET_MIDDLE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetSalutationActionImpl.class, name = CustomerSetSalutationAction.SET_SALUTATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetStoresActionImpl.class, name = CustomerSetStoresAction.SET_STORES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetTitleActionImpl.class, name = CustomerSetTitleAction.SET_TITLE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetVatIdActionImpl.class, name = CustomerSetVatIdAction.SET_VAT_ID) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = CustomerUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = CustomerUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CustomerUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<CustomerUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withCustomerUpdateAction(Function<CustomerUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
