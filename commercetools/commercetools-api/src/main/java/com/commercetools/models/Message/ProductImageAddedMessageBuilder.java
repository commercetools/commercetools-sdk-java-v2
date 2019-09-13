package com.commercetools.models.message;

import com.commercetools.models.common.Image;
import com.commercetools.models.message.Message;
import java.lang.Boolean;
import java.lang.Long;
import com.commercetools.models.message.ProductImageAddedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductImageAddedMessageBuilder {
   
   
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
   
   
   private com.commercetools.models.common.Image image;
   
   
   private java.lang.Boolean staged;
   
   
   private java.lang.Long variantId;
   
   public ProductImageAddedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductImageAddedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductImageAddedMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductImageAddedMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ProductImageAddedMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ProductImageAddedMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ProductImageAddedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ProductImageAddedMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ProductImageAddedMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public ProductImageAddedMessageBuilder image( final com.commercetools.models.common.Image image) {
      this.image = image;
      return this;
   }
   
   public ProductImageAddedMessageBuilder staged( final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductImageAddedMessageBuilder variantId( final java.lang.Long variantId) {
      this.variantId = variantId;
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
   
   
   public com.commercetools.models.common.Image getImage(){
      return this.image;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }

   public ProductImageAddedMessage build() {
       return new ProductImageAddedMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, image, staged, variantId);
   }
   
   public static ProductImageAddedMessageBuilder of() {
      return new ProductImageAddedMessageBuilder();
   }
   
   public static ProductImageAddedMessageBuilder of(final ProductImageAddedMessage template) {
      ProductImageAddedMessageBuilder builder = new ProductImageAddedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.image = template.getImage();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      return builder;
   }
   
}