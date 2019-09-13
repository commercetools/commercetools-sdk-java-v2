package com.commercetools.models.tax_category;

import com.commercetools.models.tax_category.TaxCategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.tax_category.TaxCategorySetDescriptionAction;
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