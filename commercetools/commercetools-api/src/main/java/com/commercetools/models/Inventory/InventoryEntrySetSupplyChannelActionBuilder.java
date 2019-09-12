package com.commercetools.models.Inventory;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Inventory.InventoryEntryUpdateAction;
import java.lang.String;
import com.commercetools.models.Inventory.InventoryEntrySetSupplyChannelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntrySetSupplyChannelActionBuilder {
   
   @Nullable
   private com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel;
   
   public InventoryEntrySetSupplyChannelActionBuilder supplyChannel(@Nullable final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }

   public InventoryEntrySetSupplyChannelAction build() {
       return new InventoryEntrySetSupplyChannelActionImpl(supplyChannel);
   }
   
   public static InventoryEntrySetSupplyChannelActionBuilder of() {
      return new InventoryEntrySetSupplyChannelActionBuilder();
   }
   
   public static InventoryEntrySetSupplyChannelActionBuilder of(final InventoryEntrySetSupplyChannelAction template) {
      InventoryEntrySetSupplyChannelActionBuilder builder = new InventoryEntrySetSupplyChannelActionBuilder();
      builder.supplyChannel = template.getSupplyChannel();
      return builder;
   }
   
}