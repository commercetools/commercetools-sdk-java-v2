
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CartSetItemShippingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetItemShippingAddressCustomFieldAction cartSetItemShippingAddressCustomFieldAction = CartSetItemShippingAddressCustomFieldAction.builder()
 *             .addressKey("{addressKey}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetItemShippingAddressCustomFieldActionImpl.class)
public interface CartSetItemShippingAddressCustomFieldAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetItemShippingAddressCustomFieldAction
     */
    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD = "setItemShippingAddressCustomField";

    /**
     *  <p><code>key</code> of the Address in <code>itemShippingAddress</code>.</p>
     * @return addressKey
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p><code>key</code> of the Address in <code>itemShippingAddress</code>.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of CartSetItemShippingAddressCustomFieldAction
     */
    public static CartSetItemShippingAddressCustomFieldAction of() {
        return new CartSetItemShippingAddressCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetItemShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetItemShippingAddressCustomFieldAction of(
            final CartSetItemShippingAddressCustomFieldAction template) {
        CartSetItemShippingAddressCustomFieldActionImpl instance = new CartSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetItemShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetItemShippingAddressCustomFieldAction deepCopy(
            @Nullable final CartSetItemShippingAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CartSetItemShippingAddressCustomFieldActionImpl instance = new CartSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CartSetItemShippingAddressCustomFieldAction
     * @return builder
     */
    public static CartSetItemShippingAddressCustomFieldActionBuilder builder() {
        return CartSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    /**
     * create builder for CartSetItemShippingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetItemShippingAddressCustomFieldActionBuilder builder(
            final CartSetItemShippingAddressCustomFieldAction template) {
        return CartSetItemShippingAddressCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetItemShippingAddressCustomFieldAction(
            Function<CartSetItemShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CartSetItemShippingAddressCustomFieldAction ofUnset(final String name, final String addressKey) {
        return CartSetItemShippingAddressCustomFieldActionBuilder.of().name(name).addressKey(addressKey).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetItemShippingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetItemShippingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetItemShippingAddressCustomFieldAction>";
            }
        };
    }
}
