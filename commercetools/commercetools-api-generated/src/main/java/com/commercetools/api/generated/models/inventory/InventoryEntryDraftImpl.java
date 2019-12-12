package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
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
public final class InventoryEntryDraftImpl implements InventoryEntryDraft {

   private java.time.ZonedDateTime expectedDelivery;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private Long quantityOnStock;
   
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel;
   
   private Long restockableInDays;
   
   private String sku;

   @JsonCreator
   InventoryEntryDraftImpl(@JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("quantityOnStock") final Long quantityOnStock, @JsonProperty("supplyChannel") final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("restockableInDays") final Long restockableInDays, @JsonProperty("sku") final String sku) {
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
   
   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public Long getQuantityOnStock(){
      return this.quantityOnStock;
   }
   
   
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   
   public String getSku(){
      return this.sku;
   }

   public void setExpectedDelivery(final java.time.ZonedDateTime expectedDelivery){
      this.expectedDelivery = expectedDelivery;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setQuantityOnStock(final Long quantityOnStock){
      this.quantityOnStock = quantityOnStock;
   }
   
   public void setSupplyChannel(final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setRestockableInDays(final Long restockableInDays){
      this.restockableInDays = restockableInDays;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }

}