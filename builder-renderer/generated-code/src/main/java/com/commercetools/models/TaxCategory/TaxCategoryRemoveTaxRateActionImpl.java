package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxCategoryUpdateAction;
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
public final class TaxCategoryRemoveTaxRateActionImpl implements TaxCategoryRemoveTaxRateAction {

   private java.lang.String action;
   
   private java.lang.String taxRateId;

   @JsonCreator
   TaxCategoryRemoveTaxRateActionImpl(@JsonProperty("taxRateId") final java.lang.String taxRateId) {
      this.taxRateId = taxRateId;
      this.action = "removeTaxRate";
   }
   public TaxCategoryRemoveTaxRateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getTaxRateId(){
      return this.taxRateId;
   }

   public void setTaxRateId(final java.lang.String taxRateId){
      this.taxRateId = taxRateId;
   }

}