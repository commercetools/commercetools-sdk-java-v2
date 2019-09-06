package com.commercetools.models.Order;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.Parcel;
import java.lang.String;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryImpl implements Delivery {

   private java.time.ZonedDateTime createdAt;
   
   private com.commercetools.models.Common.Address address;
   
   private java.lang.String id;
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   private java.util.List<com.commercetools.models.Order.Parcel> parcels;

   @JsonCreator
   DeliveryImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("address") final com.commercetools.models.Common.Address address, @JsonProperty("id") final java.lang.String id, @JsonProperty("items") final java.util.List<com.commercetools.models.Order.DeliveryItem> items, @JsonProperty("parcels") final java.util.List<com.commercetools.models.Order.Parcel> parcels) {
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
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public java.util.List<com.commercetools.models.Order.Parcel> getParcels(){
      return this.parcels;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setAddress(final com.commercetools.models.Common.Address address){
      this.address = address;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setItems(final java.util.List<com.commercetools.models.Order.DeliveryItem> items){
      this.items = items;
   }
   
   public void setParcels(final java.util.List<com.commercetools.models.Order.Parcel> parcels){
      this.parcels = parcels;
   }

}