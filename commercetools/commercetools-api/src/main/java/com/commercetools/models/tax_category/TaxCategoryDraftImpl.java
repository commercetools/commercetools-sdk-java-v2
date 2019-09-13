package com.commercetools.models.tax_category;

import com.commercetools.models.tax_category.TaxRateDraft;
import java.lang.String;
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
   
   private java.lang.String name;
   
   private java.lang.String description;
   
   private java.lang.String key;

   @JsonCreator
   TaxCategoryDraftImpl(@JsonProperty("rates") final java.util.List<com.commercetools.models.tax_category.TaxRateDraft> rates, @JsonProperty("name") final java.lang.String name, @JsonProperty("description") final java.lang.String description, @JsonProperty("key") final java.lang.String key) {
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
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.String getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setRates(final java.util.List<com.commercetools.models.tax_category.TaxRateDraft> rates){
      this.rates = rates;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setDescription(final java.lang.String description){
      this.description = description;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}