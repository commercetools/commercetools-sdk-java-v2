package com.commercetools.api.models.message;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.ProductAddedToCategoryMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductAddedToCategoryMessageBuilder {


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


   private Boolean staged;


   private com.commercetools.api.models.category.CategoryReference category;

   public ProductAddedToCategoryMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }

   public ProductAddedToCategoryMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }

   public ProductAddedToCategoryMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public ProductAddedToCategoryMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }

   public ProductAddedToCategoryMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }

   public ProductAddedToCategoryMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }

   public ProductAddedToCategoryMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }

   public ProductAddedToCategoryMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }

   public ProductAddedToCategoryMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }

   public ProductAddedToCategoryMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }

   public ProductAddedToCategoryMessageBuilder staged( final Boolean staged) {
      this.staged = staged;
      return this;
   }

   public ProductAddedToCategoryMessageBuilder category( final com.commercetools.api.models.category.CategoryReference category) {
      this.category = category;
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


   public Boolean getStaged(){
      return this.staged;
   }


   public com.commercetools.api.models.category.CategoryReference getCategory(){
      return this.category;
   }

   public ProductAddedToCategoryMessage build() {
       return new ProductAddedToCategoryMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, staged, category);
   }

   public static ProductAddedToCategoryMessageBuilder of() {
      return new ProductAddedToCategoryMessageBuilder();
   }

   public static ProductAddedToCategoryMessageBuilder of(final ProductAddedToCategoryMessage template) {
      ProductAddedToCategoryMessageBuilder builder = new ProductAddedToCategoryMessageBuilder();
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
      builder.staged = template.getStaged();
      builder.category = template.getCategory();
      return builder;
   }

}
