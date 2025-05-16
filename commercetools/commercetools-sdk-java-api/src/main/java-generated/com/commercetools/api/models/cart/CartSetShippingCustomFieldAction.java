
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
 * CartSetShippingCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingCustomFieldAction cartSetShippingCustomFieldAction = CartSetShippingCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setShippingCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingCustomFieldActionImpl.class)
public interface CartSetShippingCustomFieldAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetShippingCustomFieldAction
     */
    String SET_SHIPPING_CUSTOM_FIELD = "setShippingCustomField";

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Cart with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Cart.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Cart with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Cart.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of CartSetShippingCustomFieldAction
     */
    public static CartSetShippingCustomFieldAction of() {
        return new CartSetShippingCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetShippingCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetShippingCustomFieldAction of(final CartSetShippingCustomFieldAction template) {
        CartSetShippingCustomFieldActionImpl instance = new CartSetShippingCustomFieldActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public CartSetShippingCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetShippingCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetShippingCustomFieldAction deepCopy(@Nullable final CartSetShippingCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CartSetShippingCustomFieldActionImpl instance = new CartSetShippingCustomFieldActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CartSetShippingCustomFieldAction
     * @return builder
     */
    public static CartSetShippingCustomFieldActionBuilder builder() {
        return CartSetShippingCustomFieldActionBuilder.of();
    }

    /**
     * create builder for CartSetShippingCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingCustomFieldActionBuilder builder(final CartSetShippingCustomFieldAction template) {
        return CartSetShippingCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetShippingCustomFieldAction(Function<CartSetShippingCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingCustomFieldAction>";
            }
        };
    }
}
