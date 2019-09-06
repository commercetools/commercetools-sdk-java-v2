package com.commercetools.models.Inventory;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Inventory.InventoryEntryUpdateAction;
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
public final class InventoryEntrySetSupplyChannelActionImpl implements InventoryEntrySetSupplyChannelAction {

   private java.lang.String action;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel;

   @JsonCreator
   InventoryEntrySetSupplyChannelActionImpl(@JsonProperty("supplyChannel") final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      this.action = "setSupplyChannel";
   }
   public InventoryEntrySetSupplyChannelActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }

   public void setSupplyChannel(final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }

}