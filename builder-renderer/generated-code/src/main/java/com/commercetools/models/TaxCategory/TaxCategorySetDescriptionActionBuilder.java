package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxCategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.TaxCategory.TaxCategorySetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategorySetDescriptionActionBuilder {
   
   @Nullable
   private java.lang.String description;
   
   public TaxCategorySetDescriptionActionBuilder description(@Nullable final java.lang.String description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public java.lang.String getDescription(){
      return this.description;
   }

   public TaxCategorySetDescriptionAction build() {
       return new TaxCategorySetDescriptionActionImpl(description);
   }
   
   public static TaxCategorySetDescriptionActionBuilder of() {
      return new TaxCategorySetDescriptionActionBuilder();
   }
   
   public static TaxCategorySetDescriptionActionBuilder of(final TaxCategorySetDescriptionAction template) {
      TaxCategorySetDescriptionActionBuilder builder = new TaxCategorySetDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}