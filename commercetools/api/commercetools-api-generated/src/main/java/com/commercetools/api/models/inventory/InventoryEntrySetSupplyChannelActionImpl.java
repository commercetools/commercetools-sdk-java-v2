package com.commercetools.api.models.inventory;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
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
public final class InventoryEntrySetSupplyChannelActionImpl implements InventoryEntrySetSupplyChannelAction {

   private String action;
   
   private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

   @JsonCreator
   InventoryEntrySetSupplyChannelActionImpl(@JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      this.action = "setSupplyChannel";
   }
   public InventoryEntrySetSupplyChannelActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>If absent, the supply channel is removed.
   *  This action will fail if an entry with the combination of sku and supplyChannel already exists.</p>
   */
   public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }

   public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }

}
