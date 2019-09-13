package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.product.ProductMoveImageToPositionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductMoveImageToPositionActionBuilder {
   
   
   private java.lang.String imageUrl;
   
   @Nullable
   private java.lang.Boolean staged;
   
   
   private java.lang.Long position;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductMoveImageToPositionActionBuilder imageUrl( final java.lang.String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
   }
   
   public ProductMoveImageToPositionActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductMoveImageToPositionActionBuilder position( final java.lang.Long position) {
      this.position = position;
      return this;
   }
   
   public ProductMoveImageToPositionActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductMoveImageToPositionActionBuilder sku(@Nullable final java.lang.String sku) {
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
   
   
   public java.lang.Long getPosition(){
      return this.position;
   }
   
   @Nullable
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }

   public ProductMoveImageToPositionAction build() {
       return new ProductMoveImageToPositionActionImpl(imageUrl, staged, position, variantId, sku);
   }
   
   public static ProductMoveImageToPositionActionBuilder of() {
      return new ProductMoveImageToPositionActionBuilder();
   }
   
   public static ProductMoveImageToPositionActionBuilder of(final ProductMoveImageToPositionAction template) {
      ProductMoveImageToPositionActionBuilder builder = new ProductMoveImageToPositionActionBuilder();
      builder.imageUrl = template.getImageUrl();
      builder.staged = template.getStaged();
      builder.position = template.getPosition();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }
   
}