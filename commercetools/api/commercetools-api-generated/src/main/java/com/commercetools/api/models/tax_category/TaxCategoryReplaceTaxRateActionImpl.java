package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxRateDraft;
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
public final class TaxCategoryReplaceTaxRateActionImpl implements TaxCategoryReplaceTaxRateAction {

   private String action;
   
   private String taxRateId;
   
   private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

   @JsonCreator
   TaxCategoryReplaceTaxRateActionImpl(@JsonProperty("taxRateId") final String taxRateId, @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
      this.taxRateId = taxRateId;
      this.taxRate = taxRate;
      this.action = "replaceTaxRate";
   }
   public TaxCategoryReplaceTaxRateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getTaxRateId(){
      return this.taxRateId;
   }
   
   
   public com.commercetools.api.models.tax_category.TaxRateDraft getTaxRate(){
      return this.taxRate;
   }

   public void setTaxRateId(final String taxRateId){
      this.taxRateId = taxRateId;
   }
   
   public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRateDraft taxRate){
      this.taxRate = taxRate;
   }

}
