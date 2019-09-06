package com.commercetools.models.Message;

import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Message.Message;
import com.commercetools.models.Message.OrderDiscountCodeRemovedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderDiscountCodeRemovedMessageBuilder {
   
   
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
   
   
   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;
   
   public OrderDiscountCodeRemovedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public OrderDiscountCodeRemovedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public OrderDiscountCodeRemovedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderDiscountCodeRemovedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public OrderDiscountCodeRemovedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public OrderDiscountCodeRemovedMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderDiscountCodeRemovedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public OrderDiscountCodeRemovedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public OrderDiscountCodeRemovedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public OrderDiscountCodeRemovedMessageBuilder discountCode( final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
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
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public OrderDiscountCodeRemovedMessage build() {
       return new OrderDiscountCodeRemovedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, discountCode);
   }
   
   public static OrderDiscountCodeRemovedMessageBuilder of() {
      return new OrderDiscountCodeRemovedMessageBuilder();
   }
   
   public static OrderDiscountCodeRemovedMessageBuilder of(final OrderDiscountCodeRemovedMessage template) {
      OrderDiscountCodeRemovedMessageBuilder builder = new OrderDiscountCodeRemovedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.discountCode = template.getDiscountCode();
      return builder;
   }
   
}