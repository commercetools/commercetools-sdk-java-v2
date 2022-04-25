
package com.commercetools.api.models.order;

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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetItemShippingAddressCustomTypeActionImpl.class)
public interface OrderSetItemShippingAddressCustomTypeAction extends OrderUpdateAction {

    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE = "setItemShippingAddressCustomType";

    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the <code>itemShippingAddress</code> with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the <code>itemShippingAddress</code>.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setAddressKey(final String addressKey);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetItemShippingAddressCustomTypeAction of() {
        return new OrderSetItemShippingAddressCustomTypeActionImpl();
    }

    public static OrderSetItemShippingAddressCustomTypeAction of(
            final OrderSetItemShippingAddressCustomTypeAction template) {
        OrderSetItemShippingAddressCustomTypeActionImpl instance = new OrderSetItemShippingAddressCustomTypeActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetItemShippingAddressCustomTypeActionBuilder builder() {
        return OrderSetItemShippingAddressCustomTypeActionBuilder.of();
    }

    public static OrderSetItemShippingAddressCustomTypeActionBuilder builder(
            final OrderSetItemShippingAddressCustomTypeAction template) {
        return OrderSetItemShippingAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderSetItemShippingAddressCustomTypeAction(
            Function<OrderSetItemShippingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetItemShippingAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetItemShippingAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetItemShippingAddressCustomTypeAction>";
            }
        };
    }
}
