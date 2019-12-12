package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductChangeAssetNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductChangeAssetNameActionBuilder {
   
   @Nullable
   private String assetId;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String assetKey;
   
   public ProductChangeAssetNameActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public ProductChangeAssetNameActionBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductChangeAssetNameActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductChangeAssetNameActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductChangeAssetNameActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductChangeAssetNameActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public String getAssetId(){
      return this.assetId;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
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

   public ProductChangeAssetNameAction build() {
       return new ProductChangeAssetNameActionImpl(assetId, name, staged, variantId, sku, assetKey);
   }
   
   public static ProductChangeAssetNameActionBuilder of() {
      return new ProductChangeAssetNameActionBuilder();
   }
   
   public static ProductChangeAssetNameActionBuilder of(final ProductChangeAssetNameAction template) {
      ProductChangeAssetNameActionBuilder builder = new ProductChangeAssetNameActionBuilder();
      builder.assetId = template.getAssetId();
      builder.name = template.getName();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}