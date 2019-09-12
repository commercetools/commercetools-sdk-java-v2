package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.SubRate;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.TaxCategory.TaxRateDraftImpl;

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
@JsonDeserialize(as = TaxRateDraftImpl.class)
public interface TaxRateDraft  {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("amount")
   public Integer getAmount();
   
   @NotNull
   @JsonProperty("includedInPrice")
   public Boolean getIncludedInPrice();
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   @NotNull
   @JsonProperty("country")
   public String getCountry();
   
   
   @JsonProperty("state")
   public String getState();
   
   @Valid
   @JsonProperty("subRates")
   public List<SubRate> getSubRates();

   public void setName(final String name);
   
   public void setAmount(final Integer amount);
   
   public void setIncludedInPrice(final Boolean includedInPrice);
   
   public void setCountry(final String country);
   
   public void setState(final String state);
   
   public void setSubRates(final List<SubRate> subRates);
   
   public static TaxRateDraftImpl of(){
      return new TaxRateDraftImpl();
   }
   

   public static TaxRateDraftImpl of(final TaxRateDraft template) {
      TaxRateDraftImpl instance = new TaxRateDraftImpl();
      instance.setCountry(template.getCountry());
      instance.setAmount(template.getAmount());
      instance.setIncludedInPrice(template.getIncludedInPrice());
      instance.setName(template.getName());
      instance.setState(template.getState());
      instance.setSubRates(template.getSubRates());
      return instance;
   }

}