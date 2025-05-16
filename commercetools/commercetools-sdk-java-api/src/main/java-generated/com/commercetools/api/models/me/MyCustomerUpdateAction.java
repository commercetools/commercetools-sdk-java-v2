
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

    public MyCustomerUpdateAction copyDeep();

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

        if (!(template instanceof MyCustomerUpdateActionImpl)) {
            return template.copyDeep();
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
