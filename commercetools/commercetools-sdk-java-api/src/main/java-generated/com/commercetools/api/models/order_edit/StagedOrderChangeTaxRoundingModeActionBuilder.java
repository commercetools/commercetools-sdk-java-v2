
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeTaxRoundingModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeTaxRoundingModeAction stagedOrderChangeTaxRoundingModeAction = StagedOrderChangeTaxRoundingModeAction.builder()
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeTaxRoundingModeActionBuilder implements Builder<StagedOrderChangeTaxRoundingModeAction> {

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    /**
     *  <p>New value to set.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */

    public StagedOrderChangeTaxRoundingModeActionBuilder taxRoundingMode(
            final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return taxRoundingMode
     */

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     * builds StagedOrderChangeTaxRoundingModeAction with checking for non-null required values
     * @return StagedOrderChangeTaxRoundingModeAction
     */
    public StagedOrderChangeTaxRoundingModeAction build() {
        Objects.requireNonNull(taxRoundingMode,
            StagedOrderChangeTaxRoundingModeAction.class + ": taxRoundingMode is missing");
        return new StagedOrderChangeTaxRoundingModeActionImpl(taxRoundingMode);
    }

    /**
     * builds StagedOrderChangeTaxRoundingModeAction without checking for non-null required values
     * @return StagedOrderChangeTaxRoundingModeAction
     */
    public StagedOrderChangeTaxRoundingModeAction buildUnchecked() {
        return new StagedOrderChangeTaxRoundingModeActionImpl(taxRoundingMode);
    }

    /**
     * factory method for an instance of StagedOrderChangeTaxRoundingModeActionBuilder
     * @return builder
     */
    public static StagedOrderChangeTaxRoundingModeActionBuilder of() {
        return new StagedOrderChangeTaxRoundingModeActionBuilder();
    }

    /**
     * create builder for StagedOrderChangeTaxRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeTaxRoundingModeActionBuilder of(
            final StagedOrderChangeTaxRoundingModeAction template) {
        StagedOrderChangeTaxRoundingModeActionBuilder builder = new StagedOrderChangeTaxRoundingModeActionBuilder();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        return builder;
    }

}
