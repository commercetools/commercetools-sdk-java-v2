package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderSetDeliveryItemsActionImpl implements StagedOrderSetDeliveryItemsAction {

   private String action;
   
   private String deliveryId;
   
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;

   @JsonCreator
   StagedOrderSetDeliveryItemsActionImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("items") final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items) {
      this.deliveryId = deliveryId;
      this.items = items;
      this.action = "setDeliveryItems";
   }
   public StagedOrderSetDeliveryItemsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getItems(){
      return this.items;
   }

   public void setDeliveryId(final String deliveryId){
      this.deliveryId = deliveryId;
   }
   
   public void setItems(final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items){
      this.items = items;
   }

}