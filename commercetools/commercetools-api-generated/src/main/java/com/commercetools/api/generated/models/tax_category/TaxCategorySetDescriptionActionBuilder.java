package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.generated.models.tax_category.TaxCategorySetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategorySetDescriptionActionBuilder {
   
   @Nullable
   private String description;
   
   public TaxCategorySetDescriptionActionBuilder description(@Nullable final String description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public String getDescription(){
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