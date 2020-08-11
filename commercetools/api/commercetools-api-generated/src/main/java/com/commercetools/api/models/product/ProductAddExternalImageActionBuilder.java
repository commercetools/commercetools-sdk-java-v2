package com.commercetools.api.models.product;

import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductAddExternalImageAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductAddExternalImageActionBuilder {


   private com.commercetools.api.models.common.Image image;

   @Nullable
   private Boolean staged;

   @Nullable
   private Long variantId;

   @Nullable
   private String sku;

   public ProductAddExternalImageActionBuilder image( final com.commercetools.api.models.common.Image image) {
      this.image = image;
      return this;
   }

   public ProductAddExternalImageActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }

   public ProductAddExternalImageActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }

   public ProductAddExternalImageActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }


   public com.commercetools.api.models.common.Image getImage(){
      return this.image;
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
