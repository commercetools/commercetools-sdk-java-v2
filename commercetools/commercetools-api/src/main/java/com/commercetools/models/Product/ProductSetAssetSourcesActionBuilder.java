package com.commercetools.models.product;

import com.commercetools.models.common.AssetSource;
import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.product.ProductSetAssetSourcesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetAssetSourcesActionBuilder {
   
   
   private java.util.List<com.commercetools.models.common.AssetSource> sources;
   
   @Nullable
   private java.lang.String assetId;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String assetKey;
   
   public ProductSetAssetSourcesActionBuilder sources( final java.util.List<com.commercetools.models.common.AssetSource> sources) {
      this.sources = sources;
      return this;
   }
   
   public ProductSetAssetSourcesActionBuilder assetId(@Nullable final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public ProductSetAssetSourcesActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAssetSourcesActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAssetSourcesActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAssetSourcesActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.common.AssetSource> getSources(){
      return this.sources;
   }
   
   @Nullable
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

   public ProductSetAssetSourcesAction build() {
       return new ProductSetAssetSourcesActionImpl(sources, assetId, staged, variantId, sku, assetKey);
   }
   
   public static ProductSetAssetSourcesActionBuilder of() {
      return new ProductSetAssetSourcesActionBuilder();
   }
   
   public static ProductSetAssetSourcesActionBuilder of(final ProductSetAssetSourcesAction template) {
      ProductSetAssetSourcesActionBuilder builder = new ProductSetAssetSourcesActionBuilder();
      builder.sources = template.getSources();
      builder.assetId = template.getAssetId();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}