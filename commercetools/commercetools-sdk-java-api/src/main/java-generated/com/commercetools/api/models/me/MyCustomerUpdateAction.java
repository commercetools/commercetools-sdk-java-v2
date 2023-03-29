
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
 * MyCustomerUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerUpdateAction myCustomerUpdateAction = MyCustomerUpdateAction.addAddressBuilder()
 *             address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MyCustomerUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<MyCustomerUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of MyCustomerUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerUpdateAction deepCopy(@Nullable final MyCustomerUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerAddAddressAction) {
            return com.commercetools.api.models.me.MyCustomerAddAddressAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerAddAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerAddBillingAddressIdAction) {
            return com.commercetools.api.models.me.MyCustomerAddBillingAddressIdAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerAddBillingAddressIdAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerAddShippingAddressIdAction) {
            return com.commercetools.api.models.me.MyCustomerAddShippingAddressIdAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerAddShippingAddressIdAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerChangeAddressAction) {
            return com.commercetools.api.models.me.MyCustomerChangeAddressAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerChangeAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerChangeEmailAction) {
            return com.commercetools.api.models.me.MyCustomerChangeEmailAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerChangeEmailAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerRemoveAddressAction) {
            return com.commercetools.api.models.me.MyCustomerRemoveAddressAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerRemoveAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdAction) {
            return com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdAction) {
            return com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetCompanyNameAction) {
            return com.commercetools.api.models.me.MyCustomerSetCompanyNameAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetCompanyNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetCustomFieldAction) {
            return com.commercetools.api.models.me.MyCustomerSetCustomFieldAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetCustomTypeAction) {
            return com.commercetools.api.models.me.MyCustomerSetCustomTypeAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetDateOfBirthAction) {
            return com.commercetools.api.models.me.MyCustomerSetDateOfBirthAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetDateOfBirthAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressAction) {
            return com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressAction) {
            return com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetFirstNameAction) {
            return com.commercetools.api.models.me.MyCustomerSetFirstNameAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetFirstNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetLastNameAction) {
            return com.commercetools.api.models.me.MyCustomerSetLastNameAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetLastNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetLocaleAction) {
            return com.commercetools.api.models.me.MyCustomerSetLocaleAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetLocaleAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetMiddleNameAction) {
            return com.commercetools.api.models.me.MyCustomerSetMiddleNameAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetMiddleNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetSalutationAction) {
            return com.commercetools.api.models.me.MyCustomerSetSalutationAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetSalutationAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetTitleAction) {
            return com.commercetools.api.models.me.MyCustomerSetTitleAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetTitleAction) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyCustomerSetVatIdAction) {
            return com.commercetools.api.models.me.MyCustomerSetVatIdAction
                    .deepCopy((com.commercetools.api.models.me.MyCustomerSetVatIdAction) template);
        }
        MyCustomerUpdateActionImpl instance = new MyCustomerUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerAddAddressActionBuilder addAddressBuilder() {
        return com.commercetools.api.models.me.MyCustomerAddAddressActionBuilder.of();
    }

    /**
     * builder for addBillingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerAddBillingAddressIdActionBuilder addBillingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyCustomerAddBillingAddressIdActionBuilder.of();
    }

    /**
     * builder for addShippingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerAddShippingAddressIdActionBuilder addShippingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyCustomerAddShippingAddressIdActionBuilder.of();
    }

    /**
     * builder for changeAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerChangeAddressActionBuilder changeAddressBuilder() {
        return com.commercetools.api.models.me.MyCustomerChangeAddressActionBuilder.of();
    }

    /**
     * builder for changeEmail subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerChangeEmailActionBuilder changeEmailBuilder() {
        return com.commercetools.api.models.me.MyCustomerChangeEmailActionBuilder.of();
    }

    /**
     * builder for removeAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerRemoveAddressActionBuilder removeAddressBuilder() {
        return com.commercetools.api.models.me.MyCustomerRemoveAddressActionBuilder.of();
    }

    /**
     * builder for removeBillingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdActionBuilder removeBillingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdActionBuilder.of();
    }

    /**
     * builder for removeShippingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdActionBuilder removeShippingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdActionBuilder.of();
    }

    /**
     * builder for setCompanyName subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetCompanyNameActionBuilder setCompanyNameBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetCompanyNameActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDateOfBirth subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetDateOfBirthActionBuilder setDateOfBirthBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetDateOfBirthActionBuilder.of();
    }

    /**
     * builder for setDefaultBillingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressActionBuilder setDefaultBillingAddressBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressActionBuilder.of();
    }

    /**
     * builder for setDefaultShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressActionBuilder setDefaultShippingAddressBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetDefaultShippingAddressActionBuilder.of();
    }

    /**
     * builder for setFirstName subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetFirstNameActionBuilder setFirstNameBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetFirstNameActionBuilder.of();
    }

    /**
     * builder for setLastName subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetLastNameActionBuilder setLastNameBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetLastNameActionBuilder.of();
    }

    /**
     * builder for setLocale subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetLocaleActionBuilder setLocaleBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetLocaleActionBuilder.of();
    }

    /**
     * builder for setMiddleName subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetMiddleNameActionBuilder setMiddleNameBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetMiddleNameActionBuilder.of();
    }

    /**
     * builder for setSalutation subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetSalutationActionBuilder setSalutationBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetSalutationActionBuilder.of();
    }

    /**
     * builder for setTitle subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetTitleActionBuilder setTitleBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetTitleActionBuilder.of();
    }

    /**
     * builder for setVatId subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCustomerSetVatIdActionBuilder setVatIdBuilder() {
        return com.commercetools.api.models.me.MyCustomerSetVatIdActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerUpdateAction(Function<MyCustomerUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerUpdateAction>";
            }
        };
    }
}
