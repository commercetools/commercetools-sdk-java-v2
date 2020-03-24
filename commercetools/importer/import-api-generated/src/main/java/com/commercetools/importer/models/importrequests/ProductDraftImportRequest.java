package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.importrequests.ImportRequest;
import com.commercetools.importer.models.productdrafts.ProductDraftImport;
import com.commercetools.importer.models.importrequests.ProductDraftImportRequestImpl;

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
*  <p>An import request for multiple product draft import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDraftImportRequestImpl.class)
public interface ProductDraftImportRequest extends ImportRequest {

   /**
   *  <p>The product draft import resources of this request.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("resources")
   public List<ProductDraftImport> getResources();

   public void setResources(final List<ProductDraftImport> resources);
   
   public static ProductDraftImportRequestImpl of(){
      return new ProductDraftImportRequestImpl();
   }
   

   public static ProductDraftImportRequestImpl of(final ProductDraftImportRequest template) {
      ProductDraftImportRequestImpl instance = new ProductDraftImportRequestImpl();
      instance.setResources(template.getResources());
      return instance;
   }

}