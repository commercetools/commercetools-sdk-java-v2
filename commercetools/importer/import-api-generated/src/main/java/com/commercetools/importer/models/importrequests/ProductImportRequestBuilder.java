package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.importrequests.ImportRequest;
import com.commercetools.importer.models.products.ProductImport;
import com.commercetools.importer.models.importrequests.ProductImportRequest;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductImportRequestBuilder {
   
   
   private java.util.List<com.commercetools.importer.models.products.ProductImport> resources;
   
   public ProductImportRequestBuilder resources( final java.util.List<com.commercetools.importer.models.products.ProductImport> resources) {
      this.resources = resources;
      return this;
   }
   
   
   public java.util.List<com.commercetools.importer.models.products.ProductImport> getResources(){
      return this.resources;
   }

   public ProductImportRequest build() {
       return new ProductImportRequestImpl(resources);
   }
   
   public static ProductImportRequestBuilder of() {
      return new ProductImportRequestBuilder();
   }
   
   public static ProductImportRequestBuilder of(final ProductImportRequest template) {
      ProductImportRequestBuilder builder = new ProductImportRequestBuilder();
      builder.resources = template.getResources();
      return builder;
   }
   
}