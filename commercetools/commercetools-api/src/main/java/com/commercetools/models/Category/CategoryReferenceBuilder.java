package com.commercetools.models.Category;

import com.commercetools.models.Category.Category;
import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Category.CategoryReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.Category.Category obj;
   
   public CategoryReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CategoryReferenceBuilder obj(@Nullable final com.commercetools.models.Category.Category obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.Category.Category getObj(){
      return this.obj;
   }

   public CategoryReference build() {
       return new CategoryReferenceImpl(id, obj);
   }
   
   public static CategoryReferenceBuilder of() {
      return new CategoryReferenceBuilder();
   }
   
   public static CategoryReferenceBuilder of(final CategoryReference template) {
      CategoryReferenceBuilder builder = new CategoryReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}