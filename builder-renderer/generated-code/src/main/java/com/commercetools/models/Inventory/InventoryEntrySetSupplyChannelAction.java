package com.commercetools.models.Inventory;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Inventory.InventoryEntryUpdateAction;
import java.lang.String;
import com.commercetools.models.Inventory.InventoryEntrySetSupplyChannelActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InventoryEntrySetSupplyChannelActionImpl.class)
public interface InventoryEntrySetSupplyChannelAction extends InventoryEntryUpdateAction {

   
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelResourceIdentifier getSupplyChannel();

   public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
   
   public static InventoryEntrySetSupplyChannelActionImpl of(){
      return new InventoryEntrySetSupplyChannelActionImpl();
   }
   

   public static InventoryEntrySetSupplyChannelActionImpl of(final InventoryEntrySetSupplyChannelAction template) {
      InventoryEntrySetSupplyChannelActionImpl instance = new InventoryEntrySetSupplyChannelActionImpl();
      instance.setSupplyChannel(template.getSupplyChannel());
      return instance;
   }

}