package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.Parcel;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryImpl implements Delivery {

   private java.time.ZonedDateTime createdAt;
   
   private com.commercetools.api.generated.models.common.Address address;
   
   private String id;
   
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;
   
   private java.util.List<com.commercetools.api.generated.models.order.Parcel> parcels;

   @JsonCreator
   DeliveryImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("address") final com.commercetools.api.generated.models.common.Address address, @JsonProperty("id") final String id, @JsonProperty("items") final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items, @JsonProperty("parcels") final java.util.List<com.commercetools.api.generated.models.order.Parcel> parcels) {
      this.createdAt = createdAt;
      this.address = address;
      this.id = id;
      this.items = items;
      this.parcels = parcels;
   }
   public DeliveryImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.Parcel> getParcels(){
      return this.parcels;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setAddress(final com.commercetools.api.generated.models.common.Address address){
      this.address = address;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setItems(final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items){
      this.items = items;
   }
   
   public void setParcels(final java.util.List<com.commercetools.api.generated.models.order.Parcel> parcels){
      this.parcels = parcels;
   }

}