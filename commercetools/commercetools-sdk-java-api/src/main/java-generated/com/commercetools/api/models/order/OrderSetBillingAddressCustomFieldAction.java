
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
 * OrderSetBillingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetBillingAddressCustomFieldAction orderSetBillingAddressCustomFieldAction = OrderSetBillingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setBillingAddressCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetBillingAddressCustomFieldActionImpl.class)
public interface OrderSetBillingAddressCustomFieldAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetBillingAddressCustomFieldAction
     */
    String SET_BILLING_ADDRESS_CUSTOM_FIELD = "setBillingAddressCustomField";

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
     * @return instance of OrderSetBillingAddressCustomFieldAction
     */
    public static OrderSetBillingAddressCustomFieldAction of() {
        return new OrderSetBillingAddressCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetBillingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetBillingAddressCustomFieldAction of(final OrderSetBillingAddressCustomFieldAction template) {
        OrderSetBillingAddressCustomFieldActionImpl instance = new OrderSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public OrderSetBillingAddressCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of OrderSetBillingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetBillingAddressCustomFieldAction deepCopy(
            @Nullable final OrderSetBillingAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        OrderSetBillingAddressCustomFieldActionImpl instance = new OrderSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for OrderSetBillingAddressCustomFieldAction
     * @return builder
     */
    public static OrderSetBillingAddressCustomFieldActionBuilder builder() {
        return OrderSetBillingAddressCustomFieldActionBuilder.of();
    }

    /**
     * create builder for OrderSetBillingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetBillingAddressCustomFieldActionBuilder builder(
            final OrderSetBillingAddressCustomFieldAction template) {
        return OrderSetBillingAddressCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetBillingAddressCustomFieldAction(
            Function<OrderSetBillingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderSetBillingAddressCustomFieldAction ofUnset(final String name) {
        return OrderSetBillingAddressCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetBillingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetBillingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetBillingAddressCustomFieldAction>";
            }
        };
    }
}
