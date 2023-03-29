
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
 * OrderSetReturnItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnItemCustomFieldAction orderSetReturnItemCustomFieldAction = OrderSetReturnItemCustomFieldAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetReturnItemCustomFieldActionImpl.class)
public interface OrderSetReturnItemCustomFieldAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetReturnItemCustomFieldAction
     */
    String SET_RETURN_ITEM_CUSTOM_FIELD = "setReturnItemCustomField";

    /**
     *
     * @return returnItemId
     */
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

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
     * set returnItemId
     * @param returnItemId value to be set
     */

    public void setReturnItemId(final String returnItemId);

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
     * @return instance of OrderSetReturnItemCustomFieldAction
     */
    public static OrderSetReturnItemCustomFieldAction of() {
        return new OrderSetReturnItemCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetReturnItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetReturnItemCustomFieldAction of(final OrderSetReturnItemCustomFieldAction template) {
        OrderSetReturnItemCustomFieldActionImpl instance = new OrderSetReturnItemCustomFieldActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetReturnItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetReturnItemCustomFieldAction deepCopy(
            @Nullable final OrderSetReturnItemCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        OrderSetReturnItemCustomFieldActionImpl instance = new OrderSetReturnItemCustomFieldActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for OrderSetReturnItemCustomFieldAction
     * @return builder
     */
    public static OrderSetReturnItemCustomFieldActionBuilder builder() {
        return OrderSetReturnItemCustomFieldActionBuilder.of();
    }

    /**
     * create builder for OrderSetReturnItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetReturnItemCustomFieldActionBuilder builder(
            final OrderSetReturnItemCustomFieldAction template) {
        return OrderSetReturnItemCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetReturnItemCustomFieldAction(Function<OrderSetReturnItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderSetReturnItemCustomFieldAction ofUnset(final String name, final String returnItemId) {
        return OrderSetReturnItemCustomFieldActionBuilder.of().name(name).returnItemId(returnItemId).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetReturnItemCustomFieldAction>";
            }
        };
    }
}
