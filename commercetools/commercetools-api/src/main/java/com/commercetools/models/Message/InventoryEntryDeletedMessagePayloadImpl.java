package com.commercetools.models.message;

import com.commercetools.models.channel.ChannelReference;
import com.commercetools.models.message.MessagePayload;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntryDeletedMessagePayloadImpl implements InventoryEntryDeletedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.channel.ChannelReference supplyChannel;
   
   private java.lang.String sku;

   @JsonCreator
   InventoryEntryDeletedMessagePayloadImpl(@JsonProperty("supplyChannel") final com.commercetools.models.channel.ChannelReference supplyChannel, @JsonProperty("sku") final java.lang.String sku) {
      this.supplyChannel = supplyChannel;
      this.sku = sku;
      this.type = "InventoryEntryDeleted";
   }
   public InventoryEntryDeletedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }

   public void setSupplyChannel(final com.commercetools.models.channel.ChannelReference supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }

}