package com.commercetools.models.tax_category;

import com.commercetools.models.tax_category.SubRate;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.tax_category.TaxRate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxRateBuilder {
   
   
   private java.lang.String country;
   
   
   private java.lang.Integer amount;
   
   
   private java.lang.Boolean includedInPrice;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.String state;
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.util.List<com.commercetools.models.tax_category.SubRate> subRates;
   
   public TaxRateBuilder country( final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public TaxRateBuilder amount( final java.lang.Integer amount) {
      this.amount = amount;
      return this;
   }
   
   public TaxRateBuilder includedInPrice( final java.lang.Boolean includedInPrice) {
      this.includedInPrice = includedInPrice;
      return this;
   }
   
   public TaxRateBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public TaxRateBuilder state(@Nullable final java.lang.String state) {
      this.state = state;
      return this;
   }
   
   public TaxRateBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public TaxRateBuilder subRates(@Nullable final java.util.List<com.commercetools.models.tax_category.SubRate> subRates) {
      this.subRates = subRates;
      return this;
   }
   
   
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
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
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.tax_category.SubRate> getSubRates(){
      return this.subRates;
   }

   public TaxRate build() {
       return new TaxRateImpl(country, amount, includedInPrice, name, state, id, subRates);
   }
   
   public static TaxRateBuilder of() {
      return new TaxRateBuilder();
   }
   
   public static TaxRateBuilder of(final TaxRate template) {
      TaxRateBuilder builder = new TaxRateBuilder();
      builder.country = template.getCountry();
      builder.amount = template.getAmount();
      builder.includedInPrice = template.getIncludedInPrice();
      builder.name = template.getName();
      builder.state = template.getState();
      builder.id = template.getId();
      builder.subRates = template.getSubRates();
      return builder;
   }
   
}