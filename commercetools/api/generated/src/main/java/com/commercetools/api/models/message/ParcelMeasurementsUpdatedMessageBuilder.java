package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelMeasurementsUpdatedMessageBuilder {


   private java.time.ZonedDateTime createdAt;


   private java.time.ZonedDateTime lastModifiedAt;


   private String id;


   private Long version;

   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;

   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;


   private Long sequenceNumber;


   private com.commercetools.api.models.common.Reference resource;

   @Nullable
   private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;


   private Long resourceVersion;


   private String deliveryId;

   @Nullable
   private com.commercetools.api.models.order.ParcelMeasurements measurements;


   private String parcelId;

   public ParcelMeasurementsUpdatedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder measurements(@Nullable final com.commercetools.api.models.order.ParcelMeasurements measurements) {
      this.measurements = measurements;
      return this;
   }

   public ParcelMeasurementsUpdatedMessageBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
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
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }

   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }


   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }


   public com.commercetools.api.models.common.Reference getResource(){
      return this.resource;
   }

   @Nullable
   public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }


   public Long getResourceVersion(){
      return this.resourceVersion;
   }


   public String getDeliveryId(){
      return this.deliveryId;
   }

   @Nullable
   public com.commercetools.api.models.order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }


   public String getParcelId(){
      return this.parcelId;
   }

   public ParcelMeasurementsUpdatedMessage build() {
       return new ParcelMeasurementsUpdatedMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, deliveryId, measurements, parcelId);
   }

   public static ParcelMeasurementsUpdatedMessageBuilder of() {
      return new ParcelMeasurementsUpdatedMessageBuilder();
   }

   public static ParcelMeasurementsUpdatedMessageBuilder of(final ParcelMeasurementsUpdatedMessage template) {
      ParcelMeasurementsUpdatedMessageBuilder builder = new ParcelMeasurementsUpdatedMessageBuilder();
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
      builder.deliveryId = template.getDeliveryId();
      builder.measurements = template.getMeasurements();
      builder.parcelId = template.getParcelId();
      return builder;
   }

}
