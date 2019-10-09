package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.order.Delivery;
import com.commercetools.models.order.Parcel;
import com.commercetools.models.message.ParcelAddedToDeliveryMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ParcelAddedToDeliveryMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   
   private Long sequenceNumber;
   
   
   private com.commercetools.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private Long resourceVersion;
   
   
   private com.commercetools.models.order.Delivery delivery;
   
   
   private com.commercetools.models.order.Parcel parcel;
   
   public ParcelAddedToDeliveryMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ParcelAddedToDeliveryMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ParcelAddedToDeliveryMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ParcelAddedToDeliveryMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ParcelAddedToDeliveryMessageBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ParcelAddedToDeliveryMessageBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ParcelAddedToDeliveryMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ParcelAddedToDeliveryMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ParcelAddedToDeliveryMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ParcelAddedToDeliveryMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ParcelAddedToDeliveryMessageBuilder delivery( final com.commercetools.models.order.Delivery delivery) {
      this.delivery = delivery;
      return this;
   }
   
   public ParcelAddedToDeliveryMessageBuilder parcel( final com.commercetools.models.order.Parcel parcel) {
      this.parcel = parcel;
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
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public com.commercetools.models.order.Delivery getDelivery(){
      return this.delivery;
   }
   
   
   public com.commercetools.models.order.Parcel getParcel(){
      return this.parcel;
   }

   public ParcelAddedToDeliveryMessage build() {
       return new ParcelAddedToDeliveryMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, delivery, parcel);
   }
   
   public static ParcelAddedToDeliveryMessageBuilder of() {
      return new ParcelAddedToDeliveryMessageBuilder();
   }
   
   public static ParcelAddedToDeliveryMessageBuilder of(final ParcelAddedToDeliveryMessage template) {
      ParcelAddedToDeliveryMessageBuilder builder = new ParcelAddedToDeliveryMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.delivery = template.getDelivery();
      builder.parcel = template.getParcel();
      return builder;
   }
   
}