package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.Reference;
import com.commercetools.ml.models.common.ReferenceTypeId;
import com.commercetools.ml.models.common.ProductReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductReferenceBuilder {


   private String id;

   public ProductReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }


   public String getId(){
      return this.id;
   }

   public ProductReference build() {
       return new ProductReferenceImpl(id);
   }

   public static ProductReferenceBuilder of() {
      return new ProductReferenceBuilder();
   }

   public static ProductReferenceBuilder of(final ProductReference template) {
      ProductReferenceBuilder builder = new ProductReferenceBuilder();
      builder.id = template.getId();
      return builder;
   }

}
