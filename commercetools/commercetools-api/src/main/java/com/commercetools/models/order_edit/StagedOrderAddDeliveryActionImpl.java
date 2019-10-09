package com.commercetools.models.order_edit;

import com.commercetools.models.common.Address;
import com.commercetools.models.order.DeliveryItem;
import com.commercetools.models.order.ParcelDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderAddDeliveryActionImpl implements StagedOrderAddDeliveryAction {

   private String action;
   
   private com.commercetools.models.common.Address address;
   
   private java.util.List<com.commercetools.models.order.DeliveryItem> items;
   
   private java.util.List<com.commercetools.models.order.ParcelDraft> parcels;

   @JsonCreator
   StagedOrderAddDeliveryActionImpl(@JsonProperty("address") final com.commercetools.models.common.Address address, @JsonProperty("items") final java.util.List<com.commercetools.models.order.DeliveryItem> items, @JsonProperty("parcels") final java.util.List<com.commercetools.models.order.ParcelDraft> parcels) {
      this.address = address;
      this.items = items;
      this.parcels = parcels;
      this.action = "addDelivery";
   }
   public StagedOrderAddDeliveryActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public java.util.List<com.commercetools.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public java.util.List<com.commercetools.models.order.ParcelDraft> getParcels(){
      return this.parcels;
   }

   public void setAddress(final com.commercetools.models.common.Address address){
      this.address = address;
   }
   
   public void setItems(final java.util.List<com.commercetools.models.order.DeliveryItem> items){
      this.items = items;
   }
   
   public void setParcels(final java.util.List<com.commercetools.models.order.ParcelDraft> parcels){
      this.parcels = parcels;
   }

}