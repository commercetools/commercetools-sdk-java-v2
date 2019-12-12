package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductMoveImageToPositionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductMoveImageToPositionActionBuilder {
   
   
   private String imageUrl;
   
   @Nullable
   private Boolean staged;
   
   
   private Long position;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   public ProductMoveImageToPositionActionBuilder imageUrl( final String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
   }
   
   public ProductMoveImageToPositionActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductMoveImageToPositionActionBuilder position( final Long position) {
      this.position = position;
      return this;
   }
   
   public ProductMoveImageToPositionActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductMoveImageToPositionActionBuilder sku(@Nullable final String sku) {
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
   
   
   public Long getPosition(){
      return this.position;
   }
   
   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public String getSku(){
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