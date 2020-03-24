package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.common.ReferenceType;
import com.commercetools.importer.models.common.TaxCategoryKeyReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryKeyReferenceBuilder {
   
   
   private String key;
   
   public TaxCategoryKeyReferenceBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public TaxCategoryKeyReference build() {
       return new TaxCategoryKeyReferenceImpl(key);
   }
   
   public static TaxCategoryKeyReferenceBuilder of() {
      return new TaxCategoryKeyReferenceBuilder();
   }
   
   public static TaxCategoryKeyReferenceBuilder of(final TaxCategoryKeyReference template) {
      TaxCategoryKeyReferenceBuilder builder = new TaxCategoryKeyReferenceBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}