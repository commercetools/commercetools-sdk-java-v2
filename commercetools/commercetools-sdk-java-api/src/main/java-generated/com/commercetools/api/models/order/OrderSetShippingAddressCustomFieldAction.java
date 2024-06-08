
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * OrderSetShippingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetShippingAddressCustomFieldAction orderSetShippingAddressCustomFieldAction = OrderSetShippingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetShippingAddressCustomFieldActionImpl.class)
public interface OrderSetShippingAddressCustomFieldAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetShippingAddressCustomFieldAction
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
     * @return instance of OrderSetShippingAddressCustomFieldAction
     */
    public static OrderSetShippingAddressCustomFieldAction of() {
        return new OrderSetShippingAddressCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetShippingAddressCustomFieldAction of(final OrderSetShippingAddressCustomFieldAction template) {
        OrderSetShippingAddressCustomFieldActionImpl instance = new OrderSetShippingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetShippingAddressCustomFieldAction deepCopy(
            @Nullable final OrderSetShippingAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        OrderSetShippingAddressCustomFieldActionImpl instance = new OrderSetShippingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for OrderSetShippingAddressCustomFieldAction
     * @return builder
     */
    public static OrderSetShippingAddressCustomFieldActionBuilder builder() {
        return OrderSetShippingAddressCustomFieldActionBuilder.of();
    }

    /**
     * create builder for OrderSetShippingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetShippingAddressCustomFieldActionBuilder builder(
            final OrderSetShippingAddressCustomFieldAction template) {
        return OrderSetShippingAddressCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetShippingAddressCustomFieldAction(
            Function<OrderSetShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderSetShippingAddressCustomFieldAction ofUnset(final String name) {
        return OrderSetShippingAddressCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetShippingAddressCustomFieldAction>";
            }
        };
    }
}
