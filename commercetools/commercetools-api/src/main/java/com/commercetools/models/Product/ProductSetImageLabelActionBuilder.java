package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.product.ProductSetImageLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetImageLabelActionBuilder {
   
   
   private java.lang.String imageUrl;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.String label;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductSetImageLabelActionBuilder imageUrl( final java.lang.String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
   }
   
   public ProductSetImageLabelActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetImageLabelActionBuilder label(@Nullable final java.lang.String label) {
      this.label = label;
      return this;
   }
   
   public ProductSetImageLabelActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetImageLabelActionBuilder sku(@Nullable final java.lang.String sku) {
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
   public java.lang.String getLabel(){
      return this.label;
   }
   
   @Nullable
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }

   public ProductSetImageLabelAction build() {
       return new ProductSetImageLabelActionImpl(imageUrl, staged, label, variantId, sku);
   }
   
   public static ProductSetImageLabelActionBuilder of() {
      return new ProductSetImageLabelActionBuilder();
   }
   
   public static ProductSetImageLabelActionBuilder of(final ProductSetImageLabelAction template) {
      ProductSetImageLabelActionBuilder builder = new ProductSetImageLabelActionBuilder();
      builder.imageUrl = template.getImageUrl();
      builder.staged = template.getStaged();
      builder.label = template.getLabel();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }
   
}