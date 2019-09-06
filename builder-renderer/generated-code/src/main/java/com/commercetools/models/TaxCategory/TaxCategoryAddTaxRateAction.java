package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxCategoryUpdateAction;
import com.commercetools.models.TaxCategory.TaxRateDraft;
import java.lang.String;
import com.commercetools.models.TaxCategory.TaxCategoryAddTaxRateActionImpl;

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
@JsonDeserialize(as = TaxCategoryAddTaxRateActionImpl.class)
public interface TaxCategoryAddTaxRateAction extends TaxCategoryUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("taxRate")
   public TaxRateDraft getTaxRate();

   public void setTaxRate(final TaxRateDraft taxRate);
   
   public static TaxCategoryAddTaxRateActionImpl of(){
      return new TaxCategoryAddTaxRateActionImpl();
   }
   

   public static TaxCategoryAddTaxRateActionImpl of(final TaxCategoryAddTaxRateAction template) {
      TaxCategoryAddTaxRateActionImpl instance = new TaxCategoryAddTaxRateActionImpl();
      instance.setTaxRate(template.getTaxRate());
      return instance;
   }

}