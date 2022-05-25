
package com.commercetools.api.models.tax_category;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryRemoveTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryRemoveTaxRateAction taxCategoryRemoveTaxRateAction = TaxCategoryRemoveTaxRateAction.builder()
 *             .taxRateId("{taxRateId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryRemoveTaxRateActionBuilder implements Builder<TaxCategoryRemoveTaxRateAction> {

    private String taxRateId;

    /**
     *  <p>ID of the TaxRate to remove.</p>
     */

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
