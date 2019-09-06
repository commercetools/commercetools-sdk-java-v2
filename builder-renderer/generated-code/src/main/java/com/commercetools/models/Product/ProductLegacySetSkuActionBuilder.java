package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Product.ProductLegacySetSkuAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductLegacySetSkuActionBuilder {
   
   
   private java.lang.Integer variantId;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductLegacySetSkuActionBuilder variantId( final java.lang.Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductLegacySetSkuActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public java.lang.Integer getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }

   public ProductLegacySetSkuAction build() {
       return new ProductLegacySetSkuActionImpl(variantId, sku);
   }
   
   public static ProductLegacySetSkuActionBuilder of() {
      return new ProductLegacySetSkuActionBuilder();
   }
   
   public static ProductLegacySetSkuActionBuilder of(final ProductLegacySetSkuAction template) {
      ProductLegacySetSkuActionBuilder builder = new ProductLegacySetSkuActionBuilder();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }
   
}