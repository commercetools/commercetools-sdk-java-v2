
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
 * OrderSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomFieldAction orderSetCustomFieldAction = OrderSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomFieldActionImpl.class)
public interface OrderSetCustomFieldAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetCustomFieldAction
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
     * @return instance of OrderSetCustomFieldAction
     */
    public static OrderSetCustomFieldAction of() {
        return new OrderSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetCustomFieldAction of(final OrderSetCustomFieldAction template) {
        OrderSetCustomFieldActionImpl instance = new OrderSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetCustomFieldAction deepCopy(@Nullable final OrderSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        OrderSetCustomFieldActionImpl instance = new OrderSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for OrderSetCustomFieldAction
     * @return builder
     */
    public static OrderSetCustomFieldActionBuilder builder() {
        return OrderSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for OrderSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetCustomFieldActionBuilder builder(final OrderSetCustomFieldAction template) {
        return OrderSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetCustomFieldAction(Function<OrderSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderSetCustomFieldAction ofUnset(final String name) {
        return OrderSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetCustomFieldAction>";
            }
        };
    }
}
