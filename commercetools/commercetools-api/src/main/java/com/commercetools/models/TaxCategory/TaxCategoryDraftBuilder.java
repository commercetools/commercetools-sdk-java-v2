package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxRateDraft;
import java.lang.String;
import com.commercetools.models.TaxCategory.TaxCategoryDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryDraftBuilder {
   
   
   private java.util.List<com.commercetools.models.TaxCategory.TaxRateDraft> rates;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.String description;
   
   @Nullable
   private java.lang.String key;
   
   public TaxCategoryDraftBuilder rates( final java.util.List<com.commercetools.models.TaxCategory.TaxRateDraft> rates) {
      this.rates = rates;
      return this;
   }
   
   public TaxCategoryDraftBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public TaxCategoryDraftBuilder description(@Nullable final java.lang.String description) {
      this.description = description;
      return this;
   }
   
   public TaxCategoryDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.TaxCategory.TaxRateDraft> getRates(){
      return this.rates;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.String getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.lang.String getKey(){
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