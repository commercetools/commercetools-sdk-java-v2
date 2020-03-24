package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.AssetDraft;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductAddAssetAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductAddAssetActionBuilder {
   
   @Nullable
   private Integer position;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   
   private com.commercetools.api.generated.models.common.AssetDraft asset;
   
   @Nullable
   private String sku;
   
   public ProductAddAssetActionBuilder position(@Nullable final Integer position) {
      this.position = position;
      return this;
   }
   
   public ProductAddAssetActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductAddAssetActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductAddAssetActionBuilder asset( final com.commercetools.api.generated.models.common.AssetDraft asset) {
      this.asset = asset;
      return this;
   }
   
   public ProductAddAssetActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   @Nullable
   public Integer getPosition(){
      return this.position;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public com.commercetools.api.generated.models.common.AssetDraft getAsset(){
      return this.asset;
   }
   
   @Nullable
   public String getSku(){
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