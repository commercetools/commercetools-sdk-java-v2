
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryCustomTypeActionImpl.class)
public interface OrderSetDeliveryCustomTypeAction extends OrderUpdateAction {

    String SET_DELIVERY_CUSTOM_TYPE = "setDeliveryCustomType";

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetDeliveryCustomTypeAction of() {
        return new OrderSetDeliveryCustomTypeActionImpl();
    }

    public static OrderSetDeliveryCustomTypeAction of(final OrderSetDeliveryCustomTypeAction template) {
        OrderSetDeliveryCustomTypeActionImpl instance = new OrderSetDeliveryCustomTypeActionImpl();
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
}