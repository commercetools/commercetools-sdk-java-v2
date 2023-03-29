
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
 * CartSetItemShippingAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetItemShippingAddressCustomTypeAction cartSetItemShippingAddressCustomTypeAction = CartSetItemShippingAddressCustomTypeAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetItemShippingAddressCustomTypeActionImpl.class)
public interface CartSetItemShippingAddressCustomTypeAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetItemShippingAddressCustomTypeAction
     */
    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE = "setItemShippingAddressCustomType";

    /**
     *  <p><code>key</code> of the Address in <code>itemShippingAddress</code>.</p>
     * @return addressKey
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p><code>key</code> of the Address in <code>itemShippingAddress</code>.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of CartSetItemShippingAddressCustomTypeAction
     */
    public static CartSetItemShippingAddressCustomTypeAction of() {
        return new CartSetItemShippingAddressCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetItemShippingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetItemShippingAddressCustomTypeAction of(
            final CartSetItemShippingAddressCustomTypeAction template) {
        CartSetItemShippingAddressCustomTypeActionImpl instance = new CartSetItemShippingAddressCustomTypeActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetItemShippingAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetItemShippingAddressCustomTypeAction deepCopy(
            @Nullable final CartSetItemShippingAddressCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        CartSetItemShippingAddressCustomTypeActionImpl instance = new CartSetItemShippingAddressCustomTypeActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for CartSetItemShippingAddressCustomTypeAction
     * @return builder
     */
    public static CartSetItemShippingAddressCustomTypeActionBuilder builder() {
        return CartSetItemShippingAddressCustomTypeActionBuilder.of();
    }

    /**
     * create builder for CartSetItemShippingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetItemShippingAddressCustomTypeActionBuilder builder(
            final CartSetItemShippingAddressCustomTypeAction template) {
        return CartSetItemShippingAddressCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetItemShippingAddressCustomTypeAction(
            Function<CartSetItemShippingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetItemShippingAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetItemShippingAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetItemShippingAddressCustomTypeAction>";
            }
        };
    }
}
