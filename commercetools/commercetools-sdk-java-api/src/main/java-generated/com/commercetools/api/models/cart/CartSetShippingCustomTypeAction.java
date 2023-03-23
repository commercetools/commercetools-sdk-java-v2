
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action sets, overwrites, or removes any existing Custom Type and Custom Fields for the Cart's <code>shippingMethod</code> or <code>shipping</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingCustomTypeAction cartSetShippingCustomTypeAction = CartSetShippingCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingCustomTypeActionImpl.class)
public interface CartSetShippingCustomTypeAction extends CartUpdateAction {

    String SET_SHIPPING_CUSTOM_TYPE = "setShippingCustomType";

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Cart with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Cart.</p>
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

    public void setShippingKey(final String shippingKey);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CartSetShippingCustomTypeAction of() {
        return new CartSetShippingCustomTypeActionImpl();
    }

    public static CartSetShippingCustomTypeAction of(final CartSetShippingCustomTypeAction template) {
        CartSetShippingCustomTypeActionImpl instance = new CartSetShippingCustomTypeActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CartSetShippingCustomTypeActionBuilder builder() {
        return CartSetShippingCustomTypeActionBuilder.of();
    }

    public static CartSetShippingCustomTypeActionBuilder builder(final CartSetShippingCustomTypeAction template) {
        return CartSetShippingCustomTypeActionBuilder.of(template);
    }

    default <T> T withCartSetShippingCustomTypeAction(Function<CartSetShippingCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingCustomTypeAction>";
            }
        };
    }
}
