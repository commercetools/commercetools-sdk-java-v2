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
public final class OrderSetDeliveryItemsActionImpl implements OrderSetDeliveryItemsAction {

   private java.lang.String action;
   
   private java.lang.String deliveryId;
   
   private java.util.List<com.commercetools.models.Order.DeliveryItem> items;

   @JsonCreator
   OrderSetDeliveryItemsActionImpl(@JsonProperty("deliveryId") final java.lang.String deliveryId, @JsonProperty("items") final java.util.List<com.commercetools.models.Order.DeliveryItem> items) {
      this.deliveryId = deliveryId;
      this.items = items;
      this.action = "setDeliveryItems";
   }
   public OrderSetDeliveryItemsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.DeliveryItem> getItems(){
      return this.items;
   }

   public void setDeliveryId(final java.lang.String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setItems(final java.util.List<com.commercetools.models.Order.DeliveryItem> items){
      this.items = items;
   }

}