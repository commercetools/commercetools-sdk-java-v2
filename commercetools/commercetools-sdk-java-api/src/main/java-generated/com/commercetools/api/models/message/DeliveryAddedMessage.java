
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
@JsonDeserialize(as = DeliveryAddedMessageImpl.class)
public interface DeliveryAddedMessage extends Message {

    String DELIVERY_ADDED = "DeliveryAdded";

    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    public void setDelivery(final Delivery delivery);

    public static DeliveryAddedMessage of() {
        return new DeliveryAddedMessageImpl();
    }

    public static DeliveryAddedMessage of(final DeliveryAddedMessage template) {
        DeliveryAddedMessageImpl instance = new DeliveryAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setDelivery(template.getDelivery());
        return instance;
    }

    public static DeliveryAddedMessageBuilder builder() {
        return DeliveryAddedMessageBuilder.of();
    }

    public static DeliveryAddedMessageBuilder builder(final DeliveryAddedMessage template) {
        return DeliveryAddedMessageBuilder.of(template);
    }

    default <T> T withDeliveryAddedMessage(Function<DeliveryAddedMessage, T> helper) {
        return helper.apply(this);
    }
}
