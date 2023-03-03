
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String SET_DELIVERY_ADDRESS_CUSTOM_TYPE = "setDeliveryAddressCustomType";

    /**
     *  <p><code>id</code> of the Delivery.</p>
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Defines the Type that extends the Delivery <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery <code>address</code>.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Delivery <code>address</code>.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setDeliveryId(final String deliveryId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CartSetDeliveryAddressCustomTypeAction of() {
        return new CartSetDeliveryAddressCustomTypeActionImpl();
    }

    public static CartSetDeliveryAddressCustomTypeAction of(final CartSetDeliveryAddressCustomTypeAction template) {
        CartSetDeliveryAddressCustomTypeActionImpl instance = new CartSetDeliveryAddressCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CartSetDeliveryAddressCustomTypeActionBuilder builder() {
        return CartSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    public static CartSetDeliveryAddressCustomTypeActionBuilder builder(
            final CartSetDeliveryAddressCustomTypeAction template) {
        return CartSetDeliveryAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withCartSetDeliveryAddressCustomTypeAction(
            Function<CartSetDeliveryAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetDeliveryAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetDeliveryAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetDeliveryAddressCustomTypeAction>";
            }
        };
    }
}
