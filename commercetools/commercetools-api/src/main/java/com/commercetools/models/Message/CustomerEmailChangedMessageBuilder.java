package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import java.lang.String;
import com.commercetools.models.message.CustomerEmailChangedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerEmailChangedMessageBuilder {
   
   
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
   
   
   private java.lang.String email;
   
   public CustomerEmailChangedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CustomerEmailChangedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CustomerEmailChangedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomerEmailChangedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CustomerEmailChangedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public CustomerEmailChangedMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public CustomerEmailChangedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public CustomerEmailChangedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public CustomerEmailChangedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public CustomerEmailChangedMessageBuilder email( final java.lang.String email) {
      this.email = email;
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
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public CustomerEmailChangedMessage build() {
       return new CustomerEmailChangedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, email);
   }
   
   public static CustomerEmailChangedMessageBuilder of() {
      return new CustomerEmailChangedMessageBuilder();
   }
   
   public static CustomerEmailChangedMessageBuilder of(final CustomerEmailChangedMessage template) {
      CustomerEmailChangedMessageBuilder builder = new CustomerEmailChangedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.email = template.getEmail();
      return builder;
   }
   
}