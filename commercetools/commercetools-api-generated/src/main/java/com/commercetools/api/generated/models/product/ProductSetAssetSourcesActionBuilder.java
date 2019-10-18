package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.AssetSource;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetAssetSourcesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetAssetSourcesActionBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.common.AssetSource> sources;
   
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
   
   public ProductSetAssetSourcesActionBuilder sources( final java.util.List<com.commercetools.api.generated.models.common.AssetSource> sources) {
      this.sources = sources;
      return this;
   }
   
   public ProductSetAssetSourcesActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public ProductSetAssetSourcesActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAssetSourcesActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAssetSourcesActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAssetSourcesActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.AssetSource> getSources(){
      return this.sources;
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