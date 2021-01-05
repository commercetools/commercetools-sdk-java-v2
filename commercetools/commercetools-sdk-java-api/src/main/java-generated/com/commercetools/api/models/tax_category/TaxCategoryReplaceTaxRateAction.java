package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
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

    public static TaxCategoryReplaceTaxRateAction of(){
        return new TaxCategoryReplaceTaxRateActionImpl();
    }
    

    public static TaxCategoryReplaceTaxRateAction of(final TaxCategoryReplaceTaxRateAction template) {
        TaxCategoryReplaceTaxRateActionImpl instance = new TaxCategoryReplaceTaxRateActionImpl();
        instance.setTaxRateId(template.getTaxRateId());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    public static TaxCategoryReplaceTaxRateActionBuilder builder(){
        return TaxCategoryReplaceTaxRateActionBuilder.of();
    }
    
    public static TaxCategoryReplaceTaxRateActionBuilder builder(final TaxCategoryReplaceTaxRateAction template){
        return TaxCategoryReplaceTaxRateActionBuilder.of(template);
    }
    

    default <T> T withTaxCategoryReplaceTaxRateAction(Function<TaxCategoryReplaceTaxRateAction, T> helper) {
        return helper.apply(this);
    }
}
