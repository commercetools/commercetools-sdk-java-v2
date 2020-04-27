package com.commercetools.api.ml.generated.models.common;

import com.commercetools.api.ml.generated.models.common.ProductReference;
import com.commercetools.api.ml.generated.models.common.ProductVariant;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantBuilder {
   
   
   private com.commercetools.api.ml.generated.models.common.ProductReference product;
   
   
   private Boolean staged;
   
   
   private Integer variantId;
   
   public ProductVariantBuilder product( final com.commercetools.api.ml.generated.models.common.ProductReference product) {
      this.product = product;
      return this;
   }
   
   public ProductVariantBuilder staged( final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductVariantBuilder variantId( final Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   
   public com.commercetools.api.ml.generated.models.common.ProductReference getProduct(){
      return this.product;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Integer getVariantId(){
      return this.variantId;
   }

   public ProductVariant build() {
       return new ProductVariantImpl(product, staged, variantId);
   }
   
   public static ProductVariantBuilder of() {
      return new ProductVariantBuilder();
   }
   
   public static ProductVariantBuilder of(final ProductVariant template) {
      ProductVariantBuilder builder = new ProductVariantBuilder();
      builder.product = template.getProduct();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      return builder;
   }
   
}
