package com.commercetools.models.message;

import com.commercetools.models.cart.ProductPublishScope;
import com.commercetools.models.message.Message;
import com.commercetools.models.product.ProductProjection;
import java.lang.Object;
import com.commercetools.models.message.ProductPublishedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPublishedMessageBuilder {
   
   
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
   
   
   private java.util.List<java.lang.Object> removedImageUrls;
   
   
   private com.commercetools.models.product.ProductProjection productProjection;
   
   
   private com.commercetools.models.cart.ProductPublishScope scope;
   
   public ProductPublishedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductPublishedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductPublishedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductPublishedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ProductPublishedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ProductPublishedMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ProductPublishedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ProductPublishedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ProductPublishedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public ProductPublishedMessageBuilder removedImageUrls( final java.util.List<java.lang.Object> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   public ProductPublishedMessageBuilder productProjection( final com.commercetools.models.product.ProductProjection productProjection) {
      this.productProjection = productProjection;
      return this;
   }
   
   public ProductPublishedMessageBuilder scope( final com.commercetools.models.cart.ProductPublishScope scope) {
      this.scope = scope;
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
   
   
   public java.util.List<java.lang.Object> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.models.product.ProductProjection getProductProjection(){
      return this.productProjection;
   }
   
   
   public com.commercetools.models.cart.ProductPublishScope getScope(){
      return this.scope;
   }

   public ProductPublishedMessage build() {
       return new ProductPublishedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, removedImageUrls, productProjection, scope);
   }
   
   public static ProductPublishedMessageBuilder of() {
      return new ProductPublishedMessageBuilder();
   }
   
   public static ProductPublishedMessageBuilder of(final ProductPublishedMessage template) {
      ProductPublishedMessageBuilder builder = new ProductPublishedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.removedImageUrls = template.getRemovedImageUrls();
      builder.productProjection = template.getProductProjection();
      builder.scope = template.getScope();
      return builder;
   }
   
}