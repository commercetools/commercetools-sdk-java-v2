package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.message.OrderImportedMessageImpl;

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
@JsonDeserialize(as = OrderImportedMessageImpl.class)
public interface OrderImportedMessage extends Message {

    
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    public void setOrder(final Order order);

    public static OrderImportedMessage of(){
        return new OrderImportedMessageImpl();
    }
    

    public static OrderImportedMessage of(final OrderImportedMessage template) {
        OrderImportedMessageImpl instance = new OrderImportedMessageImpl();
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
        instance.setOrder(template.getOrder());
        return instance;
    }

    public static OrderImportedMessageBuilder builder(){
        return OrderImportedMessageBuilder.of();
    }
    
    public static OrderImportedMessageBuilder builder(final OrderImportedMessage template){
        return OrderImportedMessageBuilder.of(template);
    }
    

    default <T> T withOrderImportedMessage(Function<OrderImportedMessage, T> helper) {
        return helper.apply(this);
    }
}
