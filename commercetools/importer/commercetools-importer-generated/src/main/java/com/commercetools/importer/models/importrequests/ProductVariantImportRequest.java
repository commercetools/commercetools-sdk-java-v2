package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.importrequests.ImportRequest;
import com.commercetools.importer.models.productvariants.ProductVariantImport;
import com.commercetools.importer.models.importrequests.ProductVariantImportRequestImpl;

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
*  <p>An import request for multiple product variant import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantImportRequestImpl.class)
public interface ProductVariantImportRequest extends ImportRequest {

   /**
   *  <p>The product variant import resources of this request.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("resources")
   public List<ProductVariantImport> getResources();

   public void setResources(final List<ProductVariantImport> resources);
   
   public static ProductVariantImportRequestImpl of(){
      return new ProductVariantImportRequestImpl();
   }
   

   public static ProductVariantImportRequestImpl of(final ProductVariantImportRequest template) {
      ProductVariantImportRequestImpl instance = new ProductVariantImportRequestImpl();
      instance.setResources(template.getResources());
      return instance;
   }

}