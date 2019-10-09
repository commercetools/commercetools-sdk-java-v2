package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductSetAssetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetAssetKeyActionBuilder {
   
   
   private String assetId;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String assetKey;
   
   public ProductSetAssetKeyActionBuilder assetId( final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public ProductSetAssetKeyActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAssetKeyActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAssetKeyActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAssetKeyActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   
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