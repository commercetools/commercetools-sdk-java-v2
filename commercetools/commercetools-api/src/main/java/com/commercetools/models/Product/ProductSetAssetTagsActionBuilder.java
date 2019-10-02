package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductSetAssetTagsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetAssetTagsActionBuilder {
   
   @Nullable
   private String assetId;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String assetKey;
   
   @Nullable
   private java.util.List<String> tags;
   
   public ProductSetAssetTagsActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public ProductSetAssetTagsActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAssetTagsActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAssetTagsActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAssetTagsActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   public ProductSetAssetTagsActionBuilder tags(@Nullable final java.util.List<String> tags) {
      this.tags = tags;
      return this;
   }
   
   @Nullable
   public String getAssetId(){
      return this.assetId;
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
   public String getAssetKey(){
      return this.assetKey;
   }
   
   @Nullable
   public java.util.List<String> getTags(){
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