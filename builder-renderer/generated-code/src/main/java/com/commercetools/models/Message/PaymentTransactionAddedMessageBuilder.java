package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Payment.Transaction;
import com.commercetools.models.Message.PaymentTransactionAddedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentTransactionAddedMessageBuilder {
   
   
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
   
   
   private com.commercetools.models.Payment.Transaction transaction;
   
   public PaymentTransactionAddedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public PaymentTransactionAddedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public PaymentTransactionAddedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public PaymentTransactionAddedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public PaymentTransactionAddedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public PaymentTransactionAddedMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public PaymentTransactionAddedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public PaymentTransactionAddedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public PaymentTransactionAddedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public PaymentTransactionAddedMessageBuilder transaction( final com.commercetools.models.Payment.Transaction transaction) {
      this.transaction = transaction;
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
   
   
   public com.commercetools.models.Payment.Transaction getTransaction(){
      return this.transaction;
   }

   public PaymentTransactionAddedMessage build() {
       return new PaymentTransactionAddedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, transaction);
   }
   
   public static PaymentTransactionAddedMessageBuilder of() {
      return new PaymentTransactionAddedMessageBuilder();
   }
   
   public static PaymentTransactionAddedMessageBuilder of(final PaymentTransactionAddedMessage template) {
      PaymentTransactionAddedMessageBuilder builder = new PaymentTransactionAddedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.transaction = template.getTransaction();
      return builder;
   }
   
}