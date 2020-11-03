package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateActionImpl;

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

    default <T> T withTaxCategoryRemoveTaxRateAction(Function<TaxCategoryRemoveTaxRateAction, T> helper) {
        return helper.apply(this);
    }
}
