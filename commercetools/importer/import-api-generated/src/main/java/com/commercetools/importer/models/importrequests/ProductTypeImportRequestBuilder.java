package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.importrequests.ImportRequest;
import com.commercetools.importer.models.producttypes.ProductTypeImport;
import com.commercetools.importer.models.importrequests.ProductTypeImportRequest;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeImportRequestBuilder {
   
   
   private java.util.List<com.commercetools.importer.models.producttypes.ProductTypeImport> resources;
   
   public ProductTypeImportRequestBuilder resources( final java.util.List<com.commercetools.importer.models.producttypes.ProductTypeImport> resources) {
      this.resources = resources;
      return this;
   }
   
   
   public java.util.List<com.commercetools.importer.models.producttypes.ProductTypeImport> getResources(){
      return this.resources;
   }

   public ProductTypeImportRequest build() {
       return new ProductTypeImportRequestImpl(resources);
   }
   
   public static ProductTypeImportRequestBuilder of() {
      return new ProductTypeImportRequestBuilder();
   }
   
   public static ProductTypeImportRequestBuilder of(final ProductTypeImportRequest template) {
      ProductTypeImportRequestBuilder builder = new ProductTypeImportRequestBuilder();
      builder.resources = template.getResources();
      return builder;
   }
   
}