package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.ProductKeyReference;
import com.commercetools.importer.models.common.ProductVariantKeyReference;
import com.commercetools.importer.models.productvariants.Attributes;
import com.commercetools.importer.models.productvariants.ProductVariantPatch;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantPatchBuilder {
   
   
   private com.commercetools.importer.models.common.ProductVariantKeyReference productVariant;
   
   
   private com.commercetools.importer.models.common.ProductKeyReference product;
   
   @Nullable
   private com.commercetools.importer.models.productvariants.Attributes attributes;
   
   public ProductVariantPatchBuilder productVariant( final com.commercetools.importer.models.common.ProductVariantKeyReference productVariant) {
      this.productVariant = productVariant;
      return this;
   }
   
   public ProductVariantPatchBuilder product( final com.commercetools.importer.models.common.ProductKeyReference product) {
      this.product = product;
      return this;
   }
   
   public ProductVariantPatchBuilder attributes(@Nullable final com.commercetools.importer.models.productvariants.Attributes attributes) {
      this.attributes = attributes;
      return this;
   }
   
   
   public com.commercetools.importer.models.common.ProductVariantKeyReference getProductVariant(){
      return this.productVariant;
   }
   
   
   public com.commercetools.importer.models.common.ProductKeyReference getProduct(){
      return this.product;
   }
   
   @Nullable
   public com.commercetools.importer.models.productvariants.Attributes getAttributes(){
      return this.attributes;
   }

   public ProductVariantPatch build() {
       return new ProductVariantPatchImpl(productVariant, product, attributes);
   }
   
   public static ProductVariantPatchBuilder of() {
      return new ProductVariantPatchBuilder();
   }
   
   public static ProductVariantPatchBuilder of(final ProductVariantPatch template) {
      ProductVariantPatchBuilder builder = new ProductVariantPatchBuilder();
      builder.productVariant = template.getProductVariant();
      builder.product = template.getProduct();
      builder.attributes = template.getAttributes();
      return builder;
   }
   
}