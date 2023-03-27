
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeTaxCalculationModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeTaxCalculationModeAction stagedOrderChangeTaxCalculationModeAction = StagedOrderChangeTaxCalculationModeAction.builder()
 *             .taxCalculationMode(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeTaxCalculationModeActionBuilder
        implements Builder<StagedOrderChangeTaxCalculationModeAction> {

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    /**
     *  <p>Determines in which Tax calculation mode taxed prices are calculated.</p>
     * @param taxCalculationMode value to be set
     * @return Builder
     */

    public StagedOrderChangeTaxCalculationModeActionBuilder taxCalculationMode(
            final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>Determines in which Tax calculation mode taxed prices are calculated.</p>
     * @return taxCalculationMode
     */

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
     * builds StagedOrderChangeTaxCalculationModeAction with checking for non-null required values
     * @return StagedOrderChangeTaxCalculationModeAction
     */
    public StagedOrderChangeTaxCalculationModeAction build() {
        Objects.requireNonNull(taxCalculationMode,
            StagedOrderChangeTaxCalculationModeAction.class + ": taxCalculationMode is missing");
        return new StagedOrderChangeTaxCalculationModeActionImpl(taxCalculationMode);
    }

    /**
     * builds StagedOrderChangeTaxCalculationModeAction without checking for non-null required values
     * @return StagedOrderChangeTaxCalculationModeAction
     */
    public StagedOrderChangeTaxCalculationModeAction buildUnchecked() {
        return new StagedOrderChangeTaxCalculationModeActionImpl(taxCalculationMode);
    }

    /**
     * factory method for an instance of StagedOrderChangeTaxCalculationModeActionBuilder
     * @return builder
     */
    public static StagedOrderChangeTaxCalculationModeActionBuilder of() {
        return new StagedOrderChangeTaxCalculationModeActionBuilder();
    }

    /**
     * create builder for StagedOrderChangeTaxCalculationModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeTaxCalculationModeActionBuilder of(
            final StagedOrderChangeTaxCalculationModeAction template) {
        StagedOrderChangeTaxCalculationModeActionBuilder builder = new StagedOrderChangeTaxCalculationModeActionBuilder();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        return builder;
    }

}
