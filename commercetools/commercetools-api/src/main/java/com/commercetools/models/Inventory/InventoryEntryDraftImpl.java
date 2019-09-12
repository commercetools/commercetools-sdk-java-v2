package com.commercetools.models.Inventory;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntryDraftImpl implements InventoryEntryDraft {

   private java.time.ZonedDateTime expectedDelivery;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private java.lang.Long quantityOnStock;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel;
   
   private java.lang.Long restockableInDays;
   
   private java.lang.String sku;

   @JsonCreator
   InventoryEntryDraftImpl(@JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("quantityOnStock") final java.lang.Long quantityOnStock, @JsonProperty("supplyChannel") final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("restockableInDays") final java.lang.Long restockableInDays, @JsonProperty("sku") final java.lang.String sku) {
      this.expectedDelivery = expectedDelivery;
      this.custom = custom;
      this.quantityOnStock = quantityOnStock;
      this.supplyChannel = supplyChannel;
      this.restockableInDays = restockableInDays;
      this.sku = sku;
   }
   public InventoryEntryDraftImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getExpectedDelivery(){
      return this.expectedDelivery;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public java.lang.Long getQuantityOnStock(){
      return this.quantityOnStock;
   }
   
   
   public com.commercetools.models.Channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.lang.Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }

   public void setExpectedDelivery(final java.time.ZonedDateTime expectedDelivery){
      this.expectedDelivery = expectedDelivery;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setQuantityOnStock(final java.lang.Long quantityOnStock){
      this.quantityOnStock = quantityOnStock;
   }
   
   public void setSupplyChannel(final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setRestockableInDays(final java.lang.Long restockableInDays){
      this.restockableInDays = restockableInDays;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }

}