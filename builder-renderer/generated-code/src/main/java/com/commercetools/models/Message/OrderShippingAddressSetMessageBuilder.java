package com.commercetools.models.Message;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Message.Message;
import com.commercetools.models.Message.OrderShippingAddressSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderShippingAddressSetMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   
   private java.lang.Long sequenceNumber;
   
   
   private com.commercetools.models.Common.Reference resource;
   
   @Nullable
   private com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private java.lang.Long resourceVersion;
   
   
   private java.lang.String type;
   
   @Nullable
   private com.commercetools.models.Common.Address oldAddress;
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public OrderShippingAddressSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public OrderShippingAddressSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public OrderShippingAddressSetMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderShippingAddressSetMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public OrderShippingAddressSetMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public OrderShippingAddressSetMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderShippingAddressSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public OrderShippingAddressSetMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public OrderShippingAddressSetMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public OrderShippingAddressSetMessageBuilder oldAddress(@Nullable final com.commercetools.models.Common.Address oldAddress) {
      this.oldAddress = oldAddress;
      return this;
   }
   
   public OrderShippingAddressSetMessageBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
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
   
   
   public com.commercetools.models.Common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.Message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getOldAddress(){
      return this.oldAddress;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public OrderShippingAddressSetMessage build() {
       return new OrderShippingAddressSetMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, oldAddress, address);
   }
   
   public static OrderShippingAddressSetMessageBuilder of() {
      return new OrderShippingAddressSetMessageBuilder();
   }
   
   public static OrderShippingAddressSetMessageBuilder of(final OrderShippingAddressSetMessage template) {
      OrderShippingAddressSetMessageBuilder builder = new OrderShippingAddressSetMessageBuilder();
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
      builder.address = template.getAddress();
      return builder;
   }
   
}