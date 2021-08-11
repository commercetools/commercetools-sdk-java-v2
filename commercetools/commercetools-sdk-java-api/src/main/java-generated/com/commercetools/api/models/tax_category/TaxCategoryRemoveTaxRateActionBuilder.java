
package com.commercetools.api.models.tax_category;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryRemoveTaxRateActionBuilder implements Builder<TaxCategoryRemoveTaxRateAction> {

    private String taxRateId;

    public TaxCategoryRemoveTaxRateActionBuilder taxRateId(final String taxRateId) {
        this.taxRateId = taxRateId;
        return this;
    }

    public String getTaxRateId() {
        return this.taxRateId;
    }

    public TaxCategoryRemoveTaxRateAction build() {
        Objects.requireNonNull(taxRateId, TaxCategoryRemoveTaxRateAction.class + ": taxRateId is missing");
        return new TaxCategoryRemoveTaxRateActionImpl(taxRateId);
    }

    /**
     * builds TaxCategoryRemoveTaxRateAction without checking for non null required values
     */
    public TaxCategoryRemoveTaxRateAction buildUnchecked() {
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
