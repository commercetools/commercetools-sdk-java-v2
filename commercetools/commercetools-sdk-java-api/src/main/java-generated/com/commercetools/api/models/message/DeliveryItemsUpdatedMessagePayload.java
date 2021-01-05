package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadImpl;

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
@JsonDeserialize(as = DeliveryItemsUpdatedMessagePayloadImpl.class)
public interface DeliveryItemsUpdatedMessagePayload extends MessagePayload {

    
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();
    
    @NotNull
    @Valid
    @JsonProperty("oldItems")
    public List<DeliveryItem> getOldItems();

    public void setDeliveryId(final String deliveryId);
    
    @JsonIgnore
    public void setItems(final DeliveryItem ...items);
    public void setItems(final List<DeliveryItem> items);
    
    @JsonIgnore
    public void setOldItems(final DeliveryItem ...oldItems);
    public void setOldItems(final List<DeliveryItem> oldItems);

    public static DeliveryItemsUpdatedMessagePayload of(){
        return new DeliveryItemsUpdatedMessagePayloadImpl();
    }
    

    public static DeliveryItemsUpdatedMessagePayload of(final DeliveryItemsUpdatedMessagePayload template) {
        DeliveryItemsUpdatedMessagePayloadImpl instance = new DeliveryItemsUpdatedMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        instance.setOldItems(template.getOldItems());
        return instance;
    }

    public static DeliveryItemsUpdatedMessagePayloadBuilder builder(){
        return DeliveryItemsUpdatedMessagePayloadBuilder.of();
    }
    
    public static DeliveryItemsUpdatedMessagePayloadBuilder builder(final DeliveryItemsUpdatedMessagePayload template){
        return DeliveryItemsUpdatedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withDeliveryItemsUpdatedMessagePayload(Function<DeliveryItemsUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
