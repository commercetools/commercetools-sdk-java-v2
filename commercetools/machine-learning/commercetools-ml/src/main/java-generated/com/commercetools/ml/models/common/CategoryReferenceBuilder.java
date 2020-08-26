package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.Reference;
import com.commercetools.ml.models.common.ReferenceTypeId;
import com.commercetools.ml.models.common.CategoryReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryReferenceBuilder {


   private String id;

   public CategoryReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }


   public String getId(){
      return this.id;
   }

   public CategoryReference build() {
       return new CategoryReferenceImpl(id);
   }

   public static CategoryReferenceBuilder of() {
      return new CategoryReferenceBuilder();
   }

   public static CategoryReferenceBuilder of(final CategoryReference template) {
      CategoryReferenceBuilder builder = new CategoryReferenceBuilder();
      builder.id = template.getId();
      return builder;
   }

}
