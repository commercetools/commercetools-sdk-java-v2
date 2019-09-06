package com.commercetools.models.Product;

import com.commercetools.models.Common.Image;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductAddExternalImageAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductAddExternalImageActionBuilder {
   
   
   private com.commercetools.models.Common.Image image;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductAddExternalImageActionBuilder image( final com.commercetools.models.Common.Image image) {
      this.image = image;
      return this;
   }
   
   public ProductAddExternalImageActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductAddExternalImageActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductAddExternalImageActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public com.commercetools.models.Common.Image getImage(){
      return this.image;
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

   public ProductAddExternalImageAction build() {
       return new ProductAddExternalImageActionImpl(image, staged, variantId, sku);
   }
   
   public static ProductAddExternalImageActionBuilder of() {
      return new ProductAddExternalImageActionBuilder();
   }
   
   public static ProductAddExternalImageActionBuilder of(final ProductAddExternalImageAction template) {
      ProductAddExternalImageActionBuilder builder = new ProductAddExternalImageActionBuilder();
      builder.image = template.getImage();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }
   
}