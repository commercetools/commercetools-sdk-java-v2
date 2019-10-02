package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductRemoveImageAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductRemoveImageActionBuilder {
   
   
   private String imageUrl;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   public ProductRemoveImageActionBuilder imageUrl( final String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
   }
   
   public ProductRemoveImageActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductRemoveImageActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductRemoveImageActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public String getImageUrl(){
      return this.imageUrl;
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