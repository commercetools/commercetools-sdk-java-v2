package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import java.time.LocalDate;
import com.commercetools.models.Message.CustomerDateOfBirthSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerDateOfBirthSetMessageBuilder {
   
   
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
   
   
   private java.time.LocalDate dateOfBirth;
   
   public CustomerDateOfBirthSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CustomerDateOfBirthSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CustomerDateOfBirthSetMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomerDateOfBirthSetMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CustomerDateOfBirthSetMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public CustomerDateOfBirthSetMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public CustomerDateOfBirthSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public CustomerDateOfBirthSetMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public CustomerDateOfBirthSetMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public CustomerDateOfBirthSetMessageBuilder dateOfBirth( final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
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
   
   
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }

   public CustomerDateOfBirthSetMessage build() {
       return new CustomerDateOfBirthSetMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, dateOfBirth);
   }
   
   public static CustomerDateOfBirthSetMessageBuilder of() {
      return new CustomerDateOfBirthSetMessageBuilder();
   }
   
   public static CustomerDateOfBirthSetMessageBuilder of(final CustomerDateOfBirthSetMessage template) {
      CustomerDateOfBirthSetMessageBuilder builder = new CustomerDateOfBirthSetMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.dateOfBirth = template.getDateOfBirth();
      return builder;
   }
   
}