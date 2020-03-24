package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.TaxCategoryUpdateAction;
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
public final class TaxCategoryRemoveTaxRateActionImpl implements TaxCategoryRemoveTaxRateAction {

   private String action;
   
   private String taxRateId;

   @JsonCreator
   TaxCategoryRemoveTaxRateActionImpl(@JsonProperty("taxRateId") final String taxRateId) {
      this.taxRateId = taxRateId;
      this.action = "removeTaxRate";
   }
   public TaxCategoryRemoveTaxRateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getTaxRateId(){
      return this.taxRateId;
   }

   public void setTaxRateId(final String taxRateId){
      this.taxRateId = taxRateId;
   }

}