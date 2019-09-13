package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.order.TrackingData;
import java.lang.String;
import com.commercetools.models.message.ParcelTrackingDataUpdatedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelTrackingDataUpdatedMessageBuilder {
   
   
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
   
   
   private java.lang.String deliveryId;
   
   @Nullable
   private com.commercetools.models.order.TrackingData trackingData;
   
   
   private java.lang.String parcelId;
   
   public ParcelTrackingDataUpdatedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessageBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessageBuilder trackingData(@Nullable final com.commercetools.models.order.TrackingData trackingData) {
      this.trackingData = trackingData;
      return this;
   }
   
   public ParcelTrackingDataUpdatedMessageBuilder parcelId( final java.lang.String parcelId) {
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
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public com.commercetools.models.order.TrackingData getTrackingData(){
      return this.trackingData;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public ParcelTrackingDataUpdatedMessage build() {
       return new ParcelTrackingDataUpdatedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, deliveryId, trackingData, parcelId);
   }
   
   public static ParcelTrackingDataUpdatedMessageBuilder of() {
      return new ParcelTrackingDataUpdatedMessageBuilder();
   }
   
   public static ParcelTrackingDataUpdatedMessageBuilder of(final ParcelTrackingDataUpdatedMessage template) {
      ParcelTrackingDataUpdatedMessageBuilder builder = new ParcelTrackingDataUpdatedMessageBuilder();
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
      builder.trackingData = template.getTrackingData();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}