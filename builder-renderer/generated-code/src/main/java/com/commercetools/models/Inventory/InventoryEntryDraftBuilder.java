package com.commercetools.models.Inventory;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Inventory.InventoryEntryDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryDraftBuilder {
   
   @Nullable
   private java.time.ZonedDateTime expectedDelivery;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   
   private java.lang.Long quantityOnStock;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private java.lang.Long restockableInDays;
   
   
   private java.lang.String sku;
   
   public InventoryEntryDraftBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
      this.expectedDelivery = expectedDelivery;
      return this;
   }
   
   public InventoryEntryDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public InventoryEntryDraftBuilder quantityOnStock( final java.lang.Long quantityOnStock) {
      this.quantityOnStock = quantityOnStock;
      return this;
   }
   
   public InventoryEntryDraftBuilder supplyChannel(@Nullable final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public InventoryEntryDraftBuilder restockableInDays(@Nullable final java.lang.Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      return this;
   }
   
   public InventoryEntryDraftBuilder sku( final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getExpectedDelivery(){
      return this.expectedDelivery;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public java.lang.Long getQuantityOnStock(){
      return this.quantityOnStock;
   }
   
   @Nullable
   public com.commercetools.models.Channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   @Nullable
   public java.lang.Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }

   public InventoryEntryDraft build() {
       return new InventoryEntryDraftImpl(expectedDelivery, custom, quantityOnStock, supplyChannel, restockableInDays, sku);
   }
   
   public static InventoryEntryDraftBuilder of() {
      return new InventoryEntryDraftBuilder();
   }
   
   public static InventoryEntryDraftBuilder of(final InventoryEntryDraft template) {
      InventoryEntryDraftBuilder builder = new InventoryEntryDraftBuilder();
      builder.expectedDelivery = template.getExpectedDelivery();
      builder.custom = template.getCustom();
      builder.quantityOnStock = template.getQuantityOnStock();
      builder.supplyChannel = template.getSupplyChannel();
      builder.restockableInDays = template.getRestockableInDays();
      builder.sku = template.getSku();
      return builder;
   }
   
}