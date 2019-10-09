package com.commercetools.models.tax_category;

import com.commercetools.models.tax_category.TaxRateDraft;
import javax.annotation.Generated;
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
public final class TaxCategoryDraftImpl implements TaxCategoryDraft {

   private java.util.List<com.commercetools.models.tax_category.TaxRateDraft> rates;
   
   private String name;
   
   private String description;
   
   private String key;

   @JsonCreator
   TaxCategoryDraftImpl(@JsonProperty("rates") final java.util.List<com.commercetools.models.tax_category.TaxRateDraft> rates, @JsonProperty("name") final String name, @JsonProperty("description") final String description, @JsonProperty("key") final String key) {
      this.rates = rates;
      this.name = name;
      this.description = description;
      this.key = key;
   }
   public TaxCategoryDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.tax_category.TaxRateDraft> getRates(){
      return this.rates;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public String getDescription(){
      return this.description;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setRates(final java.util.List<com.commercetools.models.tax_category.TaxRateDraft> rates){
      this.rates = rates;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setDescription(final String description){
      this.description = description;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}