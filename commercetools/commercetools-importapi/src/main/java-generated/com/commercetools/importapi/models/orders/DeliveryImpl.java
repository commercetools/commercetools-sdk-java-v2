package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Address;
import com.commercetools.importapi.models.orders.DeliveryItem;
import com.commercetools.importapi.models.orders.Parcel;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryImpl implements Delivery {

    private String id;
    
    private java.time.ZonedDateTime createdAt;
    
    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;
    
    private java.util.List<com.commercetools.importapi.models.orders.Parcel> parcels;
    
    private com.commercetools.importapi.models.common.Address address;

    @JsonCreator
    DeliveryImpl(@JsonProperty("id") final String id, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("items") final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items, @JsonProperty("parcels") final java.util.List<com.commercetools.importapi.models.orders.Parcel> parcels, @JsonProperty("address") final com.commercetools.importapi.models.common.Address address) {
        this.id = id;
        this.createdAt = createdAt;
        this.items = items;
        this.parcels = parcels;
        this.address = address;
    }
    public DeliveryImpl() {
       
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems(){
        return this.items;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.orders.Parcel> getParcels(){
        return this.parcels;
    }
    
    
    public com.commercetools.importapi.models.common.Address getAddress(){
        return this.address;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    public void setItems(final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items){
        this.items = items;
    }
    
    public void setParcels(final java.util.List<com.commercetools.importapi.models.orders.Parcel> parcels){
        this.parcels = parcels;
    }
    
    public void setAddress(final com.commercetools.importapi.models.common.Address address){
        this.address = address;
    }

}
