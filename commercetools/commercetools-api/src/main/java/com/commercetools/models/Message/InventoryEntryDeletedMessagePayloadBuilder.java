package com.commercetools.models.Message;

import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.InventoryEntryDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryDeletedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Channel.ChannelReference supplyChannel;
   
   
   private java.lang.String sku;
   
   public InventoryEntryDeletedMessagePayloadBuilder supplyChannel( final com.commercetools.models.Channel.ChannelReference supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public InventoryEntryDeletedMessagePayloadBuilder sku( final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public com.commercetools.models.Channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.lang.String getSku(){
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