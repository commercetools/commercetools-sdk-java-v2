package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.product_type.AttributeDefinition;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.product_type.ProductType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   
   private String name;
   
   
   private String description;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.product_type.AttributeDefinition> attributes;
   
   @Nullable
   private String key;
   
   public ProductTypeBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductTypeBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductTypeBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ProductTypeBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ProductTypeBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ProductTypeBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ProductTypeBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ProductTypeBuilder description( final String description) {
      this.description = description;
      return this;
   }
   
   public ProductTypeBuilder attributes(@Nullable final java.util.List<com.commercetools.api.generated.models.product_type.AttributeDefinition> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductTypeBuilder key(@Nullable final String key) {
      this.key = key;
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
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public String getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.product_type.AttributeDefinition> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public ProductType build() {
       return new ProductTypeImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, name, description, attributes, key);
   }
   
   public static ProductTypeBuilder of() {
      return new ProductTypeBuilder();
   }
   
   public static ProductTypeBuilder of(final ProductType template) {
      ProductTypeBuilder builder = new ProductTypeBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.attributes = template.getAttributes();
      builder.key = template.getKey();
      return builder;
   }
   
}