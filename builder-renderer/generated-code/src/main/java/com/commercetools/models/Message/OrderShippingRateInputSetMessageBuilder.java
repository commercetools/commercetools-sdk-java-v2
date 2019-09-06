package com.commercetools.models.Message;

import com.commercetools.models.Cart.ShippingRateInput;
import com.commercetools.models.Message.Message;
import com.commercetools.models.Message.OrderShippingRateInputSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderShippingRateInputSetMessageBuilder {
   
   
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
   private com.commercetools.models.Cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private com.commercetools.models.Cart.ShippingRateInput oldShippingRateInput;
   
   public OrderShippingRateInputSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder shippingRateInput(@Nullable final com.commercetools.models.Cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public OrderShippingRateInputSetMessageBuilder oldShippingRateInput(@Nullable final com.commercetools.models.Cart.ShippingRateInput oldShippingRateInput) {
      this.oldShippingRateInput = oldShippingRateInput;
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
   public com.commercetools.models.Cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ShippingRateInput getOldShippingRateInput(){
      return this.oldShippingRateInput;
   }

   public OrderShippingRateInputSetMessage build() {
       return new OrderShippingRateInputSetMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, shippingRateInput, oldShippingRateInput);
   }
   
   public static OrderShippingRateInputSetMessageBuilder of() {
      return new OrderShippingRateInputSetMessageBuilder();
   }
   
   public static OrderShippingRateInputSetMessageBuilder of(final OrderShippingRateInputSetMessage template) {
      OrderShippingRateInputSetMessageBuilder builder = new OrderShippingRateInputSetMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.shippingRateInput = template.getShippingRateInput();
      builder.oldShippingRateInput = template.getOldShippingRateInput();
      return builder;
   }
   
}