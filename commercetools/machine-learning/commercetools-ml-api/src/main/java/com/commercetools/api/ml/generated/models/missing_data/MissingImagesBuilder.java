package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.common.ProductReference;
import com.commercetools.api.ml.generated.models.missing_data.MissingImages;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingImagesBuilder {
   
   
   private ProductReference product;
   
   
   private Long variantId;
   
   
   private Long imageCount;
   
   public MissingImagesBuilder product( final ProductReference product) {
      this.product = product;
      return this;
   }
   
   public MissingImagesBuilder variantId( final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public MissingImagesBuilder imageCount( final Long imageCount) {
      this.imageCount = imageCount;
      return this;
   }
   
   
   public ProductReference getProduct(){
      return this.product;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public Long getImageCount(){
      return this.imageCount;
   }

   public MissingImages build() {
       return new MissingImagesImpl(product, variantId, imageCount);
   }
   
   public static MissingImagesBuilder of() {
      return new MissingImagesBuilder();
   }
   
   public static MissingImagesBuilder of(final MissingImages template) {
      MissingImagesBuilder builder = new MissingImagesBuilder();
      builder.product = template.getProduct();
      builder.variantId = template.getVariantId();
      builder.imageCount = template.getImageCount();
      return builder;
   }
   
}
