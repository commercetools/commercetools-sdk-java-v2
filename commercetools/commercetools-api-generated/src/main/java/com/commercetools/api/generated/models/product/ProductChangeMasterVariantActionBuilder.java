package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductChangeMasterVariantAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductChangeMasterVariantActionBuilder {
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   public ProductChangeMasterVariantActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductChangeMasterVariantActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductChangeMasterVariantActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
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

   public ProductChangeMasterVariantAction build() {
       return new ProductChangeMasterVariantActionImpl(staged, variantId, sku);
   }
   
   public static ProductChangeMasterVariantActionBuilder of() {
      return new ProductChangeMasterVariantActionBuilder();
   }
   
   public static ProductChangeMasterVariantActionBuilder of(final ProductChangeMasterVariantAction template) {
      ProductChangeMasterVariantActionBuilder builder = new ProductChangeMasterVariantActionBuilder();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }
   
}