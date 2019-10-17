package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.SubRate;
import com.commercetools.api.generated.models.tax_category.TaxRateDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxRateDraftBuilder {
   
   
   private String country;
   
   @Nullable
   private Integer amount;
   
   
   private Boolean includedInPrice;
   
   
   private String name;
   
   @Nullable
   private String state;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates;
   
   public TaxRateDraftBuilder country( final String country) {
      this.country = country;
      return this;
   }
   
   public TaxRateDraftBuilder amount(@Nullable final Integer amount) {
      this.amount = amount;
      return this;
   }
   
   public TaxRateDraftBuilder includedInPrice( final Boolean includedInPrice) {
      this.includedInPrice = includedInPrice;
      return this;
   }
   
   public TaxRateDraftBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public TaxRateDraftBuilder state(@Nullable final String state) {
      this.state = state;
      return this;
   }
   
   public TaxRateDraftBuilder subRates(@Nullable final java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates) {
      this.subRates = subRates;
      return this;
   }
   
   
   public String getCountry(){
      return this.country;
   }
   
   @Nullable
   public Integer getAmount(){
      return this.amount;
   }
   
   
   public Boolean getIncludedInPrice(){
      return this.includedInPrice;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public String getState(){
      return this.state;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> getSubRates(){
      return this.subRates;
   }

   public TaxRateDraft build() {
       return new TaxRateDraftImpl(country, amount, includedInPrice, name, state, subRates);
   }
   
   public static TaxRateDraftBuilder of() {
      return new TaxRateDraftBuilder();
   }
   
   public static TaxRateDraftBuilder of(final TaxRateDraft template) {
      TaxRateDraftBuilder builder = new TaxRateDraftBuilder();
      builder.country = template.getCountry();
      builder.amount = template.getAmount();
      builder.includedInPrice = template.getIncludedInPrice();
      builder.name = template.getName();
      builder.state = template.getState();
      builder.subRates = template.getSubRates();
      return builder;
   }
   
}