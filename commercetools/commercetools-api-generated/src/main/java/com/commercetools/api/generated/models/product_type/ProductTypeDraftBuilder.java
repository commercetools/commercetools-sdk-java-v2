package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft;
import com.commercetools.api.generated.models.product_type.ProductTypeDraft;
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
public final class ProductTypeDraftBuilder {
   
   
   private String name;
   
   
   private String description;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft> attributes;
   
   @Nullable
   private String key;
   
   public ProductTypeDraftBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ProductTypeDraftBuilder description( final String description) {
      this.description = description;
      return this;
   }
   
   public ProductTypeDraftBuilder attributes(@Nullable final java.util.List<com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductTypeDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public String getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public String getKey(){
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