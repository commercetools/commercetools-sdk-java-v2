
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
@JsonDeserialize(as = OrderSetDeliveryAddressCustomTypeActionImpl.class)
public interface OrderSetDeliveryAddressCustomTypeAction extends OrderUpdateAction {

    String SET_DELIVERY_ADDRESS_CUSTOM_TYPE = "setDeliveryAddressCustomType";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setDeliveryId(final String deliveryId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetDeliveryAddressCustomTypeAction of() {
        return new OrderSetDeliveryAddressCustomTypeActionImpl();
    }

    public static OrderSetDeliveryAddressCustomTypeAction of(final OrderSetDeliveryAddressCustomTypeAction template) {
        OrderSetDeliveryAddressCustomTypeActionImpl instance = new OrderSetDeliveryAddressCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetDeliveryAddressCustomTypeActionBuilder builder() {
        return OrderSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    public static OrderSetDeliveryAddressCustomTypeActionBuilder builder(
            final OrderSetDeliveryAddressCustomTypeAction template) {
        return OrderSetDeliveryAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderSetDeliveryAddressCustomTypeAction(
            Function<OrderSetDeliveryAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
