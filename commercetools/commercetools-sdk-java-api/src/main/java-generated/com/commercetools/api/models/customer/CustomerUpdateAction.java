package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerAddAddressAction;
import com.commercetools.api.models.customer.CustomerAddBillingAddressIdAction;
import com.commercetools.api.models.customer.CustomerAddShippingAddressIdAction;
import com.commercetools.api.models.customer.CustomerAddStoreAction;
import com.commercetools.api.models.customer.CustomerChangeAddressAction;
import com.commercetools.api.models.customer.CustomerChangeEmailAction;
import com.commercetools.api.models.customer.CustomerRemoveAddressAction;
import com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdAction;
import com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdAction;
import com.commercetools.api.models.customer.CustomerRemoveStoreAction;
import com.commercetools.api.models.customer.CustomerSetAddressCustomFieldAction;
import com.commercetools.api.models.customer.CustomerSetAddressCustomTypeAction;
import com.commercetools.api.models.customer.CustomerSetAuthenticationModeAction;
import com.commercetools.api.models.customer.CustomerSetCompanyNameAction;
import com.commercetools.api.models.customer.CustomerSetCustomFieldAction;
import com.commercetools.api.models.customer.CustomerSetCustomTypeAction;
import com.commercetools.api.models.customer.CustomerSetCustomerGroupAction;
import com.commercetools.api.models.customer.CustomerSetCustomerNumberAction;
import com.commercetools.api.models.customer.CustomerSetDateOfBirthAction;
import com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressAction;
import com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressAction;
import com.commercetools.api.models.customer.CustomerSetExternalIdAction;
import com.commercetools.api.models.customer.CustomerSetFirstNameAction;
import com.commercetools.api.models.customer.CustomerSetKeyAction;
import com.commercetools.api.models.customer.CustomerSetLastNameAction;
import com.commercetools.api.models.customer.CustomerSetLocaleAction;
import com.commercetools.api.models.customer.CustomerSetMiddleNameAction;
import com.commercetools.api.models.customer.CustomerSetSalutationAction;
import com.commercetools.api.models.customer.CustomerSetStoresAction;
import com.commercetools.api.models.customer.CustomerSetTitleAction;
import com.commercetools.api.models.customer.CustomerSetVatIdAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * CustomerUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerUpdateAction customerUpdateAction = CustomerUpdateAction.addAddressBuilder()
 *             address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
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
   @JsonSubTypes.Type(value = com.commercetools.api.models.customer.CustomerSetVatIdActionImpl.class, name = CustomerSetVatIdAction.SET_VAT_ID)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = CustomerUpdateActionImpl.class,
    visible = true
)
@JsonDeserialize(as = CustomerUpdateActionImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface CustomerUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<CustomerUpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();




    /**
     * factory method to create a deep copy of CustomerUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerUpdateAction deepCopy(@Nullable final CustomerUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerAddAddressAction) {
            return com.commercetools.api.models.customer.CustomerAddAddressAction.deepCopy((com.commercetools.api.models.customer.CustomerAddAddressAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerAddBillingAddressIdAction) {
            return com.commercetools.api.models.customer.CustomerAddBillingAddressIdAction.deepCopy((com.commercetools.api.models.customer.CustomerAddBillingAddressIdAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerAddShippingAddressIdAction) {
            return com.commercetools.api.models.customer.CustomerAddShippingAddressIdAction.deepCopy((com.commercetools.api.models.customer.CustomerAddShippingAddressIdAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerAddStoreAction) {
            return com.commercetools.api.models.customer.CustomerAddStoreAction.deepCopy((com.commercetools.api.models.customer.CustomerAddStoreAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerChangeAddressAction) {
            return com.commercetools.api.models.customer.CustomerChangeAddressAction.deepCopy((com.commercetools.api.models.customer.CustomerChangeAddressAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerChangeEmailAction) {
            return com.commercetools.api.models.customer.CustomerChangeEmailAction.deepCopy((com.commercetools.api.models.customer.CustomerChangeEmailAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerRemoveAddressAction) {
            return com.commercetools.api.models.customer.CustomerRemoveAddressAction.deepCopy((com.commercetools.api.models.customer.CustomerRemoveAddressAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdAction) {
            return com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdAction.deepCopy((com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdAction) {
            return com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdAction.deepCopy((com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerRemoveStoreAction) {
            return com.commercetools.api.models.customer.CustomerRemoveStoreAction.deepCopy((com.commercetools.api.models.customer.CustomerRemoveStoreAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetAddressCustomFieldAction) {
            return com.commercetools.api.models.customer.CustomerSetAddressCustomFieldAction.deepCopy((com.commercetools.api.models.customer.CustomerSetAddressCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetAddressCustomTypeAction) {
            return com.commercetools.api.models.customer.CustomerSetAddressCustomTypeAction.deepCopy((com.commercetools.api.models.customer.CustomerSetAddressCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetAuthenticationModeAction) {
            return com.commercetools.api.models.customer.CustomerSetAuthenticationModeAction.deepCopy((com.commercetools.api.models.customer.CustomerSetAuthenticationModeAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetCompanyNameAction) {
            return com.commercetools.api.models.customer.CustomerSetCompanyNameAction.deepCopy((com.commercetools.api.models.customer.CustomerSetCompanyNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetCustomFieldAction) {
            return com.commercetools.api.models.customer.CustomerSetCustomFieldAction.deepCopy((com.commercetools.api.models.customer.CustomerSetCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetCustomTypeAction) {
            return com.commercetools.api.models.customer.CustomerSetCustomTypeAction.deepCopy((com.commercetools.api.models.customer.CustomerSetCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetCustomerGroupAction) {
            return com.commercetools.api.models.customer.CustomerSetCustomerGroupAction.deepCopy((com.commercetools.api.models.customer.CustomerSetCustomerGroupAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetCustomerNumberAction) {
            return com.commercetools.api.models.customer.CustomerSetCustomerNumberAction.deepCopy((com.commercetools.api.models.customer.CustomerSetCustomerNumberAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetDateOfBirthAction) {
            return com.commercetools.api.models.customer.CustomerSetDateOfBirthAction.deepCopy((com.commercetools.api.models.customer.CustomerSetDateOfBirthAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressAction) {
            return com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressAction.deepCopy((com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressAction) {
            return com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressAction.deepCopy((com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetExternalIdAction) {
            return com.commercetools.api.models.customer.CustomerSetExternalIdAction.deepCopy((com.commercetools.api.models.customer.CustomerSetExternalIdAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetFirstNameAction) {
            return com.commercetools.api.models.customer.CustomerSetFirstNameAction.deepCopy((com.commercetools.api.models.customer.CustomerSetFirstNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetKeyAction) {
            return com.commercetools.api.models.customer.CustomerSetKeyAction.deepCopy((com.commercetools.api.models.customer.CustomerSetKeyAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetLastNameAction) {
            return com.commercetools.api.models.customer.CustomerSetLastNameAction.deepCopy((com.commercetools.api.models.customer.CustomerSetLastNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetLocaleAction) {
            return com.commercetools.api.models.customer.CustomerSetLocaleAction.deepCopy((com.commercetools.api.models.customer.CustomerSetLocaleAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetMiddleNameAction) {
            return com.commercetools.api.models.customer.CustomerSetMiddleNameAction.deepCopy((com.commercetools.api.models.customer.CustomerSetMiddleNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetSalutationAction) {
            return com.commercetools.api.models.customer.CustomerSetSalutationAction.deepCopy((com.commercetools.api.models.customer.CustomerSetSalutationAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetStoresAction) {
            return com.commercetools.api.models.customer.CustomerSetStoresAction.deepCopy((com.commercetools.api.models.customer.CustomerSetStoresAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetTitleAction) {
            return com.commercetools.api.models.customer.CustomerSetTitleAction.deepCopy((com.commercetools.api.models.customer.CustomerSetTitleAction)template);
        }
        if (template instanceof com.commercetools.api.models.customer.CustomerSetVatIdAction) {
            return com.commercetools.api.models.customer.CustomerSetVatIdAction.deepCopy((com.commercetools.api.models.customer.CustomerSetVatIdAction)template);
        }
        CustomerUpdateActionImpl instance = new CustomerUpdateActionImpl();
        return instance;
    }


    /**
     * builder for addAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerAddAddressActionBuilder addAddressBuilder() {
       return com.commercetools.api.models.customer.CustomerAddAddressActionBuilder.of();
    }
    /**
     * builder for addBillingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerAddBillingAddressIdActionBuilder addBillingAddressIdBuilder() {
       return com.commercetools.api.models.customer.CustomerAddBillingAddressIdActionBuilder.of();
    }
    /**
     * builder for addShippingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerAddShippingAddressIdActionBuilder addShippingAddressIdBuilder() {
       return com.commercetools.api.models.customer.CustomerAddShippingAddressIdActionBuilder.of();
    }
    /**
     * builder for addStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerAddStoreActionBuilder addStoreBuilder() {
       return com.commercetools.api.models.customer.CustomerAddStoreActionBuilder.of();
    }
    /**
     * builder for changeAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerChangeAddressActionBuilder changeAddressBuilder() {
       return com.commercetools.api.models.customer.CustomerChangeAddressActionBuilder.of();
    }
    /**
     * builder for changeEmail subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerChangeEmailActionBuilder changeEmailBuilder() {
       return com.commercetools.api.models.customer.CustomerChangeEmailActionBuilder.of();
    }
    /**
     * builder for removeAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerRemoveAddressActionBuilder removeAddressBuilder() {
       return com.commercetools.api.models.customer.CustomerRemoveAddressActionBuilder.of();
    }
    /**
     * builder for removeBillingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdActionBuilder removeBillingAddressIdBuilder() {
       return com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdActionBuilder.of();
    }
    /**
     * builder for removeShippingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdActionBuilder removeShippingAddressIdBuilder() {
       return com.commercetools.api.models.customer.CustomerRemoveShippingAddressIdActionBuilder.of();
    }
    /**
     * builder for removeStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerRemoveStoreActionBuilder removeStoreBuilder() {
       return com.commercetools.api.models.customer.CustomerRemoveStoreActionBuilder.of();
    }
    /**
     * builder for setAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetAddressCustomFieldActionBuilder setAddressCustomFieldBuilder() {
       return com.commercetools.api.models.customer.CustomerSetAddressCustomFieldActionBuilder.of();
    }
    /**
     * builder for setAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetAddressCustomTypeActionBuilder setAddressCustomTypeBuilder() {
       return com.commercetools.api.models.customer.CustomerSetAddressCustomTypeActionBuilder.of();
    }
    /**
     * builder for setAuthenticationMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetAuthenticationModeActionBuilder setAuthenticationModeBuilder() {
       return com.commercetools.api.models.customer.CustomerSetAuthenticationModeActionBuilder.of();
    }
    /**
     * builder for setCompanyName subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetCompanyNameActionBuilder setCompanyNameBuilder() {
       return com.commercetools.api.models.customer.CustomerSetCompanyNameActionBuilder.of();
    }
    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.customer.CustomerSetCustomFieldActionBuilder.of();
    }
    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.customer.CustomerSetCustomTypeActionBuilder.of();
    }
    /**
     * builder for setCustomerGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetCustomerGroupActionBuilder setCustomerGroupBuilder() {
       return com.commercetools.api.models.customer.CustomerSetCustomerGroupActionBuilder.of();
    }
    /**
     * builder for setCustomerNumber subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetCustomerNumberActionBuilder setCustomerNumberBuilder() {
       return com.commercetools.api.models.customer.CustomerSetCustomerNumberActionBuilder.of();
    }
    /**
     * builder for setDateOfBirth subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetDateOfBirthActionBuilder setDateOfBirthBuilder() {
       return com.commercetools.api.models.customer.CustomerSetDateOfBirthActionBuilder.of();
    }
    /**
     * builder for setDefaultBillingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressActionBuilder setDefaultBillingAddressBuilder() {
       return com.commercetools.api.models.customer.CustomerSetDefaultBillingAddressActionBuilder.of();
    }
    /**
     * builder for setDefaultShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressActionBuilder setDefaultShippingAddressBuilder() {
       return com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressActionBuilder.of();
    }
    /**
     * builder for setExternalId subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetExternalIdActionBuilder setExternalIdBuilder() {
       return com.commercetools.api.models.customer.CustomerSetExternalIdActionBuilder.of();
    }
    /**
     * builder for setFirstName subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetFirstNameActionBuilder setFirstNameBuilder() {
       return com.commercetools.api.models.customer.CustomerSetFirstNameActionBuilder.of();
    }
    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.customer.CustomerSetKeyActionBuilder.of();
    }
    /**
     * builder for setLastName subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetLastNameActionBuilder setLastNameBuilder() {
       return com.commercetools.api.models.customer.CustomerSetLastNameActionBuilder.of();
    }
    /**
     * builder for setLocale subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetLocaleActionBuilder setLocaleBuilder() {
       return com.commercetools.api.models.customer.CustomerSetLocaleActionBuilder.of();
    }
    /**
     * builder for setMiddleName subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetMiddleNameActionBuilder setMiddleNameBuilder() {
       return com.commercetools.api.models.customer.CustomerSetMiddleNameActionBuilder.of();
    }
    /**
     * builder for setSalutation subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetSalutationActionBuilder setSalutationBuilder() {
       return com.commercetools.api.models.customer.CustomerSetSalutationActionBuilder.of();
    }
    /**
     * builder for setStores subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetStoresActionBuilder setStoresBuilder() {
       return com.commercetools.api.models.customer.CustomerSetStoresActionBuilder.of();
    }
    /**
     * builder for setTitle subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetTitleActionBuilder setTitleBuilder() {
       return com.commercetools.api.models.customer.CustomerSetTitleActionBuilder.of();
    }
    /**
     * builder for setVatId subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer.CustomerSetVatIdActionBuilder setVatIdBuilder() {
       return com.commercetools.api.models.customer.CustomerSetVatIdActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerUpdateAction(Function<CustomerUpdateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerUpdateAction>";
            }
        };
    }
}
