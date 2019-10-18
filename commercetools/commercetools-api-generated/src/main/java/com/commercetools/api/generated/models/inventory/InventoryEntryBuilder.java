package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.inventory.InventoryEntry;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntryBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   
   private Long availableQuantity;
   
   @Nullable
   private java.time.ZonedDateTime expectedDelivery;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   
   private Long quantityOnStock;
   
   @Nullable
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private Long restockableInDays;
   
   
   private String sku;
   
   public InventoryEntryBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public InventoryEntryBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public InventoryEntryBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public InventoryEntryBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public InventoryEntryBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public InventoryEntryBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public InventoryEntryBuilder availableQuantity( final Long availableQuantity) {
      this.availableQuantity = availableQuantity;
      return this;
   }
   
   public InventoryEntryBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
      this.expectedDelivery = expectedDelivery;
      return this;
   }
   
   public InventoryEntryBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public InventoryEntryBuilder quantityOnStock( final Long quantityOnStock) {
      this.quantityOnStock = quantityOnStock;
      return this;
   }
   
   public InventoryEntryBuilder supplyChannel(@Nullable final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public InventoryEntryBuilder restockableInDays(@Nullable final Long restockableInDays) {
      this.restockableInDays = restockableInDays;
      return this;
   }
   
   public InventoryEntryBuilder sku( final String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public Long getAvailableQuantity(){
      return this.availableQuantity;
   }
   
   @Nullable
   public java.time.ZonedDateTime getExpectedDelivery(){
      return this.expectedDelivery;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
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

   public InventoryEntry build() {
       return new InventoryEntryImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, availableQuantity, expectedDelivery, custom, quantityOnStock, supplyChannel, restockableInDays, sku);
   }
   
   public static InventoryEntryBuilder of() {
      return new InventoryEntryBuilder();
   }
   
   public static InventoryEntryBuilder of(final InventoryEntry template) {
      InventoryEntryBuilder builder = new InventoryEntryBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.availableQuantity = template.getAvailableQuantity();
      builder.expectedDelivery = template.getExpectedDelivery();
      builder.custom = template.getCustom();
      builder.quantityOnStock = template.getQuantityOnStock();
      builder.supplyChannel = template.getSupplyChannel();
      builder.restockableInDays = template.getRestockableInDays();
      builder.sku = template.getSku();
      return builder;
   }
   
}