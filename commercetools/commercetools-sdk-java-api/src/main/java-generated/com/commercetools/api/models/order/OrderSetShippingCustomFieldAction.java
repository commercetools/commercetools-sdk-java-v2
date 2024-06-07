
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetShippingCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetShippingCustomFieldAction orderSetShippingCustomFieldAction = OrderSetShippingCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetShippingCustomFieldActionImpl.class)
public interface OrderSetShippingCustomFieldAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetShippingCustomFieldAction
     */
    String SET_SHIPPING_CUSTOM_FIELD = "setShippingCustomField";

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
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
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
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
     * @return instance of OrderSetShippingCustomFieldAction
     */
    public static OrderSetShippingCustomFieldAction of() {
        return new OrderSetShippingCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetShippingCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetShippingCustomFieldAction of(final OrderSetShippingCustomFieldAction template) {
        OrderSetShippingCustomFieldActionImpl instance = new OrderSetShippingCustomFieldActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetShippingCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetShippingCustomFieldAction deepCopy(
            @Nullable final OrderSetShippingCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        OrderSetShippingCustomFieldActionImpl instance = new OrderSetShippingCustomFieldActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for OrderSetShippingCustomFieldAction
     * @return builder
     */
    public static OrderSetShippingCustomFieldActionBuilder builder() {
        return OrderSetShippingCustomFieldActionBuilder.of();
    }

    /**
     * create builder for OrderSetShippingCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetShippingCustomFieldActionBuilder builder(final OrderSetShippingCustomFieldAction template) {
        return OrderSetShippingCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetShippingCustomFieldAction(Function<OrderSetShippingCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetShippingCustomFieldAction>";
            }
        };
    }
}
