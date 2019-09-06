package com.commercetools.models.TaxCategory;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.TaxCategory.TaxCategory;
import com.commercetools.models.TaxCategory.TaxCategoryReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxCategory obj;
   
   public TaxCategoryReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public TaxCategoryReferenceBuilder obj(@Nullable final com.commercetools.models.TaxCategory.TaxCategory obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxCategory getObj(){
      return this.obj;
   }

   public TaxCategoryReference build() {
       return new TaxCategoryReferenceImpl(id, obj);
   }
   
   public static TaxCategoryReferenceBuilder of() {
      return new TaxCategoryReferenceBuilder();
   }
   
   public static TaxCategoryReferenceBuilder of(final TaxCategoryReference template) {
      TaxCategoryReferenceBuilder builder = new TaxCategoryReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}