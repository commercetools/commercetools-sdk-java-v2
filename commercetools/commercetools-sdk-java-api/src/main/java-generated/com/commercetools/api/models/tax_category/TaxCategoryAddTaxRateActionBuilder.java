
package com.commercetools.api.models.tax_category;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryAddTaxRateActionBuilder {

    private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

    public TaxCategoryAddTaxRateActionBuilder taxRate(
            final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public com.commercetools.api.models.tax_category.TaxRateDraft getTaxRate() {
        return this.taxRate;
    }

    public TaxCategoryAddTaxRateAction build() {
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
