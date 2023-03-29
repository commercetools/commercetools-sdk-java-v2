
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingAddressCustomFieldAction cartSetShippingAddressCustomFieldAction = CartSetShippingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingAddressCustomFieldActionImpl.class)
public interface CartSetShippingAddressCustomFieldAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetShippingAddressCustomFieldAction
     */
    String SET_SHIPPING_ADDRESS_CUSTOM_FIELD = "setShippingAddressCustomField";

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
     * @return instance of CartSetShippingAddressCustomFieldAction
     */
    public static CartSetShippingAddressCustomFieldAction of() {
        return new CartSetShippingAddressCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetShippingAddressCustomFieldAction of(final CartSetShippingAddressCustomFieldAction template) {
        CartSetShippingAddressCustomFieldActionImpl instance = new CartSetShippingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetShippingAddressCustomFieldAction deepCopy(
            @Nullable final CartSetShippingAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CartSetShippingAddressCustomFieldActionImpl instance = new CartSetShippingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CartSetShippingAddressCustomFieldAction
     * @return builder
     */
    public static CartSetShippingAddressCustomFieldActionBuilder builder() {
        return CartSetShippingAddressCustomFieldActionBuilder.of();
    }

    /**
     * create builder for CartSetShippingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingAddressCustomFieldActionBuilder builder(
            final CartSetShippingAddressCustomFieldAction template) {
        return CartSetShippingAddressCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetShippingAddressCustomFieldAction(
            Function<CartSetShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static CartSetShippingAddressCustomFieldAction ofUnset(final String name) {
        return CartSetShippingAddressCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingAddressCustomFieldAction>";
            }
        };
    }
}
