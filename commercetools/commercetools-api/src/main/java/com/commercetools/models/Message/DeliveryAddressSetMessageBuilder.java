package com.commercetools.models.message;

import com.commercetools.models.common.Address;
import com.commercetools.models.message.Message;
import java.lang.String;
import com.commercetools.models.message.DeliveryAddressSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DeliveryAddressSetMessageBuilder {
   
   
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
   private com.commercetools.models.common.Address oldAddress;
   
   
   private java.lang.String deliveryId;
   
   @Nullable
   private com.commercetools.models.common.Address address;
   
   public DeliveryAddressSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public DeliveryAddressSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public DeliveryAddressSetMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public DeliveryAddressSetMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public DeliveryAddressSetMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public DeliveryAddressSetMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public DeliveryAddressSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public DeliveryAddressSetMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public DeliveryAddressSetMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public DeliveryAddressSetMessageBuilder oldAddress(@Nullable final com.commercetools.models.common.Address oldAddress) {
      this.oldAddress = oldAddress;
      return this;
   }
   
   public DeliveryAddressSetMessageBuilder deliveryId( final java.lang.String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public DeliveryAddressSetMessageBuilder address(@Nullable final com.commercetools.models.common.Address address) {
      this.address = address;
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
   public com.commercetools.models.common.Address getOldAddress(){
      return this.oldAddress;
   }
   
   
   public java.lang.String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public DeliveryAddressSetMessage build() {
       return new DeliveryAddressSetMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, oldAddress, deliveryId, address);
   }
   
   public static DeliveryAddressSetMessageBuilder of() {
      return new DeliveryAddressSetMessageBuilder();
   }
   
   public static DeliveryAddressSetMessageBuilder of(final DeliveryAddressSetMessage template) {
      DeliveryAddressSetMessageBuilder builder = new DeliveryAddressSetMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.oldAddress = template.getOldAddress();
      builder.deliveryId = template.getDeliveryId();
      builder.address = template.getAddress();
      return builder;
   }
   
}