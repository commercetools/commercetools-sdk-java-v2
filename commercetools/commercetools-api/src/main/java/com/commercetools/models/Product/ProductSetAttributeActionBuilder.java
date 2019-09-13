package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.product.ProductSetAttributeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetAttributeActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.Object value;
   
   public ProductSetAttributeActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ProductSetAttributeActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAttributeActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAttributeActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAttributeActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public ProductSetAttributeAction build() {
       return new ProductSetAttributeActionImpl(name, staged, variantId, sku, value);
   }
   
   public static ProductSetAttributeActionBuilder of() {
      return new ProductSetAttributeActionBuilder();
   }
   
   public static ProductSetAttributeActionBuilder of(final ProductSetAttributeAction template) {
      ProductSetAttributeActionBuilder builder = new ProductSetAttributeActionBuilder();
      builder.name = template.getName();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.value = template.getValue();
      return builder;
   }
   
}