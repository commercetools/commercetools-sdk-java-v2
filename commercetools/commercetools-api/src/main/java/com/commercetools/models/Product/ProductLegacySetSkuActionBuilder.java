package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductLegacySetSkuAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductLegacySetSkuActionBuilder {
   
   
   private Integer variantId;
   
   @Nullable
   private String sku;
   
   public ProductLegacySetSkuActionBuilder variantId( final Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductLegacySetSkuActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public Integer getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public String getSku(){
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