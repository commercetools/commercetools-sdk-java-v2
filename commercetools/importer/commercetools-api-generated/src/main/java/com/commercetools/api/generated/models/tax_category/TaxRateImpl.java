package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.SubRate;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxRateImpl implements TaxRate {

   private String country;
   
   private Integer amount;
   
   private Boolean includedInPrice;
   
   private String name;
   
   private String state;
   
   private String id;
   
   private java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates;

   @JsonCreator
   TaxRateImpl(@JsonProperty("country") final String country, @JsonProperty("amount") final Integer amount, @JsonProperty("includedInPrice") final Boolean includedInPrice, @JsonProperty("name") final String name, @JsonProperty("state") final String state, @JsonProperty("id") final String id, @JsonProperty("subRates") final java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates) {
      this.country = country;
      this.amount = amount;
      this.includedInPrice = includedInPrice;
      this.name = name;
      this.state = state;
      this.id = id;
      this.subRates = subRates;
   }
   public TaxRateImpl() {
      
   }
   
   /**
   *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public String getCountry(){
      return this.country;
   }
   
   /**
   *  <p>Percentage in the range of [0..1].
   *  The sum of the amounts of all <code>subRates</code>, if there are any.</p>
   */
   public Integer getAmount(){
      return this.amount;
   }
   
   
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
   *  <p>The ID is always set if the tax rate is part of a TaxCategory.
   *  The external tax rates in a
   *  Cart do not contain an <code>id</code>.</p>
   */
   public String getId(){
      return this.id;
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
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setSubRates(final java.util.List<com.commercetools.api.generated.models.tax_category.SubRate> subRates){
      this.subRates = subRates;
   }

}