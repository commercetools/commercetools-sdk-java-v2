package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxCategoryUpdateAction;
import java.lang.Long;
import com.commercetools.models.TaxCategory.TaxCategoryUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.TaxCategory.TaxCategoryUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public TaxCategoryUpdateBuilder actions( final java.util.List<com.commercetools.models.TaxCategory.TaxCategoryUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public TaxCategoryUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.TaxCategory.TaxCategoryUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
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