
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryReplaceTaxRateActionBuilder implements Builder<TaxCategoryReplaceTaxRateAction> {

    private String taxRateId;

    private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

    public TaxCategoryReplaceTaxRateActionBuilder taxRateId(final String taxRateId) {
        this.taxRateId = taxRateId;
        return this;
    }

    public TaxCategoryReplaceTaxRateActionBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraftBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of()).build();
        return this;
    }

    public TaxCategoryReplaceTaxRateActionBuilder taxRate(
            final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public String getTaxRateId() {
        return this.taxRateId;
    }

    public com.commercetools.api.models.tax_category.TaxRateDraft getTaxRate() {
        return this.taxRate;
    }

    public TaxCategoryReplaceTaxRateAction build() {
        Objects.requireNonNull(taxRateId, TaxCategoryReplaceTaxRateAction.class + ": taxRateId is missing");
        Objects.requireNonNull(taxRate, TaxCategoryReplaceTaxRateAction.class + ": taxRate is missing");
        return new TaxCategoryReplaceTaxRateActionImpl(taxRateId, taxRate);
    }

    /**
     * builds TaxCategoryReplaceTaxRateAction without checking for non null required values
     */
    public TaxCategoryReplaceTaxRateAction buildUnchecked() {
        return new TaxCategoryReplaceTaxRateActionImpl(taxRateId, taxRate);
    }

    public static TaxCategoryReplaceTaxRateActionBuilder of() {
        return new TaxCategoryReplaceTaxRateActionBuilder();
    }

    public static TaxCategoryReplaceTaxRateActionBuilder of(final TaxCategoryReplaceTaxRateAction template) {
        TaxCategoryReplaceTaxRateActionBuilder builder = new TaxCategoryReplaceTaxRateActionBuilder();
        builder.taxRateId = template.getTaxRateId();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}
