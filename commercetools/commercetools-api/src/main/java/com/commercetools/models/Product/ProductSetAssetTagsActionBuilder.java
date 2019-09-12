package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductSetAssetTagsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetAssetTagsActionBuilder {
   
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
   
   @Nullable
   private java.util.List<java.lang.String> tags;
   
   public ProductSetAssetTagsActionBuilder assetId(@Nullable final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public ProductSetAssetTagsActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAssetTagsActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAssetTagsActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAssetTagsActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   public ProductSetAssetTagsActionBuilder tags(@Nullable final java.util.List<java.lang.String> tags) {
      this.tags = tags;
      return this;
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
   
   @Nullable
   public java.util.List<java.lang.String> getTags(){
      return this.tags;
   }

   public ProductSetAssetTagsAction build() {
       return new ProductSetAssetTagsActionImpl(assetId, staged, variantId, sku, assetKey, tags);
   }
   
   public static ProductSetAssetTagsActionBuilder of() {
      return new ProductSetAssetTagsActionBuilder();
   }
   
   public static ProductSetAssetTagsActionBuilder of(final ProductSetAssetTagsAction template) {
      ProductSetAssetTagsActionBuilder builder = new ProductSetAssetTagsActionBuilder();
      builder.assetId = template.getAssetId();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.assetKey = template.getAssetKey();
      builder.tags = template.getTags();
      return builder;
   }
   
}