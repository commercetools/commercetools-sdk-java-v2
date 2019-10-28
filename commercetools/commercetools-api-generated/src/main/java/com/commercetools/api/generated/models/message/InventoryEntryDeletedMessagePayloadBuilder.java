package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.channel.ChannelReference;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.InventoryEntryDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntryDeletedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.channel.ChannelReference supplyChannel;
   
   
   private String sku;
   
   public InventoryEntryDeletedMessagePayloadBuilder supplyChannel( final com.commercetools.api.generated.models.channel.ChannelReference supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public InventoryEntryDeletedMessagePayloadBuilder sku( final String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public String getSku(){
      return this.sku;
   }

   public InventoryEntryDeletedMessagePayload build() {
       return new InventoryEntryDeletedMessagePayloadImpl(supplyChannel, sku);
   }
   
   public static InventoryEntryDeletedMessagePayloadBuilder of() {
      return new InventoryEntryDeletedMessagePayloadBuilder();
   }
   
   public static InventoryEntryDeletedMessagePayloadBuilder of(final InventoryEntryDeletedMessagePayload template) {
      InventoryEntryDeletedMessagePayloadBuilder builder = new InventoryEntryDeletedMessagePayloadBuilder();
      builder.supplyChannel = template.getSupplyChannel();
      builder.sku = template.getSku();
      return builder;
   }
   
}