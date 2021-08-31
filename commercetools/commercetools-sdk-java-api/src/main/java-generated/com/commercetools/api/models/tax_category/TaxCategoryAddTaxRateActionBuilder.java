
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryAddTaxRateActionBuilder implements Builder<TaxCategoryAddTaxRateAction> {

    private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

    public TaxCategoryAddTaxRateActionBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraftBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of()).build();
        return this;
    }

    public TaxCategoryAddTaxRateActionBuilder taxRate(
            final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public com.commercetools.api.models.tax_category.TaxRateDraft getTaxRate() {
        return this.taxRate;
    }

    public TaxCategoryAddTaxRateAction build() {
        Objects.requireNonNull(taxRate, TaxCategoryAddTaxRateAction.class + ": taxRate is missing");
        return new TaxCategoryAddTaxRateActionImpl(taxRate);
    }

    /**
     * builds TaxCategoryAddTaxRateAction without checking for non null required values
     */
    public TaxCategoryAddTaxRateAction buildUnchecked() {
        return new TaxCategoryAddTaxRateActionImpl(taxRate);
    }

    public static TaxCategoryAddTaxRateActionBuilder of() {
        return new TaxCategoryAddTaxRateActionBuilder();
    }

    public static TaxCategoryAddTaxRateActionBuilder of(final TaxCategoryAddTaxRateAction template) {
        TaxCategoryAddTaxRateActionBuilder builder = new TaxCategoryAddTaxRateActionBuilder();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}
