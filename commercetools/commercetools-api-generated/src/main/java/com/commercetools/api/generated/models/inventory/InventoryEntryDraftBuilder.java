package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.inventory.InventoryEntryDraft;
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
public final class InventoryEntryDraftBuilder {
   
   @Nullable
   private java.time.ZonedDateTime expectedDelivery;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   
   private Long quantityOnStock;
   
   @Nullable
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private Long restockableInDays;
   
   
   private String sku;
   
   public InventoryEntryDraftBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
      this.expectedDelivery = expectedDelivery;
      return this;
   }
   
   public InventoryEntryDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public InventoryEntryDraftBuilder quantityOnStock( final Long quantityOnStock) {
      this.quantityOnStock = quantityOnStock;
      return this;
   }
   
   public InventoryEntryDraftBuilder supplyChannel(@Nullable final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public InventoryEntryDraftBuilder restockableInDays(@Nullable final Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      return this;
   }
   
   public InventoryEntryDraftBuilder sku( final String sku) {
      this.sku = sku;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getExpectedDelivery(){
      return this.expectedDelivery;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public Long getQuantityOnStock(){
      return this.quantityOnStock;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   @Nullable
   public Long getRestockableInDays(){
      return this.restockableInDays;
   }
   
   
   public String getSku(){
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