package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetProductVariantKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetProductVariantKeyActionBuilder {
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String key;
   
   public ProductSetProductVariantKeyActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetProductVariantKeyActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetProductVariantKeyActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetProductVariantKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public String getKey(){
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