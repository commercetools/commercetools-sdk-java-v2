package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.importrequests.ImportRequest;
import com.commercetools.importer.models.productdrafts.ProductDraftImport;
import com.commercetools.importer.models.importrequests.ProductDraftImportRequest;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDraftImportRequestBuilder {
   
   
   private java.util.List<com.commercetools.importer.models.productdrafts.ProductDraftImport> resources;
   
   public ProductDraftImportRequestBuilder resources( final java.util.List<com.commercetools.importer.models.productdrafts.ProductDraftImport> resources) {
      this.resources = resources;
      return this;
   }
   
   
   public java.util.List<com.commercetools.importer.models.productdrafts.ProductDraftImport> getResources(){
      return this.resources;
   }

   public ProductDraftImportRequest build() {
       return new ProductDraftImportRequestImpl(resources);
   }
   
   public static ProductDraftImportRequestBuilder of() {
      return new ProductDraftImportRequestBuilder();
   }
   
   public static ProductDraftImportRequestBuilder of(final ProductDraftImportRequest template) {
      ProductDraftImportRequestBuilder builder = new ProductDraftImportRequestBuilder();
      builder.resources = template.getResources();
      return builder;
   }
   
}