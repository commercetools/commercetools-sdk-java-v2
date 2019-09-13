package com.commercetools.models.tax_category;

import com.commercetools.models.tax_category.TaxCategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.tax_category.TaxCategoryChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryChangeNameActionBuilder {
   
   
   private java.lang.String name;
   
   public TaxCategoryChangeNameActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public TaxCategoryChangeNameAction build() {
       return new TaxCategoryChangeNameActionImpl(name);
   }
   
   public static TaxCategoryChangeNameActionBuilder of() {
      return new TaxCategoryChangeNameActionBuilder();
   }
   
   public static TaxCategoryChangeNameActionBuilder of(final TaxCategoryChangeNameAction template) {
      TaxCategoryChangeNameActionBuilder builder = new TaxCategoryChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}