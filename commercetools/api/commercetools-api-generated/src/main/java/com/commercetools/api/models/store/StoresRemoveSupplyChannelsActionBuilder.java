package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresRemoveSupplyChannelsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoresRemoveSupplyChannelsActionBuilder {
   
   
   private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
   
   public StoresRemoveSupplyChannelsActionBuilder supplyChannel( final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   
   public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }

   public StoresRemoveSupplyChannelsAction build() {
       return new StoresRemoveSupplyChannelsActionImpl(supplyChannel);
   }
   
   public static StoresRemoveSupplyChannelsActionBuilder of() {
      return new StoresRemoveSupplyChannelsActionBuilder();
   }
   
   public static StoresRemoveSupplyChannelsActionBuilder of(final StoresRemoveSupplyChannelsAction template) {
      StoresRemoveSupplyChannelsActionBuilder builder = new StoresRemoveSupplyChannelsActionBuilder();
      builder.supplyChannel = template.getSupplyChannel();
      return builder;
   }
   
}
