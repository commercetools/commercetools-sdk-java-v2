package com.commercetools.api.models.message;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.message.MessagePayload;
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
public final class InventoryEntryDeletedMessagePayloadImpl implements InventoryEntryDeletedMessagePayload {

   private String type;

   private com.commercetools.api.models.channel.ChannelReference supplyChannel;

   private String sku;

   @JsonCreator
   InventoryEntryDeletedMessagePayloadImpl(@JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelReference supplyChannel, @JsonProperty("sku") final String sku) {
      this.supplyChannel = supplyChannel;
      this.sku = sku;
      this.type = "InventoryEntryDeleted";
   }
   public InventoryEntryDeletedMessagePayloadImpl() {

   }


   public String getType(){
      return this.type;
   }


   public com.commercetools.api.models.channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }


   public String getSku(){
      return this.sku;
   }

   public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelReference supplyChannel){
      this.supplyChannel = supplyChannel;
   }

   public void setSku(final String sku){
      this.sku = sku;
   }

}
