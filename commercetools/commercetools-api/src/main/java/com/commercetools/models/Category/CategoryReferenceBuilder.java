package com.commercetools.models.category;

import com.commercetools.models.category.Category;
import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.category.CategoryReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.models.category.Category obj;
   
   public CategoryReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CategoryReferenceBuilder obj(@Nullable final com.commercetools.models.category.Category obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.category.Category getObj(){
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