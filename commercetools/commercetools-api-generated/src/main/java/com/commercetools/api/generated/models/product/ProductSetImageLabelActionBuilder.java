package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetImageLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetImageLabelActionBuilder {
   
   
   private String imageUrl;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private String label;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   public ProductSetImageLabelActionBuilder imageUrl( final String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
   }
   
   public ProductSetImageLabelActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetImageLabelActionBuilder label(@Nullable final String label) {
      this.label = label;
      return this;
   }
   
   public ProductSetImageLabelActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetImageLabelActionBuilder sku(@Nullable final String sku) {
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
   public String getLabel(){
      return this.label;
   }
   
   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public String getSku(){
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