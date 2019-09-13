package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.product.ProductSetProductVariantKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetProductVariantKeyActionBuilder {
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String key;
   
   public ProductSetProductVariantKeyActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetProductVariantKeyActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetProductVariantKeyActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetProductVariantKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
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
   public java.lang.String getKey(){
      return this.key;
   }

   public ProductSetProductVariantKeyAction build() {
       return new ProductSetProductVariantKeyActionImpl(staged, variantId, sku, key);
   }
   
   public static ProductSetProductVariantKeyActionBuilder of() {
      return new ProductSetProductVariantKeyActionBuilder();
   }
   
   public static ProductSetProductVariantKeyActionBuilder of(final ProductSetProductVariantKeyAction template) {
      ProductSetProductVariantKeyActionBuilder builder = new ProductSetProductVariantKeyActionBuilder();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.key = template.getKey();
      return builder;
   }
   
}