package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductSetSkuAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetSkuActionBuilder {
   
   @Nullable
   private java.lang.Boolean staged;
   
   
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductSetSkuActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetSkuActionBuilder variantId( final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetSkuActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }

   public ProductSetSkuAction build() {
       return new ProductSetSkuActionImpl(staged, variantId, sku);
   }
   
   public static ProductSetSkuActionBuilder of() {
      return new ProductSetSkuActionBuilder();
   }
   
   public static ProductSetSkuActionBuilder of(final ProductSetSkuAction template) {
      ProductSetSkuActionBuilder builder = new ProductSetSkuActionBuilder();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }
   
}