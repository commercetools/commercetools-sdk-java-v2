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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryReplaceTaxRateActionImpl implements TaxCategoryReplaceTaxRateAction {

   private java.lang.String action;
   
   private com.commercetools.models.TaxCategory.TaxRateDraft taxRate;
   
   private java.lang.String taxRateId;

   @JsonCreator
   TaxCategoryReplaceTaxRateActionImpl(@JsonProperty("taxRate") final com.commercetools.models.TaxCategory.TaxRateDraft taxRate, @JsonProperty("taxRateId") final java.lang.String taxRateId) {
      this.taxRate = taxRate;
      this.taxRateId = taxRateId;
      this.action = "replaceTaxRate";
   }
   public TaxCategoryReplaceTaxRateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxRateDraft getTaxRate(){
      return this.taxRate;
   }
   
   
   public java.lang.String getTaxRateId(){
      return this.taxRateId;
   }

   public void setTaxRate(final com.commercetools.models.TaxCategory.TaxRateDraft taxRate){
      this.taxRate = taxRate;
   }
   
   public void setTaxRateId(final java.lang.String taxRateId){
      this.taxRateId = taxRateId;
   }

}