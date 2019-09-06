package com.commercetools.models.Product;

import com.commercetools.models.Common.AssetDraft;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductAddAssetAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductAddAssetActionBuilder {
   
   @Nullable
   private java.lang.Integer position;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   
   private com.commercetools.models.Common.AssetDraft asset;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductAddAssetActionBuilder position(@Nullable final java.lang.Integer position) {
      this.position = position;
      return this;
   }
   
   public ProductAddAssetActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductAddAssetActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductAddAssetActionBuilder asset( final com.commercetools.models.Common.AssetDraft asset) {
      this.asset = asset;
      return this;
   }
   
   public ProductAddAssetActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getPosition(){
      return this.position;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   
   public com.commercetools.models.Common.AssetDraft getAsset(){
      return this.asset;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }

   public ProductAddAssetAction build() {
       return new ProductAddAssetActionImpl(position, staged, variantId, asset, sku);
   }
   
   public static ProductAddAssetActionBuilder of() {
      return new ProductAddAssetActionBuilder();
   }
   
   public static ProductAddAssetActionBuilder of(final ProductAddAssetAction template) {
      ProductAddAssetActionBuilder builder = new ProductAddAssetActionBuilder();
      builder.position = template.getPosition();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.asset = template.getAsset();
      builder.sku = template.getSku();
      return builder;
   }
   
}