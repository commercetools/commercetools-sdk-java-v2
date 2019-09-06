package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxCategoryUpdateAction;
import com.commercetools.models.TaxCategory.TaxRateDraft;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryAddTaxRateActionImpl implements TaxCategoryAddTaxRateAction {

   private java.lang.String action;
   
   private com.commercetools.models.TaxCategory.TaxRateDraft taxRate;

   @JsonCreator
   TaxCategoryAddTaxRateActionImpl(@JsonProperty("taxRate") final com.commercetools.models.TaxCategory.TaxRateDraft taxRate) {
      this.taxRate = taxRate;
      this.action = "addTaxRate";
   }
   public TaxCategoryAddTaxRateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxRateDraft getTaxRate(){
      return this.taxRate;
   }

   public void setTaxRate(final com.commercetools.models.TaxCategory.TaxRateDraft taxRate){
      this.taxRate = taxRate;
   }

}