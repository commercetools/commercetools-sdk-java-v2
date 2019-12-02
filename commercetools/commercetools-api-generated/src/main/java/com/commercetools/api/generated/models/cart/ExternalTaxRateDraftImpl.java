package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.tax_category.SubRate;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExternalTaxRateDraftImpl implements ExternalTaxRateDraft {

   private String country;
   
   private Integer amount;
   
   private Boolean includedInPrice;
   
   private String name;
   
   private String state;
   
   private java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates;

   @JsonCreator
   ExternalTaxRateDraftImpl(@JsonProperty("country") final String country, @JsonProperty("amount") final Integer amount, @JsonProperty("includedInPrice") final Boolean includedInPrice, @JsonProperty("name") final String name, @JsonProperty("state") final String state, @JsonProperty("subRates") final java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates) {
      this.country = country;
      this.amount = amount;
      this.includedInPrice = includedInPrice;
      this.name = name;
      this.state = state;
      this.subRates = subRates;
   }
   public ExternalTaxRateDraftImpl() {
      
   }
   
   /**
   *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public String getCountry(){
      return this.country;
   }
   
   /**
   *  <p>Percentage in the range of [0..1].
   *  Must be supplied if no <code>subRates</code> are specified.
   *  If <code>subRates</code> are specified
   *  then the <code>amount</code> can be omitted or it must be the sum of the amounts of all <code>subRates</code>.</p>
   */
   public Integer getAmount(){
      return this.amount;
   }
   
   /**
   *  <p>The default value for <code>includedInPrice</code> is FALSE.</p>
   */
   public Boolean getIncludedInPrice(){
      return this.includedInPrice;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   /**
   *  <p>The state in the country</p>
   */
   public String getState(){
      return this.state;
   }
   
   /**
   *  <p>For countries (e.g.
   *  the US) where the total tax is a combination of multiple taxes (e.g.
   *  state and local taxes).</p>
   */
   public java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> getSubRates(){
      return this.subRates;
   }

   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setAmount(final Integer amount){
      this.amount = amount;
   }
   
   public void setIncludedInPrice(final Boolean includedInPrice){
      this.includedInPrice = includedInPrice;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setState(final String state){
      this.state = state;
   }
   
   public void setSubRates(final java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates){
      this.subRates = subRates;
   }

}