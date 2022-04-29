
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
@JsonDeserialize(as = OrderSetDeliveryCustomTypeActionImpl.class)
public interface OrderSetDeliveryCustomTypeAction extends OrderUpdateAction {

    String SET_DELIVERY_CUSTOM_TYPE = "setDeliveryCustomType";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the Delivery with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the Delivery.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setDeliveryId(final String deliveryId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetDeliveryCustomTypeAction of() {
        return new OrderSetDeliveryCustomTypeActionImpl();
    }

    public static OrderSetDeliveryCustomTypeAction of(final OrderSetDeliveryCustomTypeAction template) {
        OrderSetDeliveryCustomTypeActionImpl instance = new OrderSetDeliveryCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetDeliveryCustomTypeActionBuilder builder() {
        return OrderSetDeliveryCustomTypeActionBuilder.of();
    }

    public static OrderSetDeliveryCustomTypeActionBuilder builder(final OrderSetDeliveryCustomTypeAction template) {
        return OrderSetDeliveryCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderSetDeliveryCustomTypeAction(Function<OrderSetDeliveryCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetDeliveryCustomTypeAction>";
            }
        };
    }
}
