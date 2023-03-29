
package com.commercetools.api.models.cart;

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
 * CartSetShippingAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingAddressCustomTypeAction cartSetShippingAddressCustomTypeAction = CartSetShippingAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingAddressCustomTypeActionImpl.class)
public interface CartSetShippingAddressCustomTypeAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetShippingAddressCustomTypeAction
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
     * @return instance of CartSetShippingAddressCustomTypeAction
     */
    public static CartSetShippingAddressCustomTypeAction of() {
        return new CartSetShippingAddressCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetShippingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetShippingAddressCustomTypeAction of(final CartSetShippingAddressCustomTypeAction template) {
        CartSetShippingAddressCustomTypeActionImpl instance = new CartSetShippingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetShippingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetShippingAddressCustomTypeAction deepCopy(
            @Nullable final CartSetShippingAddressCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        CartSetShippingAddressCustomTypeActionImpl instance = new CartSetShippingAddressCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for CartSetShippingAddressCustomTypeAction
     * @return builder
     */
    public static CartSetShippingAddressCustomTypeActionBuilder builder() {
        return CartSetShippingAddressCustomTypeActionBuilder.of();
    }

    /**
     * create builder for CartSetShippingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingAddressCustomTypeActionBuilder builder(
            final CartSetShippingAddressCustomTypeAction template) {
        return CartSetShippingAddressCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetShippingAddressCustomTypeAction(
            Function<CartSetShippingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingAddressCustomTypeAction>";
            }
        };
    }
}
