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
public final class TaxCategoryAddTaxRateActionImpl implements TaxCategoryAddTaxRateAction {

    private String action;
    
    private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

    @JsonCreator
    TaxCategoryAddTaxRateActionImpl(@JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
        this.taxRate = taxRate;
        this.action = "addTaxRate";
    }
    public TaxCategoryAddTaxRateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.tax_category.TaxRateDraft getTaxRate(){
        return this.taxRate;
    }

    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRateDraft taxRate){
        this.taxRate = taxRate;
    }

}
