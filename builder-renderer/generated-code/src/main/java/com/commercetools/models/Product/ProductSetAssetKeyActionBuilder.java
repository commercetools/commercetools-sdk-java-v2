package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductSetAssetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetAssetKeyActionBuilder {
   
   
   private java.lang.String assetId;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String assetKey;
   
   public ProductSetAssetKeyActionBuilder assetId( final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public ProductSetAssetKeyActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAssetKeyActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAssetKeyActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAssetKeyActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   
   public java.lang.String getAssetId(){
      return this.assetId;
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
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }

   public ProductSetAssetKeyAction build() {
       return new ProductSetAssetKeyActionImpl(assetId, staged, variantId, sku, assetKey);
   }
   
   public static ProductSetAssetKeyActionBuilder of() {
      return new ProductSetAssetKeyActionBuilder();
   }
   
   public static ProductSetAssetKeyActionBuilder of(final ProductSetAssetKeyAction template) {
      ProductSetAssetKeyActionBuilder builder = new ProductSetAssetKeyActionBuilder();
      builder.assetId = template.getAssetId();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}