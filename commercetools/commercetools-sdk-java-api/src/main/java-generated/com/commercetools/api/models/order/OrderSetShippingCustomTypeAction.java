
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
 *  <p>This action sets, overwrites, or removes any existing Custom Type and Custom Fields for the Order's <code>shippingMethod</code> or <code>shipping</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetShippingCustomTypeAction orderSetShippingCustomTypeAction = OrderSetShippingCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetShippingCustomTypeActionImpl.class)
public interface OrderSetShippingCustomTypeAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetShippingCustomTypeAction
     */
    String SET_SHIPPING_CUSTOM_TYPE = "setShippingCustomType";

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Defines the Type that extends the specified ShippingMethod with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the <code>shippingMethod</code>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>Defines the Type that extends the specified ShippingMethod with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the <code>shippingMethod</code>.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of OrderSetShippingCustomTypeAction
     */
    public static OrderSetShippingCustomTypeAction of() {
        return new OrderSetShippingCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetShippingCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetShippingCustomTypeAction of(final OrderSetShippingCustomTypeAction template) {
        OrderSetShippingCustomTypeActionImpl instance = new OrderSetShippingCustomTypeActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetShippingCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetShippingCustomTypeAction deepCopy(@Nullable final OrderSetShippingCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        OrderSetShippingCustomTypeActionImpl instance = new OrderSetShippingCustomTypeActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for OrderSetShippingCustomTypeAction
     * @return builder
     */
    public static OrderSetShippingCustomTypeActionBuilder builder() {
        return OrderSetShippingCustomTypeActionBuilder.of();
    }

    /**
     * create builder for OrderSetShippingCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetShippingCustomTypeActionBuilder builder(final OrderSetShippingCustomTypeAction template) {
        return OrderSetShippingCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetShippingCustomTypeAction(Function<OrderSetShippingCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetShippingCustomTypeAction>";
            }
        };
    }
}
