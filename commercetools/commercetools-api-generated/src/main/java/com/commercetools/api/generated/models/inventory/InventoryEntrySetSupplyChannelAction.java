package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetSupplyChannelActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InventoryEntrySetSupplyChannelActionImpl.class)
public interface InventoryEntrySetSupplyChannelAction extends InventoryEntryUpdateAction {

   /**
   *  <p>If absent, the supply channel is removed.
   *  This action will fail if an entry with the combination of sku and supplyChannel already exists.</p>
   */
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