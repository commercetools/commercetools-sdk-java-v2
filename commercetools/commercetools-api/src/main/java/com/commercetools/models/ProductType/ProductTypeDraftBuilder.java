package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeDefinitionDraft;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeDraftBuilder {
   
   
   private java.lang.String name;
   
   
   private java.lang.String description;
   
   @Nullable
   private java.util.List<com.commercetools.models.ProductType.AttributeDefinitionDraft> attributes;
   
   @Nullable
   private java.lang.String key;
   
   public ProductTypeDraftBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ProductTypeDraftBuilder description( final java.lang.String description) {
      this.description = description;
      return this;
   }
   
   public ProductTypeDraftBuilder attributes(@Nullable final java.util.List<com.commercetools.models.ProductType.AttributeDefinitionDraft> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductTypeDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.String getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.ProductType.AttributeDefinitionDraft> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ProductTypeDraft build() {
       return new ProductTypeDraftImpl(name, description, attributes, key);
   }
   
   public static ProductTypeDraftBuilder of() {
      return new ProductTypeDraftBuilder();
   }
   
   public static ProductTypeDraftBuilder of(final ProductTypeDraft template) {
      ProductTypeDraftBuilder builder = new ProductTypeDraftBuilder();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.attributes = template.getAttributes();
      builder.key = template.getKey();
      return builder;
   }
   
}