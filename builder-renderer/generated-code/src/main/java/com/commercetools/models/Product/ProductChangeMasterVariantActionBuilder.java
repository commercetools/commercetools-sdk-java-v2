package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductChangeMasterVariantAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductChangeMasterVariantActionBuilder {
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductChangeMasterVariantActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductChangeMasterVariantActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductChangeMasterVariantActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
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

   public ProductChangeMasterVariantAction build() {
       return new ProductChangeMasterVariantActionImpl(staged, variantId, sku);
   }
   
   public static ProductChangeMasterVariantActionBuilder of() {
      return new ProductChangeMasterVariantActionBuilder();
   }
   
   public static ProductChangeMasterVariantActionBuilder of(final ProductChangeMasterVariantAction template) {
      ProductChangeMasterVariantActionBuilder builder = new ProductChangeMasterVariantActionBuilder();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }
   
}