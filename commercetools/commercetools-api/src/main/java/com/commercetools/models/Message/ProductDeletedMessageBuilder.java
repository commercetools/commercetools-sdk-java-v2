package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.product.ProductProjection;
import java.lang.String;
import com.commercetools.models.message.ProductDeletedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDeletedMessageBuilder {
   
   
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
   
   
   private java.util.List<java.lang.String> removedImageUrls;
   
   
   private com.commercetools.models.product.ProductProjection currentProjection;
   
   public ProductDeletedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductDeletedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductDeletedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductDeletedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ProductDeletedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ProductDeletedMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ProductDeletedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ProductDeletedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ProductDeletedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public ProductDeletedMessageBuilder removedImageUrls( final java.util.List<java.lang.String> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   public ProductDeletedMessageBuilder currentProjection( final com.commercetools.models.product.ProductProjection currentProjection) {
      this.currentProjection = currentProjection;
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
   
   
   public java.util.List<java.lang.String> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.models.product.ProductProjection getCurrentProjection(){
      return this.currentProjection;
   }

   public ProductDeletedMessage build() {
       return new ProductDeletedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, removedImageUrls, currentProjection);
   }
   
   public static ProductDeletedMessageBuilder of() {
      return new ProductDeletedMessageBuilder();
   }
   
   public static ProductDeletedMessageBuilder of(final ProductDeletedMessage template) {
      ProductDeletedMessageBuilder builder = new ProductDeletedMessageBuilder();
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
      builder.currentProjection = template.getCurrentProjection();
      return builder;
   }
   
}