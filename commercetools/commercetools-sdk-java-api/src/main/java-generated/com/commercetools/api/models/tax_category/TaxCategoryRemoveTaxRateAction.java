
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxCategoryRemoveTaxRateActionImpl.class)
public interface TaxCategoryRemoveTaxRateAction extends TaxCategoryUpdateAction {

    String REMOVE_TAX_RATE = "removeTaxRate";

    @NotNull
    @JsonProperty("taxRateId")
    public String getTaxRateId();

    public void setTaxRateId(final String taxRateId);

    public static TaxCategoryRemoveTaxRateAction of() {
        return new TaxCategoryRemoveTaxRateActionImpl();
    }

    public static TaxCategoryRemoveTaxRateAction of(final TaxCategoryRemoveTaxRateAction template) {
        TaxCategoryRemoveTaxRateActionImpl instance = new TaxCategoryRemoveTaxRateActionImpl();
        instance.setTaxRateId(template.getTaxRateId());
        return instance;
    }

    public static TaxCategoryRemoveTaxRateActionBuilder builder() {
        return TaxCategoryRemoveTaxRateActionBuilder.of();
    }

    public static TaxCategoryRemoveTaxRateActionBuilder builder(final TaxCategoryRemoveTaxRateAction template) {
        return TaxCategoryRemoveTaxRateActionBuilder.of(template);
    }

    default <T> T withTaxCategoryRemoveTaxRateAction(Function<TaxCategoryRemoveTaxRateAction, T> helper) {
        return helper.apply(this);
    }
}
