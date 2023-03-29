
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetShippingAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetShippingAddressCustomTypeAction orderSetShippingAddressCustomTypeAction = OrderSetShippingAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetShippingAddressCustomTypeActionImpl.class)
public interface OrderSetShippingAddressCustomTypeAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetShippingAddressCustomTypeAction
     */
    String SET_SHIPPING_ADDRESS_CUSTOM_TYPE = "setShippingAddressCustomType";

    /**
     *  <p>Defines the Type that extends the <code>shippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the <code>shippingAddress</code>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the <code>shippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the <code>shippingAddress</code>.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of OrderSetShippingAddressCustomTypeAction
     */
    public static OrderSetShippingAddressCustomTypeAction of() {
        return new OrderSetShippingAddressCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetShippingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetShippingAddressCustomTypeAction of(final OrderSetShippingAddressCustomTypeAction template) {
        OrderSetShippingAddressCustomTypeActionImpl instance = new OrderSetShippingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetShippingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetShippingAddressCustomTypeAction deepCopy(
            @Nullable final OrderSetShippingAddressCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        OrderSetShippingAddressCustomTypeActionImpl instance = new OrderSetShippingAddressCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for OrderSetShippingAddressCustomTypeAction
     * @return builder
     */
    public static OrderSetShippingAddressCustomTypeActionBuilder builder() {
        return OrderSetShippingAddressCustomTypeActionBuilder.of();
    }

    /**
     * create builder for OrderSetShippingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetShippingAddressCustomTypeActionBuilder builder(
            final OrderSetShippingAddressCustomTypeAction template) {
        return OrderSetShippingAddressCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetShippingAddressCustomTypeAction(
            Function<OrderSetShippingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetShippingAddressCustomTypeAction>";
            }
        };
    }
}
