
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetDeliveryAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetDeliveryAddressCustomTypeAction cartSetDeliveryAddressCustomTypeAction = CartSetDeliveryAddressCustomTypeAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetDeliveryAddressCustomTypeActionImpl.class)
public interface CartSetDeliveryAddressCustomTypeAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetDeliveryAddressCustomTypeAction
     */
    String SET_DELIVERY_ADDRESS_CUSTOM_TYPE = "setDeliveryAddressCustomType";

    /**
     *  <p><code>id</code> of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Defines the Type that extends the Delivery <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery <code>address</code>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Delivery <code>address</code>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p><code>id</code> of the Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Defines the Type that extends the Delivery <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery <code>address</code>.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Delivery <code>address</code>.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of CartSetDeliveryAddressCustomTypeAction
     */
    public static CartSetDeliveryAddressCustomTypeAction of() {
        return new CartSetDeliveryAddressCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetDeliveryAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetDeliveryAddressCustomTypeAction of(final CartSetDeliveryAddressCustomTypeAction template) {
        CartSetDeliveryAddressCustomTypeActionImpl instance = new CartSetDeliveryAddressCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetDeliveryAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetDeliveryAddressCustomTypeAction deepCopy(
            @Nullable final CartSetDeliveryAddressCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        CartSetDeliveryAddressCustomTypeActionImpl instance = new CartSetDeliveryAddressCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(Optional.ofNullable(template.getType())
                .map(com.commercetools.api.models.type.TypeResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setFields(Optional.ofNullable(template.getFields())
                .map(com.commercetools.api.models.type.FieldContainer::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartSetDeliveryAddressCustomTypeAction
     * @return builder
     */
    public static CartSetDeliveryAddressCustomTypeActionBuilder builder() {
        return CartSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    /**
     * create builder for CartSetDeliveryAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetDeliveryAddressCustomTypeActionBuilder builder(
            final CartSetDeliveryAddressCustomTypeAction template) {
        return CartSetDeliveryAddressCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetDeliveryAddressCustomTypeAction(
            Function<CartSetDeliveryAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetDeliveryAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetDeliveryAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetDeliveryAddressCustomTypeAction>";
            }
        };
    }
}
