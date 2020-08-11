package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductChangeAssetOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductChangeAssetOrderActionBuilder {


   private java.util.List<String> assetOrder;

   @Nullable
   private Boolean staged;

   @Nullable
   private Long variantId;

   @Nullable
   private String sku;

   public ProductChangeAssetOrderActionBuilder assetOrder( final java.util.List<String> assetOrder) {
      this.assetOrder = assetOrder;
      return this;
   }

   public ProductChangeAssetOrderActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }

   public ProductChangeAssetOrderActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }

   public ProductChangeAssetOrderActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }


   public java.util.List<String> getAssetOrder(){
      return this.assetOrder;
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

   public ProductChangeAssetOrderAction build() {
       return new ProductChangeAssetOrderActionImpl(assetOrder, staged, variantId, sku);
   }

   public static ProductChangeAssetOrderActionBuilder of() {
      return new ProductChangeAssetOrderActionBuilder();
   }

   public static ProductChangeAssetOrderActionBuilder of(final ProductChangeAssetOrderAction template) {
      ProductChangeAssetOrderActionBuilder builder = new ProductChangeAssetOrderActionBuilder();
      builder.assetOrder = template.getAssetOrder();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }

}
