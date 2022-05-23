
package com.commercetools.api.models.order;

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

    String SET_SHIPPING_ADDRESS_CUSTOM_TYPE = "setShippingAddressCustomType";

    /**
     <*  <p>Defines the Type that extends the <code>shippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     <*  <p>Sets the Custom Fields fields for the <code>shippingAddress</code>.</p>>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetShippingAddressCustomTypeAction of() {
        return new OrderSetShippingAddressCustomTypeActionImpl();
    }

    public static OrderSetShippingAddressCustomTypeAction of(final OrderSetShippingAddressCustomTypeAction template) {
        OrderSetShippingAddressCustomTypeActionImpl instance = new OrderSetShippingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetShippingAddressCustomTypeActionBuilder builder() {
        return OrderSetShippingAddressCustomTypeActionBuilder.of();
    }

    public static OrderSetShippingAddressCustomTypeActionBuilder builder(
            final OrderSetShippingAddressCustomTypeAction template) {
        return OrderSetShippingAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderSetShippingAddressCustomTypeAction(
            Function<OrderSetShippingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetShippingAddressCustomTypeAction>";
            }
        };
    }
}
