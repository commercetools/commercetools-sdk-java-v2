package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import java.lang.String;
import com.commercetools.models.Message.PaymentStatusInterfaceCodeSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentStatusInterfaceCodeSetMessageBuilder {
   
   
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
   
   
   private java.lang.String paymentId;
   
   
   private java.lang.String interfaceCode;
   
   public PaymentStatusInterfaceCodeSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public PaymentStatusInterfaceCodeSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public PaymentStatusInterfaceCodeSetMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public PaymentStatusInterfaceCodeSetMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public PaymentStatusInterfaceCodeSetMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public PaymentStatusInterfaceCodeSetMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public PaymentStatusInterfaceCodeSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public PaymentStatusInterfaceCodeSetMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public PaymentStatusInterfaceCodeSetMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public PaymentStatusInterfaceCodeSetMessageBuilder paymentId( final java.lang.String paymentId) {
      this.paymentId = paymentId;
      return this;
   }
   
   public PaymentStatusInterfaceCodeSetMessageBuilder interfaceCode( final java.lang.String interfaceCode) {
      this.interfaceCode = interfaceCode;
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
   
   
   public java.lang.String getPaymentId(){
      return this.paymentId;
   }
   
   
   public java.lang.String getInterfaceCode(){
      return this.interfaceCode;
   }

   public PaymentStatusInterfaceCodeSetMessage build() {
       return new PaymentStatusInterfaceCodeSetMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, paymentId, interfaceCode);
   }
   
   public static PaymentStatusInterfaceCodeSetMessageBuilder of() {
      return new PaymentStatusInterfaceCodeSetMessageBuilder();
   }
   
   public static PaymentStatusInterfaceCodeSetMessageBuilder of(final PaymentStatusInterfaceCodeSetMessage template) {
      PaymentStatusInterfaceCodeSetMessageBuilder builder = new PaymentStatusInterfaceCodeSetMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.paymentId = template.getPaymentId();
      builder.interfaceCode = template.getInterfaceCode();
      return builder;
   }
   
}