
package com.commercetools.api.models.tax_category;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryRemoveTaxRateActionBuilder {

    private String taxRateId;

    public TaxCategoryRemoveTaxRateActionBuilder taxRateId(final String taxRateId) {
        this.taxRateId = taxRateId;
        return this;
    }

    public String getTaxRateId() {
        return this.taxRateId;
    }

    public TaxCategoryRemoveTaxRateAction build() {
        return new TaxCategoryRemoveTaxRateActionImpl(taxRateId);
    }

    public static TaxCategoryRemoveTaxRateActionBuilder of() {
        return new TaxCategoryRemoveTaxRateActionBuilder();
    }

    public static TaxCategoryRemoveTaxRateActionBuilder of(final TaxCategoryRemoveTaxRateAction template) {
        TaxCategoryRemoveTaxRateActionBuilder builder = new TaxCategoryRemoveTaxRateActionBuilder();
        builder.taxRateId = template.getTaxRateId();
        return builder;
    }

}
