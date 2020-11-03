package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.message.DeliveryRemovedMessageImpl;

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
@JsonDeserialize(as = DeliveryRemovedMessageImpl.class)
public interface DeliveryRemovedMessage extends Message {

    
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    public void setDelivery(final Delivery delivery);

    public static DeliveryRemovedMessageImpl of(){
        return new DeliveryRemovedMessageImpl();
    }
    

    public static DeliveryRemovedMessageImpl of(final DeliveryRemovedMessage template) {
        DeliveryRemovedMessageImpl instance = new DeliveryRemovedMessageImpl();
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

    default <T> T withDeliveryRemovedMessage(Function<DeliveryRemovedMessage, T> helper) {
        return helper.apply(this);
    }
}
