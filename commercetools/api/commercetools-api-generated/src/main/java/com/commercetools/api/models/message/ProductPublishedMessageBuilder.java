package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.ProductPublishScope;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.message.ProductPublishedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductPublishedMessageBuilder {


   private java.time.ZonedDateTime createdAt;


   private java.time.ZonedDateTime lastModifiedAt;


   private String id;


   private Long version;

   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;

   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;


   private Long sequenceNumber;


   private com.commercetools.api.models.common.Reference resource;

   @Nullable
   private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;


   private Long resourceVersion;


   private java.util.List<com.fasterxml.jackson.databind.JsonNode> removedImageUrls;


   private com.commercetools.api.models.product.ProductProjection productProjection;


   private com.commercetools.api.models.cart.ProductPublishScope scope;

   public ProductPublishedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }

   public ProductPublishedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }

   public ProductPublishedMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public ProductPublishedMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }

   public ProductPublishedMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }

   public ProductPublishedMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }

   public ProductPublishedMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }

   public ProductPublishedMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }

   public ProductPublishedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }

   public ProductPublishedMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }

   public ProductPublishedMessageBuilder removedImageUrls( final java.util.List<com.fasterxml.jackson.databind.JsonNode> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }

   public ProductPublishedMessageBuilder productProjection( final com.commercetools.api.models.product.ProductProjection productProjection) {
      this.productProjection = productProjection;
      return this;
   }

   public ProductPublishedMessageBuilder scope( final com.commercetools.api.models.cart.ProductPublishScope scope) {
      this.scope = scope;
      return this;
   }


   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }


   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }


   public String getId(){
      return this.id;
   }


   public Long getVersion(){
      return this.version;
   }

   @Nullable
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }

   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }


   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }


   public com.commercetools.api.models.common.Reference getResource(){
      return this.resource;
   }

   @Nullable
   public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }


   public Long getResourceVersion(){
      return this.resourceVersion;
   }


   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getRemovedImageUrls(){
      return this.removedImageUrls;
   }


   public com.commercetools.api.models.product.ProductProjection getProductProjection(){
      return this.productProjection;
   }


   public com.commercetools.api.models.cart.ProductPublishScope getScope(){
      return this.scope;
   }

   public ProductPublishedMessage build() {
       return new ProductPublishedMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, removedImageUrls, productProjection, scope);
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
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.removedImageUrls = template.getRemovedImageUrls();
      builder.productProjection = template.getProductProjection();
      builder.scope = template.getScope();
      return builder;
   }

}
