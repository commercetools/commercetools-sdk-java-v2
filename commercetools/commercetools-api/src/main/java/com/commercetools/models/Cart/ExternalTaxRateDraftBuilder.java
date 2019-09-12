package com.commercetools.models.Cart;

import com.commercetools.models.TaxCategory.SubRate;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Cart.ExternalTaxRateDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExternalTaxRateDraftBuilder {
   
   
   private java.lang.String country;
   
   @Nullable
   private java.lang.Integer amount;
   
   @Nullable
   private java.lang.Boolean includedInPrice;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.String state;
   
   @Nullable
   private java.util.List<com.commercetools.models.TaxCategory.SubRate> subRates;
   
   public ExternalTaxRateDraftBuilder country( final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public ExternalTaxRateDraftBuilder amount(@Nullable final java.lang.Integer amount) {
      this.amount = amount;
      return this;
   }
   
   public ExternalTaxRateDraftBuilder includedInPrice(@Nullable final java.lang.Boolean includedInPrice) {
      this.includedInPrice = includedInPrice;
      return this;
   }
   
   public ExternalTaxRateDraftBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ExternalTaxRateDraftBuilder state(@Nullable final java.lang.String state) {
      this.state = state;
      return this;
   }
   
   public ExternalTaxRateDraftBuilder subRates(@Nullable final java.util.List<com.commercetools.models.TaxCategory.SubRate> subRates) {
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
   
   @Nullable
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
   public java.util.List<com.commercetools.models.TaxCategory.SubRate> getSubRates(){
      return this.subRates;
   }

   public ExternalTaxRateDraft build() {
       return new ExternalTaxRateDraftImpl(country, amount, includedInPrice, name, state, subRates);
   }
   
   public static ExternalTaxRateDraftBuilder of() {
      return new ExternalTaxRateDraftBuilder();
   }
   
   public static ExternalTaxRateDraftBuilder of(final ExternalTaxRateDraft template) {
      ExternalTaxRateDraftBuilder builder = new ExternalTaxRateDraftBuilder();
      builder.country = template.getCountry();
      builder.amount = template.getAmount();
      builder.includedInPrice = template.getIncludedInPrice();
      builder.name = template.getName();
      builder.state = template.getState();
      builder.subRates = template.getSubRates();
      return builder;
   }
   
}