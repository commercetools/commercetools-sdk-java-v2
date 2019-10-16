package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.generated.models.tax_category.TaxRateDraft;
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

   private String action;
   
   private com.commercetools.api.generated.models.tax_category.TaxRateDraft taxRate;
   
   private String taxRateId;

   @JsonCreator
   TaxCategoryReplaceTaxRateActionImpl(@JsonProperty("taxRate") final com.commercetools.api.generated.models.tax_category.TaxRateDraft taxRate, @JsonProperty("taxRateId") final String taxRateId) {
      this.taxRate = taxRate;
      this.taxRateId = taxRateId;
      this.action = "replaceTaxRate";
   }
   public TaxCategoryReplaceTaxRateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.tax_category.TaxRateDraft getTaxRate(){
      return this.taxRate;
   }
   
   
   public String getTaxRateId(){
      return this.taxRateId;
   }

   public void setTaxRate(final com.commercetools.api.generated.models.tax_category.TaxRateDraft taxRate){
      this.taxRate = taxRate;
   }
   
   public void setTaxRateId(final String taxRateId){
      this.taxRateId = taxRateId;
   }

}