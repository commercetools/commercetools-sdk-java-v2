
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action sets, overwrites, or removes any existing Custom Field for an existing ShippingMethod.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetCustomFieldAction shippingMethodSetCustomFieldAction = ShippingMethodSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetCustomFieldActionImpl.class)
public interface ShippingMethodSetCustomFieldAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

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
     * @return instance of ShippingMethodSetCustomFieldAction
     */
    public static ShippingMethodSetCustomFieldAction of() {
        return new ShippingMethodSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetCustomFieldAction of(final ShippingMethodSetCustomFieldAction template) {
        ShippingMethodSetCustomFieldActionImpl instance = new ShippingMethodSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetCustomFieldAction deepCopy(
            @Nullable final ShippingMethodSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetCustomFieldActionImpl instance = new ShippingMethodSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetCustomFieldAction
     * @return builder
     */
    public static ShippingMethodSetCustomFieldActionBuilder builder() {
        return ShippingMethodSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetCustomFieldActionBuilder builder(final ShippingMethodSetCustomFieldAction template) {
        return ShippingMethodSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetCustomFieldAction(Function<ShippingMethodSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static ShippingMethodSetCustomFieldAction ofUnset(final String name) {
        return ShippingMethodSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetCustomFieldAction>";
            }
        };
    }
}
