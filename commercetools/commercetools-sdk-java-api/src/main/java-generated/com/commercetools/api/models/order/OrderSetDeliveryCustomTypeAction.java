
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * OrderSetDeliveryCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryCustomTypeAction orderSetDeliveryCustomTypeAction = OrderSetDeliveryCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryCustomTypeActionImpl.class)
public interface OrderSetDeliveryCustomTypeAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetDeliveryCustomTypeAction
     */
    String SET_DELIVERY_CUSTOM_TYPE = "setDeliveryCustomType";

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryId
     */

    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryKey
     */

    @JsonProperty("deliveryKey")
    public String getDeliveryKey();

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryKey value to be set
     */

    public void setDeliveryKey(final String deliveryKey);

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of OrderSetDeliveryCustomTypeAction
     */
    public static OrderSetDeliveryCustomTypeAction of() {
        return new OrderSetDeliveryCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetDeliveryCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetDeliveryCustomTypeAction of(final OrderSetDeliveryCustomTypeAction template) {
        OrderSetDeliveryCustomTypeActionImpl instance = new OrderSetDeliveryCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetDeliveryCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetDeliveryCustomTypeAction deepCopy(@Nullable final OrderSetDeliveryCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        OrderSetDeliveryCustomTypeActionImpl instance = new OrderSetDeliveryCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for OrderSetDeliveryCustomTypeAction
     * @return builder
     */
    public static OrderSetDeliveryCustomTypeActionBuilder builder() {
        return OrderSetDeliveryCustomTypeActionBuilder.of();
    }

    /**
     * create builder for OrderSetDeliveryCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryCustomTypeActionBuilder builder(final OrderSetDeliveryCustomTypeAction template) {
        return OrderSetDeliveryCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetDeliveryCustomTypeAction(Function<OrderSetDeliveryCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetDeliveryCustomTypeAction>";
            }
        };
    }
}
