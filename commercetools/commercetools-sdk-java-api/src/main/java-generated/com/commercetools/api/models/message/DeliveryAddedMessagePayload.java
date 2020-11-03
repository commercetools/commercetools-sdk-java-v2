package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.message.DeliveryAddedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DeliveryAddedMessagePayloadImpl.class)
public interface DeliveryAddedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    public void setDelivery(final Delivery delivery);

    public static DeliveryAddedMessagePayloadImpl of(){
        return new DeliveryAddedMessagePayloadImpl();
    }
    

    public static DeliveryAddedMessagePayloadImpl of(final DeliveryAddedMessagePayload template) {
        DeliveryAddedMessagePayloadImpl instance = new DeliveryAddedMessagePayloadImpl();
        instance.setDelivery(template.getDelivery());
        return instance;
    }

    default <T> T withDeliveryAddedMessagePayload(Function<DeliveryAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
