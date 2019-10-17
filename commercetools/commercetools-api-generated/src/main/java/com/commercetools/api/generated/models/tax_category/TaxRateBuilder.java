package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.SubRate;
import com.commercetools.api.generated.models.tax_category.TaxRate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxRateBuilder {
   
   
   private String country;
   
   
   private Integer amount;
   
   
   private Boolean includedInPrice;
   
   
   private String name;
   
   @Nullable
   private String state;
   
   @Nullable
   private String id;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates;
   
   public TaxRateBuilder country( final String country) {
      this.country = country;
      return this;
   }
   
   public TaxRateBuilder amount( final Integer amount) {
      this.amount = amount;
      return this;
   }
   
   public TaxRateBuilder includedInPrice( final Boolean includedInPrice) {
      this.includedInPrice = includedInPrice;
      return this;
   }
   
   public TaxRateBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public TaxRateBuilder state(@Nullable final String state) {
      this.state = state;
      return this;
   }
   
   public TaxRateBuilder id(@Nullable final String id) {
      this.id = id;
      return this;
   }
   
   public TaxRateBuilder subRates(@Nullable final java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates) {
      this.subRates = subRates;
      return this;
   }
   
   
   public String getCountry(){
      return this.country;
   }
   
   
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
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> getSubRates(){
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