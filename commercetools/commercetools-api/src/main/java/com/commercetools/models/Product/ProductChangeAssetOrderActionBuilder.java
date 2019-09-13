package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.product.ProductChangeAssetOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductChangeAssetOrderActionBuilder {
   
   
   private java.util.List<java.lang.String> assetOrder;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductChangeAssetOrderActionBuilder assetOrder( final java.util.List<java.lang.String> assetOrder) {
      this.assetOrder = assetOrder;
      return this;
   }
   
   public ProductChangeAssetOrderActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductChangeAssetOrderActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductChangeAssetOrderActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getAssetOrder(){
      return this.assetOrder;
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