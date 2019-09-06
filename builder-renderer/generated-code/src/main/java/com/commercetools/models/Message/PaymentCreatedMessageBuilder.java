package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Payment.Payment;
import com.commercetools.models.Message.PaymentCreatedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentCreatedMessageBuilder {
   
   
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
   
   
   private com.commercetools.models.Payment.Payment payment;
   
   public PaymentCreatedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public PaymentCreatedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public PaymentCreatedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public PaymentCreatedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public PaymentCreatedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public PaymentCreatedMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public PaymentCreatedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public PaymentCreatedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public PaymentCreatedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public PaymentCreatedMessageBuilder payment( final com.commercetools.models.Payment.Payment payment) {
      this.payment = payment;
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
   
   
   public com.commercetools.models.Payment.Payment getPayment(){
      return this.payment;
   }

   public PaymentCreatedMessage build() {
       return new PaymentCreatedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, payment);
   }
   
   public static PaymentCreatedMessageBuilder of() {
      return new PaymentCreatedMessageBuilder();
   }
   
   public static PaymentCreatedMessageBuilder of(final PaymentCreatedMessage template) {
      PaymentCreatedMessageBuilder builder = new PaymentCreatedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.payment = template.getPayment();
      return builder;
   }
   
}