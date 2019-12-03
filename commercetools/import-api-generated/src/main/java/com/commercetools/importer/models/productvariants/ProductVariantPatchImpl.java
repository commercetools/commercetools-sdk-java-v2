package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.ProductKeyReference;
import com.commercetools.importer.models.common.ProductVariantKeyReference;
import com.commercetools.importer.models.productvariants.Attributes;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>Import representation for an update to a product variant. Use this type for importing updates to existing
*  product variants into a commercetools project.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantPatchImpl implements ProductVariantPatch {

   private com.commercetools.importer.models.common.ProductKeyReference product;
   
   private com.commercetools.importer.models.common.ProductVariantKeyReference productVariant;
   
   private com.commercetools.importer.models.productvariants.Attributes attributes;

   @JsonCreator
   ProductVariantPatchImpl(@JsonProperty("product") final com.commercetools.importer.models.common.ProductKeyReference product, @JsonProperty("productVariant") final com.commercetools.importer.models.common.ProductVariantKeyReference productVariant, @JsonProperty("attributes") final com.commercetools.importer.models.productvariants.Attributes attributes) {
      this.product = product;
      this.productVariant = productVariant;
      this.attributes = attributes;
   }
   public ProductVariantPatchImpl() {
      
   }
   
   /**
   *  <p>The product in which the patched product variant resides. Maps to <code>ProductVariant.product</code>.</p>
   *  <p>The product referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   public com.commercetools.importer.models.common.ProductKeyReference getProduct(){
      return this.product;
   }
   
   /**
   *  <p>The product variant to which this patch is applied.</p>
   *  <p>The product variant referenced
   *  must already exist in the commercetools project, or the
   *  import operation state is set to <code>Unresolved</code>.</p>
   */
   public com.commercetools.importer.models.common.ProductVariantKeyReference getProductVariant(){
      return this.productVariant;
   }
   
   /**
   *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
   *  <p>Each attribute referenced must be defined
   *  in an already existing product type in the commercetools project, or the import
   *  operation state is set to <code>Unresolved</code>.</p>
   */
   public com.commercetools.importer.models.productvariants.Attributes getAttributes(){
      return this.attributes;
   }

   public void setProduct(final com.commercetools.importer.models.common.ProductKeyReference product){
      this.product = product;
   }
   
   public void setProductVariant(final com.commercetools.importer.models.common.ProductVariantKeyReference productVariant){
      this.productVariant = productVariant;
   }
   
   public void setAttributes(final com.commercetools.importer.models.productvariants.Attributes attributes){
      this.attributes = attributes;
   }

}