
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryReplaceTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryReplaceTaxRateAction taxCategoryReplaceTaxRateAction = TaxCategoryReplaceTaxRateAction.builder()
 *             .taxRate(taxRateBuilder -> taxRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryReplaceTaxRateActionBuilder implements Builder<TaxCategoryReplaceTaxRateAction> {

    @Nullable
    private String taxRateId;

    @Nullable
    private String taxRateKey;

    private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

    /**
     *  <p>ID of the TaxRate to replace. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @param taxRateId value to be set
     * @return Builder
     */

    public TaxCategoryReplaceTaxRateActionBuilder taxRateId(@Nullable final String taxRateId) {
        this.taxRateId = taxRateId;
        return this;
    }

    /**
     *  <p>Key of the TaxRate to replace. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @param taxRateKey value to be set
     * @return Builder
     */

    public TaxCategoryReplaceTaxRateActionBuilder taxRateKey(@Nullable final String taxRateKey) {
        this.taxRateKey = taxRateKey;
        return this;
    }

    /**
     *  <p>New TaxRate to replace with.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public TaxCategoryReplaceTaxRateActionBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraftBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New TaxRate to replace with.</p>
     * @param taxRate value to be set
     * @return Builder
     */

    public TaxCategoryReplaceTaxRateActionBuilder taxRate(
            final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>ID of the TaxRate to replace. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @return taxRateId
     */

    @Nullable
    public String getTaxRateId() {
        return this.taxRateId;
    }

    /**
     *  <p>Key of the TaxRate to replace. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @return taxRateKey
     */

    @Nullable
    public String getTaxRateKey() {
        return this.taxRateKey;
    }

    /**
     *  <p>New TaxRate to replace with.</p>
     * @return taxRate
     */

    public com.commercetools.api.models.tax_category.TaxRateDraft getTaxRate() {
        return this.taxRate;
    }

    /**
     * builds TaxCategoryReplaceTaxRateAction with checking for non-null required values
     * @return TaxCategoryReplaceTaxRateAction
     */
    public TaxCategoryReplaceTaxRateAction build() {
        Objects.requireNonNull(taxRate, TaxCategoryReplaceTaxRateAction.class + ": taxRate is missing");
        return new TaxCategoryReplaceTaxRateActionImpl(taxRateId, taxRateKey, taxRate);
    }

    /**
     * builds TaxCategoryReplaceTaxRateAction without checking for non-null required values
     * @return TaxCategoryReplaceTaxRateAction
     */
    public TaxCategoryReplaceTaxRateAction buildUnchecked() {
        return new TaxCategoryReplaceTaxRateActionImpl(taxRateId, taxRateKey, taxRate);
    }

    /**
     * factory method for an instance of TaxCategoryReplaceTaxRateActionBuilder
     * @return builder
     */
    public static TaxCategoryReplaceTaxRateActionBuilder of() {
        return new TaxCategoryReplaceTaxRateActionBuilder();
    }

    /**
     * create builder for TaxCategoryReplaceTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryReplaceTaxRateActionBuilder of(final TaxCategoryReplaceTaxRateAction template) {
        TaxCategoryReplaceTaxRateActionBuilder builder = new TaxCategoryReplaceTaxRateActionBuilder();
        builder.taxRateId = template.getTaxRateId();
        builder.taxRateKey = template.getTaxRateKey();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}
