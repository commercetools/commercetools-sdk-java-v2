package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.generated.models.inventory.InventoryEntrySetSupplyChannelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntrySetSupplyChannelActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel;
   
   public InventoryEntrySetSupplyChannelActionBuilder supplyChannel(@Nullable final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getSupplyChannel(){
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