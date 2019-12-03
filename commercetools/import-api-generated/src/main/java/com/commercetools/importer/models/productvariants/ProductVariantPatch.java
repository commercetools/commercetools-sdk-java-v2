package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.ProductKeyReference;
import com.commercetools.importer.models.common.ProductVariantKeyReference;
import com.commercetools.importer.models.productvariants.Attributes;
import com.commercetools.importer.models.productvariants.ProductVariantPatchImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>Import representation for an update to a product variant. Use this type for importing updates to existing
*  product variants into a commercetools project.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantPatchImpl.class)
public interface ProductVariantPatch  {

   /**
   *  <p>The product variant to which this patch is applied.</p>
   *  <p>The product variant referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("productVariant")
   public ProductVariantKeyReference getProductVariant();
   /**
   *  <p>The product in which the patched product variant resides. Maps to <code>ProductVariant.product</code>.</p>
   *  <p>The product referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("product")
   public ProductKeyReference getProduct();
   /**
   *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
   *  <p>Each attribute referenced must be defined
   *  in an already existing product type in the commercetools project, or the import
   *  operation state is set to <code>Unresolved</code>.</p>
   */
   @Valid
   @JsonProperty("attributes")
   public Attributes getAttributes();

   public void setProductVariant(final ProductVariantKeyReference productVariant);
   
   public void setProduct(final ProductKeyReference product);
   
   public void setAttributes(final Attributes attributes);
   
   public static ProductVariantPatchImpl of(){
      return new ProductVariantPatchImpl();
   }
   

   public static ProductVariantPatchImpl of(final ProductVariantPatch template) {
      ProductVariantPatchImpl instance = new ProductVariantPatchImpl();
      instance.setProduct(template.getProduct());
      instance.setProductVariant(template.getProductVariant());
      instance.setAttributes(template.getAttributes());
      return instance;
   }

}