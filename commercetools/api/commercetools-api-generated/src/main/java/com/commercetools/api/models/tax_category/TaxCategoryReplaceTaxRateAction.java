package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
        instance.setTaxRateId(template.getTaxRateId());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

}
