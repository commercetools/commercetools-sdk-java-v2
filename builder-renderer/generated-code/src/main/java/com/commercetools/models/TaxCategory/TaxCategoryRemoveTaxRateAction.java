package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxCategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.TaxCategory.TaxCategoryRemoveTaxRateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryRemoveTaxRateActionImpl.class)
public interface TaxCategoryRemoveTaxRateAction extends TaxCategoryUpdateAction {

   
   @NotNull
   @JsonProperty("taxRateId")
   public String getTaxRateId();

   public void setTaxRateId(final String taxRateId);
   
   public static TaxCategoryRemoveTaxRateActionImpl of(){
      return new TaxCategoryRemoveTaxRateActionImpl();
   }
   

   public static TaxCategoryRemoveTaxRateActionImpl of(final TaxCategoryRemoveTaxRateAction template) {
      TaxCategoryRemoveTaxRateActionImpl instance = new TaxCategoryRemoveTaxRateActionImpl();
      instance.setTaxRateId(template.getTaxRateId());
      return instance;
   }

}