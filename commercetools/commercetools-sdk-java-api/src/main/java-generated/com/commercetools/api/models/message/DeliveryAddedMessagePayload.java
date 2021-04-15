
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Delivery;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DeliveryAddedMessagePayloadImpl.class)
public interface DeliveryAddedMessagePayload extends MessagePayload {

    String DELIVERY_ADDED = "DeliveryAdded";

    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    public void setDelivery(final Delivery delivery);

    public static DeliveryAddedMessagePayload of() {
        return new DeliveryAddedMessagePayloadImpl();
    }

    public static DeliveryAddedMessagePayload of(final DeliveryAddedMessagePayload template) {
        DeliveryAddedMessagePayloadImpl instance = new DeliveryAddedMessagePayloadImpl();
        instance.setDelivery(template.getDelivery());
        return instance;
    }

    public static DeliveryAddedMessagePayloadBuilder builder() {
        return DeliveryAddedMessagePayloadBuilder.of();
    }

    public static DeliveryAddedMessagePayloadBuilder builder(final DeliveryAddedMessagePayload template) {
        return DeliveryAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withDeliveryAddedMessagePayload(Function<DeliveryAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
