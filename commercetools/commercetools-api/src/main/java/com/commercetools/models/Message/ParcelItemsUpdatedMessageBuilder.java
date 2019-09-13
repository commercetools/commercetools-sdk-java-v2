package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.order.DeliveryItem;
import java.lang.String;
import com.commercetools.models.message.ParcelItemsUpdatedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelItemsUpdatedMessageBuilder {
   
   
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
   
   @Nullable
   private java.lang.String deliveryId;
   
   
   private java.util.List<com.commercetools.models.order.DeliveryItem> oldItems;
   
   
   private java.util.List<com.commercetools.models.order.DeliveryItem> items;
   
   
   private java.lang.String parcelId;
   
   public ParcelItemsUpdatedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder deliveryId(@Nullable final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder oldItems( final java.util.List<com.commercetools.models.order.DeliveryItem> oldItems) {
      this.oldItems = oldItems;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder items( final java.util.List<com.commercetools.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public ParcelItemsUpdatedMessageBuilder parcelId( final java.lang.String parcelId) {
      this.parcelId = parcelId;
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
   
   @Nullable
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   
   public java.util.List<com.commercetools.models.order.DeliveryItem> getOldItems(){
      return this.oldItems;
   }
   
   
   public java.util.List<com.commercetools.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public ParcelItemsUpdatedMessage build() {
       return new ParcelItemsUpdatedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, deliveryId, oldItems, items, parcelId);
   }
   
   public static ParcelItemsUpdatedMessageBuilder of() {
      return new ParcelItemsUpdatedMessageBuilder();
   }
   
   public static ParcelItemsUpdatedMessageBuilder of(final ParcelItemsUpdatedMessage template) {
      ParcelItemsUpdatedMessageBuilder builder = new ParcelItemsUpdatedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.deliveryId = template.getDeliveryId();
      builder.oldItems = template.getOldItems();
      builder.items = template.getItems();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}