package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.DeliveryItem;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryItemsUpdatedMessagePayloadImpl implements DeliveryItemsUpdatedMessagePayload {

    private String type;
    
    private String deliveryId;
    
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;
    
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems;

    @JsonCreator
    DeliveryItemsUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items, @JsonProperty("oldItems") final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
        this.deliveryId = deliveryId;
        this.items = items;
        this.oldItems = oldItems;
        this.type = "DeliveryItemsUpdated";
    }
    public DeliveryItemsUpdatedMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
        return this.items;
    }
    
    
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getOldItems(){
        return this.oldItems;
    }

    public void setDeliveryId(final String deliveryId){
        this.deliveryId = deliveryId;
    }
    
    public void setItems(final com.commercetools.api.models.order.DeliveryItem ...items){
       this.items = new ArrayList<>(Arrays.asList(items));
    }
    
    public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items){
       this.items = items;
    }
    
    public void setOldItems(final com.commercetools.api.models.order.DeliveryItem ...oldItems){
       this.oldItems = new ArrayList<>(Arrays.asList(oldItems));
    }
    
    public void setOldItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems){
       this.oldItems = oldItems;
    }

}
