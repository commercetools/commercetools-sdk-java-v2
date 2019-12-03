package com.commercetools.importer.models.common;

import com.commercetools.importer.models.categories.CategoryImport;
import com.commercetools.importer.models.prices.PriceImport;
import com.commercetools.importer.models.products.ProductImport;
import com.commercetools.importer.models.producttypes.ProductTypeImport;
import com.commercetools.importer.models.productvariants.ProductVariantImport;
import com.commercetools.importer.models.common.ImportResource;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportResourceBuilder {
   
   
   private String key;
   
   public ImportResourceBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public ImportResource build() {
       return new ImportResourceImpl(key);
   }
   
   public static ImportResourceBuilder of() {
      return new ImportResourceBuilder();
   }
   
   public static ImportResourceBuilder of(final ImportResource template) {
      ImportResourceBuilder builder = new ImportResourceBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}