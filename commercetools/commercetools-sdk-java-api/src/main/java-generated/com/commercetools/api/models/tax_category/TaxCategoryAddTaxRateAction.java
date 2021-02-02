
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxCategoryAddTaxRateActionImpl.class)
public interface TaxCategoryAddTaxRateAction extends TaxCategoryUpdateAction {

    String ADD_TAX_RATE = "addTaxRate";

    @NotNull
    @Valid
    @JsonProperty("taxRate")
    public TaxRateDraft getTaxRate();

    public void setTaxRate(final TaxRateDraft taxRate);

    public static TaxCategoryAddTaxRateAction of() {
        return new TaxCategoryAddTaxRateActionImpl();
    }

    public static TaxCategoryAddTaxRateAction of(final TaxCategoryAddTaxRateAction template) {
        TaxCategoryAddTaxRateActionImpl instance = new TaxCategoryAddTaxRateActionImpl();
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    public static TaxCategoryAddTaxRateActionBuilder builder() {
        return TaxCategoryAddTaxRateActionBuilder.of();
    }

    public static TaxCategoryAddTaxRateActionBuilder builder(final TaxCategoryAddTaxRateAction template) {
        return TaxCategoryAddTaxRateActionBuilder.of(template);
    }

    default <T> T withTaxCategoryAddTaxRateAction(Function<TaxCategoryAddTaxRateAction, T> helper) {
        return helper.apply(this);
    }
}
