package com.commercetools.models.category;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.category.CategoryResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public CategoryResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CategoryResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public CategoryResourceIdentifier build() {
       return new CategoryResourceIdentifierImpl(id, key);
   }
   
   public static CategoryResourceIdentifierBuilder of() {
      return new CategoryResourceIdentifierBuilder();
   }
   
   public static CategoryResourceIdentifierBuilder of(final CategoryResourceIdentifier template) {
      CategoryResourceIdentifierBuilder builder = new CategoryResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}