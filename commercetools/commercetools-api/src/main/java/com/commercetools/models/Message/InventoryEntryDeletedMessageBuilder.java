package com.commercetools.models.message;

import com.commercetools.models.channel.ChannelReference;
import com.commercetools.models.message.Message;
import java.lang.String;
import com.commercetools.models.message.InventoryEntryDeletedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntryDeletedMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   
   private java.lang.Long sequenceNumber;
   
   
   private com.commercetools.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private java.lang.Long resourceVersion;
   
   
   private java.lang.String type;
   
   
   private com.commercetools.models.channel.ChannelReference supplyChannel;
   
   
   private java.lang.String sku;
   
   public InventoryEntryDeletedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public InventoryEntryDeletedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public InventoryEntryDeletedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public InventoryEntryDeletedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public InventoryEntryDeletedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public InventoryEntryDeletedMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public InventoryEntryDeletedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public InventoryEntryDeletedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public InventoryEntryDeletedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public InventoryEntryDeletedMessageBuilder supplyChannel( final com.commercetools.models.channel.ChannelReference supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public InventoryEntryDeletedMessageBuilder sku( final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }

   public InventoryEntryDeletedMessage build() {
       return new InventoryEntryDeletedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, supplyChannel, sku);
   }
   
   public static InventoryEntryDeletedMessageBuilder of() {
      return new InventoryEntryDeletedMessageBuilder();
   }
   
   public static InventoryEntryDeletedMessageBuilder of(final InventoryEntryDeletedMessage template) {
      InventoryEntryDeletedMessageBuilder builder = new InventoryEntryDeletedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.supplyChannel = template.getSupplyChannel();
      builder.sku = template.getSku();
      return builder;
   }
   
}