
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
 * OrderSetDeliveryCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryCustomFieldAction orderSetDeliveryCustomFieldAction = OrderSetDeliveryCustomFieldAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryCustomFieldActionImpl.class)
public interface OrderSetDeliveryCustomFieldAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetDeliveryCustomFieldAction
     */
    String SET_DELIVERY_CUSTOM_FIELD = "setDeliveryCustomField";

    /**
     *
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

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
     * set deliveryId
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

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
     * @return instance of OrderSetDeliveryCustomFieldAction
     */
    public static OrderSetDeliveryCustomFieldAction of() {
        return new OrderSetDeliveryCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetDeliveryCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetDeliveryCustomFieldAction of(final OrderSetDeliveryCustomFieldAction template) {
        OrderSetDeliveryCustomFieldActionImpl instance = new OrderSetDeliveryCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetDeliveryCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetDeliveryCustomFieldAction deepCopy(
            @Nullable final OrderSetDeliveryCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        OrderSetDeliveryCustomFieldActionImpl instance = new OrderSetDeliveryCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for OrderSetDeliveryCustomFieldAction
     * @return builder
     */
    public static OrderSetDeliveryCustomFieldActionBuilder builder() {
        return OrderSetDeliveryCustomFieldActionBuilder.of();
    }

    /**
     * create builder for OrderSetDeliveryCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryCustomFieldActionBuilder builder(final OrderSetDeliveryCustomFieldAction template) {
        return OrderSetDeliveryCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetDeliveryCustomFieldAction(Function<OrderSetDeliveryCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderSetDeliveryCustomFieldAction ofUnset(final String name, final String deliveryId) {
        return OrderSetDeliveryCustomFieldActionBuilder.of().name(name).deliveryId(deliveryId).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetDeliveryCustomFieldAction>";
            }
        };
    }
}
