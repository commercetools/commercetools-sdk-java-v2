package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.product.ProductRevertStagedVariantChangesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductRevertStagedVariantChangesActionBuilder {
   
   
   private java.lang.Long variantId;
   
   public ProductRevertStagedVariantChangesActionBuilder variantId( final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }

   public ProductRevertStagedVariantChangesAction build() {
       return new ProductRevertStagedVariantChangesActionImpl(variantId);
   }
   
   public static ProductRevertStagedVariantChangesActionBuilder of() {
      return new ProductRevertStagedVariantChangesActionBuilder();
   }
   
   public static ProductRevertStagedVariantChangesActionBuilder of(final ProductRevertStagedVariantChangesAction template) {
      ProductRevertStagedVariantChangesActionBuilder builder = new ProductRevertStagedVariantChangesActionBuilder();
      builder.variantId = template.getVariantId();
      return builder;
   }
   
}