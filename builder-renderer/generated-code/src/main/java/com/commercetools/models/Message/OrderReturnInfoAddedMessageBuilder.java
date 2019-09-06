package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Order.ReturnInfo;
import com.commercetools.models.Message.OrderReturnInfoAddedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderReturnInfoAddedMessageBuilder {
   
   
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
   
   
   private com.commercetools.models.Order.ReturnInfo returnInfo;
   
   public OrderReturnInfoAddedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public OrderReturnInfoAddedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public OrderReturnInfoAddedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderReturnInfoAddedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public OrderReturnInfoAddedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public OrderReturnInfoAddedMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderReturnInfoAddedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public OrderReturnInfoAddedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public OrderReturnInfoAddedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public OrderReturnInfoAddedMessageBuilder returnInfo( final com.commercetools.models.Order.ReturnInfo returnInfo) {
      this.returnInfo = returnInfo;
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
   
   
   public com.commercetools.models.Order.ReturnInfo getReturnInfo(){
      return this.returnInfo;
   }

   public OrderReturnInfoAddedMessage build() {
       return new OrderReturnInfoAddedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, returnInfo);
   }
   
   public static OrderReturnInfoAddedMessageBuilder of() {
      return new OrderReturnInfoAddedMessageBuilder();
   }
   
   public static OrderReturnInfoAddedMessageBuilder of(final OrderReturnInfoAddedMessage template) {
      OrderReturnInfoAddedMessageBuilder builder = new OrderReturnInfoAddedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.returnInfo = template.getReturnInfo();
      return builder;
   }
   
}