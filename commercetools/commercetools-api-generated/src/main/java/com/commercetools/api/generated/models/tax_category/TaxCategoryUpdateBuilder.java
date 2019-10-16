package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.generated.models.tax_category.TaxCategoryUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.tax_category.TaxCategoryUpdateAction> actions;
   
   
   private Long version;
   
   public TaxCategoryUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.tax_category.TaxCategoryUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public TaxCategoryUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.tax_category.TaxCategoryUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public TaxCategoryUpdate build() {
       return new TaxCategoryUpdateImpl(actions, version);
   }
   
   public static TaxCategoryUpdateBuilder of() {
      return new TaxCategoryUpdateBuilder();
   }
   
   public static TaxCategoryUpdateBuilder of(final TaxCategoryUpdate template) {
      TaxCategoryUpdateBuilder builder = new TaxCategoryUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}