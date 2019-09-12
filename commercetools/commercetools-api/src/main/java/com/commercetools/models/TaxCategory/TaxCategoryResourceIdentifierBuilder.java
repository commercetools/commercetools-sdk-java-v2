package com.commercetools.models.TaxCategory;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public TaxCategoryResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public TaxCategoryResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
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

   public TaxCategoryResourceIdentifier build() {
       return new TaxCategoryResourceIdentifierImpl(id, key);
   }
   
   public static TaxCategoryResourceIdentifierBuilder of() {
      return new TaxCategoryResourceIdentifierBuilder();
   }
   
   public static TaxCategoryResourceIdentifierBuilder of(final TaxCategoryResourceIdentifier template) {
      TaxCategoryResourceIdentifierBuilder builder = new TaxCategoryResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}