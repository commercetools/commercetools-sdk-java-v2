package com.commercetools.models.Order;

import com.commercetools.models.Order.DeliveryItem;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
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
public final class OrderSetParcelItemsActionImpl implements OrderSetParcelItemsAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;
   
   private java.lang.String parcelId;

   @JsonCreator
   OrderSetParcelItemsActionImpl(@JsonProperty("items") final java.util.List<com.commercetools.models.Order.DeliveryItem> items, @JsonProperty("parcelId") final java.lang.String parcelId) {
      this.items = items;
      this.parcelId = parcelId;
      this.action = "setParcelItems";
   }
   public OrderSetParcelItemsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public void setItems(final java.util.List<com.commercetools.models.Order.DeliveryItem> items){
      this.items = items;
   }
   
   public void setParcelId(final java.lang.String parcelId){
      this.parcelId = parcelId;
   }

}