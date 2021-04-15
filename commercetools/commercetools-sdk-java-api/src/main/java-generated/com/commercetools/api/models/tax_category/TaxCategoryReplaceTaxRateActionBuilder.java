
package com.commercetools.api.models.tax_category;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryReplaceTaxRateActionBuilder {

    private String taxRateId;

    private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

    public TaxCategoryReplaceTaxRateActionBuilder taxRateId(final String taxRateId) {
        this.taxRateId = taxRateId;
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
