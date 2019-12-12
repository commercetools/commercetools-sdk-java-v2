package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.TaxRateDraft;
import com.commercetools.api.generated.models.tax_category.TaxCategoryDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryDraftBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.tax_category.TaxRateDraft> rates;
   
   
   private String name;
   
   @Nullable
   private String description;
   
   @Nullable
   private String key;
   
   public TaxCategoryDraftBuilder rates( final java.util.List<com.commercetools.api.generated.models.tax_category.TaxRateDraft> rates) {
      this.rates = rates;
      return this;
   }
   
   public TaxCategoryDraftBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public TaxCategoryDraftBuilder description(@Nullable final String description) {
      this.description = description;
      return this;
   }
   
   public TaxCategoryDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.tax_category.TaxRateDraft> getRates(){
      return this.rates;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public String getDescription(){
      return this.description;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public TaxCategoryDraft build() {
       return new TaxCategoryDraftImpl(rates, name, description, key);
   }
   
   public static TaxCategoryDraftBuilder of() {
      return new TaxCategoryDraftBuilder();
   }
   
   public static TaxCategoryDraftBuilder of(final TaxCategoryDraft template) {
      TaxCategoryDraftBuilder builder = new TaxCategoryDraftBuilder();
      builder.rates = template.getRates();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.key = template.getKey();
      return builder;
   }
   
}