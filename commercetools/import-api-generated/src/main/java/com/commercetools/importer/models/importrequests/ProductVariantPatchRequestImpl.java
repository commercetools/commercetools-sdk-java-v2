package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.importrequests.ImportRequest;
import com.commercetools.importer.models.productvariants.ProductVariantPatch;
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
*  <p>An import request for multiple product variant patch resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantPatchRequestImpl implements ProductVariantPatchRequest {

   private com.commercetools.importer.models.common.ImportResourceType type;
   
   private java.util.List<com.commercetools.importer.models.productvariants.ProductVariantPatch> patches;

   @JsonCreator
   ProductVariantPatchRequestImpl(@JsonProperty("patches") final java.util.List<com.commercetools.importer.models.productvariants.ProductVariantPatch> patches) {
      this.patches = patches;
      this.type = ImportResourceType.findEnumViaJsonName("product-variant-patch").get();
   }
   public ProductVariantPatchRequestImpl() {
      
   }
   
   /**
   *  <p>The type of the import resource.</p>
   */
   public com.commercetools.importer.models.common.ImportResourceType getType(){
      return this.type;
   }
   
   /**
   *  <p>The product variant patches of this request.</p>
   */
   public java.util.List<com.commercetools.importer.models.productvariants.ProductVariantPatch> getPatches(){
      return this.patches;
   }

   public void setPatches(final java.util.List<com.commercetools.importer.models.productvariants.ProductVariantPatch> patches){
      this.patches = patches;
   }

}