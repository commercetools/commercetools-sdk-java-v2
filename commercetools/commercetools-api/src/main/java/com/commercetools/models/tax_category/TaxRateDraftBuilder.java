package com.commercetools.models.tax_category;

import com.commercetools.models.tax_category.SubRate;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.tax_category.TaxRateDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxRateDraftBuilder {
   
   
   private java.lang.String country;
   
   @Nullable
   private java.lang.Integer amount;
   
   
   private java.lang.Boolean includedInPrice;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.String state;
   
   @Nullable
   private java.util.List<com.commercetools.models.tax_category.SubRate> subRates;
   
   public TaxRateDraftBuilder country( final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public TaxRateDraftBuilder amount(@Nullable final java.lang.Integer amount) {
      this.amount = amount;
      return this;
   }
   
   public TaxRateDraftBuilder includedInPrice( final java.lang.Boolean includedInPrice) {
      this.includedInPrice = includedInPrice;
      return this;
   }
   
   public TaxRateDraftBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public TaxRateDraftBuilder state(@Nullable final java.lang.String state) {
      this.state = state;
      return this;
   }
   
   public TaxRateDraftBuilder subRates(@Nullable final java.util.List<com.commercetools.models.tax_category.SubRate> subRates) {
      this.subRates = subRates;
      return this;
   }
   
   
   public java.lang.String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.lang.Integer getAmount(){
      return this.amount;
   }
   
   
   public java.lang.Boolean getIncludedInPrice(){
      return this.includedInPrice;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.String getState(){
      return this.state;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.tax_category.SubRate> getSubRates(){
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