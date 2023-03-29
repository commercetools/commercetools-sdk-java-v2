
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
 * OrderSetDeliveryAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryAddressCustomFieldAction orderSetDeliveryAddressCustomFieldAction = OrderSetDeliveryAddressCustomFieldAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryAddressCustomFieldActionImpl.class)
public interface OrderSetDeliveryAddressCustomFieldAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetDeliveryAddressCustomFieldAction
     */
    String SET_DELIVERY_ADDRESS_CUSTOM_FIELD = "setDeliveryAddressCustomField";

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
     * @return instance of OrderSetDeliveryAddressCustomFieldAction
     */
    public static OrderSetDeliveryAddressCustomFieldAction of() {
        return new OrderSetDeliveryAddressCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetDeliveryAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetDeliveryAddressCustomFieldAction of(final OrderSetDeliveryAddressCustomFieldAction template) {
        OrderSetDeliveryAddressCustomFieldActionImpl instance = new OrderSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetDeliveryAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetDeliveryAddressCustomFieldAction deepCopy(
            @Nullable final OrderSetDeliveryAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        OrderSetDeliveryAddressCustomFieldActionImpl instance = new OrderSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for OrderSetDeliveryAddressCustomFieldAction
     * @return builder
     */
    public static OrderSetDeliveryAddressCustomFieldActionBuilder builder() {
        return OrderSetDeliveryAddressCustomFieldActionBuilder.of();
    }

    /**
     * create builder for OrderSetDeliveryAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryAddressCustomFieldActionBuilder builder(
            final OrderSetDeliveryAddressCustomFieldAction template) {
        return OrderSetDeliveryAddressCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetDeliveryAddressCustomFieldAction(
            Function<OrderSetDeliveryAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderSetDeliveryAddressCustomFieldAction ofUnset(final String name, final String deliveryId) {
        return OrderSetDeliveryAddressCustomFieldActionBuilder.of().name(name).deliveryId(deliveryId).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetDeliveryAddressCustomFieldAction>";
            }
        };
    }
}
