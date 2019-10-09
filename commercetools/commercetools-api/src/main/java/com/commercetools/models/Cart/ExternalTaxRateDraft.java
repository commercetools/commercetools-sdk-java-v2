package com.commercetools.models.cart;

import com.commercetools.models.tax_category.SubRate;
import com.commercetools.models.cart.ExternalTaxRateDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ExternalTaxRateDraftImpl.class)
public interface ExternalTaxRateDraft  {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("amount")
   public Integer getAmount();
   
   @NotNull
   @JsonProperty("country")
   public String getCountry();
   
   
   @JsonProperty("state")
   public String getState();
   
   @Valid
   @JsonProperty("subRates")
   public List<SubRate> getSubRates();
   
   
   @JsonProperty("includedInPrice")
   public Boolean getIncludedInPrice();

   public void setName(final String name);
   
   public void setAmount(final Integer amount);
   
   public void setCountry(final String country);
   
   public void setState(final String state);
   
   public void setSubRates(final List<SubRate> subRates);
   
   public void setIncludedInPrice(final Boolean includedInPrice);
   
   public static ExternalTaxRateDraftImpl of(){
      return new ExternalTaxRateDraftImpl();
   }
   

   public static ExternalTaxRateDraftImpl of(final ExternalTaxRateDraft template) {
      ExternalTaxRateDraftImpl instance = new ExternalTaxRateDraftImpl();
      instance.setCountry(template.getCountry());
      instance.setAmount(template.getAmount());
      instance.setIncludedInPrice(template.getIncludedInPrice());
      instance.setName(template.getName());
      instance.setState(template.getState());
      instance.setSubRates(template.getSubRates());
      return instance;
   }

}