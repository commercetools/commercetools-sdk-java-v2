
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
 * MyBusinessUnitUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitUpdateAction myBusinessUnitUpdateAction = MyBusinessUnitUpdateAction.addAddressBuilder()
 *             address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = MyBusinessUnitUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = MyBusinessUnitUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MyBusinessUnitUpdateAction {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public MyBusinessUnitUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of MyBusinessUnitUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitUpdateAction deepCopy(@Nullable final MyBusinessUnitUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof MyBusinessUnitUpdateActionImpl)) {
            return template.copyDeep();
        }
        MyBusinessUnitUpdateActionImpl instance = new MyBusinessUnitUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitAddAddressActionBuilder addAddressBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitAddAddressActionBuilder.of();
    }

    /**
     * builder for addBillingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitAddBillingAddressIdActionBuilder addBillingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitAddBillingAddressIdActionBuilder.of();
    }

    /**
     * builder for addShippingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitAddShippingAddressIdActionBuilder addShippingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitAddShippingAddressIdActionBuilder.of();
    }

    /**
     * builder for changeAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitChangeAddressActionBuilder changeAddressBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitChangeAddressActionBuilder.of();
    }

    /**
     * builder for changeAssociate subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitChangeAssociateActionBuilder changeAssociateBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitChangeAssociateActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitChangeNameActionBuilder.of();
    }

    /**
     * builder for changeParentUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitChangeParentUnitActionBuilder changeParentUnitBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitChangeParentUnitActionBuilder.of();
    }

    /**
     * builder for removeAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitRemoveAddressActionBuilder removeAddressBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitRemoveAddressActionBuilder.of();
    }

    /**
     * builder for removeAssociate subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitRemoveAssociateActionBuilder removeAssociateBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitRemoveAssociateActionBuilder.of();
    }

    /**
     * builder for removeBillingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitRemoveBillingAddressIdActionBuilder removeBillingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitRemoveBillingAddressIdActionBuilder.of();
    }

    /**
     * builder for removeShippingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitRemoveShippingAddressIdActionBuilder removeShippingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitRemoveShippingAddressIdActionBuilder.of();
    }

    /**
     * builder for setAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitSetAddressCustomFieldActionBuilder setAddressCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitSetAddressCustomTypeActionBuilder setAddressCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setContactEmail subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitSetContactEmailActionBuilder setContactEmailBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetContactEmailActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDefaultBillingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitSetDefaultBillingAddressActionBuilder setDefaultBillingAddressBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetDefaultBillingAddressActionBuilder.of();
    }

    /**
     * builder for setDefaultShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyBusinessUnitSetDefaultShippingAddressActionBuilder setDefaultShippingAddressBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetDefaultShippingAddressActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitUpdateAction(Function<MyBusinessUnitUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitUpdateAction>";
            }
        };
    }
}
