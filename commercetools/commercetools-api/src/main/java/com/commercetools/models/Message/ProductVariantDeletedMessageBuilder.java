package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.product.ProductVariant;
import java.lang.Object;
import com.commercetools.models.message.ProductVariantDeletedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductVariantDeletedMessageBuilder {
   
   
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
   
   
   private com.commercetools.models.product.ProductVariant variant;
   
   public ProductVariantDeletedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder removedImageUrls( final java.util.List<java.lang.Object> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   public ProductVariantDeletedMessageBuilder variant( final com.commercetools.models.product.ProductVariant variant) {
      this.variant = variant;
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
   
   
   public com.commercetools.models.product.ProductVariant getVariant(){
      return this.variant;
   }

   public ProductVariantDeletedMessage build() {
       return new ProductVariantDeletedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, removedImageUrls, variant);
   }
   
   public static ProductVariantDeletedMessageBuilder of() {
      return new ProductVariantDeletedMessageBuilder();
   }
   
   public static ProductVariantDeletedMessageBuilder of(final ProductVariantDeletedMessage template) {
      ProductVariantDeletedMessageBuilder builder = new ProductVariantDeletedMessageBuilder();
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
      builder.variant = template.getVariant();
      return builder;
   }
   
}