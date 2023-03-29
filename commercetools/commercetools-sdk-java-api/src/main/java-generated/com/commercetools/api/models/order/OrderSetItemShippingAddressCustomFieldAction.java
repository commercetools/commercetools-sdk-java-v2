
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
 * OrderSetItemShippingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetItemShippingAddressCustomFieldAction orderSetItemShippingAddressCustomFieldAction = OrderSetItemShippingAddressCustomFieldAction.builder()
 *             .addressKey("{addressKey}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetItemShippingAddressCustomFieldActionImpl.class)
public interface OrderSetItemShippingAddressCustomFieldAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetItemShippingAddressCustomFieldAction
     */
    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD = "setItemShippingAddressCustomField";

    /**
     *
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
     * set addressKey
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
     * @return instance of OrderSetItemShippingAddressCustomFieldAction
     */
    public static OrderSetItemShippingAddressCustomFieldAction of() {
        return new OrderSetItemShippingAddressCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetItemShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetItemShippingAddressCustomFieldAction of(
            final OrderSetItemShippingAddressCustomFieldAction template) {
        OrderSetItemShippingAddressCustomFieldActionImpl instance = new OrderSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetItemShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetItemShippingAddressCustomFieldAction deepCopy(
            @Nullable final OrderSetItemShippingAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        OrderSetItemShippingAddressCustomFieldActionImpl instance = new OrderSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for OrderSetItemShippingAddressCustomFieldAction
     * @return builder
     */
    public static OrderSetItemShippingAddressCustomFieldActionBuilder builder() {
        return OrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    /**
     * create builder for OrderSetItemShippingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetItemShippingAddressCustomFieldActionBuilder builder(
            final OrderSetItemShippingAddressCustomFieldAction template) {
        return OrderSetItemShippingAddressCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetItemShippingAddressCustomFieldAction(
            Function<OrderSetItemShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderSetItemShippingAddressCustomFieldAction ofUnset(final String name, final String addressKey) {
        return OrderSetItemShippingAddressCustomFieldActionBuilder.of().name(name).addressKey(addressKey).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetItemShippingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetItemShippingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetItemShippingAddressCustomFieldAction>";
            }
        };
    }
}
