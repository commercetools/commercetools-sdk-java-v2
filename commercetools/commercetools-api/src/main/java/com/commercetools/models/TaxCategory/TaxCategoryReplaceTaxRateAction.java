package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxCategoryUpdateAction;
import com.commercetools.models.TaxCategory.TaxRateDraft;
import java.lang.String;
import com.commercetools.models.TaxCategory.TaxCategoryReplaceTaxRateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryReplaceTaxRateActionImpl.class)
public interface TaxCategoryReplaceTaxRateAction extends TaxCategoryUpdateAction {

   
   @NotNull
   @JsonProperty("taxRateId")
   public String getTaxRateId();
   
   @NotNull
   @Valid
   @JsonProperty("taxRate")
   public TaxRateDraft getTaxRate();

   public void setTaxRateId(final String taxRateId);
   
   public void setTaxRate(final TaxRateDraft taxRate);
   
   public static TaxCategoryReplaceTaxRateActionImpl of(){
      return new TaxCategoryReplaceTaxRateActionImpl();
   }
   

   public static TaxCategoryReplaceTaxRateActionImpl of(final TaxCategoryReplaceTaxRateAction template) {
      TaxCategoryReplaceTaxRateActionImpl instance = new TaxCategoryReplaceTaxRateActionImpl();
      instance.setTaxRate(template.getTaxRate());
      instance.setTaxRateId(template.getTaxRateId());
      return instance;
   }

}