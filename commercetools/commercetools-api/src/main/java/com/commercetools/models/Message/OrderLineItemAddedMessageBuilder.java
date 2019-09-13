package com.commercetools.models.message;

import com.commercetools.models.cart.LineItem;
import com.commercetools.models.message.Message;
import java.lang.Long;
import com.commercetools.models.message.OrderLineItemAddedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderLineItemAddedMessageBuilder {
   
   
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
   
   
   private com.commercetools.models.cart.LineItem lineItem;
   
   
   private java.lang.Long addedQuantity;
   
   public OrderLineItemAddedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public OrderLineItemAddedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public OrderLineItemAddedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderLineItemAddedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public OrderLineItemAddedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public OrderLineItemAddedMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderLineItemAddedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public OrderLineItemAddedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public OrderLineItemAddedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public OrderLineItemAddedMessageBuilder lineItem( final com.commercetools.models.cart.LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
   }
   
   public OrderLineItemAddedMessageBuilder addedQuantity( final java.lang.Long addedQuantity) {
      this.addedQuantity = addedQuantity;
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
   
   
   public com.commercetools.models.cart.LineItem getLineItem(){
      return this.lineItem;
   }
   
   
   public java.lang.Long getAddedQuantity(){
      return this.addedQuantity;
   }

   public OrderLineItemAddedMessage build() {
       return new OrderLineItemAddedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, lineItem, addedQuantity);
   }
   
   public static OrderLineItemAddedMessageBuilder of() {
      return new OrderLineItemAddedMessageBuilder();
   }
   
   public static OrderLineItemAddedMessageBuilder of(final OrderLineItemAddedMessage template) {
      OrderLineItemAddedMessageBuilder builder = new OrderLineItemAddedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.lineItem = template.getLineItem();
      builder.addedQuantity = template.getAddedQuantity();
      return builder;
   }
   
}