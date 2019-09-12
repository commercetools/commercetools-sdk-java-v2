package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductRemoveImageAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductRemoveImageActionBuilder {
   
   
   private java.lang.String imageUrl;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductRemoveImageActionBuilder imageUrl( final java.lang.String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
   }
   
   public ProductRemoveImageActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductRemoveImageActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductRemoveImageActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public java.lang.String getImageUrl(){
      return this.imageUrl;
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

   public ProductRemoveImageAction build() {
       return new ProductRemoveImageActionImpl(imageUrl, staged, variantId, sku);
   }
   
   public static ProductRemoveImageActionBuilder of() {
      return new ProductRemoveImageActionBuilder();
   }
   
   public static ProductRemoveImageActionBuilder of(final ProductRemoveImageAction template) {
      ProductRemoveImageActionBuilder builder = new ProductRemoveImageActionBuilder();
      builder.imageUrl = template.getImageUrl();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }
   
}