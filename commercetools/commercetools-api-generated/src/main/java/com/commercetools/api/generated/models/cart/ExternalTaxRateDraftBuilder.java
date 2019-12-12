package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.tax_category.SubRate;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
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
public final class ExternalTaxRateDraftBuilder {
   
   
   private String country;
   
   @Nullable
   private Integer amount;
   
   @Nullable
   private Boolean includedInPrice;
   
   
   private String name;
   
   @Nullable
   private String state;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates;
   
   public ExternalTaxRateDraftBuilder country( final String country) {
      this.country = country;
      return this;
   }
   
   public ExternalTaxRateDraftBuilder amount(@Nullable final Integer amount) {
      this.amount = amount;
      return this;
   }
   
   public ExternalTaxRateDraftBuilder includedInPrice(@Nullable final Boolean includedInPrice) {
      this.includedInPrice = includedInPrice;
      return this;
   }
   
   public ExternalTaxRateDraftBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ExternalTaxRateDraftBuilder state(@Nullable final String state) {
      this.state = state;
      return this;
   }
   
   public ExternalTaxRateDraftBuilder subRates(@Nullable final java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates) {
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
   
   @Nullable
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